// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.auditregistration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyPatch {
    /**
     * @return The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
     * 
     */
    private @Nullable String level;
    /**
     * @return Stages is a list of stages for which events are created.
     * 
     */
    private @Nullable List<String> stages;

    private PolicyPatch() {}
    /**
     * @return The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
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

    public static Builder builder(PolicyPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String level;
        private @Nullable List<String> stages;
        public Builder() {}
        public Builder(PolicyPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.stages = defaults.stages;
        }

        @CustomType.Setter
        public Builder level(@Nullable String level) {
            this.level = level;
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
        public PolicyPatch build() {
            final var o = new PolicyPatch();
            o.level = level;
            o.stages = stages;
            return o;
        }
    }
}
