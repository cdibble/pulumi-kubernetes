// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// DaemonSet represents the configuration of a daemon set.
type DaemonSet struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// The desired behavior of this daemon set. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec DaemonSetSpecPtrOutput `pulumi:"spec"`
	// The current status of this daemon set. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Status DaemonSetStatusPtrOutput `pulumi:"status"`
}

// NewDaemonSet registers a new resource with the given unique name, arguments, and options.
func NewDaemonSet(ctx *pulumi.Context,
	name string, args *DaemonSetArgs, opts ...pulumi.ResourceOption) (*DaemonSet, error) {
	if args == nil {
		args = &DaemonSetArgs{}
	}

	args.ApiVersion = pulumi.StringPtr("apps/v1")
	args.Kind = pulumi.StringPtr("DaemonSet")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:apps/v1beta2:DaemonSet"),
		},
		{
			Type: pulumi.String("kubernetes:extensions/v1beta1:DaemonSet"),
		},
	})
	opts = append(opts, aliases)
	var resource DaemonSet
	err := ctx.RegisterResource("kubernetes:apps/v1:DaemonSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDaemonSet gets an existing DaemonSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDaemonSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DaemonSetState, opts ...pulumi.ResourceOption) (*DaemonSet, error) {
	var resource DaemonSet
	err := ctx.ReadResource("kubernetes:apps/v1:DaemonSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DaemonSet resources.
type daemonSetState struct {
}

type DaemonSetState struct {
}

func (DaemonSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*daemonSetState)(nil)).Elem()
}

type daemonSetArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// The desired behavior of this daemon set. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec *DaemonSetSpec `pulumi:"spec"`
}

// The set of arguments for constructing a DaemonSet resource.
type DaemonSetArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput
	// The desired behavior of this daemon set. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec DaemonSetSpecPtrInput
}

func (DaemonSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*daemonSetArgs)(nil)).Elem()
}

type DaemonSetInput interface {
	pulumi.Input

	ToDaemonSetOutput() DaemonSetOutput
	ToDaemonSetOutputWithContext(ctx context.Context) DaemonSetOutput
}

func (*DaemonSet) ElementType() reflect.Type {
	return reflect.TypeOf((*DaemonSet)(nil))
}

func (i *DaemonSet) ToDaemonSetOutput() DaemonSetOutput {
	return i.ToDaemonSetOutputWithContext(context.Background())
}

func (i *DaemonSet) ToDaemonSetOutputWithContext(ctx context.Context) DaemonSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DaemonSetOutput)
}

func (i *DaemonSet) ToDaemonSetPtrOutput() DaemonSetPtrOutput {
	return i.ToDaemonSetPtrOutputWithContext(context.Background())
}

func (i *DaemonSet) ToDaemonSetPtrOutputWithContext(ctx context.Context) DaemonSetPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DaemonSetPtrOutput)
}

type DaemonSetPtrInput interface {
	pulumi.Input

	ToDaemonSetPtrOutput() DaemonSetPtrOutput
	ToDaemonSetPtrOutputWithContext(ctx context.Context) DaemonSetPtrOutput
}

type daemonSetPtrType DaemonSetArgs

func (*daemonSetPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DaemonSet)(nil))
}

func (i *daemonSetPtrType) ToDaemonSetPtrOutput() DaemonSetPtrOutput {
	return i.ToDaemonSetPtrOutputWithContext(context.Background())
}

func (i *daemonSetPtrType) ToDaemonSetPtrOutputWithContext(ctx context.Context) DaemonSetPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DaemonSetPtrOutput)
}

// DaemonSetArrayInput is an input type that accepts DaemonSetArray and DaemonSetArrayOutput values.
// You can construct a concrete instance of `DaemonSetArrayInput` via:
//
//          DaemonSetArray{ DaemonSetArgs{...} }
type DaemonSetArrayInput interface {
	pulumi.Input

	ToDaemonSetArrayOutput() DaemonSetArrayOutput
	ToDaemonSetArrayOutputWithContext(context.Context) DaemonSetArrayOutput
}

type DaemonSetArray []DaemonSetInput

func (DaemonSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DaemonSet)(nil)).Elem()
}

func (i DaemonSetArray) ToDaemonSetArrayOutput() DaemonSetArrayOutput {
	return i.ToDaemonSetArrayOutputWithContext(context.Background())
}

func (i DaemonSetArray) ToDaemonSetArrayOutputWithContext(ctx context.Context) DaemonSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DaemonSetArrayOutput)
}

// DaemonSetMapInput is an input type that accepts DaemonSetMap and DaemonSetMapOutput values.
// You can construct a concrete instance of `DaemonSetMapInput` via:
//
//          DaemonSetMap{ "key": DaemonSetArgs{...} }
type DaemonSetMapInput interface {
	pulumi.Input

	ToDaemonSetMapOutput() DaemonSetMapOutput
	ToDaemonSetMapOutputWithContext(context.Context) DaemonSetMapOutput
}

type DaemonSetMap map[string]DaemonSetInput

func (DaemonSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DaemonSet)(nil)).Elem()
}

func (i DaemonSetMap) ToDaemonSetMapOutput() DaemonSetMapOutput {
	return i.ToDaemonSetMapOutputWithContext(context.Background())
}

func (i DaemonSetMap) ToDaemonSetMapOutputWithContext(ctx context.Context) DaemonSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DaemonSetMapOutput)
}

type DaemonSetOutput struct{ *pulumi.OutputState }

func (DaemonSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DaemonSet)(nil))
}

func (o DaemonSetOutput) ToDaemonSetOutput() DaemonSetOutput {
	return o
}

func (o DaemonSetOutput) ToDaemonSetOutputWithContext(ctx context.Context) DaemonSetOutput {
	return o
}

func (o DaemonSetOutput) ToDaemonSetPtrOutput() DaemonSetPtrOutput {
	return o.ToDaemonSetPtrOutputWithContext(context.Background())
}

func (o DaemonSetOutput) ToDaemonSetPtrOutputWithContext(ctx context.Context) DaemonSetPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v DaemonSet) *DaemonSet {
		return &v
	}).(DaemonSetPtrOutput)
}

type DaemonSetPtrOutput struct{ *pulumi.OutputState }

func (DaemonSetPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DaemonSet)(nil))
}

func (o DaemonSetPtrOutput) ToDaemonSetPtrOutput() DaemonSetPtrOutput {
	return o
}

func (o DaemonSetPtrOutput) ToDaemonSetPtrOutputWithContext(ctx context.Context) DaemonSetPtrOutput {
	return o
}

func (o DaemonSetPtrOutput) Elem() DaemonSetOutput {
	return o.ApplyT(func(v *DaemonSet) DaemonSet {
		if v != nil {
			return *v
		}
		var ret DaemonSet
		return ret
	}).(DaemonSetOutput)
}

type DaemonSetArrayOutput struct{ *pulumi.OutputState }

func (DaemonSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DaemonSet)(nil))
}

func (o DaemonSetArrayOutput) ToDaemonSetArrayOutput() DaemonSetArrayOutput {
	return o
}

func (o DaemonSetArrayOutput) ToDaemonSetArrayOutputWithContext(ctx context.Context) DaemonSetArrayOutput {
	return o
}

func (o DaemonSetArrayOutput) Index(i pulumi.IntInput) DaemonSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DaemonSet {
		return vs[0].([]DaemonSet)[vs[1].(int)]
	}).(DaemonSetOutput)
}

type DaemonSetMapOutput struct{ *pulumi.OutputState }

func (DaemonSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]DaemonSet)(nil))
}

func (o DaemonSetMapOutput) ToDaemonSetMapOutput() DaemonSetMapOutput {
	return o
}

func (o DaemonSetMapOutput) ToDaemonSetMapOutputWithContext(ctx context.Context) DaemonSetMapOutput {
	return o
}

func (o DaemonSetMapOutput) MapIndex(k pulumi.StringInput) DaemonSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) DaemonSet {
		return vs[0].(map[string]DaemonSet)[vs[1].(string)]
	}).(DaemonSetOutput)
}

func init() {
	pulumi.RegisterOutputType(DaemonSetOutput{})
	pulumi.RegisterOutputType(DaemonSetPtrOutput{})
	pulumi.RegisterOutputType(DaemonSetArrayOutput{})
	pulumi.RegisterOutputType(DaemonSetMapOutput{})
}
