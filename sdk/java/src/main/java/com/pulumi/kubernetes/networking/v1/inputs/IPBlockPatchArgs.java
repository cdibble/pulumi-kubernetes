// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IPBlock describes a particular CIDR (Ex. &#34;192.168.1.1/24&#34;,&#34;2001:db9::/64&#34;) that is allowed to the pods matched by a NetworkPolicySpec&#39;s podSelector. The except entry describes CIDRs that should not be included within this rule.
 * 
 */
public final class IPBlockPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPBlockPatchArgs Empty = new IPBlockPatchArgs();

    /**
     * CIDR is a string representing the IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34;
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return CIDR is a string representing the IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34;
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34; Except values will be rejected if they are outside the CIDR range
     * 
     */
    @Import(name="except")
    private @Nullable Output<List<String>> except;

    /**
     * @return Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34; Except values will be rejected if they are outside the CIDR range
     * 
     */
    public Optional<Output<List<String>>> except() {
        return Optional.ofNullable(this.except);
    }

    private IPBlockPatchArgs() {}

    private IPBlockPatchArgs(IPBlockPatchArgs $) {
        this.cidr = $.cidr;
        this.except = $.except;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPBlockPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPBlockPatchArgs $;

        public Builder() {
            $ = new IPBlockPatchArgs();
        }

        public Builder(IPBlockPatchArgs defaults) {
            $ = new IPBlockPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr CIDR is a string representing the IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34;
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr CIDR is a string representing the IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34;
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param except Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34; Except values will be rejected if they are outside the CIDR range
         * 
         * @return builder
         * 
         */
        public Builder except(@Nullable Output<List<String>> except) {
            $.except = except;
            return this;
        }

        /**
         * @param except Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34; Except values will be rejected if they are outside the CIDR range
         * 
         * @return builder
         * 
         */
        public Builder except(List<String> except) {
            return except(Output.of(except));
        }

        /**
         * @param except Except is a slice of CIDRs that should not be included within an IP Block Valid examples are &#34;192.168.1.1/24&#34; or &#34;2001:db9::/64&#34; Except values will be rejected if they are outside the CIDR range
         * 
         * @return builder
         * 
         */
        public Builder except(String... except) {
            return except(List.of(except));
        }

        public IPBlockPatchArgs build() {
            return $;
        }
    }

}
