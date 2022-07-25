// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ObjectFieldSelectorPatch;
import com.pulumi.kubernetes.core.v1.outputs.ResourceFieldSelectorPatch;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DownwardAPIVolumeFilePatch {
    /**
     * @return Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
     * 
     */
    private @Nullable ObjectFieldSelectorPatch fieldRef;
    /**
     * @return Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private @Nullable Integer mode;
    /**
     * @return Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
     * 
     */
    private @Nullable String path;
    /**
     * @return Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     * 
     */
    private @Nullable ResourceFieldSelectorPatch resourceFieldRef;

    private DownwardAPIVolumeFilePatch() {}
    /**
     * @return Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
     * 
     */
    public Optional<ObjectFieldSelectorPatch> fieldRef() {
        return Optional.ofNullable(this.fieldRef);
    }
    /**
     * @return Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Integer> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     * 
     */
    public Optional<ResourceFieldSelectorPatch> resourceFieldRef() {
        return Optional.ofNullable(this.resourceFieldRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DownwardAPIVolumeFilePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ObjectFieldSelectorPatch fieldRef;
        private @Nullable Integer mode;
        private @Nullable String path;
        private @Nullable ResourceFieldSelectorPatch resourceFieldRef;
        public Builder() {}
        public Builder(DownwardAPIVolumeFilePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldRef = defaults.fieldRef;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
    	      this.resourceFieldRef = defaults.resourceFieldRef;
        }

        @CustomType.Setter
        public Builder fieldRef(@Nullable ObjectFieldSelectorPatch fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable Integer mode) {
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder resourceFieldRef(@Nullable ResourceFieldSelectorPatch resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }
        public DownwardAPIVolumeFilePatch build() {
            final var o = new DownwardAPIVolumeFilePatch();
            o.fieldRef = fieldRef;
            o.mode = mode;
            o.path = path;
            o.resourceFieldRef = resourceFieldRef;
            return o;
        }
    }
}
