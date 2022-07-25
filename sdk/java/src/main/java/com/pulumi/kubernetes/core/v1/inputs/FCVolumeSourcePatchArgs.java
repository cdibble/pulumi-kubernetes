// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 * 
 */
public final class FCVolumeSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final FCVolumeSourcePatchArgs Empty = new FCVolumeSourcePatchArgs();

    /**
     * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    /**
     * @return fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * lun is Optional: FC target lun number
     * 
     */
    @Import(name="lun")
    private @Nullable Output<Integer> lun;

    /**
     * @return lun is Optional: FC target lun number
     * 
     */
    public Optional<Output<Integer>> lun() {
        return Optional.ofNullable(this.lun);
    }

    /**
     * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * targetWWNs is Optional: FC target worldwide names (WWNs)
     * 
     */
    @Import(name="targetWWNs")
    private @Nullable Output<List<String>> targetWWNs;

    /**
     * @return targetWWNs is Optional: FC target worldwide names (WWNs)
     * 
     */
    public Optional<Output<List<String>>> targetWWNs() {
        return Optional.ofNullable(this.targetWWNs);
    }

    /**
     * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    @Import(name="wwids")
    private @Nullable Output<List<String>> wwids;

    /**
     * @return wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    public Optional<Output<List<String>>> wwids() {
        return Optional.ofNullable(this.wwids);
    }

    private FCVolumeSourcePatchArgs() {}

    private FCVolumeSourcePatchArgs(FCVolumeSourcePatchArgs $) {
        this.fsType = $.fsType;
        this.lun = $.lun;
        this.readOnly = $.readOnly;
        this.targetWWNs = $.targetWWNs;
        this.wwids = $.wwids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FCVolumeSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FCVolumeSourcePatchArgs $;

        public Builder() {
            $ = new FCVolumeSourcePatchArgs();
        }

        public Builder(FCVolumeSourcePatchArgs defaults) {
            $ = new FCVolumeSourcePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fsType fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        /**
         * @param fsType fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        /**
         * @param lun lun is Optional: FC target lun number
         * 
         * @return builder
         * 
         */
        public Builder lun(@Nullable Output<Integer> lun) {
            $.lun = lun;
            return this;
        }

        /**
         * @param lun lun is Optional: FC target lun number
         * 
         * @return builder
         * 
         */
        public Builder lun(Integer lun) {
            return lun(Output.of(lun));
        }

        /**
         * @param readOnly readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param targetWWNs targetWWNs is Optional: FC target worldwide names (WWNs)
         * 
         * @return builder
         * 
         */
        public Builder targetWWNs(@Nullable Output<List<String>> targetWWNs) {
            $.targetWWNs = targetWWNs;
            return this;
        }

        /**
         * @param targetWWNs targetWWNs is Optional: FC target worldwide names (WWNs)
         * 
         * @return builder
         * 
         */
        public Builder targetWWNs(List<String> targetWWNs) {
            return targetWWNs(Output.of(targetWWNs));
        }

        /**
         * @param targetWWNs targetWWNs is Optional: FC target worldwide names (WWNs)
         * 
         * @return builder
         * 
         */
        public Builder targetWWNs(String... targetWWNs) {
            return targetWWNs(List.of(targetWWNs));
        }

        /**
         * @param wwids wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
         * 
         * @return builder
         * 
         */
        public Builder wwids(@Nullable Output<List<String>> wwids) {
            $.wwids = wwids;
            return this;
        }

        /**
         * @param wwids wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
         * 
         * @return builder
         * 
         */
        public Builder wwids(List<String> wwids) {
            return wwids(Output.of(wwids));
        }

        /**
         * @param wwids wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
         * 
         * @return builder
         * 
         */
        public Builder wwids(String... wwids) {
            return wwids(List.of(wwids));
        }

        public FCVolumeSourcePatchArgs build() {
            return $;
        }
    }

}
