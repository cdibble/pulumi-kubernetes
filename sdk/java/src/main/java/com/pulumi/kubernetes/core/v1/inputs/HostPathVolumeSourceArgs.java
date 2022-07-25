// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class HostPathVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostPathVolumeSourceArgs Empty = new HostPathVolumeSourceArgs();

    /**
     * path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * type for HostPath Volume Defaults to &#34;&#34; More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return type for HostPath Volume Defaults to &#34;&#34; More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private HostPathVolumeSourceArgs() {}

    private HostPathVolumeSourceArgs(HostPathVolumeSourceArgs $) {
        this.path = $.path;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostPathVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostPathVolumeSourceArgs $;

        public Builder() {
            $ = new HostPathVolumeSourceArgs();
        }

        public Builder(HostPathVolumeSourceArgs defaults) {
            $ = new HostPathVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param type type for HostPath Volume Defaults to &#34;&#34; More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type type for HostPath Volume Defaults to &#34;&#34; More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public HostPathVolumeSourceArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
