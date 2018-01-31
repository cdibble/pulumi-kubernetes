// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

package main

import (
	kubernetes "github.com/pulumi/pulumi-kubernetes"
	"github.com/pulumi/pulumi-kubernetes/pkg/version"
	"github.com/pulumi/pulumi-terraform/pkg/tfgen"
)

func main() {
	tfgen.Main("kubernetes", version.Version, kubernetes.Provider())
}
