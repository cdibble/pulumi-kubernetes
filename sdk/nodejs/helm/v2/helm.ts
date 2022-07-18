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

// *** WARNING: this file was generated by the pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { execSync } from "child_process";
import * as fs from "fs";
import * as nodepath from "path";
import * as shell from "shell-quote";
import * as tmp from "tmp";
import * as path from "../../path";
import { getVersion } from "../../utilities";
import * as yaml from "../../yaml/index";

/**
 * Chart is a component representing a collection of resources described by an arbitrary Helm
 * Chart. The Chart can be fetched from any source that is accessible to the `helm` command
 * line. Values in the `values.yml` file can be overridden using `ChartOpts.values` (equivalent
 * to `--set` or having multiple `values.yml` files). Objects can be transformed arbitrarily by
 * supplying callbacks to `ChartOpts.transformations`.
 *
 * `Chart` does not use Tiller. The Chart specified is copied and expanded locally; the semantics
 * are equivalent to running `helm template` and then using Pulumi to manage the resulting YAML
 * manifests. Any values that would be retrieved in-cluster are assigned fake values, and
 * none of Tiller's server-side validity testing is executed.
 *
 * ## Example Usage
 * ### Local Chart Directory
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v2.Chart("nginx-ingress", {
 *   path: "./nginx-ingress",
 * });
 * ```
 * ### Remote Chart
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v2.Chart("nginx-ingress", {
 *   chart: "nginx-ingress",
 *   version: "1.24.4",
 *   fetchOpts:{
 *     repo: "https://charts.helm.sh/stable",
 *   },
 * });
 * ```
 * ### Set Chart values
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v2.Chart("nginx-ingress", {
 *   chart: "nginx-ingress",
 *   version: "1.24.4",
 *   fetchOpts:{
 *     repo: "https://charts.helm.sh/stable",
 *   },
 *   values: {
 *     controller: {
 *       metrics: {
 *         enabled: true,
 *       }
 *     }
 *   },
 * });
 * ```
 * ### Deploy Chart into Namespace
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v2.Chart("nginx-ingress", {
 *   chart: "nginx-ingress",
 *   version: "1.24.4",
 *   namespace: "test-namespace",
 *   fetchOpts:{
 *     repo: "https://charts.helm.sh/stable",
 *   },
 * });
 * ```
 * ### Chart with Transformations
 *
 * ```typescript
 * import * as k8s from "@pulumi/kubernetes";
 *
 * const nginxIngress = new k8s.helm.v2.Chart("nginx-ingress", {
 *   chart: "nginx-ingress",
 *   version: "1.24.4",
 *   fetchOpts:{
 *     repo: "https://charts.helm.sh/stable",
 *   },
 *   transformations: [
 *     // Make every service private to the cluster, i.e., turn all services into ClusterIP instead of LoadBalancer.
 *     (obj: any, opts: pulumi.CustomResourceOptions) => {
 *       if (obj.kind === "Service" && obj.apiVersion === "v1") {
 *         if (obj.spec && obj.spec.type && obj.spec.type === "LoadBalancer") {
 *           obj.spec.type = "ClusterIP";
 *         }
 *       }
 *     },
 *
 *     // Set a resource alias for a previous name.
 *     (obj: any, opts: pulumi.CustomResourceOptions) => {
 *     if (obj.kind === "Deployment") {
 *       opts.aliases = [{ name: "oldName" }]
 *     },
 *
 *     // Omit a resource from the Chart by transforming the specified resource definition to an empty List.
 *     (obj: any, opts: pulumi.CustomResourceOptions) => {
 *     if (obj.kind === "Pod" && obj.metadata.name === "test") {
 *       obj.apiVersion = "v1"
 *       obj.kind = "List"
 *     },
 *   ],
 * });
 * ```
 *
 * @deprecated helm/v2/Chart is deprecated by helm/v3/Chart and will be removed in a future release.
 */
export class Chart extends yaml.CollectionComponentResource {
    /** @internal */
    public static readonly __pulumiType = 'kubernetes:helm.sh/v2:Chart';

    /**
     * Create an instance of the specified Helm chart.
     * @param releaseName Name of the Chart (e.g., nginx-ingress).
     * @param config Configuration options for the Chart.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(
        releaseName: string,
        config: ChartOpts | LocalChartOpts,
        opts?: pulumi.ComponentResourceOptions
    ) {
        if (config.resourcePrefix !== undefined) {
            releaseName = `${config.resourcePrefix}-${releaseName}`
        }
        super("kubernetes:helm.sh/v2:Chart", releaseName, config, opts);

        const allConfig = pulumi.output(config);
        const configDeps = Array.from(<Set<pulumi.Resource>>(<any>allConfig).resources());

        (<any>allConfig).isKnown.then((isKnown: boolean) => {
            if (!isKnown) {
                // Note that this can only happen during a preview.
                pulumi.log.info("[Can't preview] all chart values must be known ahead of time to generate an accurate preview.", this);
            }
        });

        this.resources = allConfig.apply(cfg => {
            // Create temporary directories and files to hold chart data and override values.
            const overrides = tmp.fileSync({ postfix: ".yaml" });
            const chartDir = tmp.dirSync({ unsafeCleanup: true });

            try {
                let chart: string;
                let defaultValues: string;
                let cmd: string;
                if (isChartOpts(cfg)) {
                    // Fetch chart.
                    if (cfg.repo && cfg.repo.includes("http")) {
                        pulumi.log.error(
                            "`repo` specifies the name of the Helm chart repo. Use `fetchOpts.repo` to specify a URL.", this);
                    }
                    const chartToFetch = cfg.repo ? `${cfg.repo}/${cfg.chart}` : cfg.chart;
                    const fetchOpts = Object.assign({}, cfg.fetchOpts, {
                        destination: chartDir.name,
                        version: cfg.version
                    });
                    fetch(chartToFetch, fetchOpts);
                    const fetchedChartName = fs.readdirSync(chartDir.name).sort()[0];
                    chart = path.quotePath(nodepath.join(chartDir.name, fetchedChartName));
                    defaultValues = path.quotePath(
                        nodepath.join(chartDir.name, fetchedChartName, "values.yaml")
                    );
                } else {
                    chart = cfg.path;
                    defaultValues = path.quotePath(nodepath.join(chart, "values.yaml"));
                }

                // Write overrides file.
                const data = JSON.stringify(cfg.values || {}, undefined, "  ");
                fs.writeFileSync(overrides.name, data);

                // Does not require Tiller. From the `helm template` documentation:
                //
                // >  Render chart templates locally and display the output.
                // >
                // > This does not require Tiller. However, any values that would normally be
                // > looked up or retrieved in-cluster will be faked locally. Additionally, none
                // > of the server-side testing of chart validity (e.g. whether an API is supported)
                // > is done.
                const release = shell.quote([releaseName]);
                const values = path.quotePath(overrides.name);
                const apiVersionsArgs = cfg.apiVersions
                    ? cfg.apiVersions
                        .map(v => `--api-versions=${v}`)
                        .join(" ")
                    : "";
                const namespaceArg = cfg.namespace
                    ? `--namespace ${shell.quote([cfg.namespace])}`
                    : "";

                // Check the helm version - v2 or v3
                let helmVerCmd = `helm version --short || true`;
                var helmVer;
                try {
                    helmVer = execSync(
                        helmVerCmd,
                        {
                            stdio: ['pipe', 'pipe', 'ignore'], // Suppress tiller version error
                        },
                    ).toString();
                } catch (e: any) {
                    helmVer = e.stdout.toString();
                }

                cmd = `helm template ${chart} --name-template ${release} --values ${defaultValues} --values ${values} ${apiVersionsArgs} ${namespaceArg}`;
                // Helm v2 returns version like this:
                // Client: v2.16.7+g5f2584f
                // Helm v3 returns a version like this:
                // v3.1.2+gd878d4d
                // --include-crds is available in helm v3.1+ so check for a regex matching that version
                if (RegExp('^v3\.[1-9]').test(helmVer)) {
                    cmd += ` --include-crds`
                }

                const yamlStream = execSync(
                    cmd,
                    {
                        env: {...process.env},
                        maxBuffer: 512 * 1024 * 1024 // 512 MB
                    },
                ).toString();
                return this.parseTemplate(
                    yamlStream, cfg.transformations, cfg.resourcePrefix, configDeps, cfg.namespace);
            } catch (e: any) {
                // Shed stack trace, only emit the error.
                throw new pulumi.RunError(e.toString());
            } finally {
                // Clean up temporary files and directories.
                chartDir.removeCallback();
                overrides.removeCallback();
            }

            // Without this block, the TS compiler adds `| undefined` even though execution won't get here.
            return pulumi.output<{[key: string]: pulumi.CustomResource}>({});
        });

        this.ready = this.resources.apply(m => Object.values(m));
    }

    parseTemplate(
        text: string,
        transformations: ((o: any, opts: pulumi.CustomResourceOptions) => void)[] | undefined,
        resourcePrefix: string | undefined,
        dependsOn: pulumi.Resource[],
        defaultNamespace: string | undefined,
    ): pulumi.Output<{ [key: string]: pulumi.CustomResource }> {
        // Rather than using the default provider for the following invoke call, use the version specified
        // in package.json.
        let invokeOpts: pulumi.InvokeOptions = { async: true, version: getVersion() };

        const promise = pulumi.runtime.invoke("kubernetes:yaml:decode", {text, defaultNamespace}, invokeOpts);
        return pulumi.output(promise).apply<{[key: string]: pulumi.CustomResource}>(p => yaml.parse(
            {
                resourcePrefix: resourcePrefix,
                objs: p.result,
                transformations: transformations || [],
            },
            { parent: this, dependsOn: dependsOn }
        ));
    }
}

interface BaseChartOpts {
    /**
     * The optional kubernetes api versions used for Capabilities.APIVersions.
     */
    apiVersions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The optional namespace to install chart resources into.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Overrides for chart values.
     */
    values?: pulumi.Inputs;
    /**
     * A set of transformations to apply to Kubernetes resource definitions before registering
     * with engine.
     */
    transformations?: ((o: any, opts: pulumi.CustomResourceOptions) => void)[];
    /**
     * An optional prefix for the auto-generated resource names.
     * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
     */
    resourcePrefix?: string
}

/**
 * The set of arguments for constructing a Chart resource from a remote source.
 */
export interface ChartOpts extends BaseChartOpts {
    /**
     * The repository name of the chart to deploy.
     * Example: "stable"
     */
    repo?: pulumi.Input<string>;

    /**
     * The name of the chart to deploy.  If [repo] is provided, this chart name will be prefixed by the repo name.
     * Example: repo: "stable", chart: "nginx-ingress" -> "stable/nginx-ingress"
     * Example: chart: "stable/nginx-ingress" -> "stable/nginx-ingress"
     */
    chart: pulumi.Input<string>;

    /**
     * The version of the chart to deploy. If not provided, the latest version will be deployed.
     */
    version?: pulumi.Input<string>;

    /**
     * Additional options to customize the fetching of the Helm chart.
     */
    fetchOpts?: pulumi.Input<FetchOpts>;
}

function isChartOpts(o: any): o is ChartOpts {
    return "chart" in o;
}

/**
 * The set of arguments for constructing a Chart resource from a local source.
 */
export interface LocalChartOpts extends BaseChartOpts {
    /**
     * The path to the chart directory which contains the `Chart.yaml` file.
     */
    path: string;
}

function isLocalChartOpts(o: any): o is LocalChartOpts {
    return "path" in o;
}

/**
 * Additional options to customize the fetching of the Helm chart.
 */
export interface FetchOpts {
    /** Specific version of a chart. Without this, the latest version is fetched. */
    version?: pulumi.Input<string>;

    /** Verify certificates of HTTPS-enabled servers using this CA bundle. */
    caFile?: pulumi.Input<string>;

    /** Identify HTTPS client using this SSL certificate file. */
    certFile?: pulumi.Input<string>;

    /** Identify HTTPS client using this SSL key file. */
    keyFile?: pulumi.Input<string>;

    /**
     * Location to write the chart. If this and tardir are specified, tardir is appended to this
     * (default ".").
     */
    destination?: pulumi.Input<string>;

    /** Keyring containing public keys (default "/Users/alex/.gnupg/pubring.gpg"). */
    keyring?: pulumi.Input<string>;

    /** Chart repository password. */
    password?: pulumi.Input<string>;

    /** Chart repository url where to locate the requested chart. */
    repo?: pulumi.Input<string>;

    /**
     * If untar is specified, this flag specifies the name of the directory into which the chart is
     * expanded (default ".").
     */
    untardir?: pulumi.Input<string>;

    /** Chart repository username. */
    username?: pulumi.Input<string>;

    /** Location of your Helm config. Overrides $HELM_HOME (default "/Users/alex/.helm"). */
    home?: pulumi.Input<string>;

    /**
     * Use development versions, too. Equivalent to version '>0.0.0-0'. If --version is set, this is
     * ignored.
     */
    devel?: pulumi.Input<boolean>;

    /** Fetch the provenance file, but don't perform verification. */
    prov?: pulumi.Input<boolean>;

    /** If set to false, will leave the chart as a tarball after downloading. */
    untar?: pulumi.Input<boolean>;

    /** Verify the package against its signature. */
    verify?: pulumi.Input<boolean>;
}

interface ResolvedFetchOpts {
    version?: string;
    caFile?: string;
    certFile?: string;
    keyFile?: string;
    destination?: string;
    keyring?: string;
    password?: string;
    repo?: string;
    untardir?: string;
    username?: string;
    home?: string;
    devel?: boolean;
    prov?: boolean;
    untar?: boolean;
    verify?: boolean;
}

/**
 * Retrieve a package from a package repository, and download it locally.
 *
 * This is useful for fetching packages to inspect, modify, or repackage. It can also be used to
 * perform cryptographic verification of a chart without installing the chart.
 *
 * There are options for unpacking the chart after download. This will create a directory for the
 * chart and uncompress into that directory.
 *
 * If the `verify` option is specified, the requested chart MUST have a provenance file, and MUST
 * pass the verification process. Failure in any part of this will result in an error, and the chart
 * will not be saved locally.
 *
 * @ignore
 */
export function fetch(chart: string, opts?: ResolvedFetchOpts) {
    const flags: string[] = [];
    const env: { [key: string]: string | undefined } = {...process.env};
    if (opts !== undefined) {
        // Untar by default.
        if(opts.untar !== false) { flags.push(`--untar`); }

        // Helm v3 removed the `--home` flag, so we must use an env var instead.
        if (opts.home) { env['HELM_HOME'] = path.quotePath(opts.home) }

        // For arguments that are not paths to files, it is sufficient to use shell.quote to quote the arguments.
        // However, for arguments that are actual paths to files we use path.quotePath (note that path here is
        // not the node path builtin module). This ensures proper escaping of paths on Windows.
        if (opts.version !== undefined)     { flags.push(`--version ${shell.quote([opts.version])}`);    }
        if (opts.caFile !== undefined)      { flags.push(`--ca-file ${path.quotePath(opts.caFile)}`);          }
        if (opts.certFile !== undefined)    { flags.push(`--cert-file ${path.quotePath(opts.certFile)}`);      }
        if (opts.keyFile !== undefined)     { flags.push(`--key-file ${path.quotePath(opts.keyFile)}`);        }
        if (opts.destination !== undefined) { flags.push(`--destination ${path.quotePath(opts.destination)}`); }
        if (opts.keyring !== undefined)     { flags.push(`--keyring ${path.quotePath(opts.keyring)}`);         }
        if (opts.password !== undefined)    { flags.push(`--password ${shell.quote([opts.password])}`);  }
        if (opts.repo !== undefined)        { flags.push(`--repo ${path.quotePath(opts.repo)}`);               }
        if (opts.untardir !== undefined)    { flags.push(`--untardir ${path.quotePath(opts.untardir)}`);       }
        if (opts.username !== undefined)    { flags.push(`--username ${shell.quote([opts.username])}`);  }
        if (opts.devel === true)            { flags.push(`--devel`);                                           }
        if (opts.prov === true)             { flags.push(`--prov`);                                            }
        if (opts.verify === true)           { flags.push(`--verify`);                                          }
    }
    execSync(`helm fetch ${shell.quote([chart])} ${flags.join(" ")}`, { env });
}
