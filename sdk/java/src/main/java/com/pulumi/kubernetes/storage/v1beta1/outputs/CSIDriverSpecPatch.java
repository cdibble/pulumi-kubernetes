// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.storage.v1beta1.outputs.TokenRequestPatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CSIDriverSpecPatch {
    /**
     * @return attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     * 
     */
    private @Nullable Boolean attachRequired;
    /**
     * @return Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details. This field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy feature gate.
     * 
     */
    private @Nullable String fsGroupPolicy;
    /**
     * @return If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. &#34;csi.storage.k8s.io/pod.name&#34;: pod.Name &#34;csi.storage.k8s.io/pod.namespace&#34;: pod.Namespace &#34;csi.storage.k8s.io/pod.uid&#34;: string(pod.UID) &#34;csi.storage.k8s.io/ephemeral&#34;: &#34;true&#34; iff the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise &#34;false&#34;
     * 
     * &#34;csi.storage.k8s.io/ephemeral&#34; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the &#34;Persistent&#34; and &#34;Ephemeral&#34; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
     * 
     */
    private @Nullable Boolean podInfoOnMount;
    /**
     * @return RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
     * 
     * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
     * 
     * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
     * 
     */
    private @Nullable Boolean requiresRepublish;
    /**
     * @return If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
     * 
     * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
     * 
     * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
     * 
     * This is an alpha field and only available when the CSIStorageCapacity feature is enabled. The default is false.
     * 
     */
    private @Nullable Boolean storageCapacity;
    /**
     * @return TokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: &#34;csi.storage.k8s.io/serviceAccount.tokens&#34;: {
     *   &#34;&lt;audience&gt;&#34;: {
     *     &#34;token&#34;: &lt;token&gt;,
     *     &#34;expirationTimestamp&#34;: &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * 
     * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * 
     * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
     * 
     */
    private @Nullable List<TokenRequestPatch> tokenRequests;
    /**
     * @return VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is &#34;Persistent&#34;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is &#34;Ephemeral&#34;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
     * 
     */
    private @Nullable List<String> volumeLifecycleModes;

    private CSIDriverSpecPatch() {}
    /**
     * @return attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     * 
     */
    public Optional<Boolean> attachRequired() {
        return Optional.ofNullable(this.attachRequired);
    }
    /**
     * @return Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details. This field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy feature gate.
     * 
     */
    public Optional<String> fsGroupPolicy() {
        return Optional.ofNullable(this.fsGroupPolicy);
    }
    /**
     * @return If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. &#34;csi.storage.k8s.io/pod.name&#34;: pod.Name &#34;csi.storage.k8s.io/pod.namespace&#34;: pod.Namespace &#34;csi.storage.k8s.io/pod.uid&#34;: string(pod.UID) &#34;csi.storage.k8s.io/ephemeral&#34;: &#34;true&#34; iff the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise &#34;false&#34;
     * 
     * &#34;csi.storage.k8s.io/ephemeral&#34; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the &#34;Persistent&#34; and &#34;Ephemeral&#34; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
     * 
     */
    public Optional<Boolean> podInfoOnMount() {
        return Optional.ofNullable(this.podInfoOnMount);
    }
    /**
     * @return RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
     * 
     * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
     * 
     * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
     * 
     */
    public Optional<Boolean> requiresRepublish() {
        return Optional.ofNullable(this.requiresRepublish);
    }
    /**
     * @return If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
     * 
     * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
     * 
     * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
     * 
     * This is an alpha field and only available when the CSIStorageCapacity feature is enabled. The default is false.
     * 
     */
    public Optional<Boolean> storageCapacity() {
        return Optional.ofNullable(this.storageCapacity);
    }
    /**
     * @return TokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: &#34;csi.storage.k8s.io/serviceAccount.tokens&#34;: {
     *   &#34;&lt;audience&gt;&#34;: {
     *     &#34;token&#34;: &lt;token&gt;,
     *     &#34;expirationTimestamp&#34;: &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * 
     * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * 
     * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
     * 
     */
    public List<TokenRequestPatch> tokenRequests() {
        return this.tokenRequests == null ? List.of() : this.tokenRequests;
    }
    /**
     * @return VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is &#34;Persistent&#34;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is &#34;Ephemeral&#34;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
     * 
     */
    public List<String> volumeLifecycleModes() {
        return this.volumeLifecycleModes == null ? List.of() : this.volumeLifecycleModes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIDriverSpecPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean attachRequired;
        private @Nullable String fsGroupPolicy;
        private @Nullable Boolean podInfoOnMount;
        private @Nullable Boolean requiresRepublish;
        private @Nullable Boolean storageCapacity;
        private @Nullable List<TokenRequestPatch> tokenRequests;
        private @Nullable List<String> volumeLifecycleModes;
        public Builder() {}
        public Builder(CSIDriverSpecPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachRequired = defaults.attachRequired;
    	      this.fsGroupPolicy = defaults.fsGroupPolicy;
    	      this.podInfoOnMount = defaults.podInfoOnMount;
    	      this.requiresRepublish = defaults.requiresRepublish;
    	      this.storageCapacity = defaults.storageCapacity;
    	      this.tokenRequests = defaults.tokenRequests;
    	      this.volumeLifecycleModes = defaults.volumeLifecycleModes;
        }

        @CustomType.Setter
        public Builder attachRequired(@Nullable Boolean attachRequired) {
            this.attachRequired = attachRequired;
            return this;
        }
        @CustomType.Setter
        public Builder fsGroupPolicy(@Nullable String fsGroupPolicy) {
            this.fsGroupPolicy = fsGroupPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder podInfoOnMount(@Nullable Boolean podInfoOnMount) {
            this.podInfoOnMount = podInfoOnMount;
            return this;
        }
        @CustomType.Setter
        public Builder requiresRepublish(@Nullable Boolean requiresRepublish) {
            this.requiresRepublish = requiresRepublish;
            return this;
        }
        @CustomType.Setter
        public Builder storageCapacity(@Nullable Boolean storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }
        @CustomType.Setter
        public Builder tokenRequests(@Nullable List<TokenRequestPatch> tokenRequests) {
            this.tokenRequests = tokenRequests;
            return this;
        }
        public Builder tokenRequests(TokenRequestPatch... tokenRequests) {
            return tokenRequests(List.of(tokenRequests));
        }
        @CustomType.Setter
        public Builder volumeLifecycleModes(@Nullable List<String> volumeLifecycleModes) {
            this.volumeLifecycleModes = volumeLifecycleModes;
            return this;
        }
        public Builder volumeLifecycleModes(String... volumeLifecycleModes) {
            return volumeLifecycleModes(List.of(volumeLifecycleModes));
        }
        public CSIDriverSpecPatch build() {
            final var o = new CSIDriverSpecPatch();
            o.attachRequired = attachRequired;
            o.fsGroupPolicy = fsGroupPolicy;
            o.podInfoOnMount = podInfoOnMount;
            o.requiresRepublish = requiresRepublish;
            o.storageCapacity = storageCapacity;
            o.tokenRequests = tokenRequests;
            o.volumeLifecycleModes = volumeLifecycleModes;
            return o;
        }
    }
}
