// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RollbackConfig {
    /**
     * @return The revision to rollback to. If set to 0, rollback to the last revision.
     * 
     */
    private @Nullable Integer revision;

    private RollbackConfig() {}
    /**
     * @return The revision to rollback to. If set to 0, rollback to the last revision.
     * 
     */
    public Optional<Integer> revision() {
        return Optional.ofNullable(this.revision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollbackConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer revision;
        public Builder() {}
        public Builder(RollbackConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revision = defaults.revision;
        }

        @CustomType.Setter
        public Builder revision(@Nullable Integer revision) {
            this.revision = revision;
            return this;
        }
        public RollbackConfig build() {
            final var o = new RollbackConfig();
            o.revision = revision;
            return o;
        }
    }
}
