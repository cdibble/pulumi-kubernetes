// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorPatchArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MetricIdentifier defines the name and optionally selector for a metric
 * 
 */
public final class MetricIdentifierPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricIdentifierPatchArgs Empty = new MetricIdentifierPatchArgs();

    /**
     * name is the name of the given metric
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name is the name of the given metric
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorPatchArgs> selector;

    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<Output<LabelSelectorPatchArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private MetricIdentifierPatchArgs() {}

    private MetricIdentifierPatchArgs(MetricIdentifierPatchArgs $) {
        this.name = $.name;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricIdentifierPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricIdentifierPatchArgs $;

        public Builder() {
            $ = new MetricIdentifierPatchArgs();
        }

        public Builder(MetricIdentifierPatchArgs defaults) {
            $ = new MetricIdentifierPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name name is the name of the given metric
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name is the name of the given metric
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<LabelSelectorPatchArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorPatchArgs selector) {
            return selector(Output.of(selector));
        }

        public MetricIdentifierPatchArgs build() {
            return $;
        }
    }

}
