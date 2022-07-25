// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricTarget;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceMetricSource {
    /**
     * @return name is the name of the resource in question.
     * 
     */
    private String name;
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    private MetricTarget target;

    private ResourceMetricSource() {}
    /**
     * @return name is the name of the resource in question.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public MetricTarget target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private MetricTarget target;
        public Builder() {}
        public Builder(ResourceMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder target(MetricTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ResourceMetricSource build() {
            final var o = new ResourceMetricSource();
            o.name = name;
            o.target = target;
            return o;
        }
    }
}
