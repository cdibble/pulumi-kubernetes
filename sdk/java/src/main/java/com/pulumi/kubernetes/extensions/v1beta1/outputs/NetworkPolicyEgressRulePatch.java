// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.extensions.v1beta1.outputs.NetworkPolicyPeerPatch;
import com.pulumi.kubernetes.extensions.v1beta1.outputs.NetworkPolicyPortPatch;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NetworkPolicyEgressRulePatch {
    /**
     * @return List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    private @Nullable List<NetworkPolicyPortPatch> ports;
    /**
     * @return List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
     * 
     */
    private @Nullable List<NetworkPolicyPeerPatch> to;

    private NetworkPolicyEgressRulePatch() {}
    /**
     * @return List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    public List<NetworkPolicyPortPatch> ports() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * @return List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
     * 
     */
    public List<NetworkPolicyPeerPatch> to() {
        return this.to == null ? List.of() : this.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyEgressRulePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NetworkPolicyPortPatch> ports;
        private @Nullable List<NetworkPolicyPeerPatch> to;
        public Builder() {}
        public Builder(NetworkPolicyEgressRulePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder ports(@Nullable List<NetworkPolicyPortPatch> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(NetworkPolicyPortPatch... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder to(@Nullable List<NetworkPolicyPeerPatch> to) {
            this.to = to;
            return this;
        }
        public Builder to(NetworkPolicyPeerPatch... to) {
            return to(List.of(to));
        }
        public NetworkPolicyEgressRulePatch build() {
            final var o = new NetworkPolicyEgressRulePatch();
            o.ports = ports;
            o.to = to;
            return o;
        }
    }
}
