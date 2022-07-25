// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FlowDistinguisherMethod {
    /**
     * @return `type` is the type of flow distinguisher method The supported types are &#34;ByUser&#34; and &#34;ByNamespace&#34;. Required.
     * 
     */
    private String type;

    private FlowDistinguisherMethod() {}
    /**
     * @return `type` is the type of flow distinguisher method The supported types are &#34;ByUser&#34; and &#34;ByNamespace&#34;. Required.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDistinguisherMethod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(FlowDistinguisherMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FlowDistinguisherMethod build() {
            final var o = new FlowDistinguisherMethod();
            o.type = type;
            return o;
        }
    }
}
