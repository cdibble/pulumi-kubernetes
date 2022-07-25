// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PodReadinessGate {
    /**
     * @return ConditionType refers to a condition in the pod&#39;s condition list with matching type.
     * 
     */
    private String conditionType;

    private PodReadinessGate() {}
    /**
     * @return ConditionType refers to a condition in the pod&#39;s condition list with matching type.
     * 
     */
    public String conditionType() {
        return this.conditionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodReadinessGate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String conditionType;
        public Builder() {}
        public Builder(PodReadinessGate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionType = defaults.conditionType;
        }

        @CustomType.Setter
        public Builder conditionType(String conditionType) {
            this.conditionType = Objects.requireNonNull(conditionType);
            return this;
        }
        public PodReadinessGate build() {
            final var o = new PodReadinessGate();
            o.conditionType = conditionType;
            return o;
        }
    }
}
