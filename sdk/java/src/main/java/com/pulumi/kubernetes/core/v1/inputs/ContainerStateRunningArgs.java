// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ContainerStateRunning is a running state of a container.
 * 
 */
public final class ContainerStateRunningArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerStateRunningArgs Empty = new ContainerStateRunningArgs();

    /**
     * Time at which the container was last (re-)started
     * 
     */
    @Import(name="startedAt")
    private @Nullable Output<String> startedAt;

    /**
     * @return Time at which the container was last (re-)started
     * 
     */
    public Optional<Output<String>> startedAt() {
        return Optional.ofNullable(this.startedAt);
    }

    private ContainerStateRunningArgs() {}

    private ContainerStateRunningArgs(ContainerStateRunningArgs $) {
        this.startedAt = $.startedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerStateRunningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerStateRunningArgs $;

        public Builder() {
            $ = new ContainerStateRunningArgs();
        }

        public Builder(ContainerStateRunningArgs defaults) {
            $ = new ContainerStateRunningArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param startedAt Time at which the container was last (re-)started
         * 
         * @return builder
         * 
         */
        public Builder startedAt(@Nullable Output<String> startedAt) {
            $.startedAt = startedAt;
            return this;
        }

        /**
         * @param startedAt Time at which the container was last (re-)started
         * 
         * @return builder
         * 
         */
        public Builder startedAt(String startedAt) {
            return startedAt(Output.of(startedAt));
        }

        public ContainerStateRunningArgs build() {
            return $;
        }
    }

}
