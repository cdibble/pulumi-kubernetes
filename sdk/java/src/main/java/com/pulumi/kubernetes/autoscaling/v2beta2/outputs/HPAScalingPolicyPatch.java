// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HPAScalingPolicyPatch {
    /**
     * @return PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * 
     */
    private @Nullable Integer periodSeconds;
    /**
     * @return Type is used to specify the scaling policy.
     * 
     */
    private @Nullable String type;
    /**
     * @return Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * 
     */
    private @Nullable Integer value;

    private HPAScalingPolicyPatch() {}
    /**
     * @return PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return Type is used to specify the scaling policy.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * 
     */
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HPAScalingPolicyPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer periodSeconds;
        private @Nullable String type;
        private @Nullable Integer value;
        public Builder() {}
        public Builder(HPAScalingPolicyPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public HPAScalingPolicyPatch build() {
            final var o = new HPAScalingPolicyPatch();
            o.periodSeconds = periodSeconds;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}
