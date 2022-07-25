// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.v1.outputs;

import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkPolicyPortPatch {
    /**
     * @return If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port. This feature is in Beta state and is enabled by default. It can be disabled using the Feature Gate &#34;NetworkPolicyEndPort&#34;.
     * 
     */
    private @Nullable Integer endPort;
    /**
     * @return The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    private @Nullable Either<Integer,String> port;
    /**
     * @return The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    private @Nullable String protocol;

    private NetworkPolicyPortPatch() {}
    /**
     * @return If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port. This feature is in Beta state and is enabled by default. It can be disabled using the Feature Gate &#34;NetworkPolicyEndPort&#34;.
     * 
     */
    public Optional<Integer> endPort() {
        return Optional.ofNullable(this.endPort);
    }
    /**
     * @return The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    public Optional<Either<Integer,String>> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPortPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer endPort;
        private @Nullable Either<Integer,String> port;
        private @Nullable String protocol;
        public Builder() {}
        public Builder(NetworkPolicyPortPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPort = defaults.endPort;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder endPort(@Nullable Integer endPort) {
            this.endPort = endPort;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Either<Integer,String> port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public NetworkPolicyPortPatch build() {
            final var o = new NetworkPolicyPortPatch();
            o.endPort = endPort;
            o.port = port;
            o.protocol = protocol;
            return o;
        }
    }
}
