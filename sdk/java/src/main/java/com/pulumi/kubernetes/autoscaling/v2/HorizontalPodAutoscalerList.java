// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.autoscaling.v2.HorizontalPodAutoscalerListArgs;
import com.pulumi.kubernetes.autoscaling.v2.outputs.HorizontalPodAutoscaler;
import com.pulumi.kubernetes.meta.v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
 * 
 */
@ResourceType(type="kubernetes:autoscaling/v2:HorizontalPodAutoscalerList")
public class HorizontalPodAutoscalerList extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output<Optional<String>> apiVersion() {
        return Codegen.optional(this.apiVersion);
    }
    /**
     * items is the list of horizontal pod autoscaler objects.
     * 
     */
    @Export(name="items", type=List.class, parameters={HorizontalPodAutoscaler.class})
    private Output<List<HorizontalPodAutoscaler>> items;

    /**
     * @return items is the list of horizontal pod autoscaler objects.
     * 
     */
    public Output<List<HorizontalPodAutoscaler>> items() {
        return this.items;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * metadata is the standard list metadata.
     * 
     */
    @Export(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    /**
     * @return metadata is the standard list metadata.
     * 
     */
    public Output<Optional<ListMeta>> metadata() {
        return Codegen.optional(this.metadata);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HorizontalPodAutoscalerList(String name) {
        this(name, HorizontalPodAutoscalerListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HorizontalPodAutoscalerList(String name, HorizontalPodAutoscalerListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HorizontalPodAutoscalerList(String name, HorizontalPodAutoscalerListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v2:HorizontalPodAutoscalerList", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private HorizontalPodAutoscalerList(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v2:HorizontalPodAutoscalerList", name, null, makeResourceOptions(options, id));
    }

    private static HorizontalPodAutoscalerListArgs makeArgs(HorizontalPodAutoscalerListArgs args) {
        var builder = args == null ? HorizontalPodAutoscalerListArgs.builder() : HorizontalPodAutoscalerListArgs.builder(args);
        return builder
            .apiVersion("autoscaling/v2")
            .kind("HorizontalPodAutoscalerList")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HorizontalPodAutoscalerList get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HorizontalPodAutoscalerList(name, id, options);
    }
}
