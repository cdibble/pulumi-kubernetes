// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResourceRequirementsPatch {
    /**
     * @return Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    private @Nullable Map<String,String> limits;
    /**
     * @return Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    private @Nullable Map<String,String> requests;

    private ResourceRequirementsPatch() {}
    /**
     * @return Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    public Map<String,String> limits() {
        return this.limits == null ? Map.of() : this.limits;
    }
    /**
     * @return Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    public Map<String,String> requests() {
        return this.requests == null ? Map.of() : this.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirementsPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> limits;
        private @Nullable Map<String,String> requests;
        public Builder() {}
        public Builder(ResourceRequirementsPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        @CustomType.Setter
        public Builder limits(@Nullable Map<String,String> limits) {
            this.limits = limits;
            return this;
        }
        @CustomType.Setter
        public Builder requests(@Nullable Map<String,String> requests) {
            this.requests = requests;
            return this;
        }
        public ResourceRequirementsPatch build() {
            final var o = new ResourceRequirementsPatch();
            o.limits = limits;
            o.requests = requests;
            return o;
        }
    }
}
