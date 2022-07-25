// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.extensions.v1beta1.outputs.HTTPIngressPath;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HTTPIngressRuleValue {
    /**
     * @return A collection of paths that map requests to backends.
     * 
     */
    private List<HTTPIngressPath> paths;

    private HTTPIngressRuleValue() {}
    /**
     * @return A collection of paths that map requests to backends.
     * 
     */
    public List<HTTPIngressPath> paths() {
        return this.paths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HTTPIngressRuleValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<HTTPIngressPath> paths;
        public Builder() {}
        public Builder(HTTPIngressRuleValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
        }

        @CustomType.Setter
        public Builder paths(List<HTTPIngressPath> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }
        public Builder paths(HTTPIngressPath... paths) {
            return paths(List.of(paths));
        }
        public HTTPIngressRuleValue build() {
            final var o = new HTTPIngressRuleValue();
            o.paths = paths;
            return o;
        }
    }
}
