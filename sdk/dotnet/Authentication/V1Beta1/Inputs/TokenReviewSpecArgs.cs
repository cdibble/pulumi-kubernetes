// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Kubernetes.Types.Inputs.Authentication.V1Beta1
{

    /// <summary>
    /// TokenReviewSpec is a description of the token authentication request.
    /// </summary>
    public class TokenReviewSpecArgs : global::Pulumi.ResourceArgs
    {
        [Input("audiences")]
        private InputList<string>? _audiences;

        /// <summary>
        /// Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
        /// </summary>
        public InputList<string> Audiences
        {
            get => _audiences ?? (_audiences = new InputList<string>());
            set => _audiences = value;
        }

        /// <summary>
        /// Token is the opaque bearer token.
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        public TokenReviewSpecArgs()
        {
        }
        public static new TokenReviewSpecArgs Empty => new TokenReviewSpecArgs();
    }
}
