// Copyright 2016-2020, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package gen

import pschema "github.com/pulumi/pulumi/pkg/v2/codegen/schema"

// typeOverlays augment the types defined by the kubernetes schema.
var typeOverlays = map[string]pschema.ComplexTypeSpec{
	"kubernetes:core/v1:ServiceSpec": {
		ObjectTypeSpec: pschema.ObjectTypeSpec{
			Properties: map[string]pschema.PropertySpec{
				"type": {
					TypeSpec: pschema.TypeSpec{
						OneOf: []pschema.TypeSpec{
							{Type: "string"},
							{Ref: "#/types/kubernetes:core/v1:ServiceSpecType"},
						},
					},
				},
			},
		},
	},
	"kubernetes:core/v1:ServiceSpecType": {
		ObjectTypeSpec: pschema.ObjectTypeSpec{
			Type: "string",
		},
		Enum: []*pschema.EnumValueSpec{
			{Value: "ExternalName"},
			{Value: "ClusterIP"},
			{Value: "NodePort"},
			{Value: "LoadBalancer"},
		},
	},
}

// resourceOverlays augment the resources defined by the kubernetes schema.
var resourceOverlays = map[string]pschema.ResourceSpec{}
