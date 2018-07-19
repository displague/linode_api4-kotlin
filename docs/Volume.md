
# Volume

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | The unique ID of this Volume. |  [optional]
**label** | [**kotlin.String**](.md) | The Volume&#x27;s label is for display purposes only.  | 
**filesystemPath** | [**kotlin.String**](.md) | The full filesystem path for the Volume based on the Volume&#x27;s label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ + Volume label.  |  [optional]
**status** | [**inline**](#StatusEnum) | The current status of the volume.  Can be one of:    * &#x60;creating&#x60; - the Volume is being created and is not yet available     for use.   * &#x60;active&#x60; - the Volume is online and available for use.   * &#x60;resizing&#x60; - the Volume is in the process of upgrading     its current capacity.   * &#x60;contact_support&#x60; - there is a problem with your Volume. Please     [open a Support Ticket](/#operation/createTicket) to resolve the issue.  |  [optional]
**size** | [**kotlin.Int**](.md) | The Volume&#x27;s size, in GiB.  |  [optional]
**region** | [**RegionSlashpropertiesSlashid**](RegionSlashpropertiesSlashid.md) |  |  [optional]
**linodeId** | [**kotlin.Int**](.md) | If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here.  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Volume was created. |  [optional]
**updated** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Volume was last updated. |  [optional]



<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | creating, active, resizing, contact_support



