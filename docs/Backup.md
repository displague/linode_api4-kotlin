
# Backup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | The unique ID of this Backup. |  [optional]
**type** | [**inline**](#TypeEnum) | This indicates whether the Backup is an automatic Backup or manual snapshot taken by the User at a specific point in time.  |  [optional]
**status** | [**inline**](#StatusEnum) | The current state of a specific Backup. |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date the Backup was taken. |  [optional]
**updated** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date the Backup was most recently updated. |  [optional]
**finished** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date the Backup completed. |  [optional]
**label** | [**kotlin.String**](.md) | A label for Backups that are of type &#x60;snapshot&#x60;. |  [optional]
**configs** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | A list of the labels of the Configuration profiles that are part of the Backup.  |  [optional]
**disks** | [**kotlin.Array&lt;BackupDisks&gt;**](BackupDisks.md) | A list of the disks that are part of the Backup.  |  [optional]



<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | auto, snapshot


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | paused, pending, running, needsPostProcessing, successful, failed, userAborted



