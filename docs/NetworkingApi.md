# NetworkingApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allocateIP**](NetworkingApi.md#allocateIP) | **POST** /networking/ips | Allocate IP Address
[**assignIPs**](NetworkingApi.md#assignIPs) | **POST** /networking/ipv4/assign | Assign IPs to Linodes
[**getIP**](NetworkingApi.md#getIP) | **GET** /networking/ips/{address} | View IP Address
[**getIPs**](NetworkingApi.md#getIPs) | **GET** /networking/ips | List IP Addresses
[**getIPv6Pools**](NetworkingApi.md#getIPv6Pools) | **GET** /networking/ipv6/pools | List IPv6 Pools
[**getIPv6Ranges**](NetworkingApi.md#getIPv6Ranges) | **GET** /networking/ipv6/ranges | List IPv6 Ranges
[**shareIPs**](NetworkingApi.md#shareIPs) | **POST** /networking/ipv4/share | Configure IP Sharing
[**updateIP**](NetworkingApi.md#updateIP) | **PUT** /networking/ips/{address} | Update IP Address RDNS




<a name="allocateIP"></a>
# **allocateIP**
> IPAddress allocateIP(body)

Allocate IP Address

Allocates a new IPv4 Address on your Account. The Linode must be configured to support additional addresses - please [open a support ticket](/#operation/createTicket) requesting additional addresses before attempting allocation. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NetworkingApi()

val body : Body13 =  // Body13 | Information about the address you are creating.

try {
    val result : IPAddress = apiInstance.allocateIP(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkingApi#allocateIP")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkingApi#allocateIP")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body13**](Body13.md)| Information about the address you are creating. |


### Return type

[**IPAddress**](IPAddress.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="assignIPs"></a>
# **assignIPs**
> kotlin.Any assignIPs(body)

Assign IPs to Linodes

Assign multiple IPs to multiple Linodes in one Region. This allows swapping, shuffling, or otherwise reorganizing IPv4 Addresses to your Linodes.  When the assignment is finished, all Linodes must end up with at least one public IPv4 and no more than one private IPv4. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NetworkingApi()

val body : Body14 =  // Body14 | Information about what IPv4 address to assign, and to which Linode.


try {
    val result : kotlin.Any = apiInstance.assignIPs(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkingApi#assignIPs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkingApi#assignIPs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body14**](Body14.md)| Information about what IPv4 address to assign, and to which Linode.
 |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="getIP"></a>
# **getIP**
> IPAddress getIP(address)

View IP Address

Returns information about a single IP Address on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NetworkingApi()

val address : kotlin.String = address_example // kotlin.String | The address to operate on.

try {
    val result : IPAddress = apiInstance.getIP(address)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkingApi#getIP")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkingApi#getIP")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**kotlin.String**](.md)| The address to operate on. |


### Return type

[**IPAddress**](IPAddress.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getIPs"></a>
# **getIPs**
> InlineResponse20026 getIPs()

List IP Addresses

Returns a paginated list of IP Addresses on your Account, excluding private addresses. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NetworkingApi()

try {
    val result : InlineResponse20026 = apiInstance.getIPs()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkingApi#getIPs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkingApi#getIPs")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getIPv6Pools"></a>
# **getIPv6Pools**
> InlineResponse20027 getIPv6Pools(page, pageSize)

List IPv6 Pools

Displays the IPv6 pools on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NetworkingApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20027 = apiInstance.getIPv6Pools(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkingApi#getIPv6Pools")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkingApi#getIPv6Pools")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getIPv6Ranges"></a>
# **getIPv6Ranges**
> InlineResponse20028 getIPv6Ranges(page, pageSize)

List IPv6 Ranges

Displays the IPv6 ranges on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NetworkingApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20028 = apiInstance.getIPv6Ranges(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkingApi#getIPv6Ranges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkingApi#getIPv6Ranges")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="shareIPs"></a>
# **shareIPs**
> kotlin.Any shareIPs(body)

Configure IP Sharing

Configure shared IPs.  A shared IP may be brought up on a Linode other than the one it lists in its response.  This can be used to allow one Linode to begin serving requests should another become unresponsive. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NetworkingApi()

val body : Body15 =  // Body15 | Information about what IPs to share with which Linode.

try {
    val result : kotlin.Any = apiInstance.shareIPs(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkingApi#shareIPs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkingApi#shareIPs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body15**](Body15.md)| Information about what IPs to share with which Linode. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateIP"></a>
# **updateIP**
> IPAddress updateIP(body, address)

Update IP Address RDNS

Sets RDNS on an IP Address. Forward DNS must already be set up for reverse DNS to be applied. If you set the RDNS to &#x60;null&#x60; for public IPv4 addresses, it will be reset to the default _members.linode.com_ RDNS value. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NetworkingApi()

val body : IPAddress =  // IPAddress | The information to update.

val address : kotlin.String = address_example // kotlin.String | The address to operate on.

try {
    val result : IPAddress = apiInstance.updateIP(body, address)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NetworkingApi#updateIP")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NetworkingApi#updateIP")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IPAddress**](IPAddress.md)| The information to update. |
 **address** | [**kotlin.String**](.md)| The address to operate on. |


### Return type

[**IPAddress**](IPAddress.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



