// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VolumeError captures an error encountered during a volume operation.
 * 
 */
public final class VolumeErrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeErrorArgs Empty = new VolumeErrorArgs();

    /**
     * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Time the error was encountered.
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    /**
     * @return Time the error was encountered.
     * 
     */
    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    private VolumeErrorArgs() {}

    private VolumeErrorArgs(VolumeErrorArgs $) {
        this.message = $.message;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeErrorArgs $;

        public Builder() {
            $ = new VolumeErrorArgs();
        }

        public Builder(VolumeErrorArgs defaults) {
            $ = new VolumeErrorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param message String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param time Time the error was encountered.
         * 
         * @return builder
         * 
         */
        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time Time the error was encountered.
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        public VolumeErrorArgs build() {
            return $;
        }
    }

}
