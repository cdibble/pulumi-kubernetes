// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.autoscaling.v2.inputs.ContainerResourceMetricSourceArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.ExternalMetricSourceArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.ObjectMetricSourceArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.PodsMetricSourceArgs;
import com.pulumi.kubernetes.autoscaling.v2.inputs.ResourceMetricSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
 * 
 */
public final class MetricSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricSpecArgs Empty = new MetricSpecArgs();

    /**
     * containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
     * 
     */
    @Import(name="containerResource")
    private @Nullable Output<ContainerResourceMetricSourceArgs> containerResource;

    /**
     * @return containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
     * 
     */
    public Optional<Output<ContainerResourceMetricSourceArgs>> containerResource() {
        return Optional.ofNullable(this.containerResource);
    }

    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    @Import(name="external")
    private @Nullable Output<ExternalMetricSourceArgs> external;

    /**
     * @return external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    public Optional<Output<ExternalMetricSourceArgs>> external() {
        return Optional.ofNullable(this.external);
    }

    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    @Import(name="object")
    private @Nullable Output<ObjectMetricSourceArgs> object;

    /**
     * @return object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    public Optional<Output<ObjectMetricSourceArgs>> object() {
        return Optional.ofNullable(this.object);
    }

    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    @Import(name="pods")
    private @Nullable Output<PodsMetricSourceArgs> pods;

    /**
     * @return pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    public Optional<Output<PodsMetricSourceArgs>> pods() {
        return Optional.ofNullable(this.pods);
    }

    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<ResourceMetricSourceArgs> resource;

    /**
     * @return resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
     * 
     */
    public Optional<Output<ResourceMetricSourceArgs>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * type is the type of metric source.  It should be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each mapping to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return type is the type of metric source.  It should be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each mapping to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private MetricSpecArgs() {}

    private MetricSpecArgs(MetricSpecArgs $) {
        this.containerResource = $.containerResource;
        this.external = $.external;
        this.object = $.object;
        this.pods = $.pods;
        this.resource = $.resource;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricSpecArgs $;

        public Builder() {
            $ = new MetricSpecArgs();
        }

        public Builder(MetricSpecArgs defaults) {
            $ = new MetricSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerResource containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
         * 
         * @return builder
         * 
         */
        public Builder containerResource(@Nullable Output<ContainerResourceMetricSourceArgs> containerResource) {
            $.containerResource = containerResource;
            return this;
        }

        /**
         * @param containerResource containerResource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
         * 
         * @return builder
         * 
         */
        public Builder containerResource(ContainerResourceMetricSourceArgs containerResource) {
            return containerResource(Output.of(containerResource));
        }

        /**
         * @param external external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
         * 
         * @return builder
         * 
         */
        public Builder external(@Nullable Output<ExternalMetricSourceArgs> external) {
            $.external = external;
            return this;
        }

        /**
         * @param external external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
         * 
         * @return builder
         * 
         */
        public Builder external(ExternalMetricSourceArgs external) {
            return external(Output.of(external));
        }

        /**
         * @param object object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
         * 
         * @return builder
         * 
         */
        public Builder object(@Nullable Output<ObjectMetricSourceArgs> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
         * 
         * @return builder
         * 
         */
        public Builder object(ObjectMetricSourceArgs object) {
            return object(Output.of(object));
        }

        /**
         * @param pods pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
         * 
         * @return builder
         * 
         */
        public Builder pods(@Nullable Output<PodsMetricSourceArgs> pods) {
            $.pods = pods;
            return this;
        }

        /**
         * @param pods pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
         * 
         * @return builder
         * 
         */
        public Builder pods(PodsMetricSourceArgs pods) {
            return pods(Output.of(pods));
        }

        /**
         * @param resource resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<ResourceMetricSourceArgs> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.
         * 
         * @return builder
         * 
         */
        public Builder resource(ResourceMetricSourceArgs resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param type type is the type of metric source.  It should be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each mapping to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type type is the type of metric source.  It should be one of &#34;ContainerResource&#34;, &#34;External&#34;, &#34;Object&#34;, &#34;Pods&#34; or &#34;Resource&#34;, each mapping to a matching field in the object. Note: &#34;ContainerResource&#34; type is available on when the feature-gate HPAContainerMetrics is enabled
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MetricSpecArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
