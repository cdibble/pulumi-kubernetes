// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyPeerArgs;
import com.pulumi.kubernetes.extensions.v1beta1.inputs.NetworkPolicyPortArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and only if the traffic matches both ports AND from.
 * 
 */
public final class NetworkPolicyIngressRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyIngressRuleArgs Empty = new NetworkPolicyIngressRuleArgs();

    /**
     * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     * 
     */
    @Import(name="from")
    private @Nullable Output<List<NetworkPolicyPeerArgs>> from;

    /**
     * @return List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     * 
     */
    public Optional<Output<List<NetworkPolicyPeerArgs>>> from() {
        return Optional.ofNullable(this.from);
    }

    /**
     * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<NetworkPolicyPortArgs>> ports;

    /**
     * @return List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    public Optional<Output<List<NetworkPolicyPortArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    private NetworkPolicyIngressRuleArgs() {}

    private NetworkPolicyIngressRuleArgs(NetworkPolicyIngressRuleArgs $) {
        this.from = $.from;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyIngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyIngressRuleArgs $;

        public Builder() {
            $ = new NetworkPolicyIngressRuleArgs();
        }

        public Builder(NetworkPolicyIngressRuleArgs defaults) {
            $ = new NetworkPolicyIngressRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param from List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
         * 
         * @return builder
         * 
         */
        public Builder from(@Nullable Output<List<NetworkPolicyPeerArgs>> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
         * 
         * @return builder
         * 
         */
        public Builder from(List<NetworkPolicyPeerArgs> from) {
            return from(Output.of(from));
        }

        /**
         * @param from List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
         * 
         * @return builder
         * 
         */
        public Builder from(NetworkPolicyPeerArgs... from) {
            return from(List.of(from));
        }

        /**
         * @param ports List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<NetworkPolicyPortArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<NetworkPolicyPortArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
         * 
         * @return builder
         * 
         */
        public Builder ports(NetworkPolicyPortArgs... ports) {
            return ports(List.of(ports));
        }

        public NetworkPolicyIngressRuleArgs build() {
            return $;
        }
    }

}
