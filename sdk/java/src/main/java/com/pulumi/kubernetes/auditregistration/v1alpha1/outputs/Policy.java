// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.auditregistration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class Policy {
    /**
     * @return The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
     * 
     */
    private String level;
    /**
     * @return Stages is a list of stages for which events are created.
     * 
     */
    private @Nullable List<String> stages;

    private Policy() {}
    /**
     * @return The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
     * 
     */
    public String level() {
        return this.level;
    }
    /**
     * @return Stages is a list of stages for which events are created.
     * 
     */
    public List<String> stages() {
        return this.stages == null ? List.of() : this.stages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Policy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String level;
        private @Nullable List<String> stages;
        public Builder() {}
        public Builder(Policy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.stages = defaults.stages;
        }

        @CustomType.Setter
        public Builder level(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }
        @CustomType.Setter
        public Builder stages(@Nullable List<String> stages) {
            this.stages = stages;
            return this;
        }
        public Builder stages(String... stages) {
            return stages(List.of(stages));
        }
        public Policy build() {
            final var o = new Policy();
            o.level = level;
            o.stages = stages;
            return o;
        }
    }
}
