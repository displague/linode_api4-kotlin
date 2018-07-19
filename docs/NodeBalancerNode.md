
# NodeBalancerNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This node&#x27;s unique ID. |  [optional]
**address** | [**kotlin.String**](.md) | The private IP Address where this backend can be reached. This _must_ be a private IP address.  |  [optional]
**label** | [**kotlin.String**](.md) | The label for this node.  This is for display purposes only.  |  [optional]
**status** | [**inline**](#StatusEnum) | The current status of this node, based on the configured checks of its NodeBalancer Config.  |  [optional]
**weight** | [**kotlin.Int**](.md) | Used when picking a backend to serve a request and is not pinned to a single backend yet.  Nodes with a higher weight will receive more traffic.  |  [optional]
**mode** | [**inline**](#ModeEnum) | The mode this NodeBalancer should use when sending traffic to this backend. * If set to &#x60;accept&#x60; this backend is accepting traffic. * If set to &#x60;reject&#x60; this backend will not receive traffic. * If set to &#x60;drain&#x60; this backend will not receive _new_ traffic, but connections already   pinned to it will continue to be routed to it.  |  [optional]
**configId** | [**kotlin.Int**](.md) | The NodeBalancer Config ID that this Node belongs to.  |  [optional]
**nodebalancerId** | [**kotlin.Int**](.md) | The NodeBalancer ID that this Node belongs to.  |  [optional]



<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | unknown, UP, DOWN


<a name="ModeEnum"></a>
## Enum: mode
Name | Value
---- | -----
mode | accept, reject, drain



