// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.EndpointAddressArgs;
import com.pulumi.kubernetes.core.v1.inputs.EndpointPortArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
 *   {
 *     Addresses: [{&#34;ip&#34;: &#34;10.10.1.1&#34;}, {&#34;ip&#34;: &#34;10.10.2.2&#34;}],
 *     Ports:     [{&#34;name&#34;: &#34;a&#34;, &#34;port&#34;: 8675}, {&#34;name&#34;: &#34;b&#34;, &#34;port&#34;: 309}]
 *   }
 * The resulting set of endpoints can be viewed as:
 *     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
 *     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 * 
 */
public final class EndpointSubsetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointSubsetArgs Empty = new EndpointSubsetArgs();

    /**
     * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
     * 
     */
    @Import(name="addresses")
    private @Nullable Output<List<EndpointAddressArgs>> addresses;

    /**
     * @return IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
     * 
     */
    public Optional<Output<List<EndpointAddressArgs>>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    /**
     * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
     * 
     */
    @Import(name="notReadyAddresses")
    private @Nullable Output<List<EndpointAddressArgs>> notReadyAddresses;

    /**
     * @return IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
     * 
     */
    public Optional<Output<List<EndpointAddressArgs>>> notReadyAddresses() {
        return Optional.ofNullable(this.notReadyAddresses);
    }

    /**
     * Port numbers available on the related IP addresses.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<EndpointPortArgs>> ports;

    /**
     * @return Port numbers available on the related IP addresses.
     * 
     */
    public Optional<Output<List<EndpointPortArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    private EndpointSubsetArgs() {}

    private EndpointSubsetArgs(EndpointSubsetArgs $) {
        this.addresses = $.addresses;
        this.notReadyAddresses = $.notReadyAddresses;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointSubsetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointSubsetArgs $;

        public Builder() {
            $ = new EndpointSubsetArgs();
        }

        public Builder(EndpointSubsetArgs defaults) {
            $ = new EndpointSubsetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable Output<List<EndpointAddressArgs>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<EndpointAddressArgs> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
         * 
         * @return builder
         * 
         */
        public Builder addresses(EndpointAddressArgs... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param notReadyAddresses IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
         * 
         * @return builder
         * 
         */
        public Builder notReadyAddresses(@Nullable Output<List<EndpointAddressArgs>> notReadyAddresses) {
            $.notReadyAddresses = notReadyAddresses;
            return this;
        }

        /**
         * @param notReadyAddresses IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
         * 
         * @return builder
         * 
         */
        public Builder notReadyAddresses(List<EndpointAddressArgs> notReadyAddresses) {
            return notReadyAddresses(Output.of(notReadyAddresses));
        }

        /**
         * @param notReadyAddresses IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
         * 
         * @return builder
         * 
         */
        public Builder notReadyAddresses(EndpointAddressArgs... notReadyAddresses) {
            return notReadyAddresses(List.of(notReadyAddresses));
        }

        /**
         * @param ports Port numbers available on the related IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<EndpointPortArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports Port numbers available on the related IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<EndpointPortArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports Port numbers available on the related IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder ports(EndpointPortArgs... ports) {
            return ports(List.of(ports));
        }

        public EndpointSubsetArgs build() {
            return $;
        }
    }

}
