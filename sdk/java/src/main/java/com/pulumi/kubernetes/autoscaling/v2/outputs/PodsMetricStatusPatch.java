// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricIdentifierPatch;
import com.pulumi.kubernetes.autoscaling.v2.outputs.MetricValueStatusPatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodsMetricStatusPatch {
    /**
     * @return current contains the current value for the given metric
     * 
     */
    private @Nullable MetricValueStatusPatch current;
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    private @Nullable MetricIdentifierPatch metric;

    private PodsMetricStatusPatch() {}
    /**
     * @return current contains the current value for the given metric
     * 
     */
    public Optional<MetricValueStatusPatch> current() {
        return Optional.ofNullable(this.current);
    }
    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public Optional<MetricIdentifierPatch> metric() {
        return Optional.ofNullable(this.metric);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable MetricValueStatusPatch current;
        private @Nullable MetricIdentifierPatch metric;
        public Builder() {}
        public Builder(PodsMetricStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.metric = defaults.metric;
        }

        @CustomType.Setter
        public Builder current(@Nullable MetricValueStatusPatch current) {
            this.current = current;
            return this;
        }
        @CustomType.Setter
        public Builder metric(@Nullable MetricIdentifierPatch metric) {
            this.metric = metric;
            return this;
        }
        public PodsMetricStatusPatch build() {
            final var o = new PodsMetricStatusPatch();
            o.current = current;
            o.metric = metric;
            return o;
        }
    }
}
