// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Outputs.Autoscaling.V2
{

    /// <summary>
    /// HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
    /// </summary>
    [OutputType]
    public sealed class HPAScalingRulesPatch
    {
        /// <summary>
        /// policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
        /// </summary>
        public readonly ImmutableArray<Pulumi.Kubernetes.Types.Outputs.Autoscaling.V2.HPAScalingPolicyPatch> Policies;
        /// <summary>
        /// selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
        /// </summary>
        public readonly string SelectPolicy;
        /// <summary>
        /// StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
        /// </summary>
        public readonly int StabilizationWindowSeconds;

        [OutputConstructor]
        private HPAScalingRulesPatch(
            ImmutableArray<Pulumi.Kubernetes.Types.Outputs.Autoscaling.V2.HPAScalingPolicyPatch> policies,

            string selectPolicy,

            int stabilizationWindowSeconds)
        {
            Policies = policies;
            SelectPolicy = selectPolicy;
            StabilizationWindowSeconds = stabilizationWindowSeconds;
        }
    }
}
