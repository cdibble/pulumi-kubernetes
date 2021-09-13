// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
//
// VolumeAttachment objects are non-namespaced.
type VolumeAttachment struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrOutput `pulumi:"metadata"`
	// Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
	Spec VolumeAttachmentSpecOutput `pulumi:"spec"`
	// Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
	Status VolumeAttachmentStatusPtrOutput `pulumi:"status"`
}

// NewVolumeAttachment registers a new resource with the given unique name, arguments, and options.
func NewVolumeAttachment(ctx *pulumi.Context,
	name string, args *VolumeAttachmentArgs, opts ...pulumi.ResourceOption) (*VolumeAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Spec == nil {
		return nil, errors.New("invalid value for required argument 'Spec'")
	}
	args.ApiVersion = pulumi.StringPtr("storage.k8s.io/v1")
	args.Kind = pulumi.StringPtr("VolumeAttachment")
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("kubernetes:storage.k8s.io/v1alpha1:VolumeAttachment"),
		},
		{
			Type: pulumi.String("kubernetes:storage.k8s.io/v1beta1:VolumeAttachment"),
		},
	})
	opts = append(opts, aliases)
	var resource VolumeAttachment
	err := ctx.RegisterResource("kubernetes:storage.k8s.io/v1:VolumeAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVolumeAttachment gets an existing VolumeAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolumeAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VolumeAttachmentState, opts ...pulumi.ResourceOption) (*VolumeAttachment, error) {
	var resource VolumeAttachment
	err := ctx.ReadResource("kubernetes:storage.k8s.io/v1:VolumeAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VolumeAttachment resources.
type volumeAttachmentState struct {
}

type VolumeAttachmentState struct {
}

func (VolumeAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeAttachmentState)(nil)).Elem()
}

type volumeAttachmentArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata *metav1.ObjectMeta `pulumi:"metadata"`
	// Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
	Spec VolumeAttachmentSpec `pulumi:"spec"`
}

// The set of arguments for constructing a VolumeAttachment resource.
type VolumeAttachmentArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata metav1.ObjectMetaPtrInput
	// Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
	Spec VolumeAttachmentSpecInput
}

func (VolumeAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeAttachmentArgs)(nil)).Elem()
}

type VolumeAttachmentInput interface {
	pulumi.Input

	ToVolumeAttachmentOutput() VolumeAttachmentOutput
	ToVolumeAttachmentOutputWithContext(ctx context.Context) VolumeAttachmentOutput
}

func (*VolumeAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*VolumeAttachment)(nil))
}

func (i *VolumeAttachment) ToVolumeAttachmentOutput() VolumeAttachmentOutput {
	return i.ToVolumeAttachmentOutputWithContext(context.Background())
}

func (i *VolumeAttachment) ToVolumeAttachmentOutputWithContext(ctx context.Context) VolumeAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeAttachmentOutput)
}

func (i *VolumeAttachment) ToVolumeAttachmentPtrOutput() VolumeAttachmentPtrOutput {
	return i.ToVolumeAttachmentPtrOutputWithContext(context.Background())
}

func (i *VolumeAttachment) ToVolumeAttachmentPtrOutputWithContext(ctx context.Context) VolumeAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeAttachmentPtrOutput)
}

type VolumeAttachmentPtrInput interface {
	pulumi.Input

	ToVolumeAttachmentPtrOutput() VolumeAttachmentPtrOutput
	ToVolumeAttachmentPtrOutputWithContext(ctx context.Context) VolumeAttachmentPtrOutput
}

type volumeAttachmentPtrType VolumeAttachmentArgs

func (*volumeAttachmentPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**VolumeAttachment)(nil))
}

func (i *volumeAttachmentPtrType) ToVolumeAttachmentPtrOutput() VolumeAttachmentPtrOutput {
	return i.ToVolumeAttachmentPtrOutputWithContext(context.Background())
}

func (i *volumeAttachmentPtrType) ToVolumeAttachmentPtrOutputWithContext(ctx context.Context) VolumeAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeAttachmentPtrOutput)
}

// VolumeAttachmentArrayInput is an input type that accepts VolumeAttachmentArray and VolumeAttachmentArrayOutput values.
// You can construct a concrete instance of `VolumeAttachmentArrayInput` via:
//
//          VolumeAttachmentArray{ VolumeAttachmentArgs{...} }
type VolumeAttachmentArrayInput interface {
	pulumi.Input

	ToVolumeAttachmentArrayOutput() VolumeAttachmentArrayOutput
	ToVolumeAttachmentArrayOutputWithContext(context.Context) VolumeAttachmentArrayOutput
}

type VolumeAttachmentArray []VolumeAttachmentInput

func (VolumeAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VolumeAttachment)(nil)).Elem()
}

func (i VolumeAttachmentArray) ToVolumeAttachmentArrayOutput() VolumeAttachmentArrayOutput {
	return i.ToVolumeAttachmentArrayOutputWithContext(context.Background())
}

func (i VolumeAttachmentArray) ToVolumeAttachmentArrayOutputWithContext(ctx context.Context) VolumeAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeAttachmentArrayOutput)
}

// VolumeAttachmentMapInput is an input type that accepts VolumeAttachmentMap and VolumeAttachmentMapOutput values.
// You can construct a concrete instance of `VolumeAttachmentMapInput` via:
//
//          VolumeAttachmentMap{ "key": VolumeAttachmentArgs{...} }
type VolumeAttachmentMapInput interface {
	pulumi.Input

	ToVolumeAttachmentMapOutput() VolumeAttachmentMapOutput
	ToVolumeAttachmentMapOutputWithContext(context.Context) VolumeAttachmentMapOutput
}

type VolumeAttachmentMap map[string]VolumeAttachmentInput

func (VolumeAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VolumeAttachment)(nil)).Elem()
}

func (i VolumeAttachmentMap) ToVolumeAttachmentMapOutput() VolumeAttachmentMapOutput {
	return i.ToVolumeAttachmentMapOutputWithContext(context.Background())
}

func (i VolumeAttachmentMap) ToVolumeAttachmentMapOutputWithContext(ctx context.Context) VolumeAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeAttachmentMapOutput)
}

type VolumeAttachmentOutput struct{ *pulumi.OutputState }

func (VolumeAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VolumeAttachment)(nil))
}

func (o VolumeAttachmentOutput) ToVolumeAttachmentOutput() VolumeAttachmentOutput {
	return o
}

func (o VolumeAttachmentOutput) ToVolumeAttachmentOutputWithContext(ctx context.Context) VolumeAttachmentOutput {
	return o
}

func (o VolumeAttachmentOutput) ToVolumeAttachmentPtrOutput() VolumeAttachmentPtrOutput {
	return o.ToVolumeAttachmentPtrOutputWithContext(context.Background())
}

func (o VolumeAttachmentOutput) ToVolumeAttachmentPtrOutputWithContext(ctx context.Context) VolumeAttachmentPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v VolumeAttachment) *VolumeAttachment {
		return &v
	}).(VolumeAttachmentPtrOutput)
}

type VolumeAttachmentPtrOutput struct{ *pulumi.OutputState }

func (VolumeAttachmentPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VolumeAttachment)(nil))
}

func (o VolumeAttachmentPtrOutput) ToVolumeAttachmentPtrOutput() VolumeAttachmentPtrOutput {
	return o
}

func (o VolumeAttachmentPtrOutput) ToVolumeAttachmentPtrOutputWithContext(ctx context.Context) VolumeAttachmentPtrOutput {
	return o
}

func (o VolumeAttachmentPtrOutput) Elem() VolumeAttachmentOutput {
	return o.ApplyT(func(v *VolumeAttachment) VolumeAttachment {
		if v != nil {
			return *v
		}
		var ret VolumeAttachment
		return ret
	}).(VolumeAttachmentOutput)
}

type VolumeAttachmentArrayOutput struct{ *pulumi.OutputState }

func (VolumeAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VolumeAttachment)(nil))
}

func (o VolumeAttachmentArrayOutput) ToVolumeAttachmentArrayOutput() VolumeAttachmentArrayOutput {
	return o
}

func (o VolumeAttachmentArrayOutput) ToVolumeAttachmentArrayOutputWithContext(ctx context.Context) VolumeAttachmentArrayOutput {
	return o
}

func (o VolumeAttachmentArrayOutput) Index(i pulumi.IntInput) VolumeAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) VolumeAttachment {
		return vs[0].([]VolumeAttachment)[vs[1].(int)]
	}).(VolumeAttachmentOutput)
}

type VolumeAttachmentMapOutput struct{ *pulumi.OutputState }

func (VolumeAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]VolumeAttachment)(nil))
}

func (o VolumeAttachmentMapOutput) ToVolumeAttachmentMapOutput() VolumeAttachmentMapOutput {
	return o
}

func (o VolumeAttachmentMapOutput) ToVolumeAttachmentMapOutputWithContext(ctx context.Context) VolumeAttachmentMapOutput {
	return o
}

func (o VolumeAttachmentMapOutput) MapIndex(k pulumi.StringInput) VolumeAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) VolumeAttachment {
		return vs[0].(map[string]VolumeAttachment)[vs[1].(string)]
	}).(VolumeAttachmentOutput)
}

func init() {
	pulumi.RegisterOutputType(VolumeAttachmentOutput{})
	pulumi.RegisterOutputType(VolumeAttachmentPtrOutput{})
	pulumi.RegisterOutputType(VolumeAttachmentArrayOutput{})
	pulumi.RegisterOutputType(VolumeAttachmentMapOutput{})
}
