// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authorization.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.authorization.v1beta1.outputs.NonResourceRulePatch;
import com.pulumi.kubernetes.authorization.v1beta1.outputs.ResourceRulePatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubjectRulesReviewStatusPatch {
    /**
     * @return EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn&#39;t support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
     * 
     */
    private @Nullable String evaluationError;
    /**
     * @return Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn&#39;t support rules evaluation.
     * 
     */
    private @Nullable Boolean incomplete;
    /**
     * @return NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    private @Nullable List<NonResourceRulePatch> nonResourceRules;
    /**
     * @return ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    private @Nullable List<ResourceRulePatch> resourceRules;

    private SubjectRulesReviewStatusPatch() {}
    /**
     * @return EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn&#39;t support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
     * 
     */
    public Optional<String> evaluationError() {
        return Optional.ofNullable(this.evaluationError);
    }
    /**
     * @return Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn&#39;t support rules evaluation.
     * 
     */
    public Optional<Boolean> incomplete() {
        return Optional.ofNullable(this.incomplete);
    }
    /**
     * @return NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    public List<NonResourceRulePatch> nonResourceRules() {
        return this.nonResourceRules == null ? List.of() : this.nonResourceRules;
    }
    /**
     * @return ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    public List<ResourceRulePatch> resourceRules() {
        return this.resourceRules == null ? List.of() : this.resourceRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectRulesReviewStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String evaluationError;
        private @Nullable Boolean incomplete;
        private @Nullable List<NonResourceRulePatch> nonResourceRules;
        private @Nullable List<ResourceRulePatch> resourceRules;
        public Builder() {}
        public Builder(SubjectRulesReviewStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationError = defaults.evaluationError;
    	      this.incomplete = defaults.incomplete;
    	      this.nonResourceRules = defaults.nonResourceRules;
    	      this.resourceRules = defaults.resourceRules;
        }

        @CustomType.Setter
        public Builder evaluationError(@Nullable String evaluationError) {
            this.evaluationError = evaluationError;
            return this;
        }
        @CustomType.Setter
        public Builder incomplete(@Nullable Boolean incomplete) {
            this.incomplete = incomplete;
            return this;
        }
        @CustomType.Setter
        public Builder nonResourceRules(@Nullable List<NonResourceRulePatch> nonResourceRules) {
            this.nonResourceRules = nonResourceRules;
            return this;
        }
        public Builder nonResourceRules(NonResourceRulePatch... nonResourceRules) {
            return nonResourceRules(List.of(nonResourceRules));
        }
        @CustomType.Setter
        public Builder resourceRules(@Nullable List<ResourceRulePatch> resourceRules) {
            this.resourceRules = resourceRules;
            return this;
        }
        public Builder resourceRules(ResourceRulePatch... resourceRules) {
            return resourceRules(List.of(resourceRules));
        }
        public SubjectRulesReviewStatusPatch build() {
            final var o = new SubjectRulesReviewStatusPatch();
            o.evaluationError = evaluationError;
            o.incomplete = incomplete;
            o.nonResourceRules = nonResourceRules;
            o.resourceRules = resourceRules;
            return o;
        }
    }
}
