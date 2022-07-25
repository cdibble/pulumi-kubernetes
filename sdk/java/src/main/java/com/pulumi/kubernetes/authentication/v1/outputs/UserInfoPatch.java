// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authentication.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserInfoPatch {
    /**
     * @return Any additional information provided by the authenticator.
     * 
     */
    private @Nullable Map<String,List<String>> extra;
    /**
     * @return The names of groups this user is a part of.
     * 
     */
    private @Nullable List<String> groups;
    /**
     * @return A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
     * 
     */
    private @Nullable String uid;
    /**
     * @return The name that uniquely identifies this user among all active users.
     * 
     */
    private @Nullable String username;

    private UserInfoPatch() {}
    /**
     * @return Any additional information provided by the authenticator.
     * 
     */
    public Map<String,List<String>> extra() {
        return this.extra == null ? Map.of() : this.extra;
    }
    /**
     * @return The names of groups this user is a part of.
     * 
     */
    public List<String> groups() {
        return this.groups == null ? List.of() : this.groups;
    }
    /**
     * @return A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * @return The name that uniquely identifies this user among all active users.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,List<String>> extra;
        private @Nullable List<String> groups;
        private @Nullable String uid;
        private @Nullable String username;
        public Builder() {}
        public Builder(UserInfoPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.uid = defaults.uid;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder extra(@Nullable Map<String,List<String>> extra) {
            this.extra = extra;
            return this;
        }
        @CustomType.Setter
        public Builder groups(@Nullable List<String> groups) {
            this.groups = groups;
            return this;
        }
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public UserInfoPatch build() {
            final var o = new UserInfoPatch();
            o.extra = extra;
            o.groups = groups;
            o.uid = uid;
            o.username = username;
            return o;
        }
    }
}
