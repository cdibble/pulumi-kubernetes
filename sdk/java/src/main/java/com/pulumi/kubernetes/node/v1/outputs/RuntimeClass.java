// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.node.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.node.v1.outputs.Overhead;
import com.pulumi.kubernetes.node.v1.outputs.Scheduling;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeClass {
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * 
     */
    private String handler;
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private @Nullable String kind;
    /**
     * @return More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private @Nullable ObjectMeta metadata;
    /**
     * @return Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
     *  https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
     * 
     */
    private @Nullable Overhead overhead;
    /**
     * @return Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    private @Nullable Scheduling scheduling;

    private RuntimeClass() {}
    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called &#34;runc&#34; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * 
     */
    public String handler() {
        return this.handler;
    }
    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
     *  https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
     * 
     */
    public Optional<Overhead> overhead() {
        return Optional.ofNullable(this.overhead);
    }
    /**
     * @return Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    public Optional<Scheduling> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private String handler;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable Overhead overhead;
        private @Nullable Scheduling scheduling;
        public Builder() {}
        public Builder(RuntimeClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.handler = defaults.handler;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.overhead = defaults.overhead;
    	      this.scheduling = defaults.scheduling;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder handler(String handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder overhead(@Nullable Overhead overhead) {
            this.overhead = overhead;
            return this;
        }
        @CustomType.Setter
        public Builder scheduling(@Nullable Scheduling scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public RuntimeClass build() {
            final var o = new RuntimeClass();
            o.apiVersion = apiVersion;
            o.handler = handler;
            o.kind = kind;
            o.metadata = metadata;
            o.overhead = overhead;
            o.scheduling = scheduling;
            return o;
        }
    }
}
