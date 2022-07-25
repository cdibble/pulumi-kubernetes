// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.certificates.v1beta1.inputs.CertificateSigningRequestConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateSigningRequestStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestStatusArgs Empty = new CertificateSigningRequestStatusArgs();

    /**
     * If request was approved, the controller will place the issued certificate here.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return If request was approved, the controller will place the issued certificate here.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Conditions applied to the request, such as approval or denial.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<CertificateSigningRequestConditionArgs>> conditions;

    /**
     * @return Conditions applied to the request, such as approval or denial.
     * 
     */
    public Optional<Output<List<CertificateSigningRequestConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    private CertificateSigningRequestStatusArgs() {}

    private CertificateSigningRequestStatusArgs(CertificateSigningRequestStatusArgs $) {
        this.certificate = $.certificate;
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateSigningRequestStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateSigningRequestStatusArgs $;

        public Builder() {
            $ = new CertificateSigningRequestStatusArgs();
        }

        public Builder(CertificateSigningRequestStatusArgs defaults) {
            $ = new CertificateSigningRequestStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate If request was approved, the controller will place the issued certificate here.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate If request was approved, the controller will place the issued certificate here.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param conditions Conditions applied to the request, such as approval or denial.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<CertificateSigningRequestConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Conditions applied to the request, such as approval or denial.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<CertificateSigningRequestConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Conditions applied to the request, such as approval or denial.
         * 
         * @return builder
         * 
         */
        public Builder conditions(CertificateSigningRequestConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public CertificateSigningRequestStatusArgs build() {
            return $;
        }
    }

}
