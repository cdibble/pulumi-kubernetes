// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodReadinessGatePatch {
    /**
     * @return ConditionType refers to a condition in the pod&#39;s condition list with matching type.
     * 
     */
    private @Nullable String conditionType;

    private PodReadinessGatePatch() {}
    /**
     * @return ConditionType refers to a condition in the pod&#39;s condition list with matching type.
     * 
     */
    public Optional<String> conditionType() {
        return Optional.ofNullable(this.conditionType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodReadinessGatePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String conditionType;
        public Builder() {}
        public Builder(PodReadinessGatePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionType = defaults.conditionType;
        }

        @CustomType.Setter
        public Builder conditionType(@Nullable String conditionType) {
            this.conditionType = conditionType;
            return this;
        }
        public PodReadinessGatePatch build() {
            final var o = new PodReadinessGatePatch();
            o.conditionType = conditionType;
            return o;
        }
    }
}
