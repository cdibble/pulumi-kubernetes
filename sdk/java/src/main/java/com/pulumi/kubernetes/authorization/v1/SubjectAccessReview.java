// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authorization.v1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.authorization.v1.SubjectAccessReviewArgs;
import com.pulumi.kubernetes.authorization.v1.outputs.SubjectAccessReviewSpec;
import com.pulumi.kubernetes.authorization.v1.outputs.SubjectAccessReviewStatus;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * SubjectAccessReview checks whether or not a user or group can perform an action.
 * 
 */
@ResourceType(type="kubernetes:authorization.k8s.io/v1:SubjectAccessReview")
public class SubjectAccessReview extends com.pulumi.resources.CustomResource {
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
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output<Optional<ObjectMeta>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Spec holds information about the request being evaluated
     * 
     */
    @Export(name="spec", type=SubjectAccessReviewSpec.class, parameters={})
    private Output<SubjectAccessReviewSpec> spec;

    /**
     * @return Spec holds information about the request being evaluated
     * 
     */
    public Output<SubjectAccessReviewSpec> spec() {
        return this.spec;
    }
    /**
     * Status is filled in by the server and indicates whether the request is allowed or not
     * 
     */
    @Export(name="status", type=SubjectAccessReviewStatus.class, parameters={})
    private Output</* @Nullable */ SubjectAccessReviewStatus> status;

    /**
     * @return Status is filled in by the server and indicates whether the request is allowed or not
     * 
     */
    public Output<Optional<SubjectAccessReviewStatus>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubjectAccessReview(String name) {
        this(name, SubjectAccessReviewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubjectAccessReview(String name, SubjectAccessReviewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubjectAccessReview(String name, SubjectAccessReviewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:SubjectAccessReview", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private SubjectAccessReview(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:SubjectAccessReview", name, null, makeResourceOptions(options, id));
    }

    private static SubjectAccessReviewArgs makeArgs(SubjectAccessReviewArgs args) {
        var builder = args == null ? SubjectAccessReviewArgs.builder() : SubjectAccessReviewArgs.builder(args);
        return builder
            .apiVersion("authorization.k8s.io/v1")
            .kind("SubjectAccessReview")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:authorization.k8s.io/v1beta1:SubjectAccessReview").build())
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
    public static SubjectAccessReview get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SubjectAccessReview(name, id, options);
    }
}
