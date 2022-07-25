// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
 * 
 */
public final class RuntimeClassStrategyOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeClassStrategyOptionsArgs Empty = new RuntimeClassStrategyOptionsArgs();

    /**
     * allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of &#34;*&#34; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
     * 
     */
    @Import(name="allowedRuntimeClassNames", required=true)
    private Output<List<String>> allowedRuntimeClassNames;

    /**
     * @return allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of &#34;*&#34; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
     * 
     */
    public Output<List<String>> allowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }

    /**
     * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
     * 
     */
    @Import(name="defaultRuntimeClassName")
    private @Nullable Output<String> defaultRuntimeClassName;

    /**
     * @return defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
     * 
     */
    public Optional<Output<String>> defaultRuntimeClassName() {
        return Optional.ofNullable(this.defaultRuntimeClassName);
    }

    private RuntimeClassStrategyOptionsArgs() {}

    private RuntimeClassStrategyOptionsArgs(RuntimeClassStrategyOptionsArgs $) {
        this.allowedRuntimeClassNames = $.allowedRuntimeClassNames;
        this.defaultRuntimeClassName = $.defaultRuntimeClassName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeClassStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeClassStrategyOptionsArgs $;

        public Builder() {
            $ = new RuntimeClassStrategyOptionsArgs();
        }

        public Builder(RuntimeClassStrategyOptionsArgs defaults) {
            $ = new RuntimeClassStrategyOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedRuntimeClassNames allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of &#34;*&#34; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
         * 
         * @return builder
         * 
         */
        public Builder allowedRuntimeClassNames(Output<List<String>> allowedRuntimeClassNames) {
            $.allowedRuntimeClassNames = allowedRuntimeClassNames;
            return this;
        }

        /**
         * @param allowedRuntimeClassNames allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of &#34;*&#34; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
         * 
         * @return builder
         * 
         */
        public Builder allowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
            return allowedRuntimeClassNames(Output.of(allowedRuntimeClassNames));
        }

        /**
         * @param allowedRuntimeClassNames allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of &#34;*&#34; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
         * 
         * @return builder
         * 
         */
        public Builder allowedRuntimeClassNames(String... allowedRuntimeClassNames) {
            return allowedRuntimeClassNames(List.of(allowedRuntimeClassNames));
        }

        /**
         * @param defaultRuntimeClassName defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
         * 
         * @return builder
         * 
         */
        public Builder defaultRuntimeClassName(@Nullable Output<String> defaultRuntimeClassName) {
            $.defaultRuntimeClassName = defaultRuntimeClassName;
            return this;
        }

        /**
         * @param defaultRuntimeClassName defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
         * 
         * @return builder
         * 
         */
        public Builder defaultRuntimeClassName(String defaultRuntimeClassName) {
            return defaultRuntimeClassName(Output.of(defaultRuntimeClassName));
        }

        public RuntimeClassStrategyOptionsArgs build() {
            $.allowedRuntimeClassNames = Objects.requireNonNull($.allowedRuntimeClassNames, "expected parameter 'allowedRuntimeClassNames' to be non-null");
            return $;
        }
    }

}
