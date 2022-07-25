// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import com.pulumi.kubernetes.networking.v1.inputs.IngressSpecArgs;
import com.pulumi.kubernetes.networking.v1.inputs.IngressStatusArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1.  Ingress object exists.
 * 2.  Endpoint objects exist with matching names for each Ingress path (except when Service
 *     type is ExternalName).
 * 3.  Ingress entry exists for &#39;.status.loadBalancer.ingress&#39;.
 * 
 * If the Ingress has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the &#39;customTimeouts&#39; option on the resource.
 * 
 */
public final class IngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressArgs Empty = new IngressArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="spec")
    private @Nullable Output<IngressSpecArgs> spec;

    /**
     * @return Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    public Optional<Output<IngressSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="status")
    private @Nullable Output<IngressStatusArgs> status;

    /**
     * @return Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    public Optional<Output<IngressStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private IngressArgs() {}

    private IngressArgs(IngressArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressArgs $;

        public Builder() {
            $ = new IngressArgs();
        }

        public Builder(IngressArgs defaults) {
            $ = new IngressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param metadata Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param spec Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<IngressSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Spec is the desired state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * 
         * @return builder
         * 
         */
        public Builder spec(IngressSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<IngressStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status is the current state of the Ingress. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
         * 
         * @return builder
         * 
         */
        public Builder status(IngressStatusArgs status) {
            return status(Output.of(status));
        }

        public IngressArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
