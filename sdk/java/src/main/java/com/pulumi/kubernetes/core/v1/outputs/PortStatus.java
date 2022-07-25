// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PortStatus {
    /**
     * @return Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use
     *   CamelCase names
     * - cloud provider specific error values must have names that comply with the
     *   format foo.example.com/CamelCase.
     * 
     */
    private @Nullable String error;
    /**
     * @return Port is the port number of the service port of which status is recorded here
     * 
     */
    private Integer port;
    /**
     * @return Protocol is the protocol of the service port of which status is recorded here The supported values are: &#34;TCP&#34;, &#34;UDP&#34;, &#34;SCTP&#34;
     * 
     */
    private String protocol;

    private PortStatus() {}
    /**
     * @return Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use
     *   CamelCase names
     * - cloud provider specific error values must have names that comply with the
     *   format foo.example.com/CamelCase.
     * 
     */
    public Optional<String> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return Port is the port number of the service port of which status is recorded here
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Protocol is the protocol of the service port of which status is recorded here The supported values are: &#34;TCP&#34;, &#34;UDP&#34;, &#34;SCTP&#34;
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String error;
        private Integer port;
        private String protocol;
        public Builder() {}
        public Builder(PortStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder error(@Nullable String error) {
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public PortStatus build() {
            final var o = new PortStatus();
            o.error = error;
            o.port = port;
            o.protocol = protocol;
            return o;
        }
    }
}
