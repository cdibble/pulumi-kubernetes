// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { RuntimeClassArgs } from "./runtimeClass";
export type RuntimeClass = import("./runtimeClass").RuntimeClass;
export const RuntimeClass: typeof import("./runtimeClass").RuntimeClass = null as any;
utilities.lazyLoad(exports, ["RuntimeClass"], () => require("./runtimeClass"));

export { RuntimeClassListArgs } from "./runtimeClassList";
export type RuntimeClassList = import("./runtimeClassList").RuntimeClassList;
export const RuntimeClassList: typeof import("./runtimeClassList").RuntimeClassList = null as any;
utilities.lazyLoad(exports, ["RuntimeClassList"], () => require("./runtimeClassList"));

export { RuntimeClassPatchArgs } from "./runtimeClassPatch";
export type RuntimeClassPatch = import("./runtimeClassPatch").RuntimeClassPatch;
export const RuntimeClassPatch: typeof import("./runtimeClassPatch").RuntimeClassPatch = null as any;
utilities.lazyLoad(exports, ["RuntimeClassPatch"], () => require("./runtimeClassPatch"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:node.k8s.io/v1beta1:RuntimeClass":
                return new RuntimeClass(name, <any>undefined, { urn })
            case "kubernetes:node.k8s.io/v1beta1:RuntimeClassList":
                return new RuntimeClassList(name, <any>undefined, { urn })
            case "kubernetes:node.k8s.io/v1beta1:RuntimeClassPatch":
                return new RuntimeClassPatch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "node.k8s.io/v1beta1", _module)
