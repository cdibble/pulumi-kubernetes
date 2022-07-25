// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.v1beta1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMetaPatch;
import com.pulumi.kubernetes.rbac.v1beta1.ClusterRolePatchArgs;
import com.pulumi.kubernetes.rbac.v1beta1.outputs.AggregationRulePatch;
import com.pulumi.kubernetes.rbac.v1beta1.outputs.PolicyRulePatch;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Patch resources are used to modify existing Kubernetes resources by using
 * Server-Side Apply updates. The name of the resource must be specified, but all other properties are optional. More than
 * one patch may be applied to the same resource, and a random FieldManager name will be used for each Patch resource.
 * Conflicts will result in an error by default, but can be forced using the &#34;pulumi.com/patchForce&#34; annotation. See the
 * [Server-Side Apply Docs](https://www.pulumi.com/registry/packages/kubernetes/installation-configuration/#server-side-apply) for
 * additional information about using Server-Side Apply to manage Kubernetes resources with Pulumi.
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.20.
 * 
 */
@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRolePatch")
public class ClusterRolePatch extends com.pulumi.resources.CustomResource {
    /**
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    @Export(name="aggregationRule", type=AggregationRulePatch.class, parameters={})
    private Output</* @Nullable */ AggregationRulePatch> aggregationRule;

    /**
     * @return AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    public Output<Optional<AggregationRulePatch>> aggregationRule() {
        return Codegen.optional(this.aggregationRule);
    }
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
     * Standard object&#39;s metadata.
     * 
     */
    @Export(name="metadata", type=ObjectMetaPatch.class, parameters={})
    private Output</* @Nullable */ ObjectMetaPatch> metadata;

    /**
     * @return Standard object&#39;s metadata.
     * 
     */
    public Output<Optional<ObjectMetaPatch>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    @Export(name="rules", type=List.class, parameters={PolicyRulePatch.class})
    private Output</* @Nullable */ List<PolicyRulePatch>> rules;

    /**
     * @return Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    public Output<Optional<List<PolicyRulePatch>>> rules() {
        return Codegen.optional(this.rules);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRolePatch(String name) {
        this(name, ClusterRolePatchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRolePatch(String name, ClusterRolePatchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRolePatch(String name, ClusterRolePatchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRolePatch", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterRolePatch(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRolePatch", name, null, makeResourceOptions(options, id));
    }

    private static ClusterRolePatchArgs makeArgs(ClusterRolePatchArgs args) {
        var builder = args == null ? ClusterRolePatchArgs.builder() : ClusterRolePatchArgs.builder(args);
        return builder
            .apiVersion("rbac.authorization.k8s.io/v1beta1")
            .kind("ClusterRole")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:rbac.authorization.k8s.io/v1:ClusterRolePatch").build()),
                Output.of(Alias.builder().type("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRolePatch").build())
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
    public static ClusterRolePatch get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRolePatch(name, id, options);
    }
}
