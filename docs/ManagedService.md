
# ManagedService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This Service&#x27;s unique ID.  |  [optional]
**status** | [**inline**](#StatusEnum) | The current status of this Service.  |  [optional]
**serviceType** | [**inline**](#ServiceTypeEnum) | How this Service is monitored.  |  [optional]
**label** | [**kotlin.String**](.md) | The label for this Service. This is for display purposes only.  |  [optional]
**address** | [**kotlin.String**](.md) | The URL at which this Service is monitored.  |  [optional]
**timeout** | [**kotlin.Int**](.md) | How long to wait, in seconds, for a response before considering the Service to be down.  |  [optional]
**body** | [**kotlin.String**](.md) | What to expect to find in the response body for the Service to be considered up.  |  [optional]
**consultationGroup** | [**kotlin.String**](.md) | The group of ManagedContacts who should be notified or consulted with when an Issue is detected.  |  [optional]
**notes** | [**kotlin.String**](.md) | Any information relevant to the Service that Linode special forces should know when attempting to resolve Issues.  |  [optional]
**region** | [**kotlin.String**](.md) | The Region in which this Service is located. This is required if address is a private IP, and may not be set otherwise.  |  [optional]
**credentials** | [**kotlin.Array&lt;kotlin.Int&gt;**](.md) | An array of ManagedCredential IDs that should be used when attempting to resolve issues with this Service.  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Managed Service was created. |  [optional]
**updated** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Managed Service was last updated. |  [optional]



<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | disabled, pending, ok, problem


<a name="ServiceTypeEnum"></a>
## Enum: service_type
Name | Value
---- | -----
serviceType | URL, TCP



