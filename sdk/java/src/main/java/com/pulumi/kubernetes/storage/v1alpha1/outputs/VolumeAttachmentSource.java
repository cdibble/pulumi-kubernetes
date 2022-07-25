// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.PersistentVolumeSpec;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeAttachmentSource {
    /**
     * @return inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod&#39;s inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod&#39;s inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
     * 
     */
    private @Nullable PersistentVolumeSpec inlineVolumeSpec;
    /**
     * @return Name of the persistent volume to attach.
     * 
     */
    private @Nullable String persistentVolumeName;

    private VolumeAttachmentSource() {}
    /**
     * @return inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod&#39;s inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod&#39;s inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
     * 
     */
    public Optional<PersistentVolumeSpec> inlineVolumeSpec() {
        return Optional.ofNullable(this.inlineVolumeSpec);
    }
    /**
     * @return Name of the persistent volume to attach.
     * 
     */
    public Optional<String> persistentVolumeName() {
        return Optional.ofNullable(this.persistentVolumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PersistentVolumeSpec inlineVolumeSpec;
        private @Nullable String persistentVolumeName;
        public Builder() {}
        public Builder(VolumeAttachmentSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineVolumeSpec = defaults.inlineVolumeSpec;
    	      this.persistentVolumeName = defaults.persistentVolumeName;
        }

        @CustomType.Setter
        public Builder inlineVolumeSpec(@Nullable PersistentVolumeSpec inlineVolumeSpec) {
            this.inlineVolumeSpec = inlineVolumeSpec;
            return this;
        }
        @CustomType.Setter
        public Builder persistentVolumeName(@Nullable String persistentVolumeName) {
            this.persistentVolumeName = persistentVolumeName;
            return this;
        }
        public VolumeAttachmentSource build() {
            final var o = new VolumeAttachmentSource();
            o.inlineVolumeSpec = inlineVolumeSpec;
            o.persistentVolumeName = persistentVolumeName;
            return o;
        }
    }
}
