// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1beta2.outputs;

import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RollingUpdateDaemonSetPatch {
    /**
     * @return The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
     * 
     */
    private @Nullable Either<Integer,String> maxUnavailable;

    private RollingUpdateDaemonSetPatch() {}
    /**
     * @return The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
     * 
     */
    public Optional<Either<Integer,String>> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateDaemonSetPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Either<Integer,String> maxUnavailable;
        public Builder() {}
        public Builder(RollingUpdateDaemonSetPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        @CustomType.Setter
        public Builder maxUnavailable(@Nullable Either<Integer,String> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public RollingUpdateDaemonSetPatch build() {
            final var o = new RollingUpdateDaemonSetPatch();
            o.maxUnavailable = maxUnavailable;
            return o;
        }
    }
}
