// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authentication.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TokenReviewSpec {
    /**
     * @return Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
     * 
     */
    private @Nullable List<String> audiences;
    /**
     * @return Token is the opaque bearer token.
     * 
     */
    private @Nullable String token;

    private TokenReviewSpec() {}
    /**
     * @return Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
     * 
     */
    public List<String> audiences() {
        return this.audiences == null ? List.of() : this.audiences;
    }
    /**
     * @return Token is the opaque bearer token.
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenReviewSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> audiences;
        private @Nullable String token;
        public Builder() {}
        public Builder(TokenReviewSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.token = defaults.token;
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
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }
        public TokenReviewSpec build() {
            final var o = new TokenReviewSpec();
            o.audiences = audiences;
            o.token = token;
            return o;
        }
    }
}
