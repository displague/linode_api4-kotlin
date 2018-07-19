
# Domain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This Domain&#x27;s unique ID | 
**type** | [**inline**](#TypeEnum) | If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).  | 
**domain** | [**kotlin.String**](.md) | The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.  | 
**group** | [**kotlin.String**](.md) | The group this Domain belongs to.  This is for display purposes only.  |  [optional]
**status** | [**inline**](#StatusEnum) | Used to control whether this Domain is currently being rendered.  |  [optional]
**description** | [**kotlin.String**](.md) | A description for this Domain. This is for display purposes only.  |  [optional]
**soaEmail** | [**kotlin.String**](.md) | Start of Authority email address. This is required for master Domains.  |  [optional]
**retrySec** | [**kotlin.Int**](.md) | The interval, in seconds, at which a failed refresh should be retried. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.  |  [optional]
**masterIps** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | The IP addresses representing the master DNS for this Domain.  |  [optional]
**axfrIps** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.  |  [optional]
**expireSec** | [**kotlin.Int**](.md) | The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.  |  [optional]
**refreshSec** | [**kotlin.Int**](.md) | The amount of time in seconds before this Domain should be refreshed. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.  |  [optional]
**ttlSec** | [**kotlin.Int**](.md) | \&quot;Time to Live\&quot; - the amount of time in seconds that this Domain&#x27;s records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.  |  [optional]



<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | master, slave


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | disabled, active, edit_mode, has_errors



