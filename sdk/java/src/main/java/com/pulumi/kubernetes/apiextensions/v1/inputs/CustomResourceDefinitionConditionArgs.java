// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionCondition contains details for the current condition of this pod.
 * 
 */
public final class CustomResourceDefinitionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionConditionArgs Empty = new CustomResourceDefinitionConditionArgs();

    /**
     * lastTransitionTime last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    /**
     * @return lastTransitionTime last time the condition transitioned from one status to another.
     * 
     */
    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    /**
     * message is a human-readable message indicating details about last transition.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return message is a human-readable message indicating details about last transition.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * reason is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return reason is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * status is the status of the condition. Can be True, False, Unknown.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return status is the status of the condition. Can be True, False, Unknown.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * type is the type of the condition. Types include Established, NamesAccepted and Terminating.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return type is the type of the condition. Types include Established, NamesAccepted and Terminating.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CustomResourceDefinitionConditionArgs() {}

    private CustomResourceDefinitionConditionArgs(CustomResourceDefinitionConditionArgs $) {
        this.lastTransitionTime = $.lastTransitionTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceDefinitionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceDefinitionConditionArgs $;

        public Builder() {
            $ = new CustomResourceDefinitionConditionArgs();
        }

        public Builder(CustomResourceDefinitionConditionArgs defaults) {
            $ = new CustomResourceDefinitionConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastTransitionTime lastTransitionTime last time the condition transitioned from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * @param lastTransitionTime lastTransitionTime last time the condition transitioned from one status to another.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
        }

        /**
         * @param message message is a human-readable message indicating details about last transition.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message message is a human-readable message indicating details about last transition.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param reason reason is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason reason is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param status status is the status of the condition. Can be True, False, Unknown.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status status is the status of the condition. Can be True, False, Unknown.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type type is the type of the condition. Types include Established, NamesAccepted and Terminating.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type type is the type of the condition. Types include Established, NamesAccepted and Terminating.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomResourceDefinitionConditionArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
