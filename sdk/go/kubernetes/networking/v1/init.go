// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-kubernetes/sdk/v2/go/kubernetes"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "kubernetes:networking.k8s.io/v1:Ingress":
		r = &Ingress{}
	case "kubernetes:networking.k8s.io/v1:IngressClass":
		r = &IngressClass{}
	case "kubernetes:networking.k8s.io/v1:IngressClassList":
		r = &IngressClassList{}
	case "kubernetes:networking.k8s.io/v1:IngressList":
		r = &IngressList{}
	case "kubernetes:networking.k8s.io/v1:NetworkPolicy":
		r = &NetworkPolicy{}
	case "kubernetes:networking.k8s.io/v1:NetworkPolicyList":
		r = &NetworkPolicyList{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := kubernetes.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"kubernetes",
		"networking.k8s.io/v1",
		&module{version},
	)
}
