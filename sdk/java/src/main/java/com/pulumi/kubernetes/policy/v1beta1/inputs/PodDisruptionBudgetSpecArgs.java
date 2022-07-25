// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy.v1beta1.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta.v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 * 
 */
public final class PodDisruptionBudgetSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodDisruptionBudgetSpecArgs Empty = new PodDisruptionBudgetSpecArgs();

    /**
     * An eviction is allowed if at most &#34;maxUnavailable&#34; pods selected by &#34;selector&#34; are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with &#34;minAvailable&#34;.
     * 
     */
    @Import(name="maxUnavailable")
    private @Nullable Output<Either<Integer,String>> maxUnavailable;

    /**
     * @return An eviction is allowed if at most &#34;maxUnavailable&#34; pods selected by &#34;selector&#34; are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with &#34;minAvailable&#34;.
     * 
     */
    public Optional<Output<Either<Integer,String>>> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    /**
     * An eviction is allowed if at least &#34;minAvailable&#34; pods selected by &#34;selector&#34; will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying &#34;100%&#34;.
     * 
     */
    @Import(name="minAvailable")
    private @Nullable Output<Either<Integer,String>> minAvailable;

    /**
     * @return An eviction is allowed if at least &#34;minAvailable&#34; pods selected by &#34;selector&#34; will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying &#34;100%&#34;.
     * 
     */
    public Optional<Output<Either<Integer,String>>> minAvailable() {
        return Optional.ofNullable(this.minAvailable);
    }

    /**
     * Label query over pods whose evictions are managed by the disruption budget. A null selector selects no pods. An empty selector ({}) also selects no pods, which differs from standard behavior of selecting all pods. In policy/v1, an empty selector will select all pods in the namespace.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorArgs> selector;

    /**
     * @return Label query over pods whose evictions are managed by the disruption budget. A null selector selects no pods. An empty selector ({}) also selects no pods, which differs from standard behavior of selecting all pods. In policy/v1, an empty selector will select all pods in the namespace.
     * 
     */
    public Optional<Output<LabelSelectorArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private PodDisruptionBudgetSpecArgs() {}

    private PodDisruptionBudgetSpecArgs(PodDisruptionBudgetSpecArgs $) {
        this.maxUnavailable = $.maxUnavailable;
        this.minAvailable = $.minAvailable;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PodDisruptionBudgetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PodDisruptionBudgetSpecArgs $;

        public Builder() {
            $ = new PodDisruptionBudgetSpecArgs();
        }

        public Builder(PodDisruptionBudgetSpecArgs defaults) {
            $ = new PodDisruptionBudgetSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxUnavailable An eviction is allowed if at most &#34;maxUnavailable&#34; pods selected by &#34;selector&#34; are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with &#34;minAvailable&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(@Nullable Output<Either<Integer,String>> maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param maxUnavailable An eviction is allowed if at most &#34;maxUnavailable&#34; pods selected by &#34;selector&#34; are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with &#34;minAvailable&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Either<Integer,String> maxUnavailable) {
            return maxUnavailable(Output.of(maxUnavailable));
        }

        /**
         * @param maxUnavailable An eviction is allowed if at most &#34;maxUnavailable&#34; pods selected by &#34;selector&#34; are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with &#34;minAvailable&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Integer maxUnavailable) {
            return maxUnavailable(Either.ofLeft(maxUnavailable));
        }

        /**
         * @param maxUnavailable An eviction is allowed if at most &#34;maxUnavailable&#34; pods selected by &#34;selector&#34; are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with &#34;minAvailable&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(String maxUnavailable) {
            return maxUnavailable(Either.ofRight(maxUnavailable));
        }

        /**
         * @param minAvailable An eviction is allowed if at least &#34;minAvailable&#34; pods selected by &#34;selector&#34; will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying &#34;100%&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minAvailable(@Nullable Output<Either<Integer,String>> minAvailable) {
            $.minAvailable = minAvailable;
            return this;
        }

        /**
         * @param minAvailable An eviction is allowed if at least &#34;minAvailable&#34; pods selected by &#34;selector&#34; will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying &#34;100%&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minAvailable(Either<Integer,String> minAvailable) {
            return minAvailable(Output.of(minAvailable));
        }

        /**
         * @param minAvailable An eviction is allowed if at least &#34;minAvailable&#34; pods selected by &#34;selector&#34; will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying &#34;100%&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minAvailable(Integer minAvailable) {
            return minAvailable(Either.ofLeft(minAvailable));
        }

        /**
         * @param minAvailable An eviction is allowed if at least &#34;minAvailable&#34; pods selected by &#34;selector&#34; will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying &#34;100%&#34;.
         * 
         * @return builder
         * 
         */
        public Builder minAvailable(String minAvailable) {
            return minAvailable(Either.ofRight(minAvailable));
        }

        /**
         * @param selector Label query over pods whose evictions are managed by the disruption budget. A null selector selects no pods. An empty selector ({}) also selects no pods, which differs from standard behavior of selecting all pods. In policy/v1, an empty selector will select all pods in the namespace.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Label query over pods whose evictions are managed by the disruption budget. A null selector selects no pods. An empty selector ({}) also selects no pods, which differs from standard behavior of selecting all pods. In policy/v1, an empty selector will select all pods in the namespace.
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        public PodDisruptionBudgetSpecArgs build() {
            return $;
        }
    }

}
