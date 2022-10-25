// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { CustomResourceDefinitionArgs } from "./customResourceDefinition";
export type CustomResourceDefinition = import("./customResourceDefinition").CustomResourceDefinition;
export const CustomResourceDefinition: typeof import("./customResourceDefinition").CustomResourceDefinition = null as any;
utilities.lazyLoad(exports, ["CustomResourceDefinition"], () => require("./customResourceDefinition"));

export { CustomResourceDefinitionListArgs } from "./customResourceDefinitionList";
export type CustomResourceDefinitionList = import("./customResourceDefinitionList").CustomResourceDefinitionList;
export const CustomResourceDefinitionList: typeof import("./customResourceDefinitionList").CustomResourceDefinitionList = null as any;
utilities.lazyLoad(exports, ["CustomResourceDefinitionList"], () => require("./customResourceDefinitionList"));

export { CustomResourceDefinitionPatchArgs } from "./customResourceDefinitionPatch";
export type CustomResourceDefinitionPatch = import("./customResourceDefinitionPatch").CustomResourceDefinitionPatch;
export const CustomResourceDefinitionPatch: typeof import("./customResourceDefinitionPatch").CustomResourceDefinitionPatch = null as any;
utilities.lazyLoad(exports, ["CustomResourceDefinitionPatch"], () => require("./customResourceDefinitionPatch"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:apiextensions.k8s.io/v1:CustomResourceDefinition":
                return new CustomResourceDefinition(name, <any>undefined, { urn })
            case "kubernetes:apiextensions.k8s.io/v1:CustomResourceDefinitionList":
                return new CustomResourceDefinitionList(name, <any>undefined, { urn })
            case "kubernetes:apiextensions.k8s.io/v1:CustomResourceDefinitionPatch":
                return new CustomResourceDefinitionPatch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "apiextensions.k8s.io/v1", _module)
