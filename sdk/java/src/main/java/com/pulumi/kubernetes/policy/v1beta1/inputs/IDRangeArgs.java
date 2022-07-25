// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * IDRange provides a min/max of an allowed range of IDs.
 * 
 */
public final class IDRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final IDRangeArgs Empty = new IDRangeArgs();

    /**
     * max is the end of the range, inclusive.
     * 
     */
    @Import(name="max", required=true)
    private Output<Integer> max;

    /**
     * @return max is the end of the range, inclusive.
     * 
     */
    public Output<Integer> max() {
        return this.max;
    }

    /**
     * min is the start of the range, inclusive.
     * 
     */
    @Import(name="min", required=true)
    private Output<Integer> min;

    /**
     * @return min is the start of the range, inclusive.
     * 
     */
    public Output<Integer> min() {
        return this.min;
    }

    private IDRangeArgs() {}

    private IDRangeArgs(IDRangeArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IDRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IDRangeArgs $;

        public Builder() {
            $ = new IDRangeArgs();
        }

        public Builder(IDRangeArgs defaults) {
            $ = new IDRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param max max is the end of the range, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder max(Output<Integer> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max max is the end of the range, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        /**
         * @param min min is the start of the range, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder min(Output<Integer> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min min is the start of the range, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public IDRangeArgs build() {
            $.max = Objects.requireNonNull($.max, "expected parameter 'max' to be non-null");
            $.min = Objects.requireNonNull($.min, "expected parameter 'min' to be non-null");
            return $;
        }
    }

}
