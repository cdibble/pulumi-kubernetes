// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeMount {
    /**
     * @return Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
     * 
     */
    private String mountPath;
    /**
     * @return mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
     * 
     */
    private @Nullable String mountPropagation;
    /**
     * @return This must match the Name of a Volume.
     * 
     */
    private String name;
    /**
     * @return Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return Path within the volume from which the container&#39;s volume should be mounted. Defaults to &#34;&#34; (volume&#39;s root).
     * 
     */
    private @Nullable String subPath;
    /**
     * @return Expanded path within the volume from which the container&#39;s volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container&#39;s environment. Defaults to &#34;&#34; (volume&#39;s root). SubPathExpr and SubPath are mutually exclusive.
     * 
     */
    private @Nullable String subPathExpr;

    private VolumeMount() {}
    /**
     * @return Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
     * 
     */
    public String mountPath() {
        return this.mountPath;
    }
    /**
     * @return mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
     * 
     */
    public Optional<String> mountPropagation() {
        return Optional.ofNullable(this.mountPropagation);
    }
    /**
     * @return This must match the Name of a Volume.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return Path within the volume from which the container&#39;s volume should be mounted. Defaults to &#34;&#34; (volume&#39;s root).
     * 
     */
    public Optional<String> subPath() {
        return Optional.ofNullable(this.subPath);
    }
    /**
     * @return Expanded path within the volume from which the container&#39;s volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container&#39;s environment. Defaults to &#34;&#34; (volume&#39;s root). SubPathExpr and SubPath are mutually exclusive.
     * 
     */
    public Optional<String> subPathExpr() {
        return Optional.ofNullable(this.subPathExpr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mountPath;
        private @Nullable String mountPropagation;
        private String name;
        private @Nullable Boolean readOnly;
        private @Nullable String subPath;
        private @Nullable String subPathExpr;
        public Builder() {}
        public Builder(VolumeMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.mountPropagation = defaults.mountPropagation;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.subPath = defaults.subPath;
    	      this.subPathExpr = defaults.subPathExpr;
        }

        @CustomType.Setter
        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        @CustomType.Setter
        public Builder mountPropagation(@Nullable String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder subPath(@Nullable String subPath) {
            this.subPath = subPath;
            return this;
        }
        @CustomType.Setter
        public Builder subPathExpr(@Nullable String subPathExpr) {
            this.subPathExpr = subPathExpr;
            return this;
        }
        public VolumeMount build() {
            final var o = new VolumeMount();
            o.mountPath = mountPath;
            o.mountPropagation = mountPropagation;
            o.name = name;
            o.readOnly = readOnly;
            o.subPath = subPath;
            o.subPathExpr = subPathExpr;
            return o;
        }
    }
}
