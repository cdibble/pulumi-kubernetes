// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.DownwardAPIVolumeFilePatch;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DownwardAPIVolumeSourcePatch {
    /**
     * @return Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private @Nullable Integer defaultMode;
    /**
     * @return Items is a list of downward API volume file
     * 
     */
    private @Nullable List<DownwardAPIVolumeFilePatch> items;

    private DownwardAPIVolumeSourcePatch() {}
    /**
     * @return Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Integer> defaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }
    /**
     * @return Items is a list of downward API volume file
     * 
     */
    public List<DownwardAPIVolumeFilePatch> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DownwardAPIVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer defaultMode;
        private @Nullable List<DownwardAPIVolumeFilePatch> items;
        public Builder() {}
        public Builder(DownwardAPIVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
        }

        @CustomType.Setter
        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        @CustomType.Setter
        public Builder items(@Nullable List<DownwardAPIVolumeFilePatch> items) {
            this.items = items;
            return this;
        }
        public Builder items(DownwardAPIVolumeFilePatch... items) {
            return items(List.of(items));
        }
        public DownwardAPIVolumeSourcePatch build() {
            final var o = new DownwardAPIVolumeSourcePatch();
            o.defaultMode = defaultMode;
            o.items = items;
            return o;
        }
    }
}
