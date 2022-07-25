// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EndpointPort represents a Port used by an EndpointSlice
 * 
 */
public final class EndpointPortPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointPortPatchArgs Empty = new EndpointPortPatchArgs();

    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    @Import(name="appProtocol")
    private @Nullable Output<String> appProtocol;

    /**
     * @return The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    public Optional<Output<String>> appProtocol() {
        return Optional.ofNullable(this.appProtocol);
    }

    /**
     * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or &#39;-&#39;. * must start and end with an alphanumeric character. Default is empty string.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or &#39;-&#39;. * must start and end with an alphanumeric character. Default is empty string.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private EndpointPortPatchArgs() {}

    private EndpointPortPatchArgs(EndpointPortPatchArgs $) {
        this.appProtocol = $.appProtocol;
        this.name = $.name;
        this.port = $.port;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointPortPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointPortPatchArgs $;

        public Builder() {
            $ = new EndpointPortPatchArgs();
        }

        public Builder(EndpointPortPatchArgs defaults) {
            $ = new EndpointPortPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appProtocol The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
         * 
         * @return builder
         * 
         */
        public Builder appProtocol(@Nullable Output<String> appProtocol) {
            $.appProtocol = appProtocol;
            return this;
        }

        /**
         * @param appProtocol The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
         * 
         * @return builder
         * 
         */
        public Builder appProtocol(String appProtocol) {
            return appProtocol(Output.of(appProtocol));
        }

        /**
         * @param name The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or &#39;-&#39;. * must start and end with an alphanumeric character. Default is empty string.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or &#39;-&#39;. * must start and end with an alphanumeric character. Default is empty string.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public EndpointPortPatchArgs build() {
            return $;
        }
    }

}
