// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.SELinuxOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
 * 
 */
public final class SELinuxStrategyOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SELinuxStrategyOptionsArgs Empty = new SELinuxStrategyOptionsArgs();

    /**
     * rule is the strategy that will dictate the allowable labels that may be set.
     * 
     */
    @Import(name="rule", required=true)
    private Output<String> rule;

    /**
     * @return rule is the strategy that will dictate the allowable labels that may be set.
     * 
     */
    public Output<String> rule() {
        return this.rule;
    }

    /**
     * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @Import(name="seLinuxOptions")
    private @Nullable Output<SELinuxOptionsArgs> seLinuxOptions;

    /**
     * @return seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    public Optional<Output<SELinuxOptionsArgs>> seLinuxOptions() {
        return Optional.ofNullable(this.seLinuxOptions);
    }

    private SELinuxStrategyOptionsArgs() {}

    private SELinuxStrategyOptionsArgs(SELinuxStrategyOptionsArgs $) {
        this.rule = $.rule;
        this.seLinuxOptions = $.seLinuxOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SELinuxStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SELinuxStrategyOptionsArgs $;

        public Builder() {
            $ = new SELinuxStrategyOptionsArgs();
        }

        public Builder(SELinuxStrategyOptionsArgs defaults) {
            $ = new SELinuxStrategyOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rule rule is the strategy that will dictate the allowable labels that may be set.
         * 
         * @return builder
         * 
         */
        public Builder rule(Output<String> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule rule is the strategy that will dictate the allowable labels that may be set.
         * 
         * @return builder
         * 
         */
        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param seLinuxOptions seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
         * 
         * @return builder
         * 
         */
        public Builder seLinuxOptions(@Nullable Output<SELinuxOptionsArgs> seLinuxOptions) {
            $.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * @param seLinuxOptions seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
         * 
         * @return builder
         * 
         */
        public Builder seLinuxOptions(SELinuxOptionsArgs seLinuxOptions) {
            return seLinuxOptions(Output.of(seLinuxOptions));
        }

        public SELinuxStrategyOptionsArgs build() {
            $.rule = Objects.requireNonNull($.rule, "expected parameter 'rule' to be non-null");
            return $;
        }
    }

}
