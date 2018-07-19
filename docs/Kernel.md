
# Kernel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.String**](.md) | The unique ID of this Kernel. |  [optional]
**label** | [**kotlin.String**](.md) | The friendly name of this Kernel. |  [optional]
**version** | [**kotlin.String**](.md) | Linux Kernel version. |  [optional]
**kvm** | [**kotlin.Boolean**](.md) | If this Kernel is suitable for KVM Linodes. |  [optional]
**xen** | [**kotlin.Boolean**](.md) | If this Kernel is suitable for Xen Linodes. |  [optional]
**architecture** | [**inline**](#ArchitectureEnum) | The architecture of this Kernel. |  [optional]
**pvops** | [**kotlin.Boolean**](.md) | If this Kernel is suitable for paravirtualized operations. |  [optional]



<a name="ArchitectureEnum"></a>
## Enum: architecture
Name | Value
---- | -----
architecture | x86_64, i386



