
# Notification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**NotificationEntity**](NotificationEntity.md) |  |  [optional]
**label** | [**kotlin.String**](.md) | A short description of this Notification.  |  [optional]
**message** | [**kotlin.String**](.md) | A human-readable description of the Notification. |  [optional]
**type** | [**inline**](#TypeEnum) | The type of Notification this is. |  [optional]
**severity** | [**inline**](#SeverityEnum) | The severity of this Notification.  This field can be used to decide how prominently to display the Notification, what color to make the display text, etc.  |  [optional]
**&#x60;when&#x60;** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | If this Notification is of an Event that will happen at a fixed, future time, this is when the named action will be taken. For example, if a Linode is to be migrated in response to a Security Advisory, this field will contain the approximate time the Linode will be taken offline for migration.  |  [optional]
**until** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | If this Notification has a duration, this will be the ending time for the Event/action. For example, if there is scheduled maintenance for one of our systems, &#x60;until&#x60; would be set to the end of the maintenance window.  |  [optional]



<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | migration_scheduled, migration_pending, reboot_scheduled, outage, payment_due, ticket_important, ticket_abuse, notice


<a name="SeverityEnum"></a>
## Enum: severity
Name | Value
---- | -----
severity | minor, major, critical



