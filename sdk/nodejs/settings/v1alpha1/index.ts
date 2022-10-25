// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

// Export members:
export { PodPresetArgs } from "./podPreset";
export type PodPreset = import("./podPreset").PodPreset;
export const PodPreset: typeof import("./podPreset").PodPreset = null as any;
utilities.lazyLoad(exports, ["PodPreset"], () => require("./podPreset"));

export { PodPresetListArgs } from "./podPresetList";
export type PodPresetList = import("./podPresetList").PodPresetList;
export const PodPresetList: typeof import("./podPresetList").PodPresetList = null as any;
utilities.lazyLoad(exports, ["PodPresetList"], () => require("./podPresetList"));

export { PodPresetPatchArgs } from "./podPresetPatch";
export type PodPresetPatch = import("./podPresetPatch").PodPresetPatch;
export const PodPresetPatch: typeof import("./podPresetPatch").PodPresetPatch = null as any;
utilities.lazyLoad(exports, ["PodPresetPatch"], () => require("./podPresetPatch"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "kubernetes:settings.k8s.io/v1alpha1:PodPreset":
                return new PodPreset(name, <any>undefined, { urn })
            case "kubernetes:settings.k8s.io/v1alpha1:PodPresetList":
                return new PodPresetList(name, <any>undefined, { urn })
            case "kubernetes:settings.k8s.io/v1alpha1:PodPresetPatch":
                return new PodPresetPatch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("kubernetes", "settings.k8s.io/v1alpha1", _module)
