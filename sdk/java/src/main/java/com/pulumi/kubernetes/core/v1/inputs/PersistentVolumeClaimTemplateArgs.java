// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimSpecArgs;
import com.pulumi.kubernetes.meta.v1.inputs.ObjectMetaArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
 * 
 */
public final class PersistentVolumeClaimTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeClaimTemplateArgs Empty = new PersistentVolumeClaimTemplateArgs();

    /**
     * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    /**
     * @return May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
     * 
     */
    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
     * 
     */
    @Import(name="spec", required=true)
    private Output<PersistentVolumeClaimSpecArgs> spec;

    /**
     * @return The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
     * 
     */
    public Output<PersistentVolumeClaimSpecArgs> spec() {
        return this.spec;
    }

    private PersistentVolumeClaimTemplateArgs() {}

    private PersistentVolumeClaimTemplateArgs(PersistentVolumeClaimTemplateArgs $) {
        this.metadata = $.metadata;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PersistentVolumeClaimTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PersistentVolumeClaimTemplateArgs $;

        public Builder() {
            $ = new PersistentVolumeClaimTemplateArgs();
        }

        public Builder(PersistentVolumeClaimTemplateArgs defaults) {
            $ = new PersistentVolumeClaimTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param spec The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
         * 
         * @return builder
         * 
         */
        public Builder spec(Output<PersistentVolumeClaimSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
         * 
         * @return builder
         * 
         */
        public Builder spec(PersistentVolumeClaimSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public PersistentVolumeClaimTemplateArgs build() {
            $.spec = Objects.requireNonNull($.spec, "expected parameter 'spec' to be non-null");
            return $;
        }
    }

}
