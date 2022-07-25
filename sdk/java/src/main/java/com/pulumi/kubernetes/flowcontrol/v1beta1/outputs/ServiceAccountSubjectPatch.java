// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceAccountSubjectPatch {
    /**
     * @return `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
     * 
     */
    private @Nullable String name;
    /**
     * @return `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
     */
    private @Nullable String namespace;

    private ServiceAccountSubjectPatch() {}
    /**
     * @return `name` is the name of matching ServiceAccount objects, or &#34;*&#34; to match regardless of name. Required.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountSubjectPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String namespace;
        public Builder() {}
        public Builder(ServiceAccountSubjectPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public ServiceAccountSubjectPatch build() {
            final var o = new ServiceAccountSubjectPatch();
            o.name = name;
            o.namespace = namespace;
            return o;
        }
    }
}
