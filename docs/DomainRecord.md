
# DomainRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This Record&#x27;s unique ID. |  [optional]
**type** | [**inline**](#TypeEnum) | The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address.  |  [optional]
**name** | [**kotlin.String**](.md) | The name of this Record. This field&#x27;s actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.  |  [optional]
**target** | [**kotlin.String**](.md) | The target for this Record. This field&#x27;s actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.  |  [optional]
**priority** | [**kotlin.Int**](.md) | The priority of the target host. Lower values are preferred.  |  [optional]
**weight** | [**kotlin.Int**](.md) | The relative weight of this Record. Higher values are preferred.  |  [optional]
**port** | [**kotlin.Int**](.md) | The port this Record points to.  |  [optional]
**service** | [**kotlin.String**](.md) | The service this Record identified. Only valid for SRV records.  |  [optional]
**protocol** | [**kotlin.String**](.md) | The protocol this Record&#x27;s service communicates with. Only valid for SRV records.  |  [optional]
**ttlSec** | [**kotlin.Int**](.md) | \&quot;Time to Live\&quot; - the amount of time in seconds that this Domain&#x27;s records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.  |  [optional]
**tag** | [**kotlin.String**](.md) | The tag portion of a CAA record. It is invalid to set this on other record types.  |  [optional]



<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | A, AAAA, NS, MX, CNAME, TXT, SRV, PTR, CAA



