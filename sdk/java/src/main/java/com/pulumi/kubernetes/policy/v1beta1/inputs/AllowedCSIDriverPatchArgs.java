// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
 * 
 */
public final class AllowedCSIDriverPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AllowedCSIDriverPatchArgs Empty = new AllowedCSIDriverPatchArgs();

    /**
     * Name is the registered name of the CSI driver
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name is the registered name of the CSI driver
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AllowedCSIDriverPatchArgs() {}

    private AllowedCSIDriverPatchArgs(AllowedCSIDriverPatchArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllowedCSIDriverPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllowedCSIDriverPatchArgs $;

        public Builder() {
            $ = new AllowedCSIDriverPatchArgs();
        }

        public Builder(AllowedCSIDriverPatchArgs defaults) {
            $ = new AllowedCSIDriverPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name is the registered name of the CSI driver
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name is the registered name of the CSI driver
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AllowedCSIDriverPatchArgs build() {
            return $;
        }
    }

}
