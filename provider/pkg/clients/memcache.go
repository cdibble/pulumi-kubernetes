/*
Copyright 2022, Pulumi Corporation.  All rights reserved.
Copyright 2017 The Kubernetes Authors.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

// Note: this code is taken nearly verbatim from the upstream memcache client [1].
// Several methods do not return errors, but instead log them using the `HandleError` method, which dispatches to klog.
// This bypasses Pulumi's logging mechanism, and causes unactionable error messages to appear in the CLI. This error
// logging was disabled.
//
// [1] https://github.com/kubernetes/client-go/blob/release-1.24/discovery/cached/memory/memcache.go

package clients

import (
	"errors"
	"fmt"
	"sync"
	"syscall"

	openapi_v2 "github.com/google/gnostic/openapiv2"
	logger "github.com/pulumi/pulumi/sdk/v3/go/common/util/logging" // Added in place of upstream HandleError

	errorsutil "k8s.io/apimachinery/pkg/api/errors"
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	utilruntime "k8s.io/apimachinery/pkg/util/runtime"
	"k8s.io/apimachinery/pkg/version"
	"k8s.io/client-go/discovery"
	"k8s.io/client-go/openapi"
	cachedopenapi "k8s.io/client-go/openapi/cached"
	restclient "k8s.io/client-go/rest"
)

type cacheEntry struct {
	resourceList *metav1.APIResourceList
	err          error
}

// memCacheClient can Invalidate() to stay up-to-date with discovery
// information.
//
// TODO: Switch to a watch interface. Right now it will poll after each
// Invalidate() call.
type memCacheClient struct {
	delegate discovery.DiscoveryInterface

	lock                   sync.RWMutex
	groupToServerResources map[string]*cacheEntry
	groupList              *metav1.APIGroupList
	cacheValid             bool
	openapiClient          openapi.Client
}

// Error Constants
var (
	ErrCacheNotFound = errors.New("not found")
)

var _ discovery.CachedDiscoveryInterface = &memCacheClient{}

// isTransientConnectionError checks whether given error is "Connection refused" or
// "Connection reset" error which usually means that apiserver is temporarily
// unavailable.
func isTransientConnectionError(err error) bool {
	var errno syscall.Errno
	if errors.As(err, &errno) {
		return errno == syscall.ECONNREFUSED || errno == syscall.ECONNRESET
	}
	return false
}

func isTransientError(err error) bool {
	if isTransientConnectionError(err) {
		return true
	}

	if t, ok := err.(errorsutil.APIStatus); ok && t.Status().Code >= 500 {
		return true
	}

	return errorsutil.IsTooManyRequests(err)
}

// ServerResourcesForGroupVersion returns the supported resources for a group and version.
func (d *memCacheClient) ServerResourcesForGroupVersion(groupVersion string) (*metav1.APIResourceList, error) {
	d.lock.Lock()
	defer d.lock.Unlock()
	if !d.cacheValid {
		if err := d.refreshLocked(); err != nil {
			return nil, err
		}
	}
	cachedVal, ok := d.groupToServerResources[groupVersion]
	if !ok {
		return nil, ErrCacheNotFound
	}

	if cachedVal.err != nil && isTransientError(cachedVal.err) {
		r, err := d.serverResourcesForGroupVersion(groupVersion)
		if err != nil {
			logger.V(9).Infof("couldn't get resource list for %v: %v", groupVersion, err) // Updated by Pulumi
		}
		cachedVal = &cacheEntry{r, err}
		d.groupToServerResources[groupVersion] = cachedVal
	}

	return cachedVal.resourceList, cachedVal.err
}

// ServerGroupsAndResources returns the groups and supported resources for all groups and versions.
func (d *memCacheClient) ServerGroupsAndResources() ([]*metav1.APIGroup, []*metav1.APIResourceList, error) {
	return discovery.ServerGroupsAndResources(d)
}

func (d *memCacheClient) ServerGroups() (*metav1.APIGroupList, error) {
	d.lock.Lock()
	defer d.lock.Unlock()
	if !d.cacheValid {
		if err := d.refreshLocked(); err != nil {
			return nil, err
		}
	}
	return d.groupList, nil
}

func (d *memCacheClient) RESTClient() restclient.Interface {
	return d.delegate.RESTClient()
}

func (d *memCacheClient) ServerPreferredResources() ([]*metav1.APIResourceList, error) {
	return discovery.ServerPreferredResources(d)
}

func (d *memCacheClient) ServerPreferredNamespacedResources() ([]*metav1.APIResourceList, error) {
	return discovery.ServerPreferredNamespacedResources(d)
}

func (d *memCacheClient) ServerVersion() (*version.Info, error) {
	return d.delegate.ServerVersion()
}

func (d *memCacheClient) OpenAPISchema() (*openapi_v2.Document, error) {
	return d.delegate.OpenAPISchema()
}

func (d *memCacheClient) OpenAPIV3() openapi.Client {
	// Must take lock since Invalidate call may modify openapiClient
	d.lock.Lock()
	defer d.lock.Unlock()

	if d.openapiClient == nil {
		d.openapiClient = cachedopenapi.NewClient(d.delegate.OpenAPIV3())
	}

	return d.openapiClient
}

func (d *memCacheClient) Fresh() bool {
	d.lock.RLock()
	defer d.lock.RUnlock()
	// Return whether the cache is populated at all. It is still possible that
	// a single entry is missing due to transient errors and the attempt to read
	// that entry will trigger retry.
	return d.cacheValid
}

// Invalidate enforces that no cached data that is older than the current time
// is used.
func (d *memCacheClient) Invalidate() {
	d.lock.Lock()
	defer d.lock.Unlock()
	d.cacheValid = false
	d.groupToServerResources = nil
	d.groupList = nil
	d.openapiClient = nil
}

// refreshLocked refreshes the state of cache. The caller must hold d.lock for
// writing.
func (d *memCacheClient) refreshLocked() error {
	// TODO: Could this multiplicative set of calls be replaced by a single call
	// to ServerResources? If it's possible for more than one resulting
	// APIResourceList to have the same GroupVersion, the lists would need merged.
	gl, err := d.delegate.ServerGroups()
	if err != nil || len(gl.Groups) == 0 {
		logger.V(9).Infof("couldn't get current server API group list: %v", err) // Updated by Pulumi
		return err
	}

	wg := &sync.WaitGroup{}
	resultLock := &sync.Mutex{}
	rl := map[string]*cacheEntry{}
	for _, g := range gl.Groups {
		for _, v := range g.Versions {
			gv := v.GroupVersion
			wg.Add(1)
			go func() {
				defer wg.Done()
				defer utilruntime.HandleCrash()

				r, err := d.serverResourcesForGroupVersion(gv)
				if err != nil {
					logger.V(9).Infof("couldn't get resource list for %v: %v", gv, err) // Updated by Pulumi
				}

				resultLock.Lock()
				defer resultLock.Unlock()
				rl[gv] = &cacheEntry{r, err}
			}()
		}
	}
	wg.Wait()

	d.groupToServerResources, d.groupList = rl, gl
	d.cacheValid = true
	return nil
}

func (d *memCacheClient) serverResourcesForGroupVersion(groupVersion string) (*metav1.APIResourceList, error) {
	r, err := d.delegate.ServerResourcesForGroupVersion(groupVersion)
	if err != nil {
		return r, err
	}
	if len(r.APIResources) == 0 {
		return r, fmt.Errorf("Got empty response for: %v", groupVersion)
	}
	return r, nil
}

// NewMemCacheClient creates a new CachedDiscoveryInterface which caches
// discovery information in memory and will stay up-to-date if Invalidate is
// called with regularity.
//
// NOTE: The client will NOT resort to live lookups on cache misses.
func NewMemCacheClient(delegate discovery.DiscoveryInterface) discovery.CachedDiscoveryInterface {
	return &memCacheClient{
		delegate:               delegate,
		groupToServerResources: map[string]*cacheEntry{},
	}
}
