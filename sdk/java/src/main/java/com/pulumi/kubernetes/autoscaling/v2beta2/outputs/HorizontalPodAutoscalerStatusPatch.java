// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.HorizontalPodAutoscalerConditionPatch;
import com.pulumi.kubernetes.autoscaling.v2beta2.outputs.MetricStatusPatch;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscalerStatusPatch {
    /**
     * @return conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    private @Nullable List<HorizontalPodAutoscalerConditionPatch> conditions;
    /**
     * @return currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    private @Nullable List<MetricStatusPatch> currentMetrics;
    /**
     * @return currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    private @Nullable Integer currentReplicas;
    /**
     * @return desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    private @Nullable Integer desiredReplicas;
    /**
     * @return lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    private @Nullable String lastScaleTime;
    /**
     * @return observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    private @Nullable Integer observedGeneration;

    private HorizontalPodAutoscalerStatusPatch() {}
    /**
     * @return conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    public List<HorizontalPodAutoscalerConditionPatch> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    public List<MetricStatusPatch> currentMetrics() {
        return this.currentMetrics == null ? List.of() : this.currentMetrics;
    }
    /**
     * @return currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    public Optional<Integer> currentReplicas() {
        return Optional.ofNullable(this.currentReplicas);
    }
    /**
     * @return desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    public Optional<Integer> desiredReplicas() {
        return Optional.ofNullable(this.desiredReplicas);
    }
    /**
     * @return lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    public Optional<String> lastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }
    /**
     * @return observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<HorizontalPodAutoscalerConditionPatch> conditions;
        private @Nullable List<MetricStatusPatch> currentMetrics;
        private @Nullable Integer currentReplicas;
        private @Nullable Integer desiredReplicas;
        private @Nullable String lastScaleTime;
        private @Nullable Integer observedGeneration;
        public Builder() {}
        public Builder(HorizontalPodAutoscalerStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentMetrics = defaults.currentMetrics;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable List<HorizontalPodAutoscalerConditionPatch> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(HorizontalPodAutoscalerConditionPatch... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder currentMetrics(@Nullable List<MetricStatusPatch> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }
        public Builder currentMetrics(MetricStatusPatch... currentMetrics) {
            return currentMetrics(List.of(currentMetrics));
        }
        @CustomType.Setter
        public Builder currentReplicas(@Nullable Integer currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder desiredReplicas(@Nullable Integer desiredReplicas) {
            this.desiredReplicas = desiredReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder lastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }
        @CustomType.Setter
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public HorizontalPodAutoscalerStatusPatch build() {
            final var o = new HorizontalPodAutoscalerStatusPatch();
            o.conditions = conditions;
            o.currentMetrics = currentMetrics;
            o.currentReplicas = currentReplicas;
            o.desiredReplicas = desiredReplicas;
            o.lastScaleTime = lastScaleTime;
            o.observedGeneration = observedGeneration;
            return o;
        }
    }
}
