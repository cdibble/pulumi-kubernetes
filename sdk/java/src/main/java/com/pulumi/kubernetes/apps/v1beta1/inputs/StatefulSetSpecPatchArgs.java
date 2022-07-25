// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apps.v1beta1.inputs.StatefulSetUpdateStrategyPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.PersistentVolumeClaimPatchArgs;
import com.pulumi.kubernetes.core.v1.inputs.PodTemplateSpecPatchArgs;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorPatchArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 * 
 */
public final class StatefulSetSpecPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetSpecPatchArgs Empty = new StatefulSetSpecPatchArgs();

    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     */
    @Import(name="podManagementPolicy")
    private @Nullable Output<String> podManagementPolicy;

    /**
     * @return podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     */
    public Optional<Output<String>> podManagementPolicy() {
        return Optional.ofNullable(this.podManagementPolicy);
    }

    /**
     * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<Integer> replicas;

    /**
     * @return replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    public Optional<Output<Integer>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
    private @Nullable Output<Integer> revisionHistoryLimit;

    /**
     * @return revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    public Optional<Output<Integer>> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }

    /**
     * selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorPatchArgs> selector;

    /**
     * @return selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    public Optional<Output<LabelSelectorPatchArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     * 
     */
    @Import(name="template")
    private @Nullable Output<PodTemplateSpecPatchArgs> template;

    /**
     * @return template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     * 
     */
    public Optional<Output<PodTemplateSpecPatchArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    @Import(name="updateStrategy")
    private @Nullable Output<StatefulSetUpdateStrategyPatchArgs> updateStrategy;

    /**
     * @return updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    public Optional<Output<StatefulSetUpdateStrategyPatchArgs>> updateStrategy() {
        return Optional.ofNullable(this.updateStrategy);
    }

    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    @Import(name="volumeClaimTemplates")
    private @Nullable Output<List<PersistentVolumeClaimPatchArgs>> volumeClaimTemplates;

    /**
     * @return volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    public Optional<Output<List<PersistentVolumeClaimPatchArgs>>> volumeClaimTemplates() {
        return Optional.ofNullable(this.volumeClaimTemplates);
    }

    private StatefulSetSpecPatchArgs() {}

    private StatefulSetSpecPatchArgs(StatefulSetSpecPatchArgs $) {
        this.podManagementPolicy = $.podManagementPolicy;
        this.replicas = $.replicas;
        this.revisionHistoryLimit = $.revisionHistoryLimit;
        this.selector = $.selector;
        this.serviceName = $.serviceName;
        this.template = $.template;
        this.updateStrategy = $.updateStrategy;
        this.volumeClaimTemplates = $.volumeClaimTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetSpecPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetSpecPatchArgs $;

        public Builder() {
            $ = new StatefulSetSpecPatchArgs();
        }

        public Builder(StatefulSetSpecPatchArgs defaults) {
            $ = new StatefulSetSpecPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param podManagementPolicy podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
         * 
         * @return builder
         * 
         */
        public Builder podManagementPolicy(@Nullable Output<String> podManagementPolicy) {
            $.podManagementPolicy = podManagementPolicy;
            return this;
        }

        /**
         * @param podManagementPolicy podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
         * 
         * @return builder
         * 
         */
        public Builder podManagementPolicy(String podManagementPolicy) {
            return podManagementPolicy(Output.of(podManagementPolicy));
        }

        /**
         * @param replicas replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            $.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * @param revisionHistoryLimit revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(Integer revisionHistoryLimit) {
            return revisionHistoryLimit(Output.of(revisionHistoryLimit));
        }

        /**
         * @param selector selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<LabelSelectorPatchArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorPatchArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param serviceName serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where &#34;pod-specific-string&#34; is managed by the StatefulSet controller.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param template template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<PodTemplateSpecPatchArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
         * 
         * @return builder
         * 
         */
        public Builder template(PodTemplateSpecPatchArgs template) {
            return template(Output.of(template));
        }

        /**
         * @param updateStrategy updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(@Nullable Output<StatefulSetUpdateStrategyPatchArgs> updateStrategy) {
            $.updateStrategy = updateStrategy;
            return this;
        }

        /**
         * @param updateStrategy updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
         * 
         * @return builder
         * 
         */
        public Builder updateStrategy(StatefulSetUpdateStrategyPatchArgs updateStrategy) {
            return updateStrategy(Output.of(updateStrategy));
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(@Nullable Output<List<PersistentVolumeClaimPatchArgs>> volumeClaimTemplates) {
            $.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(List<PersistentVolumeClaimPatchArgs> volumeClaimTemplates) {
            return volumeClaimTemplates(Output.of(volumeClaimTemplates));
        }

        /**
         * @param volumeClaimTemplates volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
         * 
         * @return builder
         * 
         */
        public Builder volumeClaimTemplates(PersistentVolumeClaimPatchArgs... volumeClaimTemplates) {
            return volumeClaimTemplates(List.of(volumeClaimTemplates));
        }

        public StatefulSetSpecPatchArgs build() {
            return $;
        }
    }

}
