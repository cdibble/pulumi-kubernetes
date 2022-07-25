// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FCVolumeSource {
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return lun is Optional: FC target lun number
     * 
     */
    private @Nullable Integer lun;
    /**
     * @return readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return targetWWNs is Optional: FC target worldwide names (WWNs)
     * 
     */
    private @Nullable List<String> targetWWNs;
    /**
     * @return wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    private @Nullable List<String> wwids;

    private FCVolumeSource() {}
    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return lun is Optional: FC target lun number
     * 
     */
    public Optional<Integer> lun() {
        return Optional.ofNullable(this.lun);
    }
    /**
     * @return readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return targetWWNs is Optional: FC target worldwide names (WWNs)
     * 
     */
    public List<String> targetWWNs() {
        return this.targetWWNs == null ? List.of() : this.targetWWNs;
    }
    /**
     * @return wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    public List<String> wwids() {
        return this.wwids == null ? List.of() : this.wwids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FCVolumeSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Integer lun;
        private @Nullable Boolean readOnly;
        private @Nullable List<String> targetWWNs;
        private @Nullable List<String> wwids;
        public Builder() {}
        public Builder(FCVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.lun = defaults.lun;
    	      this.readOnly = defaults.readOnly;
    	      this.targetWWNs = defaults.targetWWNs;
    	      this.wwids = defaults.wwids;
        }

        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder lun(@Nullable Integer lun) {
            this.lun = lun;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder targetWWNs(@Nullable List<String> targetWWNs) {
            this.targetWWNs = targetWWNs;
            return this;
        }
        public Builder targetWWNs(String... targetWWNs) {
            return targetWWNs(List.of(targetWWNs));
        }
        @CustomType.Setter
        public Builder wwids(@Nullable List<String> wwids) {
            this.wwids = wwids;
            return this;
        }
        public Builder wwids(String... wwids) {
            return wwids(List.of(wwids));
        }
        public FCVolumeSource build() {
            final var o = new FCVolumeSource();
            o.fsType = fsType;
            o.lun = lun;
            o.readOnly = readOnly;
            o.targetWWNs = targetWWNs;
            o.wwids = wwids;
            return o;
        }
    }
}
