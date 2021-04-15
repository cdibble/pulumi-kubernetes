# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from ... import _utilities, _tables
from . import outputs
from ... import meta as _meta

__all__ = [
    'AuditSink',
    'AuditSinkSpec',
    'Policy',
    'ServiceReference',
    'Webhook',
    'WebhookClientConfig',
    'WebhookThrottleConfig',
]

@pulumi.output_type
class AuditSink(dict):
    """
    AuditSink represents a cluster level audit sink
    """
    def __init__(__self__, *,
                 api_version: Optional[str] = None,
                 kind: Optional[str] = None,
                 metadata: Optional['_meta.v1.outputs.ObjectMeta'] = None,
                 spec: Optional['outputs.AuditSinkSpec'] = None):
        """
        AuditSink represents a cluster level audit sink
        :param str api_version: APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        :param str kind: Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        :param 'AuditSinkSpecArgs' spec: Spec defines the audit configuration spec
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", 'auditregistration.k8s.io/v1alpha1')
        if kind is not None:
            pulumi.set(__self__, "kind", 'AuditSink')
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[str]:
        """
        APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter
    def kind(self) -> Optional[str]:
        """
        Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def metadata(self) -> Optional['_meta.v1.outputs.ObjectMeta']:
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def spec(self) -> Optional['outputs.AuditSinkSpec']:
        """
        Spec defines the audit configuration spec
        """
        return pulumi.get(self, "spec")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class AuditSinkSpec(dict):
    """
    AuditSinkSpec holds the spec for the audit sink
    """
    def __init__(__self__, *,
                 policy: 'outputs.Policy',
                 webhook: 'outputs.Webhook'):
        """
        AuditSinkSpec holds the spec for the audit sink
        :param 'PolicyArgs' policy: Policy defines the policy for selecting which events should be sent to the webhook required
        :param 'WebhookArgs' webhook: Webhook to send events required
        """
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "webhook", webhook)

    @property
    @pulumi.getter
    def policy(self) -> 'outputs.Policy':
        """
        Policy defines the policy for selecting which events should be sent to the webhook required
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter
    def webhook(self) -> 'outputs.Webhook':
        """
        Webhook to send events required
        """
        return pulumi.get(self, "webhook")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class Policy(dict):
    """
    Policy defines the configuration of how audit events are logged
    """
    def __init__(__self__, *,
                 level: str,
                 stages: Optional[Sequence[str]] = None):
        """
        Policy defines the configuration of how audit events are logged
        :param str level: The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
        :param Sequence[str] stages: Stages is a list of stages for which events are created.
        """
        pulumi.set(__self__, "level", level)
        if stages is not None:
            pulumi.set(__self__, "stages", stages)

    @property
    @pulumi.getter
    def level(self) -> str:
        """
        The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
        """
        return pulumi.get(self, "level")

    @property
    @pulumi.getter
    def stages(self) -> Optional[Sequence[str]]:
        """
        Stages is a list of stages for which events are created.
        """
        return pulumi.get(self, "stages")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ServiceReference(dict):
    """
    ServiceReference holds a reference to Service.legacy.k8s.io
    """
    def __init__(__self__, *,
                 name: str,
                 namespace: str,
                 path: Optional[str] = None,
                 port: Optional[int] = None):
        """
        ServiceReference holds a reference to Service.legacy.k8s.io
        :param str name: `name` is the name of the service. Required
        :param str namespace: `namespace` is the namespace of the service. Required
        :param str path: `path` is an optional URL path which will be sent in any request to this service.
        :param int port: If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "namespace", namespace)
        if path is not None:
            pulumi.set(__self__, "path", path)
        if port is not None:
            pulumi.set(__self__, "port", port)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        `name` is the name of the service. Required
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def namespace(self) -> str:
        """
        `namespace` is the namespace of the service. Required
        """
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter
    def path(self) -> Optional[str]:
        """
        `path` is an optional URL path which will be sent in any request to this service.
        """
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
        """
        return pulumi.get(self, "port")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class Webhook(dict):
    """
    Webhook holds the configuration of the webhook
    """
    def __init__(__self__, *,
                 client_config: 'outputs.WebhookClientConfig',
                 throttle: Optional['outputs.WebhookThrottleConfig'] = None):
        """
        Webhook holds the configuration of the webhook
        :param 'WebhookClientConfigArgs' client_config: ClientConfig holds the connection parameters for the webhook required
        :param 'WebhookThrottleConfigArgs' throttle: Throttle holds the options for throttling the webhook
        """
        pulumi.set(__self__, "client_config", client_config)
        if throttle is not None:
            pulumi.set(__self__, "throttle", throttle)

    @property
    @pulumi.getter(name="clientConfig")
    def client_config(self) -> 'outputs.WebhookClientConfig':
        """
        ClientConfig holds the connection parameters for the webhook required
        """
        return pulumi.get(self, "client_config")

    @property
    @pulumi.getter
    def throttle(self) -> Optional['outputs.WebhookThrottleConfig']:
        """
        Throttle holds the options for throttling the webhook
        """
        return pulumi.get(self, "throttle")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class WebhookClientConfig(dict):
    """
    WebhookClientConfig contains the information to make a connection with the webhook
    """
    def __init__(__self__, *,
                 ca_bundle: Optional[str] = None,
                 service: Optional['outputs.ServiceReference'] = None,
                 url: Optional[str] = None):
        """
        WebhookClientConfig contains the information to make a connection with the webhook
        :param str ca_bundle: `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
        :param 'ServiceReferenceArgs' service: `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
               
               If the webhook is running within the cluster, then you should use `service`.
        :param str url: `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
               
               The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
               
               Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
               
               The scheme must be "https"; the URL must begin with "https://".
               
               A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
               
               Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
        """
        if ca_bundle is not None:
            pulumi.set(__self__, "ca_bundle", ca_bundle)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="caBundle")
    def ca_bundle(self) -> Optional[str]:
        """
        `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
        """
        return pulumi.get(self, "ca_bundle")

    @property
    @pulumi.getter
    def service(self) -> Optional['outputs.ServiceReference']:
        """
        `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.

        If the webhook is running within the cluster, then you should use `service`.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def url(self) -> Optional[str]:
        """
        `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.

        The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.

        Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.

        The scheme must be "https"; the URL must begin with "https://".

        A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.

        Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
        """
        return pulumi.get(self, "url")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class WebhookThrottleConfig(dict):
    """
    WebhookThrottleConfig holds the configuration for throttling events
    """
    def __init__(__self__, *,
                 burst: Optional[int] = None,
                 qps: Optional[int] = None):
        """
        WebhookThrottleConfig holds the configuration for throttling events
        :param int burst: ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
        :param int qps: ThrottleQPS maximum number of batches per second default 10 QPS
        """
        if burst is not None:
            pulumi.set(__self__, "burst", burst)
        if qps is not None:
            pulumi.set(__self__, "qps", qps)

    @property
    @pulumi.getter
    def burst(self) -> Optional[int]:
        """
        ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
        """
        return pulumi.get(self, "burst")

    @property
    @pulumi.getter
    def qps(self) -> Optional[int]:
        """
        ThrottleQPS maximum number of batches per second default 10 QPS
        """
        return pulumi.get(self, "qps")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


