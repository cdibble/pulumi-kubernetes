// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.NodeSelectorTermArgs;
import java.util.List;
import java.util.Objects;


/**
 * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
 * 
 */
public final class NodeSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeSelectorArgs Empty = new NodeSelectorArgs();

    /**
     * Required. A list of node selector terms. The terms are ORed.
     * 
     */
    @Import(name="nodeSelectorTerms", required=true)
    private Output<List<NodeSelectorTermArgs>> nodeSelectorTerms;

    /**
     * @return Required. A list of node selector terms. The terms are ORed.
     * 
     */
    public Output<List<NodeSelectorTermArgs>> nodeSelectorTerms() {
        return this.nodeSelectorTerms;
    }

    private NodeSelectorArgs() {}

    private NodeSelectorArgs(NodeSelectorArgs $) {
        this.nodeSelectorTerms = $.nodeSelectorTerms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeSelectorArgs $;

        public Builder() {
            $ = new NodeSelectorArgs();
        }

        public Builder(NodeSelectorArgs defaults) {
            $ = new NodeSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeSelectorTerms Required. A list of node selector terms. The terms are ORed.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelectorTerms(Output<List<NodeSelectorTermArgs>> nodeSelectorTerms) {
            $.nodeSelectorTerms = nodeSelectorTerms;
            return this;
        }

        /**
         * @param nodeSelectorTerms Required. A list of node selector terms. The terms are ORed.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelectorTerms(List<NodeSelectorTermArgs> nodeSelectorTerms) {
            return nodeSelectorTerms(Output.of(nodeSelectorTerms));
        }

        /**
         * @param nodeSelectorTerms Required. A list of node selector terms. The terms are ORed.
         * 
         * @return builder
         * 
         */
        public Builder nodeSelectorTerms(NodeSelectorTermArgs... nodeSelectorTerms) {
            return nodeSelectorTerms(List.of(nodeSelectorTerms));
        }

        public NodeSelectorArgs build() {
            $.nodeSelectorTerms = Objects.requireNonNull($.nodeSelectorTerms, "expected parameter 'nodeSelectorTerms' to be non-null");
            return $;
        }
    }

}
