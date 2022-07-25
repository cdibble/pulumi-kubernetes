// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.flowcontrol.v1beta2.outputs.QueuingConfigurationPatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LimitResponsePatch {
    /**
     * @return `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `&#34;Queue&#34;`.
     * 
     */
    private @Nullable QueuingConfigurationPatch queuing;
    /**
     * @return `type` is &#34;Queue&#34; or &#34;Reject&#34;. &#34;Queue&#34; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. &#34;Reject&#34; means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    private @Nullable String type;

    private LimitResponsePatch() {}
    /**
     * @return `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `&#34;Queue&#34;`.
     * 
     */
    public Optional<QueuingConfigurationPatch> queuing() {
        return Optional.ofNullable(this.queuing);
    }
    /**
     * @return `type` is &#34;Queue&#34; or &#34;Reject&#34;. &#34;Queue&#34; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. &#34;Reject&#34; means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitResponsePatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable QueuingConfigurationPatch queuing;
        private @Nullable String type;
        public Builder() {}
        public Builder(LimitResponsePatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queuing = defaults.queuing;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder queuing(@Nullable QueuingConfigurationPatch queuing) {
            this.queuing = queuing;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public LimitResponsePatch build() {
            final var o = new LimitResponsePatch();
            o.queuing = queuing;
            o.type = type;
            return o;
        }
    }
}
