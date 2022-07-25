// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.NodeSelectorTerm;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NodeSelector {
    /**
     * @return Required. A list of node selector terms. The terms are ORed.
     * 
     */
    private List<NodeSelectorTerm> nodeSelectorTerms;

    private NodeSelector() {}
    /**
     * @return Required. A list of node selector terms. The terms are ORed.
     * 
     */
    public List<NodeSelectorTerm> nodeSelectorTerms() {
        return this.nodeSelectorTerms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<NodeSelectorTerm> nodeSelectorTerms;
        public Builder() {}
        public Builder(NodeSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeSelectorTerms = defaults.nodeSelectorTerms;
        }

        @CustomType.Setter
        public Builder nodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
            this.nodeSelectorTerms = Objects.requireNonNull(nodeSelectorTerms);
            return this;
        }
        public Builder nodeSelectorTerms(NodeSelectorTerm... nodeSelectorTerms) {
            return nodeSelectorTerms(List.of(nodeSelectorTerms));
        }
        public NodeSelector build() {
            final var o = new NodeSelector();
            o.nodeSelectorTerms = nodeSelectorTerms;
            return o;
        }
    }
}
