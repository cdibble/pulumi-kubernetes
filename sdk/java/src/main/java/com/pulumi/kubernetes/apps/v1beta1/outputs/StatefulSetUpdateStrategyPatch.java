// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apps.v1beta1.outputs.RollingUpdateStatefulSetStrategyPatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StatefulSetUpdateStrategyPatch {
    /**
     * @return RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
     */
    private @Nullable RollingUpdateStatefulSetStrategyPatch rollingUpdate;
    /**
     * @return Type indicates the type of the StatefulSetUpdateStrategy.
     * 
     */
    private @Nullable String type;

    private StatefulSetUpdateStrategyPatch() {}
    /**
     * @return RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
     */
    public Optional<RollingUpdateStatefulSetStrategyPatch> rollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * @return Type indicates the type of the StatefulSetUpdateStrategy.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetUpdateStrategyPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RollingUpdateStatefulSetStrategyPatch rollingUpdate;
        private @Nullable String type;
        public Builder() {}
        public Builder(StatefulSetUpdateStrategyPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder rollingUpdate(@Nullable RollingUpdateStatefulSetStrategyPatch rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public StatefulSetUpdateStrategyPatch build() {
            final var o = new StatefulSetUpdateStrategyPatch();
            o.rollingUpdate = rollingUpdate;
            o.type = type;
            return o;
        }
    }
}
