// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicationControllerConditionPatch {
    /**
     * @return The last time the condition transitioned from one status to another.
     * 
     */
    private @Nullable String lastTransitionTime;
    /**
     * @return A human readable message indicating details about the transition.
     * 
     */
    private @Nullable String message;
    /**
     * @return The reason for the condition&#39;s last transition.
     * 
     */
    private @Nullable String reason;
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    private @Nullable String status;
    /**
     * @return Type of replication controller condition.
     * 
     */
    private @Nullable String type;

    private ReplicationControllerConditionPatch() {}
    /**
     * @return The last time the condition transitioned from one status to another.
     * 
     */
    public Optional<String> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * @return A human readable message indicating details about the transition.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return The reason for the condition&#39;s last transition.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * @return Status of the condition, one of True, False, Unknown.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Type of replication controller condition.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationControllerConditionPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private @Nullable String status;
        private @Nullable String type;
        public Builder() {}
        public Builder(ReplicationControllerConditionPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ReplicationControllerConditionPatch build() {
            final var o = new ReplicationControllerConditionPatch();
            o.lastTransitionTime = lastTransitionTime;
            o.message = message;
            o.reason = reason;
            o.status = status;
            o.type = type;
            return o;
        }
    }
}
