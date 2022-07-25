// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiregistration.v1beta1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.apiregistration.v1beta1.APIServiceArgs;
import com.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceSpec;
import com.pulumi.kubernetes.apiregistration.v1beta1.outputs.APIServiceStatus;
import com.pulumi.kubernetes.meta.v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * APIService represents a server for a particular GroupVersion. Name must be &#34;version.group&#34;.
 * 
 */
@ResourceType(type="kubernetes:apiregistration.k8s.io/v1beta1:APIService")
public class APIService extends com.pulumi.resources.CustomResource {
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
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output<Optional<ObjectMeta>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Spec contains information for locating and communicating with a server
     * 
     */
    @Export(name="spec", type=APIServiceSpec.class, parameters={})
    private Output</* @Nullable */ APIServiceSpec> spec;

    /**
     * @return Spec contains information for locating and communicating with a server
     * 
     */
    public Output<Optional<APIServiceSpec>> spec() {
        return Codegen.optional(this.spec);
    }
    /**
     * Status contains derived information about an API server
     * 
     */
    @Export(name="status", type=APIServiceStatus.class, parameters={})
    private Output</* @Nullable */ APIServiceStatus> status;

    /**
     * @return Status contains derived information about an API server
     * 
     */
    public Output<Optional<APIServiceStatus>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public APIService(String name) {
        this(name, APIServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public APIService(String name, @Nullable APIServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public APIService(String name, @Nullable APIServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apiregistration.k8s.io/v1beta1:APIService", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private APIService(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apiregistration.k8s.io/v1beta1:APIService", name, null, makeResourceOptions(options, id));
    }

    private static APIServiceArgs makeArgs(@Nullable APIServiceArgs args) {
        var builder = args == null ? APIServiceArgs.builder() : APIServiceArgs.builder(args);
        return builder
            .apiVersion("apiregistration.k8s.io/v1beta1")
            .kind("APIService")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:apiregistration.k8s.io/v1:APIService").build()),
                Output.of(Alias.builder().type("kubernetes:apiregistration/v1:APIService").build()),
                Output.of(Alias.builder().type("kubernetes:apiregistration/v1beta1:APIService").build())
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
    public static APIService get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new APIService(name, id, options);
    }
}
