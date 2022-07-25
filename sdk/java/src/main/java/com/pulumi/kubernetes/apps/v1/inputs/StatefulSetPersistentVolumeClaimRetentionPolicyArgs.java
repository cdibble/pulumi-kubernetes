// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.
 * 
 */
public final class StatefulSetPersistentVolumeClaimRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetPersistentVolumeClaimRetentionPolicyArgs Empty = new StatefulSetPersistentVolumeClaimRetentionPolicyArgs();

    /**
     * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
     * 
     */
    @Import(name="whenDeleted")
    private @Nullable Output<String> whenDeleted;

    /**
     * @return WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
     * 
     */
    public Optional<Output<String>> whenDeleted() {
        return Optional.ofNullable(this.whenDeleted);
    }

    /**
     * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
     * 
     */
    @Import(name="whenScaled")
    private @Nullable Output<String> whenScaled;

    /**
     * @return WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
     * 
     */
    public Optional<Output<String>> whenScaled() {
        return Optional.ofNullable(this.whenScaled);
    }

    private StatefulSetPersistentVolumeClaimRetentionPolicyArgs() {}

    private StatefulSetPersistentVolumeClaimRetentionPolicyArgs(StatefulSetPersistentVolumeClaimRetentionPolicyArgs $) {
        this.whenDeleted = $.whenDeleted;
        this.whenScaled = $.whenScaled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetPersistentVolumeClaimRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetPersistentVolumeClaimRetentionPolicyArgs $;

        public Builder() {
            $ = new StatefulSetPersistentVolumeClaimRetentionPolicyArgs();
        }

        public Builder(StatefulSetPersistentVolumeClaimRetentionPolicyArgs defaults) {
            $ = new StatefulSetPersistentVolumeClaimRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param whenDeleted WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
         * 
         * @return builder
         * 
         */
        public Builder whenDeleted(@Nullable Output<String> whenDeleted) {
            $.whenDeleted = whenDeleted;
            return this;
        }

        /**
         * @param whenDeleted WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
         * 
         * @return builder
         * 
         */
        public Builder whenDeleted(String whenDeleted) {
            return whenDeleted(Output.of(whenDeleted));
        }

        /**
         * @param whenScaled WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
         * 
         * @return builder
         * 
         */
        public Builder whenScaled(@Nullable Output<String> whenScaled) {
            $.whenScaled = whenScaled;
            return this;
        }

        /**
         * @param whenScaled WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
         * 
         * @return builder
         * 
         */
        public Builder whenScaled(String whenScaled) {
            return whenScaled(Output.of(whenScaled));
        }

        public StatefulSetPersistentVolumeClaimRetentionPolicyArgs build() {
            return $;
        }
    }

}
