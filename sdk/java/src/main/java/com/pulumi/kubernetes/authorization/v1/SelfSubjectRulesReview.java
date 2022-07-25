// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authorization.v1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.authorization.v1.SelfSubjectRulesReviewArgs;
import com.pulumi.kubernetes.authorization.v1.outputs.SelfSubjectRulesReviewSpec;
import com.pulumi.kubernetes.authorization.v1.outputs.SubjectRulesReviewStatus;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a namespace. The returned list of actions may be incomplete depending on the server&#39;s authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview should be used by UIs to show/hide actions, or to quickly let an end user reason about their permissions. It should NOT Be used by external systems to drive authorization decisions as this raises confused deputy, cache lifetime/revocation, and correctness concerns. SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization decisions to the API server.
 * 
 */
@ResourceType(type="kubernetes:authorization.k8s.io/v1:SelfSubjectRulesReview")
public class SelfSubjectRulesReview extends com.pulumi.resources.CustomResource {
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
     * Spec holds information about the request being evaluated.
     * 
     */
    @Export(name="spec", type=SelfSubjectRulesReviewSpec.class, parameters={})
    private Output<SelfSubjectRulesReviewSpec> spec;

    /**
     * @return Spec holds information about the request being evaluated.
     * 
     */
    public Output<SelfSubjectRulesReviewSpec> spec() {
        return this.spec;
    }
    /**
     * Status is filled in by the server and indicates the set of actions a user can perform.
     * 
     */
    @Export(name="status", type=SubjectRulesReviewStatus.class, parameters={})
    private Output</* @Nullable */ SubjectRulesReviewStatus> status;

    /**
     * @return Status is filled in by the server and indicates the set of actions a user can perform.
     * 
     */
    public Output<Optional<SubjectRulesReviewStatus>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SelfSubjectRulesReview(String name) {
        this(name, SelfSubjectRulesReviewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SelfSubjectRulesReview(String name, SelfSubjectRulesReviewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SelfSubjectRulesReview(String name, SelfSubjectRulesReviewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:SelfSubjectRulesReview", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private SelfSubjectRulesReview(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1:SelfSubjectRulesReview", name, null, makeResourceOptions(options, id));
    }

    private static SelfSubjectRulesReviewArgs makeArgs(SelfSubjectRulesReviewArgs args) {
        var builder = args == null ? SelfSubjectRulesReviewArgs.builder() : SelfSubjectRulesReviewArgs.builder(args);
        return builder
            .apiVersion("authorization.k8s.io/v1")
            .kind("SelfSubjectRulesReview")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:authorization.k8s.io/v1beta1:SelfSubjectRulesReview").build())
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
    public static SelfSubjectRulesReview get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SelfSubjectRulesReview(name, id, options);
    }
}
