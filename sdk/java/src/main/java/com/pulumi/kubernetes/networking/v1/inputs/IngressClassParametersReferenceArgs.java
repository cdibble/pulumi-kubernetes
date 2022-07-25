// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.
 * 
 */
public final class IngressClassParametersReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressClassParametersReferenceArgs Empty = new IngressClassParametersReferenceArgs();

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    @Import(name="apiGroup")
    private @Nullable Output<String> apiGroup;

    /**
     * @return APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    public Optional<Output<String>> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }

    /**
     * Kind is the type of resource being referenced.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind is the type of resource being referenced.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Name is the name of resource being referenced.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Namespace is the namespace of the resource being referenced. This field is required when scope is set to &#34;Namespace&#34; and must be unset when scope is set to &#34;Cluster&#34;.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Namespace is the namespace of the resource being referenced. This field is required when scope is set to &#34;Namespace&#34; and must be unset when scope is set to &#34;Cluster&#34;.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Scope represents if this refers to a cluster or namespace scoped resource. This may be set to &#34;Cluster&#34; (default) or &#34;Namespace&#34;.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return Scope represents if this refers to a cluster or namespace scoped resource. This may be set to &#34;Cluster&#34; (default) or &#34;Namespace&#34;.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private IngressClassParametersReferenceArgs() {}

    private IngressClassParametersReferenceArgs(IngressClassParametersReferenceArgs $) {
        this.apiGroup = $.apiGroup;
        this.kind = $.kind;
        this.name = $.name;
        this.namespace = $.namespace;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressClassParametersReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressClassParametersReferenceArgs $;

        public Builder() {
            $ = new IngressClassParametersReferenceArgs();
        }

        public Builder(IngressClassParametersReferenceArgs defaults) {
            $ = new IngressClassParametersReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiGroup APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
         * 
         * @return builder
         * 
         */
        public Builder apiGroup(@Nullable Output<String> apiGroup) {
            $.apiGroup = apiGroup;
            return this;
        }

        /**
         * @param apiGroup APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
         * 
         * @return builder
         * 
         */
        public Builder apiGroup(String apiGroup) {
            return apiGroup(Output.of(apiGroup));
        }

        /**
         * @param kind Kind is the type of resource being referenced.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind is the type of resource being referenced.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name is the name of resource being referenced.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name is the name of resource being referenced.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Namespace is the namespace of the resource being referenced. This field is required when scope is set to &#34;Namespace&#34; and must be unset when scope is set to &#34;Cluster&#34;.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Namespace is the namespace of the resource being referenced. This field is required when scope is set to &#34;Namespace&#34; and must be unset when scope is set to &#34;Cluster&#34;.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param scope Scope represents if this refers to a cluster or namespace scoped resource. This may be set to &#34;Cluster&#34; (default) or &#34;Namespace&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope represents if this refers to a cluster or namespace scoped resource. This may be set to &#34;Cluster&#34; (default) or &#34;Namespace&#34;.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public IngressClassParametersReferenceArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
