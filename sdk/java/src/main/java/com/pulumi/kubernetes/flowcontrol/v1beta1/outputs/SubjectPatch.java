// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1beta1.outputs.GroupSubjectPatch;
import com.pulumi.kubernetes.flowcontrol.v1beta1.outputs.ServiceAccountSubjectPatch;
import com.pulumi.kubernetes.flowcontrol.v1beta1.outputs.UserSubjectPatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubjectPatch {
    /**
     * @return `group` matches based on user group name.
     * 
     */
    private @Nullable GroupSubjectPatch group;
    /**
     * @return `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    private @Nullable String kind;
    /**
     * @return `serviceAccount` matches ServiceAccounts.
     * 
     */
    private @Nullable ServiceAccountSubjectPatch serviceAccount;
    /**
     * @return `user` matches based on username.
     * 
     */
    private @Nullable UserSubjectPatch user;

    private SubjectPatch() {}
    /**
     * @return `group` matches based on user group name.
     * 
     */
    public Optional<GroupSubjectPatch> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return `kind` indicates which one of the other fields is non-empty. Required
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return `serviceAccount` matches ServiceAccounts.
     * 
     */
    public Optional<ServiceAccountSubjectPatch> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    /**
     * @return `user` matches based on username.
     * 
     */
    public Optional<UserSubjectPatch> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GroupSubjectPatch group;
        private @Nullable String kind;
        private @Nullable ServiceAccountSubjectPatch serviceAccount;
        private @Nullable UserSubjectPatch user;
        public Builder() {}
        public Builder(SubjectPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder group(@Nullable GroupSubjectPatch group) {
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(@Nullable ServiceAccountSubjectPatch serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable UserSubjectPatch user) {
            this.user = user;
            return this;
        }
        public SubjectPatch build() {
            final var o = new SubjectPatch();
            o.group = group;
            o.kind = kind;
            o.serviceAccount = serviceAccount;
            o.user = user;
            return o;
        }
    }
}
