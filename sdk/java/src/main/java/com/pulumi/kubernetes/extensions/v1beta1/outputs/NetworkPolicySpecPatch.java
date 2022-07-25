// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.extensions.v1beta1.outputs.NetworkPolicyEgressRulePatch;
import com.pulumi.kubernetes.extensions.v1beta1.outputs.NetworkPolicyIngressRulePatch;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelectorPatch;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkPolicySpecPatch {
    /**
     * @return List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
     * 
     */
    private @Nullable List<NetworkPolicyEgressRulePatch> egress;
    /**
     * @return List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod OR if the traffic source is the pod&#39;s local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default).
     * 
     */
    private @Nullable List<NetworkPolicyIngressRulePatch> ingress;
    /**
     * @return Selects the pods to which this NetworkPolicy object applies.  The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods.  In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
     * 
     */
    private @Nullable LabelSelectorPatch podSelector;
    /**
     * @return List of rule types that the NetworkPolicy relates to. Valid options are &#34;Ingress&#34;, &#34;Egress&#34;, or &#34;Ingress,Egress&#34;. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ &#34;Egress&#34; ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include &#34;Egress&#34; (since such a policy would not include an Egress section and would otherwise default to just [ &#34;Ingress&#34; ]). This field is beta-level in 1.8
     * 
     */
    private @Nullable List<String> policyTypes;

    private NetworkPolicySpecPatch() {}
    /**
     * @return List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
     * 
     */
    public List<NetworkPolicyEgressRulePatch> egress() {
        return this.egress == null ? List.of() : this.egress;
    }
    /**
     * @return List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod OR if the traffic source is the pod&#39;s local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default).
     * 
     */
    public List<NetworkPolicyIngressRulePatch> ingress() {
        return this.ingress == null ? List.of() : this.ingress;
    }
    /**
     * @return Selects the pods to which this NetworkPolicy object applies.  The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods.  In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
     * 
     */
    public Optional<LabelSelectorPatch> podSelector() {
        return Optional.ofNullable(this.podSelector);
    }
    /**
     * @return List of rule types that the NetworkPolicy relates to. Valid options are &#34;Ingress&#34;, &#34;Egress&#34;, or &#34;Ingress,Egress&#34;. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ &#34;Egress&#34; ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include &#34;Egress&#34; (since such a policy would not include an Egress section and would otherwise default to just [ &#34;Ingress&#34; ]). This field is beta-level in 1.8
     * 
     */
    public List<String> policyTypes() {
        return this.policyTypes == null ? List.of() : this.policyTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicySpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NetworkPolicyEgressRulePatch> egress;
        private @Nullable List<NetworkPolicyIngressRulePatch> ingress;
        private @Nullable LabelSelectorPatch podSelector;
        private @Nullable List<String> policyTypes;
        public Builder() {}
        public Builder(NetworkPolicySpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egress = defaults.egress;
    	      this.ingress = defaults.ingress;
    	      this.podSelector = defaults.podSelector;
    	      this.policyTypes = defaults.policyTypes;
        }

        @CustomType.Setter
        public Builder egress(@Nullable List<NetworkPolicyEgressRulePatch> egress) {
            this.egress = egress;
            return this;
        }
        public Builder egress(NetworkPolicyEgressRulePatch... egress) {
            return egress(List.of(egress));
        }
        @CustomType.Setter
        public Builder ingress(@Nullable List<NetworkPolicyIngressRulePatch> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(NetworkPolicyIngressRulePatch... ingress) {
            return ingress(List.of(ingress));
        }
        @CustomType.Setter
        public Builder podSelector(@Nullable LabelSelectorPatch podSelector) {
            this.podSelector = podSelector;
            return this;
        }
        @CustomType.Setter
        public Builder policyTypes(@Nullable List<String> policyTypes) {
            this.policyTypes = policyTypes;
            return this;
        }
        public Builder policyTypes(String... policyTypes) {
            return policyTypes(List.of(policyTypes));
        }
        public NetworkPolicySpecPatch build() {
            final var o = new NetworkPolicySpecPatch();
            o.egress = egress;
            o.ingress = ingress;
            o.podSelector = podSelector;
            o.policyTypes = policyTypes;
            return o;
        }
    }
}
