// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import com.pulumi.kubernetes.policy.v1beta1.inputs.PodDisruptionBudgetSpecArgs;
import com.pulumi.kubernetes.policy.v1beta1.inputs.PodDisruptionBudgetStatusArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
 * 
 */
public final class PodDisruptionBudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodDisruptionBudgetArgs Empty = new PodDisruptionBudgetArgs();

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
     * Specification of the desired behavior of the PodDisruptionBudget.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<PodDisruptionBudgetSpecArgs> spec;

    /**
     * @return Specification of the desired behavior of the PodDisruptionBudget.
     * 
     */
    public Optional<Output<PodDisruptionBudgetSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * Most recently observed status of the PodDisruptionBudget.
     * 
     */
    @Import(name="status")
    private @Nullable Output<PodDisruptionBudgetStatusArgs> status;

    /**
     * @return Most recently observed status of the PodDisruptionBudget.
     * 
     */
    public Optional<Output<PodDisruptionBudgetStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private PodDisruptionBudgetArgs() {}

    private PodDisruptionBudgetArgs(PodDisruptionBudgetArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodDisruptionBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodDisruptionBudgetArgs $;

        public Builder() {
            $ = new PodDisruptionBudgetArgs();
        }

        public Builder(PodDisruptionBudgetArgs defaults) {
            $ = new PodDisruptionBudgetArgs(Objects.requireNonNull(defaults));
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
         * @param spec Specification of the desired behavior of the PodDisruptionBudget.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<PodDisruptionBudgetSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Specification of the desired behavior of the PodDisruptionBudget.
         * 
         * @return builder
         * 
         */
        public Builder spec(PodDisruptionBudgetSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status Most recently observed status of the PodDisruptionBudget.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<PodDisruptionBudgetStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Most recently observed status of the PodDisruptionBudget.
         * 
         * @return builder
         * 
         */
        public Builder status(PodDisruptionBudgetStatusArgs status) {
            return status(Output.of(status));
        }

        public PodDisruptionBudgetArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
