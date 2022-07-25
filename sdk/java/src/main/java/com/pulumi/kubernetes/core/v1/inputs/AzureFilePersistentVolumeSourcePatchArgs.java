// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 * 
 */
public final class AzureFilePersistentVolumeSourcePatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFilePersistentVolumeSourcePatchArgs Empty = new AzureFilePersistentVolumeSourcePatchArgs();

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * secretName is the name of secret that contains Azure Storage Account Name and Key
     * 
     */
    @Import(name="secretName")
    private @Nullable Output<String> secretName;

    /**
     * @return secretName is the name of secret that contains Azure Storage Account Name and Key
     * 
     */
    public Optional<Output<String>> secretName() {
        return Optional.ofNullable(this.secretName);
    }

    /**
     * secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
     * 
     */
    @Import(name="secretNamespace")
    private @Nullable Output<String> secretNamespace;

    /**
     * @return secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
     * 
     */
    public Optional<Output<String>> secretNamespace() {
        return Optional.ofNullable(this.secretNamespace);
    }

    /**
     * shareName is the azure Share Name
     * 
     */
    @Import(name="shareName")
    private @Nullable Output<String> shareName;

    /**
     * @return shareName is the azure Share Name
     * 
     */
    public Optional<Output<String>> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    private AzureFilePersistentVolumeSourcePatchArgs() {}

    private AzureFilePersistentVolumeSourcePatchArgs(AzureFilePersistentVolumeSourcePatchArgs $) {
        this.readOnly = $.readOnly;
        this.secretName = $.secretName;
        this.secretNamespace = $.secretNamespace;
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFilePersistentVolumeSourcePatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFilePersistentVolumeSourcePatchArgs $;

        public Builder() {
            $ = new AzureFilePersistentVolumeSourcePatchArgs();
        }

        public Builder(AzureFilePersistentVolumeSourcePatchArgs defaults) {
            $ = new AzureFilePersistentVolumeSourcePatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param readOnly readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param secretName secretName is the name of secret that contains Azure Storage Account Name and Key
         * 
         * @return builder
         * 
         */
        public Builder secretName(@Nullable Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName secretName is the name of secret that contains Azure Storage Account Name and Key
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param secretNamespace secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
         * 
         * @return builder
         * 
         */
        public Builder secretNamespace(@Nullable Output<String> secretNamespace) {
            $.secretNamespace = secretNamespace;
            return this;
        }

        /**
         * @param secretNamespace secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
         * 
         * @return builder
         * 
         */
        public Builder secretNamespace(String secretNamespace) {
            return secretNamespace(Output.of(secretNamespace));
        }

        /**
         * @param shareName shareName is the azure Share Name
         * 
         * @return builder
         * 
         */
        public Builder shareName(@Nullable Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName shareName is the azure Share Name
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public AzureFilePersistentVolumeSourcePatchArgs build() {
            return $;
        }
    }

}
