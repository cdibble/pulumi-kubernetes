// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apiextensions.v1beta1.inputs.WebhookClientConfigPatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 * 
 */
public final class CustomResourceConversionPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceConversionPatchArgs Empty = new CustomResourceConversionPatchArgs();

    /**
     * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[&#34;v1beta1&#34;]`.
     * 
     */
    @Import(name="conversionReviewVersions")
    private @Nullable Output<List<String>> conversionReviewVersions;

    /**
     * @return conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[&#34;v1beta1&#34;]`.
     * 
     */
    public Optional<Output<List<String>>> conversionReviewVersions() {
        return Optional.ofNullable(this.conversionReviewVersions);
    }

    /**
     * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
     * 
     */
    @Import(name="strategy")
    private @Nullable Output<String> strategy;

    /**
     * @return strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
     * 
     */
    public Optional<Output<String>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    /**
     * webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
     * 
     */
    @Import(name="webhookClientConfig")
    private @Nullable Output<WebhookClientConfigPatchArgs> webhookClientConfig;

    /**
     * @return webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
     * 
     */
    public Optional<Output<WebhookClientConfigPatchArgs>> webhookClientConfig() {
        return Optional.ofNullable(this.webhookClientConfig);
    }

    private CustomResourceConversionPatchArgs() {}

    private CustomResourceConversionPatchArgs(CustomResourceConversionPatchArgs $) {
        this.conversionReviewVersions = $.conversionReviewVersions;
        this.strategy = $.strategy;
        this.webhookClientConfig = $.webhookClientConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceConversionPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceConversionPatchArgs $;

        public Builder() {
            $ = new CustomResourceConversionPatchArgs();
        }

        public Builder(CustomResourceConversionPatchArgs defaults) {
            $ = new CustomResourceConversionPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conversionReviewVersions conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[&#34;v1beta1&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder conversionReviewVersions(@Nullable Output<List<String>> conversionReviewVersions) {
            $.conversionReviewVersions = conversionReviewVersions;
            return this;
        }

        /**
         * @param conversionReviewVersions conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[&#34;v1beta1&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder conversionReviewVersions(List<String> conversionReviewVersions) {
            return conversionReviewVersions(Output.of(conversionReviewVersions));
        }

        /**
         * @param conversionReviewVersions conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[&#34;v1beta1&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder conversionReviewVersions(String... conversionReviewVersions) {
            return conversionReviewVersions(List.of(conversionReviewVersions));
        }

        /**
         * @param strategy strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
         *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
         * 
         * @return builder
         * 
         */
        public Builder strategy(@Nullable Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
         *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
         * 
         * @return builder
         * 
         */
        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        /**
         * @param webhookClientConfig webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
         * 
         * @return builder
         * 
         */
        public Builder webhookClientConfig(@Nullable Output<WebhookClientConfigPatchArgs> webhookClientConfig) {
            $.webhookClientConfig = webhookClientConfig;
            return this;
        }

        /**
         * @param webhookClientConfig webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
         * 
         * @return builder
         * 
         */
        public Builder webhookClientConfig(WebhookClientConfigPatchArgs webhookClientConfig) {
            return webhookClientConfig(Output.of(webhookClientConfig));
        }

        public CustomResourceConversionPatchArgs build() {
            return $;
        }
    }

}
