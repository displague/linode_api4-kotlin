
# NodeBalancer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This NodeBalancer&#x27;s unique ID.  |  [optional]
**label** | [**kotlin.String**](.md) | This NodeBalancer&#x27;s label. These must be unique on your Account.  |  [optional]
**region** | [**kotlin.String**](.md) | The Region where this NodeBalancer is located. NodeBalancers only support backends in the same Region.  |  [optional]
**hostname** | [**kotlin.String**](.md) | This NodeBalancer&#x27;s hostname, ending with _.nodebalancer.linode.com_  |  [optional]
**ipv4** | [**kotlin.String**](.md) | This NodeBalancer&#x27;s public IPv4 address.  |  [optional]
**ipv6** | [**kotlin.String**](.md) | This NodeBalancer&#x27;s public IPv6 address.  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this NodeBalancer was created.  |  [optional]
**updated** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this NodeBalancer was last updated.  |  [optional]
**clientConnThrottle** | [**kotlin.Int**](.md) | Throttle connections per second.  Set to 0 (zero) to disable throttling.  |  [optional]
**transfer** | [**NodeBalancerTransfer**](NodeBalancerTransfer.md) |  |  [optional]




