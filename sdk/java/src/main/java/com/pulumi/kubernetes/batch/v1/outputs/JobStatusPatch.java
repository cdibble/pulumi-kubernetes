// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.batch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.batch.v1.outputs.JobConditionPatch;
import com.pulumi.kubernetes.batch.v1.outputs.UncountedTerminatedPodsPatch;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobStatusPatch {
    /**
     * @return The number of pending and running pods.
     * 
     */
    private @Nullable Integer active;
    /**
     * @return CompletedIndexes holds the completed indexes when .spec.completionMode = &#34;Indexed&#34; in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;.
     * 
     */
    private @Nullable String completedIndexes;
    /**
     * @return Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes successfully.
     * 
     */
    private @Nullable String completionTime;
    /**
     * @return The latest available observations of an object&#39;s current state. When a Job fails, one of the conditions will have type &#34;Failed&#34; and status true. When a Job is suspended, one of the conditions will have type &#34;Suspended&#34; and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type &#34;Complete&#34; and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private @Nullable List<JobConditionPatch> conditions;
    /**
     * @return The number of pods which reached phase Failed.
     * 
     */
    private @Nullable Integer failed;
    /**
     * @return The number of pods which have a Ready condition.
     * 
     * This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).
     * 
     */
    private @Nullable Integer ready;
    /**
     * @return Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
     * 
     */
    private @Nullable String startTime;
    /**
     * @return The number of pods which reached phase Succeeded.
     * 
     */
    private @Nullable Integer succeeded;
    /**
     * @return UncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn&#39;t yet accounted for in the status counters.
     * 
     * The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the controller does three steps to account for it in the job status: (1) Add the pod UID to the arrays in this field. (2) Remove the pod finalizer. (3) Remove the pod UID from the arrays while increasing the corresponding
     *     counter.
     * 
     * This field is beta-level. The job controller only makes use of this field when the feature gate JobTrackingWithFinalizers is enabled (enabled by default). Old jobs might not be tracked using this field, in which case the field remains null.
     * 
     */
    private @Nullable UncountedTerminatedPodsPatch uncountedTerminatedPods;

    private JobStatusPatch() {}
    /**
     * @return The number of pending and running pods.
     * 
     */
    public Optional<Integer> active() {
        return Optional.ofNullable(this.active);
    }
    /**
     * @return CompletedIndexes holds the completed indexes when .spec.completionMode = &#34;Indexed&#34; in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;.
     * 
     */
    public Optional<String> completedIndexes() {
        return Optional.ofNullable(this.completedIndexes);
    }
    /**
     * @return Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes successfully.
     * 
     */
    public Optional<String> completionTime() {
        return Optional.ofNullable(this.completionTime);
    }
    /**
     * @return The latest available observations of an object&#39;s current state. When a Job fails, one of the conditions will have type &#34;Failed&#34; and status true. When a Job is suspended, one of the conditions will have type &#34;Suspended&#34; and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type &#34;Complete&#34; and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public List<JobConditionPatch> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return The number of pods which reached phase Failed.
     * 
     */
    public Optional<Integer> failed() {
        return Optional.ofNullable(this.failed);
    }
    /**
     * @return The number of pods which have a Ready condition.
     * 
     * This field is beta-level. The job controller populates the field when the feature gate JobReadyPods is enabled (enabled by default).
     * 
     */
    public Optional<Integer> ready() {
        return Optional.ofNullable(this.ready);
    }
    /**
     * @return Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * @return The number of pods which reached phase Succeeded.
     * 
     */
    public Optional<Integer> succeeded() {
        return Optional.ofNullable(this.succeeded);
    }
    /**
     * @return UncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn&#39;t yet accounted for in the status counters.
     * 
     * The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the controller does three steps to account for it in the job status: (1) Add the pod UID to the arrays in this field. (2) Remove the pod finalizer. (3) Remove the pod UID from the arrays while increasing the corresponding
     *     counter.
     * 
     * This field is beta-level. The job controller only makes use of this field when the feature gate JobTrackingWithFinalizers is enabled (enabled by default). Old jobs might not be tracked using this field, in which case the field remains null.
     * 
     */
    public Optional<UncountedTerminatedPodsPatch> uncountedTerminatedPods() {
        return Optional.ofNullable(this.uncountedTerminatedPods);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer active;
        private @Nullable String completedIndexes;
        private @Nullable String completionTime;
        private @Nullable List<JobConditionPatch> conditions;
        private @Nullable Integer failed;
        private @Nullable Integer ready;
        private @Nullable String startTime;
        private @Nullable Integer succeeded;
        private @Nullable UncountedTerminatedPodsPatch uncountedTerminatedPods;
        public Builder() {}
        public Builder(JobStatusPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.completedIndexes = defaults.completedIndexes;
    	      this.completionTime = defaults.completionTime;
    	      this.conditions = defaults.conditions;
    	      this.failed = defaults.failed;
    	      this.ready = defaults.ready;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
    	      this.uncountedTerminatedPods = defaults.uncountedTerminatedPods;
        }

        @CustomType.Setter
        public Builder active(@Nullable Integer active) {
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder completedIndexes(@Nullable String completedIndexes) {
            this.completedIndexes = completedIndexes;
            return this;
        }
        @CustomType.Setter
        public Builder completionTime(@Nullable String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable List<JobConditionPatch> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(JobConditionPatch... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder failed(@Nullable Integer failed) {
            this.failed = failed;
            return this;
        }
        @CustomType.Setter
        public Builder ready(@Nullable Integer ready) {
            this.ready = ready;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder succeeded(@Nullable Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        @CustomType.Setter
        public Builder uncountedTerminatedPods(@Nullable UncountedTerminatedPodsPatch uncountedTerminatedPods) {
            this.uncountedTerminatedPods = uncountedTerminatedPods;
            return this;
        }
        public JobStatusPatch build() {
            final var o = new JobStatusPatch();
            o.active = active;
            o.completedIndexes = completedIndexes;
            o.completionTime = completionTime;
            o.conditions = conditions;
            o.failed = failed;
            o.ready = ready;
            o.startTime = startTime;
            o.succeeded = succeeded;
            o.uncountedTerminatedPods = uncountedTerminatedPods;
            return o;
        }
    }
}
