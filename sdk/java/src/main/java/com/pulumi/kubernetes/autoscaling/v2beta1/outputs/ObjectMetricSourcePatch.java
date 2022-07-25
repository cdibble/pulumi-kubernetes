// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2beta1.outputs.CrossVersionObjectReferencePatch;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelectorPatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectMetricSourcePatch {
    /**
     * @return averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private @Nullable String averageValue;
    /**
     * @return metricName is the name of the metric in question.
     * 
     */
    private @Nullable String metricName;
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    private @Nullable LabelSelectorPatch selector;
    /**
     * @return target is the described Kubernetes object.
     * 
     */
    private @Nullable CrossVersionObjectReferencePatch target;
    /**
     * @return targetValue is the target value of the metric (as a quantity).
     * 
     */
    private @Nullable String targetValue;

    private ObjectMetricSourcePatch() {}
    /**
     * @return averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public Optional<String> averageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * @return metricName is the name of the metric in question.
     * 
     */
    public Optional<String> metricName() {
        return Optional.ofNullable(this.metricName);
    }
    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<LabelSelectorPatch> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return target is the described Kubernetes object.
     * 
     */
    public Optional<CrossVersionObjectReferencePatch> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * @return targetValue is the target value of the metric (as a quantity).
     * 
     */
    public Optional<String> targetValue() {
        return Optional.ofNullable(this.targetValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricSourcePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String averageValue;
        private @Nullable String metricName;
        private @Nullable LabelSelectorPatch selector;
        private @Nullable CrossVersionObjectReferencePatch target;
        private @Nullable String targetValue;
        public Builder() {}
        public Builder(ObjectMetricSourcePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageValue = defaults.averageValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.target = defaults.target;
    	      this.targetValue = defaults.targetValue;
        }

        @CustomType.Setter
        public Builder averageValue(@Nullable String averageValue) {
            this.averageValue = averageValue;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(@Nullable String metricName) {
            this.metricName = metricName;
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable LabelSelectorPatch selector) {
            this.selector = selector;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable CrossVersionObjectReferencePatch target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder targetValue(@Nullable String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public ObjectMetricSourcePatch build() {
            final var o = new ObjectMetricSourcePatch();
            o.averageValue = averageValue;
            o.metricName = metricName;
            o.selector = selector;
            o.target = target;
            o.targetValue = targetValue;
            return o;
        }
    }
}
