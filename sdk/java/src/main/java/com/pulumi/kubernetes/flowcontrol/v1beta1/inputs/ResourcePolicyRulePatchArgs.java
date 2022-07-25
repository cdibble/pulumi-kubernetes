// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ResourcePolicyRule is a predicate that matches some resource requests, testing the request&#39;s verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., `Namespace==&#34;&#34;`) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request&#39;s namespace.
 * 
 */
public final class ResourcePolicyRulePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyRulePatchArgs Empty = new ResourcePolicyRulePatchArgs();

    /**
     * `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    @Import(name="apiGroups")
    private @Nullable Output<List<String>> apiGroups;

    /**
     * @return `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    public Optional<Output<List<String>>> apiGroups() {
        return Optional.ofNullable(this.apiGroups);
    }

    /**
     * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    @Import(name="clusterScope")
    private @Nullable Output<Boolean> clusterScope;

    /**
     * @return `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    public Optional<Output<Boolean>> clusterScope() {
        return Optional.ofNullable(this.clusterScope);
    }

    /**
     * `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    @Import(name="namespaces")
    private @Nullable Output<List<String>> namespaces;

    /**
     * @return `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    public Optional<Output<List<String>>> namespaces() {
        return Optional.ofNullable(this.namespaces);
    }

    /**
     * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    @Import(name="verbs")
    private @Nullable Output<List<String>> verbs;

    /**
     * @return `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    public Optional<Output<List<String>>> verbs() {
        return Optional.ofNullable(this.verbs);
    }

    private ResourcePolicyRulePatchArgs() {}

    private ResourcePolicyRulePatchArgs(ResourcePolicyRulePatchArgs $) {
        this.apiGroups = $.apiGroups;
        this.clusterScope = $.clusterScope;
        this.namespaces = $.namespaces;
        this.resources = $.resources;
        this.verbs = $.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyRulePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyRulePatchArgs $;

        public Builder() {
            $ = new ResourcePolicyRulePatchArgs();
        }

        public Builder(ResourcePolicyRulePatchArgs defaults) {
            $ = new ResourcePolicyRulePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiGroups `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(@Nullable Output<List<String>> apiGroups) {
            $.apiGroups = apiGroups;
            return this;
        }

        /**
         * @param apiGroups `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(List<String> apiGroups) {
            return apiGroups(Output.of(apiGroups));
        }

        /**
         * @param apiGroups `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }

        /**
         * @param clusterScope `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
         * 
         * @return builder
         * 
         */
        public Builder clusterScope(@Nullable Output<Boolean> clusterScope) {
            $.clusterScope = clusterScope;
            return this;
        }

        /**
         * @param clusterScope `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
         * 
         * @return builder
         * 
         */
        public Builder clusterScope(Boolean clusterScope) {
            return clusterScope(Output.of(clusterScope));
        }

        /**
         * @param namespaces `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(@Nullable Output<List<String>> namespaces) {
            $.namespaces = namespaces;
            return this;
        }

        /**
         * @param namespaces `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(List<String> namespaces) {
            return namespaces(Output.of(namespaces));
        }

        /**
         * @param namespaces `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
         * 
         * @return builder
         * 
         */
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }

        /**
         * @param resources `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param verbs `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder verbs(@Nullable Output<List<String>> verbs) {
            $.verbs = verbs;
            return this;
        }

        /**
         * @param verbs `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder verbs(List<String> verbs) {
            return verbs(Output.of(verbs));
        }

        /**
         * @param verbs `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
         * 
         * @return builder
         * 
         */
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }

        public ResourcePolicyRulePatchArgs build() {
            return $;
        }
    }

}
