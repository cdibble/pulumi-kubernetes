// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.NodeAffinityPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.PodAffinityPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.PodAntiAffinityPatchArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Affinity is a group of affinity scheduling rules.
 * 
 */
public final class AffinityPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AffinityPatchArgs Empty = new AffinityPatchArgs();

    /**
     * Describes node affinity scheduling rules for the pod.
     * 
     */
    @Import(name="nodeAffinity")
    private @Nullable Output<NodeAffinityPatchArgs> nodeAffinity;

    /**
     * @return Describes node affinity scheduling rules for the pod.
     * 
     */
    public Optional<Output<NodeAffinityPatchArgs>> nodeAffinity() {
        return Optional.ofNullable(this.nodeAffinity);
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    @Import(name="podAffinity")
    private @Nullable Output<PodAffinityPatchArgs> podAffinity;

    /**
     * @return Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    public Optional<Output<PodAffinityPatchArgs>> podAffinity() {
        return Optional.ofNullable(this.podAffinity);
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    @Import(name="podAntiAffinity")
    private @Nullable Output<PodAntiAffinityPatchArgs> podAntiAffinity;

    /**
     * @return Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    public Optional<Output<PodAntiAffinityPatchArgs>> podAntiAffinity() {
        return Optional.ofNullable(this.podAntiAffinity);
    }

    private AffinityPatchArgs() {}

    private AffinityPatchArgs(AffinityPatchArgs $) {
        this.nodeAffinity = $.nodeAffinity;
        this.podAffinity = $.podAffinity;
        this.podAntiAffinity = $.podAntiAffinity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AffinityPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AffinityPatchArgs $;

        public Builder() {
            $ = new AffinityPatchArgs();
        }

        public Builder(AffinityPatchArgs defaults) {
            $ = new AffinityPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeAffinity Describes node affinity scheduling rules for the pod.
         * 
         * @return builder
         * 
         */
        public Builder nodeAffinity(@Nullable Output<NodeAffinityPatchArgs> nodeAffinity) {
            $.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * @param nodeAffinity Describes node affinity scheduling rules for the pod.
         * 
         * @return builder
         * 
         */
        public Builder nodeAffinity(NodeAffinityPatchArgs nodeAffinity) {
            return nodeAffinity(Output.of(nodeAffinity));
        }

        /**
         * @param podAffinity Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
         * 
         * @return builder
         * 
         */
        public Builder podAffinity(@Nullable Output<PodAffinityPatchArgs> podAffinity) {
            $.podAffinity = podAffinity;
            return this;
        }

        /**
         * @param podAffinity Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
         * 
         * @return builder
         * 
         */
        public Builder podAffinity(PodAffinityPatchArgs podAffinity) {
            return podAffinity(Output.of(podAffinity));
        }

        /**
         * @param podAntiAffinity Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
         * 
         * @return builder
         * 
         */
        public Builder podAntiAffinity(@Nullable Output<PodAntiAffinityPatchArgs> podAntiAffinity) {
            $.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * @param podAntiAffinity Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
         * 
         * @return builder
         * 
         */
        public Builder podAntiAffinity(PodAntiAffinityPatchArgs podAntiAffinity) {
            return podAntiAffinity(Output.of(podAntiAffinity));
        }

        public AffinityPatchArgs build() {
            return $;
        }
    }

}
