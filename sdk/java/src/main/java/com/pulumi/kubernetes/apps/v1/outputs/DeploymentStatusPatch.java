// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apps.v1.outputs.DeploymentConditionPatch;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentStatusPatch {
    /**
     * @return Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
     * 
     */
    private @Nullable Integer availableReplicas;
    /**
     * @return Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
     * 
     */
    private @Nullable Integer collisionCount;
    /**
     * @return Represents the latest available observations of a deployment&#39;s current state.
     * 
     */
    private @Nullable List<DeploymentConditionPatch> conditions;
    /**
     * @return The generation observed by the deployment controller.
     * 
     */
    private @Nullable Integer observedGeneration;
    /**
     * @return readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.
     * 
     */
    private @Nullable Integer readyReplicas;
    /**
     * @return Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     * 
     */
    private @Nullable Integer replicas;
    /**
     * @return Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
     * 
     */
    private @Nullable Integer unavailableReplicas;
    /**
     * @return Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     * 
     */
    private @Nullable Integer updatedReplicas;

    private DeploymentStatusPatch() {}
    /**
     * @return Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
     * 
     */
    public Optional<Integer> availableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }
    /**
     * @return Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
     * 
     */
    public Optional<Integer> collisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }
    /**
     * @return Represents the latest available observations of a deployment&#39;s current state.
     * 
     */
    public List<DeploymentConditionPatch> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return The generation observed by the deployment controller.
     * 
     */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * @return readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.
     * 
     */
    public Optional<Integer> readyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    /**
     * @return Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     * 
     */
    public Optional<Integer> replicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * @return Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
     * 
     */
    public Optional<Integer> unavailableReplicas() {
        return Optional.ofNullable(this.unavailableReplicas);
    }
    /**
     * @return Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     * 
     */
    public Optional<Integer> updatedReplicas() {
        return Optional.ofNullable(this.updatedReplicas);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer availableReplicas;
        private @Nullable Integer collisionCount;
        private @Nullable List<DeploymentConditionPatch> conditions;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private @Nullable Integer replicas;
        private @Nullable Integer unavailableReplicas;
        private @Nullable Integer updatedReplicas;
        public Builder() {}
        public Builder(DeploymentStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
    	      this.unavailableReplicas = defaults.unavailableReplicas;
    	      this.updatedReplicas = defaults.updatedReplicas;
        }

        @CustomType.Setter
        public Builder availableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder collisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable List<DeploymentConditionPatch> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(DeploymentConditionPatch... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        @CustomType.Setter
        public Builder readyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        @CustomType.Setter
        public Builder unavailableReplicas(@Nullable Integer unavailableReplicas) {
            this.unavailableReplicas = unavailableReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder updatedReplicas(@Nullable Integer updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }
        public DeploymentStatusPatch build() {
            final var o = new DeploymentStatusPatch();
            o.availableReplicas = availableReplicas;
            o.collisionCount = collisionCount;
            o.conditions = conditions;
            o.observedGeneration = observedGeneration;
            o.readyReplicas = readyReplicas;
            o.replicas = replicas;
            o.unavailableReplicas = unavailableReplicas;
            o.updatedReplicas = updatedReplicas;
            return o;
        }
    }
}
