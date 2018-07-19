
# LinodeConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | The ID of this Config. |  [optional]
**kernel** | [**kotlin.String**](.md) | A Kernel ID to boot a Linode with. Defaults to \&quot;linode/latest-64bit\&quot;. |  [optional]
**comments** | [**kotlin.String**](.md) | Optional field for arbitrary User comments on this Config. |  [optional]
**memoryLimit** | [**kotlin.Int**](.md) | Defaults to the total RAM of the Linode.  |  [optional]
**runLevel** | [**inline**](#RunLevelEnum) | Defines the state of your Linode after booting. Defaults to &#x60;default&#x60;.  |  [optional]
**virtMode** | [**inline**](#VirtModeEnum) | Controls the virtualization mode. Defaults to &#x60;paravirt&#x60;. * &#x60;paravirt&#x60; is suitable for most cases. Linodes running in paravirt mode   share some qualities with the host, ultimately making it run faster since   there is less transition between it and the host. * &#x60;full_virt&#x60; affords more customization, but is slower because 100% of the VM   is virtualized.  |  [optional]
**helpers** | [**LinodeConfigHelpers**](LinodeConfigHelpers.md) |  |  [optional]
**label** | [**kotlin.String**](.md) | The Config&#x27;s label is for display purposes only.  | 
**devices** | [**Devices**](Devices.md) |  | 
**rootDevice** | [**kotlin.String**](.md) | The root device to boot. The corresponding disk must be attached.  |  [optional]



<a name="RunLevelEnum"></a>
## Enum: run_level
Name | Value
---- | -----
runLevel | default, single, binbash


<a name="VirtModeEnum"></a>
## Enum: virt_mode
Name | Value
---- | -----
virtMode | paravirt, fullvirt



