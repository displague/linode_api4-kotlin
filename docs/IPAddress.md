
# IPAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**kotlin.String**](.md) | The IP address.  |  [optional]
**gateway** | [**kotlin.String**](.md) | The default gateway for this address.  |  [optional]
**subnetMask** | [**kotlin.String**](.md) | The mask that separates host bits from network bits for this address.  |  [optional]
**prefix** | [**kotlin.Int**](.md) | The number of bits set in the subnet mask.  |  [optional]
**type** | [**inline**](#TypeEnum) | The type of address this is.  |  [optional]
**&#x60;public&#x60;** | [**kotlin.Boolean**](.md) | Whether this is a public or private IP address.  |  [optional]
**rdns** | [**kotlin.String**](.md) | The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.  |  [optional]
**linodeId** | [**kotlin.Int**](.md) | The ID of the Linode this address currently belongs to. For IPv4 addresses, this is by default the Linode that this address was assigned to on creation, and these addresses my be moved using the [/networking/ipv4/assign](/#operation/assignIPs) endpoint. For SLAAC and link-local addresses, this value may not be changed.  |  [optional]
**region** | [**kotlin.String**](.md) | The Region this IP address resides in.  |  [optional]



<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | ipv4, ipv6, ipv6/pool, ipv6/range



