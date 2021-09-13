// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	metav1 "github.com/pulumi/pulumi-kubernetes/sdk/v3/go/kubernetes/meta/v1"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// RoleList is a collection of Roles. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 RoleList, and will no longer be served in v1.22.
type RoleList struct {
	pulumi.CustomResourceState

	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrOutput `pulumi:"apiVersion"`
	// Items is a list of Roles
	Items RoleTypeArrayOutput `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Standard object's metadata.
	Metadata metav1.ListMetaPtrOutput `pulumi:"metadata"`
}

// NewRoleList registers a new resource with the given unique name, arguments, and options.
func NewRoleList(ctx *pulumi.Context,
	name string, args *RoleListArgs, opts ...pulumi.ResourceOption) (*RoleList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Items == nil {
		return nil, errors.New("invalid value for required argument 'Items'")
	}
	args.ApiVersion = pulumi.StringPtr("rbac.authorization.k8s.io/v1alpha1")
	args.Kind = pulumi.StringPtr("RoleList")
	var resource RoleList
	err := ctx.RegisterResource("kubernetes:rbac.authorization.k8s.io/v1alpha1:RoleList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoleList gets an existing RoleList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoleList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleListState, opts ...pulumi.ResourceOption) (*RoleList, error) {
	var resource RoleList
	err := ctx.ReadResource("kubernetes:rbac.authorization.k8s.io/v1alpha1:RoleList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoleList resources.
type roleListState struct {
}

type RoleListState struct {
}

func (RoleListState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleListState)(nil)).Elem()
}

type roleListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion *string `pulumi:"apiVersion"`
	// Items is a list of Roles
	Items []RoleType `pulumi:"items"`
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind *string `pulumi:"kind"`
	// Standard object's metadata.
	Metadata *metav1.ListMeta `pulumi:"metadata"`
}

// The set of arguments for constructing a RoleList resource.
type RoleListArgs struct {
	// APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion pulumi.StringPtrInput
	// Items is a list of Roles
	Items RoleTypeArrayInput
	// Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind pulumi.StringPtrInput
	// Standard object's metadata.
	Metadata metav1.ListMetaPtrInput
}

func (RoleListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleListArgs)(nil)).Elem()
}

type RoleListInput interface {
	pulumi.Input

	ToRoleListOutput() RoleListOutput
	ToRoleListOutputWithContext(ctx context.Context) RoleListOutput
}

func (*RoleList) ElementType() reflect.Type {
	return reflect.TypeOf((*RoleList)(nil))
}

func (i *RoleList) ToRoleListOutput() RoleListOutput {
	return i.ToRoleListOutputWithContext(context.Background())
}

func (i *RoleList) ToRoleListOutputWithContext(ctx context.Context) RoleListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleListOutput)
}

func (i *RoleList) ToRoleListPtrOutput() RoleListPtrOutput {
	return i.ToRoleListPtrOutputWithContext(context.Background())
}

func (i *RoleList) ToRoleListPtrOutputWithContext(ctx context.Context) RoleListPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleListPtrOutput)
}

type RoleListPtrInput interface {
	pulumi.Input

	ToRoleListPtrOutput() RoleListPtrOutput
	ToRoleListPtrOutputWithContext(ctx context.Context) RoleListPtrOutput
}

type roleListPtrType RoleListArgs

func (*roleListPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleList)(nil))
}

func (i *roleListPtrType) ToRoleListPtrOutput() RoleListPtrOutput {
	return i.ToRoleListPtrOutputWithContext(context.Background())
}

func (i *roleListPtrType) ToRoleListPtrOutputWithContext(ctx context.Context) RoleListPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleListPtrOutput)
}

// RoleListArrayInput is an input type that accepts RoleListArray and RoleListArrayOutput values.
// You can construct a concrete instance of `RoleListArrayInput` via:
//
//          RoleListArray{ RoleListArgs{...} }
type RoleListArrayInput interface {
	pulumi.Input

	ToRoleListArrayOutput() RoleListArrayOutput
	ToRoleListArrayOutputWithContext(context.Context) RoleListArrayOutput
}

type RoleListArray []RoleListInput

func (RoleListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleList)(nil)).Elem()
}

func (i RoleListArray) ToRoleListArrayOutput() RoleListArrayOutput {
	return i.ToRoleListArrayOutputWithContext(context.Background())
}

func (i RoleListArray) ToRoleListArrayOutputWithContext(ctx context.Context) RoleListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleListArrayOutput)
}

// RoleListMapInput is an input type that accepts RoleListMap and RoleListMapOutput values.
// You can construct a concrete instance of `RoleListMapInput` via:
//
//          RoleListMap{ "key": RoleListArgs{...} }
type RoleListMapInput interface {
	pulumi.Input

	ToRoleListMapOutput() RoleListMapOutput
	ToRoleListMapOutputWithContext(context.Context) RoleListMapOutput
}

type RoleListMap map[string]RoleListInput

func (RoleListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleList)(nil)).Elem()
}

func (i RoleListMap) ToRoleListMapOutput() RoleListMapOutput {
	return i.ToRoleListMapOutputWithContext(context.Background())
}

func (i RoleListMap) ToRoleListMapOutputWithContext(ctx context.Context) RoleListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleListMapOutput)
}

type RoleListOutput struct{ *pulumi.OutputState }

func (RoleListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RoleList)(nil))
}

func (o RoleListOutput) ToRoleListOutput() RoleListOutput {
	return o
}

func (o RoleListOutput) ToRoleListOutputWithContext(ctx context.Context) RoleListOutput {
	return o
}

func (o RoleListOutput) ToRoleListPtrOutput() RoleListPtrOutput {
	return o.ToRoleListPtrOutputWithContext(context.Background())
}

func (o RoleListOutput) ToRoleListPtrOutputWithContext(ctx context.Context) RoleListPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v RoleList) *RoleList {
		return &v
	}).(RoleListPtrOutput)
}

type RoleListPtrOutput struct{ *pulumi.OutputState }

func (RoleListPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleList)(nil))
}

func (o RoleListPtrOutput) ToRoleListPtrOutput() RoleListPtrOutput {
	return o
}

func (o RoleListPtrOutput) ToRoleListPtrOutputWithContext(ctx context.Context) RoleListPtrOutput {
	return o
}

func (o RoleListPtrOutput) Elem() RoleListOutput {
	return o.ApplyT(func(v *RoleList) RoleList {
		if v != nil {
			return *v
		}
		var ret RoleList
		return ret
	}).(RoleListOutput)
}

type RoleListArrayOutput struct{ *pulumi.OutputState }

func (RoleListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]RoleList)(nil))
}

func (o RoleListArrayOutput) ToRoleListArrayOutput() RoleListArrayOutput {
	return o
}

func (o RoleListArrayOutput) ToRoleListArrayOutputWithContext(ctx context.Context) RoleListArrayOutput {
	return o
}

func (o RoleListArrayOutput) Index(i pulumi.IntInput) RoleListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) RoleList {
		return vs[0].([]RoleList)[vs[1].(int)]
	}).(RoleListOutput)
}

type RoleListMapOutput struct{ *pulumi.OutputState }

func (RoleListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]RoleList)(nil))
}

func (o RoleListMapOutput) ToRoleListMapOutput() RoleListMapOutput {
	return o
}

func (o RoleListMapOutput) ToRoleListMapOutputWithContext(ctx context.Context) RoleListMapOutput {
	return o
}

func (o RoleListMapOutput) MapIndex(k pulumi.StringInput) RoleListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) RoleList {
		return vs[0].(map[string]RoleList)[vs[1].(string)]
	}).(RoleListOutput)
}

func init() {
	pulumi.RegisterOutputType(RoleListOutput{})
	pulumi.RegisterOutputType(RoleListPtrOutput{})
	pulumi.RegisterOutputType(RoleListArrayOutput{})
	pulumi.RegisterOutputType(RoleListMapOutput{})
}
