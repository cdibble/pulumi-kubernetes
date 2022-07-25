// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authentication.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.authentication.v1.outputs.UserInfo;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TokenReviewStatus {
    /**
     * @return Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token&#39;s audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is &#34;true&#34;, the token is valid against the audience of the Kubernetes API server.
     * 
     */
    private @Nullable List<String> audiences;
    /**
     * @return Authenticated indicates that the token was associated with a known user.
     * 
     */
    private @Nullable Boolean authenticated;
    /**
     * @return Error indicates that the token couldn&#39;t be checked
     * 
     */
    private @Nullable String error;
    /**
     * @return User is the UserInfo associated with the provided token.
     * 
     */
    private @Nullable UserInfo user;

    private TokenReviewStatus() {}
    /**
     * @return Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token&#39;s audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is &#34;true&#34;, the token is valid against the audience of the Kubernetes API server.
     * 
     */
    public List<String> audiences() {
        return this.audiences == null ? List.of() : this.audiences;
    }
    /**
     * @return Authenticated indicates that the token was associated with a known user.
     * 
     */
    public Optional<Boolean> authenticated() {
        return Optional.ofNullable(this.authenticated);
    }
    /**
     * @return Error indicates that the token couldn&#39;t be checked
     * 
     */
    public Optional<String> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return User is the UserInfo associated with the provided token.
     * 
     */
    public Optional<UserInfo> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenReviewStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> audiences;
        private @Nullable Boolean authenticated;
        private @Nullable String error;
        private @Nullable UserInfo user;
        public Builder() {}
        public Builder(TokenReviewStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authenticated = defaults.authenticated;
    	      this.error = defaults.error;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = audiences;
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        @CustomType.Setter
        public Builder authenticated(@Nullable Boolean authenticated) {
            this.authenticated = authenticated;
            return this;
        }
        @CustomType.Setter
        public Builder error(@Nullable String error) {
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable UserInfo user) {
            this.user = user;
            return this;
        }
        public TokenReviewStatus build() {
            final var o = new TokenReviewStatus();
            o.audiences = audiences;
            o.authenticated = authenticated;
            o.error = error;
            o.user = user;
            return o;
        }
    }
}
