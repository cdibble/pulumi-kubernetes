// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointConditions {
    /**
     * @return ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be &#34;true&#34; for terminating endpoints.
     * 
     */
    private @Nullable Boolean ready;
    /**
     * @return serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
     */
    private @Nullable Boolean serving;
    /**
     * @return terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
     */
    private @Nullable Boolean terminating;

    private EndpointConditions() {}
    /**
     * @return ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be &#34;true&#34; for terminating endpoints.
     * 
     */
    public Optional<Boolean> ready() {
        return Optional.ofNullable(this.ready);
    }
    /**
     * @return serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
     */
    public Optional<Boolean> serving() {
        return Optional.ofNullable(this.serving);
    }
    /**
     * @return terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
     */
    public Optional<Boolean> terminating() {
        return Optional.ofNullable(this.terminating);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConditions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean ready;
        private @Nullable Boolean serving;
        private @Nullable Boolean terminating;
        public Builder() {}
        public Builder(EndpointConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ready = defaults.ready;
    	      this.serving = defaults.serving;
    	      this.terminating = defaults.terminating;
        }

        @CustomType.Setter
        public Builder ready(@Nullable Boolean ready) {
            this.ready = ready;
            return this;
        }
        @CustomType.Setter
        public Builder serving(@Nullable Boolean serving) {
            this.serving = serving;
            return this;
        }
        @CustomType.Setter
        public Builder terminating(@Nullable Boolean terminating) {
            this.terminating = terminating;
            return this;
        }
        public EndpointConditions build() {
            final var o = new EndpointConditions();
            o.ready = ready;
            o.serving = serving;
            o.terminating = terminating;
            return o;
        }
    }
}
