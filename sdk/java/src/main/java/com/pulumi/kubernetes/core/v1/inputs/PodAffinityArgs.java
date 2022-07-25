// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.PodAffinityTermArgs;
import com.pulumi.kubernetes.core.v1.inputs.WeightedPodAffinityTermArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pod affinity is a group of inter pod affinity scheduling rules.
 * 
 */
public final class PodAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodAffinityArgs Empty = new PodAffinityArgs();

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding &#34;weight&#34; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
     */
    @Import(name="preferredDuringSchedulingIgnoredDuringExecution")
    private @Nullable Output<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;

    /**
     * @return The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding &#34;weight&#34; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
     */
    public Optional<Output<List<WeightedPodAffinityTermArgs>>> preferredDuringSchedulingIgnoredDuringExecution() {
        return Optional.ofNullable(this.preferredDuringSchedulingIgnoredDuringExecution);
    }

    /**
     * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
     */
    @Import(name="requiredDuringSchedulingIgnoredDuringExecution")
    private @Nullable Output<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution;

    /**
     * @return If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
     */
    public Optional<Output<List<PodAffinityTermArgs>>> requiredDuringSchedulingIgnoredDuringExecution() {
        return Optional.ofNullable(this.requiredDuringSchedulingIgnoredDuringExecution);
    }

    private PodAffinityArgs() {}

    private PodAffinityArgs(PodAffinityArgs $) {
        this.preferredDuringSchedulingIgnoredDuringExecution = $.preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = $.requiredDuringSchedulingIgnoredDuringExecution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodAffinityArgs $;

        public Builder() {
            $ = new PodAffinityArgs();
        }

        public Builder(PodAffinityArgs defaults) {
            $ = new PodAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preferredDuringSchedulingIgnoredDuringExecution The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding &#34;weight&#34; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
         * 
         * @return builder
         * 
         */
        public Builder preferredDuringSchedulingIgnoredDuringExecution(@Nullable Output<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution) {
            $.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * @param preferredDuringSchedulingIgnoredDuringExecution The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding &#34;weight&#34; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
         * 
         * @return builder
         * 
         */
        public Builder preferredDuringSchedulingIgnoredDuringExecution(List<WeightedPodAffinityTermArgs> preferredDuringSchedulingIgnoredDuringExecution) {
            return preferredDuringSchedulingIgnoredDuringExecution(Output.of(preferredDuringSchedulingIgnoredDuringExecution));
        }

        /**
         * @param preferredDuringSchedulingIgnoredDuringExecution The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding &#34;weight&#34; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
         * 
         * @return builder
         * 
         */
        public Builder preferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTermArgs... preferredDuringSchedulingIgnoredDuringExecution) {
            return preferredDuringSchedulingIgnoredDuringExecution(List.of(preferredDuringSchedulingIgnoredDuringExecution));
        }

        /**
         * @param requiredDuringSchedulingIgnoredDuringExecution If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
         * 
         * @return builder
         * 
         */
        public Builder requiredDuringSchedulingIgnoredDuringExecution(@Nullable Output<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution) {
            $.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        /**
         * @param requiredDuringSchedulingIgnoredDuringExecution If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
         * 
         * @return builder
         * 
         */
        public Builder requiredDuringSchedulingIgnoredDuringExecution(List<PodAffinityTermArgs> requiredDuringSchedulingIgnoredDuringExecution) {
            return requiredDuringSchedulingIgnoredDuringExecution(Output.of(requiredDuringSchedulingIgnoredDuringExecution));
        }

        /**
         * @param requiredDuringSchedulingIgnoredDuringExecution If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
         * 
         * @return builder
         * 
         */
        public Builder requiredDuringSchedulingIgnoredDuringExecution(PodAffinityTermArgs... requiredDuringSchedulingIgnoredDuringExecution) {
            return requiredDuringSchedulingIgnoredDuringExecution(List.of(requiredDuringSchedulingIgnoredDuringExecution));
        }

        public PodAffinityArgs build() {
            return $;
        }
    }

}
