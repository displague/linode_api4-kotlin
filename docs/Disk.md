
# Disk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This Disk&#x27;s ID which must be provided for all operations impacting this Disk.  |  [optional]
**label** | [**kotlin.String**](.md) | The Disk&#x27;s label is for display purposes only.  |  [optional]
**status** | [**inline**](#StatusEnum) | A brief description of this Disk&#x27;s current state. This field may change without direct action from you, as a result of operations performed to the Disk or the Linode containing the Disk.  |  [optional]
**size** | [**kotlin.Int**](.md) | The size of the Disk in MB. |  [optional]
**filesystem** | [**inline**](#FilesystemEnum) | The Disk filesystem can be one of:    * raw - No filesystem, just a raw binary stream.   * swap - Linux swap area.   * ext3 - The ext3 journaling filesystem for Linux.   * ext4 - The ext4 journaling filesystem for Linux.   * initrd - initrd (uncompressed initrd, ext2, max 32 MB).  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Linode was created. |  [optional]
**updated** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Linode was last updated. |  [optional]



<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | ready, not ready, deleting


<a name="FilesystemEnum"></a>
## Enum: filesystem
Name | Value
---- | -----
filesystem | raw, swap, ext3, ext4, initrd



