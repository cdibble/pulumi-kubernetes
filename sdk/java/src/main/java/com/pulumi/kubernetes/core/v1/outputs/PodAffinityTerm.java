// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta.v1.outputs.LabelSelector;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PodAffinityTerm {
    /**
     * @return A label query over a set of resources, in this case pods.
     * 
     */
    private @Nullable LabelSelector labelSelector;
    /**
     * @return A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means &#34;this pod&#39;s namespace&#34;. An empty selector ({}) matches all namespaces.
     * 
     */
    private @Nullable LabelSelector namespaceSelector;
    /**
     * @return namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means &#34;this pod&#39;s namespace&#34;.
     * 
     */
    private @Nullable List<String> namespaces;
    /**
     * @return This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * 
     */
    private String topologyKey;

    private PodAffinityTerm() {}
    /**
     * @return A label query over a set of resources, in this case pods.
     * 
     */
    public Optional<LabelSelector> labelSelector() {
        return Optional.ofNullable(this.labelSelector);
    }
    /**
     * @return A label query over the set of namespaces that the term applies to. The term is applied to the union of the namespaces selected by this field and the ones listed in the namespaces field. null selector and null or empty namespaces list means &#34;this pod&#39;s namespace&#34;. An empty selector ({}) matches all namespaces.
     * 
     */
    public Optional<LabelSelector> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }
    /**
     * @return namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means &#34;this pod&#39;s namespace&#34;.
     * 
     */
    public List<String> namespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    /**
     * @return This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * 
     */
    public String topologyKey() {
        return this.topologyKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodAffinityTerm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LabelSelector labelSelector;
        private @Nullable LabelSelector namespaceSelector;
        private @Nullable List<String> namespaces;
        private String topologyKey;
        public Builder() {}
        public Builder(PodAffinityTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelector = defaults.labelSelector;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.namespaces = defaults.namespaces;
    	      this.topologyKey = defaults.topologyKey;
        }

        @CustomType.Setter
        public Builder labelSelector(@Nullable LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceSelector(@Nullable LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }
        @CustomType.Setter
        public Builder namespaces(@Nullable List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }
        @CustomType.Setter
        public Builder topologyKey(String topologyKey) {
            this.topologyKey = Objects.requireNonNull(topologyKey);
            return this;
        }
        public PodAffinityTerm build() {
            final var o = new PodAffinityTerm();
            o.labelSelector = labelSelector;
            o.namespaceSelector = namespaceSelector;
            o.namespaces = namespaces;
            o.topologyKey = topologyKey;
            return o;
        }
    }
}
