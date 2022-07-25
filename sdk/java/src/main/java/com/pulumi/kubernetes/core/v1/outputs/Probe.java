// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core.v1.outputs.ExecAction;
import com.pulumi.kubernetes.core.v1.outputs.GRPCAction;
import com.pulumi.kubernetes.core.v1.outputs.HTTPGetAction;
import com.pulumi.kubernetes.core.v1.outputs.TCPSocketAction;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Probe {
    /**
     * @return Exec specifies the action to take.
     * 
     */
    private @Nullable ExecAction exec;
    /**
     * @return Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    private @Nullable Integer failureThreshold;
    /**
     * @return GRPC specifies an action involving a GRPC port. This is a beta field and requires enabling GRPCContainerProbe feature gate.
     * 
     */
    private @Nullable GRPCAction grpc;
    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    private @Nullable HTTPGetAction httpGet;
    /**
     * @return Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private @Nullable Integer initialDelaySeconds;
    /**
     * @return How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    private @Nullable Integer periodSeconds;
    /**
     * @return Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    private @Nullable Integer successThreshold;
    /**
     * @return TCPSocket specifies an action involving a TCP port.
     * 
     */
    private @Nullable TCPSocketAction tcpSocket;
    /**
     * @return Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    private @Nullable Integer terminationGracePeriodSeconds;
    /**
     * @return Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private @Nullable Integer timeoutSeconds;

    private Probe() {}
    /**
     * @return Exec specifies the action to take.
     * 
     */
    public Optional<ExecAction> exec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * @return Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return GRPC specifies an action involving a GRPC port. This is a beta field and requires enabling GRPCContainerProbe feature gate.
     * 
     */
    public Optional<GRPCAction> grpc() {
        return Optional.ofNullable(this.grpc);
    }
    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    public Optional<HTTPGetAction> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }
    /**
     * @return Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Optional<Integer> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }
    /**
     * @return How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    public Optional<Integer> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }
    /**
     * @return Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    public Optional<Integer> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * @return TCPSocket specifies an action involving a TCP port.
     * 
     */
    public Optional<TCPSocketAction> tcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }
    /**
     * @return Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    public Optional<Integer> terminationGracePeriodSeconds() {
        return Optional.ofNullable(this.terminationGracePeriodSeconds);
    }
    /**
     * @return Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Probe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ExecAction exec;
        private @Nullable Integer failureThreshold;
        private @Nullable GRPCAction grpc;
        private @Nullable HTTPGetAction httpGet;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable TCPSocketAction tcpSocket;
        private @Nullable Integer terminationGracePeriodSeconds;
        private @Nullable Integer timeoutSeconds;
        public Builder() {}
        public Builder(Probe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.grpc = defaults.grpc;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSocket = defaults.tcpSocket;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        @CustomType.Setter
        public Builder exec(@Nullable ExecAction exec) {
            this.exec = exec;
            return this;
        }
        @CustomType.Setter
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder grpc(@Nullable GRPCAction grpc) {
            this.grpc = grpc;
            return this;
        }
        @CustomType.Setter
        public Builder httpGet(@Nullable HTTPGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        @CustomType.Setter
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        @CustomType.Setter
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder tcpSocket(@Nullable TCPSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        @CustomType.Setter
        public Builder terminationGracePeriodSeconds(@Nullable Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Probe build() {
            final var o = new Probe();
            o.exec = exec;
            o.failureThreshold = failureThreshold;
            o.grpc = grpc;
            o.httpGet = httpGet;
            o.initialDelaySeconds = initialDelaySeconds;
            o.periodSeconds = periodSeconds;
            o.successThreshold = successThreshold;
            o.tcpSocket = tcpSocket;
            o.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            o.timeoutSeconds = timeoutSeconds;
            return o;
        }
    }
}
