// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling.v2.outputs.HPAScalingPolicyPatch;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HPAScalingRulesPatch {
    /**
     * @return policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
     * 
     */
    private @Nullable List<HPAScalingPolicyPatch> policies;
    /**
     * @return selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
     * 
     */
    private @Nullable String selectPolicy;
    /**
     * @return StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
     * 
     */
    private @Nullable Integer stabilizationWindowSeconds;

    private HPAScalingRulesPatch() {}
    /**
     * @return policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
     * 
     */
    public List<HPAScalingPolicyPatch> policies() {
        return this.policies == null ? List.of() : this.policies;
    }
    /**
     * @return selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
     * 
     */
    public Optional<String> selectPolicy() {
        return Optional.ofNullable(this.selectPolicy);
    }
    /**
     * @return StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
     * 
     */
    public Optional<Integer> stabilizationWindowSeconds() {
        return Optional.ofNullable(this.stabilizationWindowSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HPAScalingRulesPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<HPAScalingPolicyPatch> policies;
        private @Nullable String selectPolicy;
        private @Nullable Integer stabilizationWindowSeconds;
        public Builder() {}
        public Builder(HPAScalingRulesPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policies = defaults.policies;
    	      this.selectPolicy = defaults.selectPolicy;
    	      this.stabilizationWindowSeconds = defaults.stabilizationWindowSeconds;
        }

        @CustomType.Setter
        public Builder policies(@Nullable List<HPAScalingPolicyPatch> policies) {
            this.policies = policies;
            return this;
        }
        public Builder policies(HPAScalingPolicyPatch... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder selectPolicy(@Nullable String selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder stabilizationWindowSeconds(@Nullable Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        public HPAScalingRulesPatch build() {
            final var o = new HPAScalingRulesPatch();
            o.policies = policies;
            o.selectPolicy = selectPolicy;
            o.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return o;
        }
    }
}
