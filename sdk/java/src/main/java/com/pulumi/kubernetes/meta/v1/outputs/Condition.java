// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Condition {
    /**
     * @return lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the underlying condition changed.  If that is not known, then using the time when the API field changed is acceptable.
     * 
     */
    private String lastTransitionTime;
    /**
     * @return message is a human readable message indicating details about the transition. This may be an empty string.
     * 
     */
    private String message;
    /**
     * @return observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.
     * 
     */
    private @Nullable Integer observedGeneration;
    /**
     * @return reason contains a programmatic identifier indicating the reason for the condition&#39;s last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.
     * 
     */
    private String reason;
    /**
     * @return status of the condition, one of True, False, Unknown.
     * 
     */
    private String status;
    /**
     * @return type of condition in CamelCase or in foo.example.com/CamelCase.
     * 
     */
    private String type;

    private Condition() {}
    /**
     * @return lastTransitionTime is the last time the condition transitioned from one status to another. This should be when the underlying condition changed.  If that is not known, then using the time when the API field changed is acceptable.
     * 
     */
    public String lastTransitionTime() {
        return this.lastTransitionTime;
    }
    /**
     * @return message is a human readable message indicating details about the transition. This may be an empty string.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return observedGeneration represents the .metadata.generation that the condition was set based upon. For instance, if .metadata.generation is currently 12, but the .status.conditions[x].observedGeneration is 9, the condition is out of date with respect to the current state of the instance.
     * 
     */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * @return reason contains a programmatic identifier indicating the reason for the condition&#39;s last transition. Producers of specific condition types may define expected values and meanings for this field, and whether the values are considered a guaranteed API. The value should be a CamelCase string. This field may not be empty.
     * 
     */
    public String reason() {
        return this.reason;
    }
    /**
     * @return status of the condition, one of True, False, Unknown.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return type of condition in CamelCase or in foo.example.com/CamelCase.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Condition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lastTransitionTime;
        private String message;
        private @Nullable Integer observedGeneration;
        private String reason;
        private String status;
        private String type;
        public Builder() {}
        public Builder(Condition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder lastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = Objects.requireNonNull(lastTransitionTime);
            return this;
        }
        @CustomType.Setter
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        @CustomType.Setter
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        @CustomType.Setter
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Condition build() {
            final var o = new Condition();
            o.lastTransitionTime = lastTransitionTime;
            o.message = message;
            o.observedGeneration = observedGeneration;
            o.reason = reason;
            o.status = status;
            o.type = type;
            return o;
        }
    }
}
