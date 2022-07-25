// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorPatchArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 * 
 */
public final class PodsMetricSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodsMetricSourcePatchArgs Empty = new PodsMetricSourcePatchArgs();

    /**
     * metricName is the name of the metric in question
     * 
     */
    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    /**
     * @return metricName is the name of the metric in question
     * 
     */
    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorPatchArgs> selector;

    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<Output<LabelSelectorPatchArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    @Import(name="targetAverageValue")
    private @Nullable Output<String> targetAverageValue;

    /**
     * @return targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public Optional<Output<String>> targetAverageValue() {
        return Optional.ofNullable(this.targetAverageValue);
    }

    private PodsMetricSourcePatchArgs() {}

    private PodsMetricSourcePatchArgs(PodsMetricSourcePatchArgs $) {
        this.metricName = $.metricName;
        this.selector = $.selector;
        this.targetAverageValue = $.targetAverageValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodsMetricSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodsMetricSourcePatchArgs $;

        public Builder() {
            $ = new PodsMetricSourcePatchArgs();
        }

        public Builder(PodsMetricSourcePatchArgs defaults) {
            $ = new PodsMetricSourcePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metricName metricName is the name of the metric in question
         * 
         * @return builder
         * 
         */
        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName metricName is the name of the metric in question
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<LabelSelectorPatchArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorPatchArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param targetAverageValue targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
         * 
         * @return builder
         * 
         */
        public Builder targetAverageValue(@Nullable Output<String> targetAverageValue) {
            $.targetAverageValue = targetAverageValue;
            return this;
        }

        /**
         * @param targetAverageValue targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
         * 
         * @return builder
         * 
         */
        public Builder targetAverageValue(String targetAverageValue) {
            return targetAverageValue(Output.of(targetAverageValue));
        }

        public PodsMetricSourcePatchArgs build() {
            return $;
        }
    }

}
