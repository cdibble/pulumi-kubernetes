// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VsphereVirtualDiskVolumeSourcePatch {
    /**
     * @return fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    private @Nullable String storagePolicyID;
    /**
     * @return storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     * 
     */
    private @Nullable String storagePolicyName;
    /**
     * @return volumePath is the path that identifies vSphere volume vmdk
     * 
     */
    private @Nullable String volumePath;

    private VsphereVirtualDiskVolumeSourcePatch() {}
    /**
     * @return fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    public Optional<String> storagePolicyID() {
        return Optional.ofNullable(this.storagePolicyID);
    }
    /**
     * @return storagePolicyName is the storage Policy Based Management (SPBM) profile name.
     * 
     */
    public Optional<String> storagePolicyName() {
        return Optional.ofNullable(this.storagePolicyName);
    }
    /**
     * @return volumePath is the path that identifies vSphere volume vmdk
     * 
     */
    public Optional<String> volumePath() {
        return Optional.ofNullable(this.volumePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VsphereVirtualDiskVolumeSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable String storagePolicyID;
        private @Nullable String storagePolicyName;
        private @Nullable String volumePath;
        public Builder() {}
        public Builder(VsphereVirtualDiskVolumeSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.storagePolicyID = defaults.storagePolicyID;
    	      this.storagePolicyName = defaults.storagePolicyName;
    	      this.volumePath = defaults.volumePath;
        }

        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder storagePolicyID(@Nullable String storagePolicyID) {
            this.storagePolicyID = storagePolicyID;
            return this;
        }
        @CustomType.Setter
        public Builder storagePolicyName(@Nullable String storagePolicyName) {
            this.storagePolicyName = storagePolicyName;
            return this;
        }
        @CustomType.Setter
        public Builder volumePath(@Nullable String volumePath) {
            this.volumePath = volumePath;
            return this;
        }
        public VsphereVirtualDiskVolumeSourcePatch build() {
            final var o = new VsphereVirtualDiskVolumeSourcePatch();
            o.fsType = fsType;
            o.storagePolicyID = storagePolicyID;
            o.storagePolicyName = storagePolicyName;
            o.volumePath = volumePath;
            return o;
        }
    }
}
