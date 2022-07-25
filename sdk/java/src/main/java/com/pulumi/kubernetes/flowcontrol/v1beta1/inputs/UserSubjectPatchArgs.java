// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * UserSubject holds detailed information for user-kind subject.
 * 
 */
public final class UserSubjectPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserSubjectPatchArgs Empty = new UserSubjectPatchArgs();

    /**
     * `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private UserSubjectPatchArgs() {}

    private UserSubjectPatchArgs(UserSubjectPatchArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSubjectPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSubjectPatchArgs $;

        public Builder() {
            $ = new UserSubjectPatchArgs();
        }

        public Builder(UserSubjectPatchArgs defaults) {
            $ = new UserSubjectPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name `name` is the username that matches, or &#34;*&#34; to match all usernames. Required.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public UserSubjectPatchArgs build() {
            return $;
        }
    }

}
