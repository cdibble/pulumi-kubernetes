// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ExecActionPatch;
import com.pulumi.kubernetes.core.v1.outputs.HTTPGetActionPatch;
import com.pulumi.kubernetes.core.v1.outputs.TCPSocketActionPatch;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LifecycleHandlerPatch {
    /**
     * @return Exec specifies the action to take.
     * 
     */
    private @Nullable ExecActionPatch exec;
    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    private @Nullable HTTPGetActionPatch httpGet;
    /**
     * @return Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     * 
     */
    private @Nullable TCPSocketActionPatch tcpSocket;

    private LifecycleHandlerPatch() {}
    /**
     * @return Exec specifies the action to take.
     * 
     */
    public Optional<ExecActionPatch> exec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    public Optional<HTTPGetActionPatch> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }
    /**
     * @return Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     * 
     */
    public Optional<TCPSocketActionPatch> tcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleHandlerPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ExecActionPatch exec;
        private @Nullable HTTPGetActionPatch httpGet;
        private @Nullable TCPSocketActionPatch tcpSocket;
        public Builder() {}
        public Builder(LifecycleHandlerPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.httpGet = defaults.httpGet;
    	      this.tcpSocket = defaults.tcpSocket;
        }

        @CustomType.Setter
        public Builder exec(@Nullable ExecActionPatch exec) {
            this.exec = exec;
            return this;
        }
        @CustomType.Setter
        public Builder httpGet(@Nullable HTTPGetActionPatch httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        @CustomType.Setter
        public Builder tcpSocket(@Nullable TCPSocketActionPatch tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public LifecycleHandlerPatch build() {
            final var o = new LifecycleHandlerPatch();
            o.exec = exec;
            o.httpGet = httpGet;
            o.tcpSocket = tcpSocket;
            return o;
        }
    }
}
