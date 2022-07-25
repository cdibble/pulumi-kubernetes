// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventSeriesPatch {
    /**
     * @return Number of occurrences in this series up to the last heartbeat time
     * 
     */
    private @Nullable Integer count;
    /**
     * @return Time of the last occurrence observed
     * 
     */
    private @Nullable String lastObservedTime;
    /**
     * @return State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
     * 
     */
    private @Nullable String state;

    private EventSeriesPatch() {}
    /**
     * @return Number of occurrences in this series up to the last heartbeat time
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Time of the last occurrence observed
     * 
     */
    public Optional<String> lastObservedTime() {
        return Optional.ofNullable(this.lastObservedTime);
    }
    /**
     * @return State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSeriesPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String lastObservedTime;
        private @Nullable String state;
        public Builder() {}
        public Builder(EventSeriesPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.lastObservedTime = defaults.lastObservedTime;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder lastObservedTime(@Nullable String lastObservedTime) {
            this.lastObservedTime = lastObservedTime;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public EventSeriesPatch build() {
            final var o = new EventSeriesPatch();
            o.count = count;
            o.lastObservedTime = lastObservedTime;
            o.state = state;
            return o;
        }
    }
}
