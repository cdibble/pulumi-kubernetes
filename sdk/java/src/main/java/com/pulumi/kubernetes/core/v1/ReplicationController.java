// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.core.v1.ReplicationControllerArgs;
import com.pulumi.kubernetes.core.v1.outputs.ReplicationControllerSpec;
import com.pulumi.kubernetes.core.v1.outputs.ReplicationControllerStatus;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ReplicationController represents the configuration of a replication controller.
 * 
 */
@ResourceType(type="kubernetes:core/v1:ReplicationController")
public class ReplicationController extends com.pulumi.resources.CustomResource {
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
     * If the Labels of a ReplicationController are empty, they are defaulted to be the same as the Pod(s) that the replication controller manages. Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return If the Labels of a ReplicationController are empty, they are defaulted to be the same as the Pod(s) that the replication controller manages. Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output<Optional<ObjectMeta>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Spec defines the specification of the desired behavior of the replication controller. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Export(name="spec", type=ReplicationControllerSpec.class, parameters={})
    private Output</* @Nullable */ ReplicationControllerSpec> spec;

    /**
     * @return Spec defines the specification of the desired behavior of the replication controller. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    public Output<Optional<ReplicationControllerSpec>> spec() {
        return Codegen.optional(this.spec);
    }
    /**
     * Status is the most recently observed status of the replication controller. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Export(name="status", type=ReplicationControllerStatus.class, parameters={})
    private Output</* @Nullable */ ReplicationControllerStatus> status;

    /**
     * @return Status is the most recently observed status of the replication controller. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    public Output<Optional<ReplicationControllerStatus>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationController(String name) {
        this(name, ReplicationControllerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationController(String name, @Nullable ReplicationControllerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationController(String name, @Nullable ReplicationControllerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ReplicationController", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationController(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ReplicationController", name, null, makeResourceOptions(options, id));
    }

    private static ReplicationControllerArgs makeArgs(@Nullable ReplicationControllerArgs args) {
        var builder = args == null ? ReplicationControllerArgs.builder() : ReplicationControllerArgs.builder(args);
        return builder
            .apiVersion("v1")
            .kind("ReplicationController")
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
    public static ReplicationController get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationController(name, id, options);
    }
}
