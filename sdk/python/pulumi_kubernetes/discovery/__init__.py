# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from .. import _utilities
import typing

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_kubernetes.discovery.v1 as __v1
    v1 = __v1
    import pulumi_kubernetes.discovery.v1beta1 as __v1beta1
    v1beta1 = __v1beta1
else:
    v1 = _utilities.lazy_import('pulumi_kubernetes.discovery.v1')
    v1beta1 = _utilities.lazy_import('pulumi_kubernetes.discovery.v1beta1')

