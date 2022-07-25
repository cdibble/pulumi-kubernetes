// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ObjectReferencePatch;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointAddressPatch {
    /**
     * @return The Hostname of this endpoint
     * 
     */
    private @Nullable String hostname;
    /**
     * @return The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
     * 
     */
    private @Nullable String ip;
    /**
     * @return Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
     * 
     */
    private @Nullable String nodeName;
    /**
     * @return Reference to object providing the endpoint.
     * 
     */
    private @Nullable ObjectReferencePatch targetRef;

    private EndpointAddressPatch() {}
    /**
     * @return The Hostname of this endpoint
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
     * 
     */
    public Optional<String> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    /**
     * @return Reference to object providing the endpoint.
     * 
     */
    public Optional<ObjectReferencePatch> targetRef() {
        return Optional.ofNullable(this.targetRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAddressPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String hostname;
        private @Nullable String ip;
        private @Nullable String nodeName;
        private @Nullable ObjectReferencePatch targetRef;
        public Builder() {}
        public Builder(EndpointAddressPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ip = defaults.ip;
    	      this.nodeName = defaults.nodeName;
    	      this.targetRef = defaults.targetRef;
        }

        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(@Nullable String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        @CustomType.Setter
        public Builder targetRef(@Nullable ObjectReferencePatch targetRef) {
            this.targetRef = targetRef;
            return this;
        }
        public EndpointAddressPatch build() {
            final var o = new EndpointAddressPatch();
            o.hostname = hostname;
            o.ip = ip;
            o.nodeName = nodeName;
            o.targetRef = targetRef;
            return o;
        }
    }
}
