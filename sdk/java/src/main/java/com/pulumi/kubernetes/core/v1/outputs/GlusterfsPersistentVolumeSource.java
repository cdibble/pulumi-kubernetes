// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlusterfsPersistentVolumeSource {
    /**
     * @return endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private String endpoints;
    /**
     * @return endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private @Nullable String endpointsNamespace;
    /**
     * @return path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private String path;
    /**
     * @return readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    private @Nullable Boolean readOnly;

    private GlusterfsPersistentVolumeSource() {}
    /**
     * @return endpoints is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public String endpoints() {
        return this.endpoints;
    }
    /**
     * @return endpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Optional<String> endpointsNamespace() {
        return Optional.ofNullable(this.endpointsNamespace);
    }
    /**
     * @return path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return readOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlusterfsPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoints;
        private @Nullable String endpointsNamespace;
        private String path;
        private @Nullable Boolean readOnly;
        public Builder() {}
        public Builder(GlusterfsPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.endpointsNamespace = defaults.endpointsNamespace;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
        }

        @CustomType.Setter
        public Builder endpoints(String endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        @CustomType.Setter
        public Builder endpointsNamespace(@Nullable String endpointsNamespace) {
            this.endpointsNamespace = endpointsNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public GlusterfsPersistentVolumeSource build() {
            final var o = new GlusterfsPersistentVolumeSource();
            o.endpoints = endpoints;
            o.endpointsNamespace = endpointsNamespace;
            o.path = path;
            o.readOnly = readOnly;
            return o;
        }
    }
}
