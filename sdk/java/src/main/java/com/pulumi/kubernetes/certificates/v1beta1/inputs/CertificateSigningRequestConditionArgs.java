// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateSigningRequestConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestConditionArgs Empty = new CertificateSigningRequestConditionArgs();

    /**
     * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
     * 
     */
    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    /**
     * @return lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
     * 
     */
    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    /**
     * timestamp for the last update to this condition
     * 
     */
    @Import(name="lastUpdateTime")
    private @Nullable Output<String> lastUpdateTime;

    /**
     * @return timestamp for the last update to this condition
     * 
     */
    public Optional<Output<String>> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
    }

    /**
     * human readable message with details about the request state
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return human readable message with details about the request state
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * brief reason for the request state
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return brief reason for the request state
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;. Defaults to &#34;True&#34;. If unset, should be treated as &#34;True&#34;.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;. Defaults to &#34;True&#34;. If unset, should be treated as &#34;True&#34;.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * request approval state, currently Approved or Denied.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return request approval state, currently Approved or Denied.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CertificateSigningRequestConditionArgs() {}

    private CertificateSigningRequestConditionArgs(CertificateSigningRequestConditionArgs $) {
        this.lastTransitionTime = $.lastTransitionTime;
        this.lastUpdateTime = $.lastUpdateTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateSigningRequestConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateSigningRequestConditionArgs $;

        public Builder() {
            $ = new CertificateSigningRequestConditionArgs();
        }

        public Builder(CertificateSigningRequestConditionArgs defaults) {
            $ = new CertificateSigningRequestConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastTransitionTime lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * @param lastTransitionTime lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
        }

        /**
         * @param lastUpdateTime timestamp for the last update to this condition
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(@Nullable Output<String> lastUpdateTime) {
            $.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * @param lastUpdateTime timestamp for the last update to this condition
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            return lastUpdateTime(Output.of(lastUpdateTime));
        }

        /**
         * @param message human readable message with details about the request state
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message human readable message with details about the request state
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param reason brief reason for the request state
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason brief reason for the request state
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param status Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;. Defaults to &#34;True&#34;. If unset, should be treated as &#34;True&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;. Defaults to &#34;True&#34;. If unset, should be treated as &#34;True&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type request approval state, currently Approved or Denied.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type request approval state, currently Approved or Denied.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CertificateSigningRequestConditionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
