// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.ResourceRequirementsArgs;
import com.pulumi.kubernetes.core.v1.inputs.TypedLocalObjectReferenceArgs;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 * 
 */
public final class PersistentVolumeClaimSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeClaimSpecArgs Empty = new PersistentVolumeClaimSpecArgs();

    /**
     * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    @Import(name="accessModes")
    private @Nullable Output<List<String>> accessModes;

    /**
     * @return accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    public Optional<Output<List<String>>> accessModes() {
        return Optional.ofNullable(this.accessModes);
    }

    /**
     * dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.
     * 
     */
    @Import(name="dataSource")
    private @Nullable Output<TypedLocalObjectReferenceArgs> dataSource;

    /**
     * @return dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.
     * 
     */
    public Optional<Output<TypedLocalObjectReferenceArgs>> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }

    /**
     * dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef
     *   allows any non-core object, as well as PersistentVolumeClaim objects.
     * * While DataSource ignores disallowed values (dropping them), DataSourceRef
     *   preserves all values, and generates an error if a disallowed value is
     *   specified.
     *   (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled.
     * 
     */
    @Import(name="dataSourceRef")
    private @Nullable Output<TypedLocalObjectReferenceArgs> dataSourceRef;

    /**
     * @return dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef
     *   allows any non-core object, as well as PersistentVolumeClaim objects.
     * * While DataSource ignores disallowed values (dropping them), DataSourceRef
     *   preserves all values, and generates an error if a disallowed value is
     *   specified.
     *   (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled.
     * 
     */
    public Optional<Output<TypedLocalObjectReferenceArgs>> dataSourceRef() {
        return Optional.ofNullable(this.dataSourceRef);
    }

    /**
     * resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    @Import(name="resources")
    private @Nullable Output<ResourceRequirementsArgs> resources;

    /**
     * @return resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    public Optional<Output<ResourceRequirementsArgs>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * selector is a label query over volumes to consider for binding.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorArgs> selector;

    /**
     * @return selector is a label query over volumes to consider for binding.
     * 
     */
    public Optional<Output<LabelSelectorArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     * 
     */
    @Import(name="storageClassName")
    private @Nullable Output<String> storageClassName;

    /**
     * @return storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     * 
     */
    public Optional<Output<String>> storageClassName() {
        return Optional.ofNullable(this.storageClassName);
    }

    /**
     * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
     * 
     */
    @Import(name="volumeMode")
    private @Nullable Output<String> volumeMode;

    /**
     * @return volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
     * 
     */
    public Optional<Output<String>> volumeMode() {
        return Optional.ofNullable(this.volumeMode);
    }

    /**
     * volumeName is the binding reference to the PersistentVolume backing this claim.
     * 
     */
    @Import(name="volumeName")
    private @Nullable Output<String> volumeName;

    /**
     * @return volumeName is the binding reference to the PersistentVolume backing this claim.
     * 
     */
    public Optional<Output<String>> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    private PersistentVolumeClaimSpecArgs() {}

    private PersistentVolumeClaimSpecArgs(PersistentVolumeClaimSpecArgs $) {
        this.accessModes = $.accessModes;
        this.dataSource = $.dataSource;
        this.dataSourceRef = $.dataSourceRef;
        this.resources = $.resources;
        this.selector = $.selector;
        this.storageClassName = $.storageClassName;
        this.volumeMode = $.volumeMode;
        this.volumeName = $.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PersistentVolumeClaimSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PersistentVolumeClaimSpecArgs $;

        public Builder() {
            $ = new PersistentVolumeClaimSpecArgs();
        }

        public Builder(PersistentVolumeClaimSpecArgs defaults) {
            $ = new PersistentVolumeClaimSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessModes accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
         * 
         * @return builder
         * 
         */
        public Builder accessModes(@Nullable Output<List<String>> accessModes) {
            $.accessModes = accessModes;
            return this;
        }

        /**
         * @param accessModes accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
         * 
         * @return builder
         * 
         */
        public Builder accessModes(List<String> accessModes) {
            return accessModes(Output.of(accessModes));
        }

        /**
         * @param accessModes accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
         * 
         * @return builder
         * 
         */
        public Builder accessModes(String... accessModes) {
            return accessModes(List.of(accessModes));
        }

        /**
         * @param dataSource dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(@Nullable Output<TypedLocalObjectReferenceArgs> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param dataSource dataSource field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(TypedLocalObjectReferenceArgs dataSource) {
            return dataSource(Output.of(dataSource));
        }

        /**
         * @param dataSourceRef dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef
         *   allows any non-core object, as well as PersistentVolumeClaim objects.
         * * While DataSource ignores disallowed values (dropping them), DataSourceRef
         *   preserves all values, and generates an error if a disallowed value is
         *   specified.
         *   (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceRef(@Nullable Output<TypedLocalObjectReferenceArgs> dataSourceRef) {
            $.dataSourceRef = dataSourceRef;
            return this;
        }

        /**
         * @param dataSourceRef dataSourceRef specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef
         *   allows any non-core object, as well as PersistentVolumeClaim objects.
         * * While DataSource ignores disallowed values (dropping them), DataSourceRef
         *   preserves all values, and generates an error if a disallowed value is
         *   specified.
         *   (Beta) Using this field requires the AnyVolumeDataSource feature gate to be enabled.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceRef(TypedLocalObjectReferenceArgs dataSourceRef) {
            return dataSourceRef(Output.of(dataSourceRef));
        }

        /**
         * @param resources resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<ResourceRequirementsArgs> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
         * 
         * @return builder
         * 
         */
        public Builder resources(ResourceRequirementsArgs resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param selector selector is a label query over volumes to consider for binding.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector selector is a label query over volumes to consider for binding.
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param storageClassName storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
         * 
         * @return builder
         * 
         */
        public Builder storageClassName(@Nullable Output<String> storageClassName) {
            $.storageClassName = storageClassName;
            return this;
        }

        /**
         * @param storageClassName storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
         * 
         * @return builder
         * 
         */
        public Builder storageClassName(String storageClassName) {
            return storageClassName(Output.of(storageClassName));
        }

        /**
         * @param volumeMode volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
         * 
         * @return builder
         * 
         */
        public Builder volumeMode(@Nullable Output<String> volumeMode) {
            $.volumeMode = volumeMode;
            return this;
        }

        /**
         * @param volumeMode volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
         * 
         * @return builder
         * 
         */
        public Builder volumeMode(String volumeMode) {
            return volumeMode(Output.of(volumeMode));
        }

        /**
         * @param volumeName volumeName is the binding reference to the PersistentVolume backing this claim.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(@Nullable Output<String> volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        /**
         * @param volumeName volumeName is the binding reference to the PersistentVolume backing this claim.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(String volumeName) {
            return volumeName(Output.of(volumeName));
        }

        public PersistentVolumeClaimSpecArgs build() {
            return $;
        }
    }

}
