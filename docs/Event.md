
# Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | The unique ID of this Event. |  [optional]
**action** | [**inline**](#ActionEnum) | The action that caused this Event. New actions may be added in the future.  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Event was created. |  [optional]
**entity** | [**EventEntity**](EventEntity.md) |  |  [optional]
**percentComplete** | [**kotlin.Int**](.md) | A percentage estimating the amount of time remaining for an Event. Returns &#x60;null&#x60; for notification events.  |  [optional]
**rate** | [**kotlin.String**](.md) | The rate of completion of the Event. Only some Events will return rate; for example, migration and resize Events.  |  [optional]
**read** | [**kotlin.Boolean**](.md) | If this Event has been read. |  [optional]
**seen** | [**kotlin.Boolean**](.md) | If this Event has been seen. |  [optional]
**status** | [**inline**](#StatusEnum) | The current status of this Event. |  [optional]
**timeRemaining** | [**kotlin.Int**](.md) | The estimated time remaining until the completion of this Event. This value is only returned for in-progress events.  |  [optional]
**username** | [**kotlin.String**](.md) | The username of the User who caused the Event.  |  [optional]



<a name="ActionEnum"></a>
## Enum: action
Name | Value
---- | -----
action | backups_enable, backups_cancel, backups_restore, community_question_reply, credit_card_updated, disk_create, disk_delete, disk_duplicate, disk_imagize, disk_resize, dns_record_create, dns_record_delete, dns_zone_create, dns_zone_delete, image_delete, linode_addip, linode_boot, linode_clone, linode_create, linode_delete, linode_deleteip, linode_migrate, linode_mutate, linode_reboot, linode_rebuild, linode_resize, linode_shutdown, linode_snapshot, longviewclient_create, longviewclient_delete, managed_disabled, managed_enabled, managed_service_create, managed_service_delete, nodebalancer_create, nodebalancer_delete, nodebalancer_config_create, nodebalancer_config_delete, password_reset, payment_submitted, stackscript_create, stackscript_delete, stackscript_publicize, stackscript_revise, tfa_disabled, tfa_enabled, ticket_attachment_upload, ticket_create, ticket_update, volume_attach, volume_clone, volume_create, volume_delete, volume_detach, volume_resize


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | failed, finished, notification, scheduled, started



