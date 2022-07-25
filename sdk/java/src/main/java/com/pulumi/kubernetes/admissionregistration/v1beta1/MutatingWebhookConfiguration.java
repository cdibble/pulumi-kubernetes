// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.v1beta1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.admissionregistration.v1beta1.MutatingWebhookConfigurationArgs;
import com.pulumi.kubernetes.admissionregistration.v1beta1.outputs.MutatingWebhook;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object. Deprecated in v1.16, planned for removal in v1.19. Use admissionregistration.k8s.io/v1 MutatingWebhookConfiguration instead.
 * 
 */
@ResourceType(type="kubernetes:admissionregistration.k8s.io/v1beta1:MutatingWebhookConfiguration")
public class MutatingWebhookConfiguration extends com.pulumi.resources.CustomResource {
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
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    public Output<Optional<ObjectMeta>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Webhooks is a list of webhooks and the affected resources and operations.
     * 
     */
    @Export(name="webhooks", type=List.class, parameters={MutatingWebhook.class})
    private Output</* @Nullable */ List<MutatingWebhook>> webhooks;

    /**
     * @return Webhooks is a list of webhooks and the affected resources and operations.
     * 
     */
    public Output<Optional<List<MutatingWebhook>>> webhooks() {
        return Codegen.optional(this.webhooks);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MutatingWebhookConfiguration(String name) {
        this(name, MutatingWebhookConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MutatingWebhookConfiguration(String name, @Nullable MutatingWebhookConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MutatingWebhookConfiguration(String name, @Nullable MutatingWebhookConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1beta1:MutatingWebhookConfiguration", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private MutatingWebhookConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1beta1:MutatingWebhookConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static MutatingWebhookConfigurationArgs makeArgs(@Nullable MutatingWebhookConfigurationArgs args) {
        var builder = args == null ? MutatingWebhookConfigurationArgs.builder() : MutatingWebhookConfigurationArgs.builder(args);
        return builder
            .apiVersion("admissionregistration.k8s.io/v1beta1")
            .kind("MutatingWebhookConfiguration")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:admissionregistration.k8s.io/v1:MutatingWebhookConfiguration").build())
            ))
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
    public static MutatingWebhookConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MutatingWebhookConfiguration(name, id, options);
    }
}
