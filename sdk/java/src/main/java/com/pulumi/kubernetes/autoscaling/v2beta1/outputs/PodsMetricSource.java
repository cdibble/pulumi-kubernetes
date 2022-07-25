// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodsMetricSource {
    /**
     * @return metricName is the name of the metric in question
     * 
     */
    private String metricName;
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    private @Nullable LabelSelector selector;
    /**
     * @return targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private String targetAverageValue;

    private PodsMetricSource() {}
    /**
     * @return metricName is the name of the metric in question
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<LabelSelector> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public String targetAverageValue() {
        return this.targetAverageValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String metricName;
        private @Nullable LabelSelector selector;
        private String targetAverageValue;
        public Builder() {}
        public Builder(PodsMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.targetAverageValue = defaults.targetAverageValue;
        }

        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder targetAverageValue(String targetAverageValue) {
            this.targetAverageValue = Objects.requireNonNull(targetAverageValue);
            return this;
        }
        public PodsMetricSource build() {
            final var o = new PodsMetricSource();
            o.metricName = metricName;
            o.selector = selector;
            o.targetAverageValue = targetAverageValue;
            return o;
        }
    }
}
