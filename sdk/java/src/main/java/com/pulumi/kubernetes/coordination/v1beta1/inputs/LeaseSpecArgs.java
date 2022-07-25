// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.coordination.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LeaseSpec is a specification of a Lease.
 * 
 */
public final class LeaseSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final LeaseSpecArgs Empty = new LeaseSpecArgs();

    /**
     * acquireTime is a time when the current lease was acquired.
     * 
     */
    @Import(name="acquireTime")
    private @Nullable Output<String> acquireTime;

    /**
     * @return acquireTime is a time when the current lease was acquired.
     * 
     */
    public Optional<Output<String>> acquireTime() {
        return Optional.ofNullable(this.acquireTime);
    }

    /**
     * holderIdentity contains the identity of the holder of a current lease.
     * 
     */
    @Import(name="holderIdentity")
    private @Nullable Output<String> holderIdentity;

    /**
     * @return holderIdentity contains the identity of the holder of a current lease.
     * 
     */
    public Optional<Output<String>> holderIdentity() {
        return Optional.ofNullable(this.holderIdentity);
    }

    /**
     * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
     * 
     */
    @Import(name="leaseDurationSeconds")
    private @Nullable Output<Integer> leaseDurationSeconds;

    /**
     * @return leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
     * 
     */
    public Optional<Output<Integer>> leaseDurationSeconds() {
        return Optional.ofNullable(this.leaseDurationSeconds);
    }

    /**
     * leaseTransitions is the number of transitions of a lease between holders.
     * 
     */
    @Import(name="leaseTransitions")
    private @Nullable Output<Integer> leaseTransitions;

    /**
     * @return leaseTransitions is the number of transitions of a lease between holders.
     * 
     */
    public Optional<Output<Integer>> leaseTransitions() {
        return Optional.ofNullable(this.leaseTransitions);
    }

    /**
     * renewTime is a time when the current holder of a lease has last updated the lease.
     * 
     */
    @Import(name="renewTime")
    private @Nullable Output<String> renewTime;

    /**
     * @return renewTime is a time when the current holder of a lease has last updated the lease.
     * 
     */
    public Optional<Output<String>> renewTime() {
        return Optional.ofNullable(this.renewTime);
    }

    private LeaseSpecArgs() {}

    private LeaseSpecArgs(LeaseSpecArgs $) {
        this.acquireTime = $.acquireTime;
        this.holderIdentity = $.holderIdentity;
        this.leaseDurationSeconds = $.leaseDurationSeconds;
        this.leaseTransitions = $.leaseTransitions;
        this.renewTime = $.renewTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LeaseSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LeaseSpecArgs $;

        public Builder() {
            $ = new LeaseSpecArgs();
        }

        public Builder(LeaseSpecArgs defaults) {
            $ = new LeaseSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acquireTime acquireTime is a time when the current lease was acquired.
         * 
         * @return builder
         * 
         */
        public Builder acquireTime(@Nullable Output<String> acquireTime) {
            $.acquireTime = acquireTime;
            return this;
        }

        /**
         * @param acquireTime acquireTime is a time when the current lease was acquired.
         * 
         * @return builder
         * 
         */
        public Builder acquireTime(String acquireTime) {
            return acquireTime(Output.of(acquireTime));
        }

        /**
         * @param holderIdentity holderIdentity contains the identity of the holder of a current lease.
         * 
         * @return builder
         * 
         */
        public Builder holderIdentity(@Nullable Output<String> holderIdentity) {
            $.holderIdentity = holderIdentity;
            return this;
        }

        /**
         * @param holderIdentity holderIdentity contains the identity of the holder of a current lease.
         * 
         * @return builder
         * 
         */
        public Builder holderIdentity(String holderIdentity) {
            return holderIdentity(Output.of(holderIdentity));
        }

        /**
         * @param leaseDurationSeconds leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
         * 
         * @return builder
         * 
         */
        public Builder leaseDurationSeconds(@Nullable Output<Integer> leaseDurationSeconds) {
            $.leaseDurationSeconds = leaseDurationSeconds;
            return this;
        }

        /**
         * @param leaseDurationSeconds leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
         * 
         * @return builder
         * 
         */
        public Builder leaseDurationSeconds(Integer leaseDurationSeconds) {
            return leaseDurationSeconds(Output.of(leaseDurationSeconds));
        }

        /**
         * @param leaseTransitions leaseTransitions is the number of transitions of a lease between holders.
         * 
         * @return builder
         * 
         */
        public Builder leaseTransitions(@Nullable Output<Integer> leaseTransitions) {
            $.leaseTransitions = leaseTransitions;
            return this;
        }

        /**
         * @param leaseTransitions leaseTransitions is the number of transitions of a lease between holders.
         * 
         * @return builder
         * 
         */
        public Builder leaseTransitions(Integer leaseTransitions) {
            return leaseTransitions(Output.of(leaseTransitions));
        }

        /**
         * @param renewTime renewTime is a time when the current holder of a lease has last updated the lease.
         * 
         * @return builder
         * 
         */
        public Builder renewTime(@Nullable Output<String> renewTime) {
            $.renewTime = renewTime;
            return this;
        }

        /**
         * @param renewTime renewTime is a time when the current holder of a lease has last updated the lease.
         * 
         * @return builder
         * 
         */
        public Builder renewTime(String renewTime) {
            return renewTime(Output.of(renewTime));
        }

        public LeaseSpecArgs build() {
            return $;
        }
    }

}
