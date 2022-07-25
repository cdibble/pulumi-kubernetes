// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.storage.v1beta1.outputs.VolumeAttachmentSourcePatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeAttachmentSpecPatch {
    /**
     * @return Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    private @Nullable String attacher;
    /**
     * @return The node that the volume should be attached to.
     * 
     */
    private @Nullable String nodeName;
    /**
     * @return Source represents the volume that should be attached.
     * 
     */
    private @Nullable VolumeAttachmentSourcePatch source;

    private VolumeAttachmentSpecPatch() {}
    /**
     * @return Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
     * 
     */
    public Optional<String> attacher() {
        return Optional.ofNullable(this.attacher);
    }
    /**
     * @return The node that the volume should be attached to.
     * 
     */
    public Optional<String> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    /**
     * @return Source represents the volume that should be attached.
     * 
     */
    public Optional<VolumeAttachmentSourcePatch> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String attacher;
        private @Nullable String nodeName;
        private @Nullable VolumeAttachmentSourcePatch source;
        public Builder() {}
        public Builder(VolumeAttachmentSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attacher = defaults.attacher;
    	      this.nodeName = defaults.nodeName;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder attacher(@Nullable String attacher) {
            this.attacher = attacher;
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(@Nullable String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable VolumeAttachmentSourcePatch source) {
            this.source = source;
            return this;
        }
        public VolumeAttachmentSpecPatch build() {
            final var o = new VolumeAttachmentSpecPatch();
            o.attacher = attacher;
            o.nodeName = nodeName;
            o.source = source;
            return o;
        }
    }
}
