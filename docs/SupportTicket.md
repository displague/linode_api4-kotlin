
# SupportTicket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | The ID of the Support Ticket.  |  [optional]
**attachments** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | A list of filenames representing attached files associated with this Ticket.  |  [optional]
**closed** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date and time this Ticket was closed.  |  [optional]
**description** | [**kotlin.String**](.md) | The full details of the issue or question.  |  [optional]
**entity** | [**SupportTicketEntity**](SupportTicketEntity.md) |  |  [optional]
**gravatarId** | [**kotlin.String**](.md) | The Gravatar ID of the User who opened this Ticket.  |  [optional]
**opened** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date and time this Ticket was created.  |  [optional]
**openedBy** | [**kotlin.String**](.md) | The User who opened this Ticket.  |  [optional]
**status** | [**inline**](#StatusEnum) | The current status of this Ticket. |  [optional]
**summary** | [**kotlin.String**](.md) | The summary or title for this Ticket.  |  [optional]
**updated** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date and time this Ticket was last updated.  |  [optional]
**updatedBy** | [**kotlin.String**](.md) | The User who last updated this Ticket.  |  [optional]



<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | closed, new, open



