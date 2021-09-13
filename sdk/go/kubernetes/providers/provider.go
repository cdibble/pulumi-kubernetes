// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kubernetes

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the kubernetes package.
// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
type Provider struct {
	pulumi.ProviderResourceState
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.EnableDryRun == nil {
		args.EnableDryRun = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "PULUMI_K8S_ENABLE_DRY_RUN").(bool))
	}
	if args.HelmDriver == nil {
		args.HelmDriver = pulumi.StringPtr(getEnvOrDefault("", nil, "PULUMI_K8S_HELM_DRIVER").(string))
	}
	if args.HelmPluginsPath == nil {
		args.HelmPluginsPath = pulumi.StringPtr(getEnvOrDefault("", nil, "PULUMI_K8S_HELM_PLUGINS_PATH").(string))
	}
	if args.HelmRegistryConfigPath == nil {
		args.HelmRegistryConfigPath = pulumi.StringPtr(getEnvOrDefault("", nil, "PULUMI_K8S_HELM_REGISTRY_CONFIG_PATH").(string))
	}
	if args.HelmRepositoryCache == nil {
		args.HelmRepositoryCache = pulumi.StringPtr(getEnvOrDefault("", nil, "PULUMI_K8s_HELM_REPOSITORY_CACHE").(string))
	}
	if args.HelmRepositoryConfigPath == nil {
		args.HelmRepositoryConfigPath = pulumi.StringPtr(getEnvOrDefault("", nil, "PULUMI_K8S_HELM_REPOSITORY_CONFIG_PATH").(string))
	}
	if args.Kubeconfig == nil {
		args.Kubeconfig = pulumi.StringPtr(getEnvOrDefault("", nil, "KUBECONFIG").(string))
	}
	if args.SuppressDeprecationWarnings == nil {
		args.SuppressDeprecationWarnings = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "PULUMI_K8S_SUPPRESS_DEPRECATION_WARNINGS").(bool))
	}
	if args.SuppressHelmHookWarnings == nil {
		args.SuppressHelmHookWarnings = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "PULUMI_K8S_SUPPRESS_HELM_HOOK_WARNINGS").(bool))
	}
	if args.SuppressHelmReleaseBetaWarning == nil {
		args.SuppressHelmReleaseBetaWarning = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "PULUMI_K8S_SUPPRESS_HELM_RELEASE_BETA_WARNING").(bool))
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:kubernetes", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
type providerArgs struct {
	// If present, the name of the kubeconfig cluster to use.
	Cluster *string `pulumi:"cluster"`
	// If present, the name of the kubeconfig context to use.
	Context *string `pulumi:"context"`
	// BETA FEATURE - If present and set to true, enable server-side diff calculations.
	// This feature is in developer preview, and is disabled by default.
	EnableDryRun *bool `pulumi:"enableDryRun"`
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The backend storage driver for Helm. Values are: configmap, secret, memory, sql.
	HelmDriver *string `pulumi:"helmDriver"`
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The path to the helm plugins directory.
	HelmPluginsPath *string `pulumi:"helmPluginsPath"`
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The path to the registry config file.
	HelmRegistryConfigPath *string `pulumi:"helmRegistryConfigPath"`
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The path to the file containing cached repository indexes.
	HelmRepositoryCache *string `pulumi:"helmRepositoryCache"`
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The path to the file containing repository names and URLs.
	HelmRepositoryConfigPath *string `pulumi:"helmRepositoryConfigPath"`
	// The contents of a kubeconfig file or the path to a kubeconfig file.
	Kubeconfig *string `pulumi:"kubeconfig"`
	// If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
	//
	// A namespace can be specified in multiple places, and the precedence is as follows:
	// 1. `.metadata.namespace` set on the resource.
	// 2. This `namespace` parameter.
	// 3. `namespace` set for the active context in the kubeconfig.
	Namespace *string `pulumi:"namespace"`
	// BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
	// be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
	// to the Pulumi program. This feature is in developer preview, and is disabled by default.
	//
	// Note that some computed Outputs such as status fields will not be populated
	// since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
	// and may result in an error if they are referenced by other resources. Also note that any secret values
	// used in these resources will be rendered in plaintext to the resulting YAML.
	RenderYamlToDirectory *string `pulumi:"renderYamlToDirectory"`
	// If present and set to true, suppress apiVersion deprecation warnings from the CLI.
	SuppressDeprecationWarnings *bool `pulumi:"suppressDeprecationWarnings"`
	// If present and set to true, suppress unsupported Helm hook warnings from the CLI.
	SuppressHelmHookWarnings *bool `pulumi:"suppressHelmHookWarnings"`
	// While Helm Release provider is in beta, by default 'pulumi up' will log a warning if the resource is used. If present and set to "true", this warning is omitted.
	SuppressHelmReleaseBetaWarning *bool `pulumi:"suppressHelmReleaseBetaWarning"`
}

// The set of arguments for constructing a Provider resource.
// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
type ProviderArgs struct {
	// If present, the name of the kubeconfig cluster to use.
	Cluster pulumi.StringPtrInput
	// If present, the name of the kubeconfig context to use.
	Context pulumi.StringPtrInput
	// BETA FEATURE - If present and set to true, enable server-side diff calculations.
	// This feature is in developer preview, and is disabled by default.
	EnableDryRun pulumi.BoolPtrInput
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The backend storage driver for Helm. Values are: configmap, secret, memory, sql.
	HelmDriver pulumi.StringPtrInput
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The path to the helm plugins directory.
	HelmPluginsPath pulumi.StringPtrInput
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The path to the registry config file.
	HelmRegistryConfigPath pulumi.StringPtrInput
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The path to the file containing cached repository indexes.
	HelmRepositoryCache pulumi.StringPtrInput
	// BETA FEATURE - Used for supporting Helm Release resource (Beta). The path to the file containing repository names and URLs.
	HelmRepositoryConfigPath pulumi.StringPtrInput
	// The contents of a kubeconfig file or the path to a kubeconfig file.
	Kubeconfig pulumi.StringPtrInput
	// If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
	//
	// A namespace can be specified in multiple places, and the precedence is as follows:
	// 1. `.metadata.namespace` set on the resource.
	// 2. This `namespace` parameter.
	// 3. `namespace` set for the active context in the kubeconfig.
	Namespace pulumi.StringPtrInput
	// BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
	// be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
	// to the Pulumi program. This feature is in developer preview, and is disabled by default.
	//
	// Note that some computed Outputs such as status fields will not be populated
	// since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
	// and may result in an error if they are referenced by other resources. Also note that any secret values
	// used in these resources will be rendered in plaintext to the resulting YAML.
	RenderYamlToDirectory pulumi.StringPtrInput
	// If present and set to true, suppress apiVersion deprecation warnings from the CLI.
	SuppressDeprecationWarnings pulumi.BoolPtrInput
	// If present and set to true, suppress unsupported Helm hook warnings from the CLI.
	SuppressHelmHookWarnings pulumi.BoolPtrInput
	// While Helm Release provider is in beta, by default 'pulumi up' will log a warning if the resource is used. If present and set to "true", this warning is omitted.
	SuppressHelmReleaseBetaWarning pulumi.BoolPtrInput
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (i *Provider) ToProviderPtrOutput() ProviderPtrOutput {
	return i.ToProviderPtrOutputWithContext(context.Background())
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (i *Provider) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderPtrOutput)
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
type ProviderPtrInput interface {
	pulumi.Input

	ToProviderPtrOutput() ProviderPtrOutput
	ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
type providerPtrType ProviderArgs

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (*providerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil))
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (i *providerPtrType) ToProviderPtrOutput() ProviderPtrOutput {
	return i.ToProviderPtrOutputWithContext(context.Background())
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (i *providerPtrType) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderPtrOutput)
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
type ProviderOutput struct{ *pulumi.OutputState }

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (o ProviderOutput) ToProviderPtrOutput() ProviderPtrOutput {
	return o.ToProviderPtrOutputWithContext(context.Background())
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (o ProviderOutput) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Provider) *Provider {
		return &v
	}).(ProviderPtrOutput)
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
type ProviderPtrOutput struct{ *pulumi.OutputState }

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (ProviderPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil))
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (o ProviderPtrOutput) ToProviderPtrOutput() ProviderPtrOutput {
	return o
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (o ProviderPtrOutput) ToProviderPtrOutputWithContext(ctx context.Context) ProviderPtrOutput {
	return o
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func (o ProviderPtrOutput) Elem() ProviderOutput {
	return o.ApplyT(func(v *Provider) Provider {
		if v != nil {
			return *v
		}
		var ret Provider
		return ret
	}).(ProviderOutput)
}

// Deprecated: Use `github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes` instead
func init() {
	pulumi.RegisterOutputType(ProviderOutput{})
	pulumi.RegisterOutputType(ProviderPtrOutput{})
}
