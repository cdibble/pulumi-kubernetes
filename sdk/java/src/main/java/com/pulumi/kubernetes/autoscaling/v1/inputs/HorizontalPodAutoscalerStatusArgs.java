// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * current status of a horizontal pod autoscaler
 * 
 */
public final class HorizontalPodAutoscalerStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerStatusArgs Empty = new HorizontalPodAutoscalerStatusArgs();

    /**
     * current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
     * 
     */
    @Import(name="currentCPUUtilizationPercentage")
    private @Nullable Output<Integer> currentCPUUtilizationPercentage;

    /**
     * @return current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
     * 
     */
    public Optional<Output<Integer>> currentCPUUtilizationPercentage() {
        return Optional.ofNullable(this.currentCPUUtilizationPercentage);
    }

    /**
     * current number of replicas of pods managed by this autoscaler.
     * 
     */
    @Import(name="currentReplicas", required=true)
    private Output<Integer> currentReplicas;

    /**
     * @return current number of replicas of pods managed by this autoscaler.
     * 
     */
    public Output<Integer> currentReplicas() {
        return this.currentReplicas;
    }

    /**
     * desired number of replicas of pods managed by this autoscaler.
     * 
     */
    @Import(name="desiredReplicas", required=true)
    private Output<Integer> desiredReplicas;

    /**
     * @return desired number of replicas of pods managed by this autoscaler.
     * 
     */
    public Output<Integer> desiredReplicas() {
        return this.desiredReplicas;
    }

    /**
     * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    @Import(name="lastScaleTime")
    private @Nullable Output<String> lastScaleTime;

    /**
     * @return last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    public Optional<Output<String>> lastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }

    /**
     * most recent generation observed by this autoscaler.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    /**
     * @return most recent generation observed by this autoscaler.
     * 
     */
    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    private HorizontalPodAutoscalerStatusArgs() {}

    private HorizontalPodAutoscalerStatusArgs(HorizontalPodAutoscalerStatusArgs $) {
        this.currentCPUUtilizationPercentage = $.currentCPUUtilizationPercentage;
        this.currentReplicas = $.currentReplicas;
        this.desiredReplicas = $.desiredReplicas;
        this.lastScaleTime = $.lastScaleTime;
        this.observedGeneration = $.observedGeneration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HorizontalPodAutoscalerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HorizontalPodAutoscalerStatusArgs $;

        public Builder() {
            $ = new HorizontalPodAutoscalerStatusArgs();
        }

        public Builder(HorizontalPodAutoscalerStatusArgs defaults) {
            $ = new HorizontalPodAutoscalerStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param currentCPUUtilizationPercentage current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
         * 
         * @return builder
         * 
         */
        public Builder currentCPUUtilizationPercentage(@Nullable Output<Integer> currentCPUUtilizationPercentage) {
            $.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
            return this;
        }

        /**
         * @param currentCPUUtilizationPercentage current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
         * 
         * @return builder
         * 
         */
        public Builder currentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage) {
            return currentCPUUtilizationPercentage(Output.of(currentCPUUtilizationPercentage));
        }

        /**
         * @param currentReplicas current number of replicas of pods managed by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder currentReplicas(Output<Integer> currentReplicas) {
            $.currentReplicas = currentReplicas;
            return this;
        }

        /**
         * @param currentReplicas current number of replicas of pods managed by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder currentReplicas(Integer currentReplicas) {
            return currentReplicas(Output.of(currentReplicas));
        }

        /**
         * @param desiredReplicas desired number of replicas of pods managed by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder desiredReplicas(Output<Integer> desiredReplicas) {
            $.desiredReplicas = desiredReplicas;
            return this;
        }

        /**
         * @param desiredReplicas desired number of replicas of pods managed by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder desiredReplicas(Integer desiredReplicas) {
            return desiredReplicas(Output.of(desiredReplicas));
        }

        /**
         * @param lastScaleTime last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
         * 
         * @return builder
         * 
         */
        public Builder lastScaleTime(@Nullable Output<String> lastScaleTime) {
            $.lastScaleTime = lastScaleTime;
            return this;
        }

        /**
         * @param lastScaleTime last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
         * 
         * @return builder
         * 
         */
        public Builder lastScaleTime(String lastScaleTime) {
            return lastScaleTime(Output.of(lastScaleTime));
        }

        /**
         * @param observedGeneration most recent generation observed by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * @param observedGeneration most recent generation observed by this autoscaler.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public HorizontalPodAutoscalerStatusArgs build() {
            $.currentReplicas = Objects.requireNonNull($.currentReplicas, "expected parameter 'currentReplicas' to be non-null");
            $.desiredReplicas = Objects.requireNonNull($.desiredReplicas, "expected parameter 'desiredReplicas' to be non-null");
            return $;
        }
    }

}
