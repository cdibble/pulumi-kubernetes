// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IDRangePatch {
    /**
     * @return max is the end of the range, inclusive.
     * 
     */
    private @Nullable Integer max;
    /**
     * @return min is the start of the range, inclusive.
     * 
     */
    private @Nullable Integer min;

    private IDRangePatch() {}
    /**
     * @return max is the end of the range, inclusive.
     * 
     */
    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }
    /**
     * @return min is the start of the range, inclusive.
     * 
     */
    public Optional<Integer> min() {
        return Optional.ofNullable(this.min);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IDRangePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer max;
        private @Nullable Integer min;
        public Builder() {}
        public Builder(IDRangePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        @CustomType.Setter
        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        @CustomType.Setter
        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }
        public IDRangePatch build() {
            final var o = new IDRangePatch();
            o.max = max;
            o.min = min;
            return o;
        }
    }
}
