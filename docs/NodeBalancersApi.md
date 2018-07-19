# NodeBalancersApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNodeBalancer**](NodeBalancersApi.md#createNodeBalancer) | **POST** /nodebalancers | Create NodeBalancer
[**createNodeBalancerConfig**](NodeBalancersApi.md#createNodeBalancerConfig) | **POST** /nodebalancers/{nodeBalancerId}/configs | Create Config
[**createNodeBalancerNode**](NodeBalancersApi.md#createNodeBalancerNode) | **POST** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes | Create Node
[**deleteNodeBalancer**](NodeBalancersApi.md#deleteNodeBalancer) | **DELETE** /nodebalancers/{nodeBalancerId} | Delete NodeBalancer
[**deleteNodeBalancerConfig**](NodeBalancersApi.md#deleteNodeBalancerConfig) | **DELETE** /nodebalancers/{nodeBalancerId}/configs/{configId} | Delete Config
[**deleteNodeBalancerConfigNode**](NodeBalancersApi.md#deleteNodeBalancerConfigNode) | **DELETE** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes/{nodeId} | Delete Node
[**getNodeBalancer**](NodeBalancersApi.md#getNodeBalancer) | **GET** /nodebalancers/{nodeBalancerId} | View NodeBalancer
[**getNodeBalancerConfig**](NodeBalancersApi.md#getNodeBalancerConfig) | **GET** /nodebalancers/{nodeBalancerId}/configs/{configId} | View Config
[**getNodeBalancerConfigNodes**](NodeBalancersApi.md#getNodeBalancerConfigNodes) | **GET** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes | List Nodes
[**getNodeBalancerConfigs**](NodeBalancersApi.md#getNodeBalancerConfigs) | **GET** /nodebalancers/{nodeBalancerId}/configs | List Configs
[**getNodeBalancerNode**](NodeBalancersApi.md#getNodeBalancerNode) | **GET** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes/{nodeId} | View Node
[**getNodeBalancers**](NodeBalancersApi.md#getNodeBalancers) | **GET** /nodebalancers | List NodeBalancers
[**nodebalancersNodeBalancerIdStatsGet**](NodeBalancersApi.md#nodebalancersNodeBalancerIdStatsGet) | **GET** /nodebalancers/{nodeBalancerId}/stats | View NodeBalancer Statistics
[**updateNodeBalancer**](NodeBalancersApi.md#updateNodeBalancer) | **PUT** /nodebalancers/{nodeBalancerId} | Update NodeBalancer
[**updateNodeBalancerConfig**](NodeBalancersApi.md#updateNodeBalancerConfig) | **PUT** /nodebalancers/{nodeBalancerId}/configs/{configId} | Update Config
[**updateNodeBalancerNode**](NodeBalancersApi.md#updateNodeBalancerNode) | **PUT** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes/{nodeId} | Update Node




<a name="createNodeBalancer"></a>
# **createNodeBalancer**
> NodeBalancer createNodeBalancer(body)

Create NodeBalancer

Creates a NodeBalancer in the requested Region. This NodeBalancer will not start serving requests until it is configured. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val body : Body16 =  // Body16 | Information about the NodeBalancer to create.

try {
    val result : NodeBalancer = apiInstance.createNodeBalancer(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#createNodeBalancer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#createNodeBalancer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body16**](Body16.md)| Information about the NodeBalancer to create. |


### Return type

[**NodeBalancer**](NodeBalancer.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createNodeBalancerConfig"></a>
# **createNodeBalancerConfig**
> NodeBalancerConfig createNodeBalancerConfig(nodeBalancerId, body)

Create Config

Creates a NodeBalancer Config, which allows the NodeBalancer to accept traffic on a new port. You will need to add NodeBalancer Nodes to the new Config before it can actually serve requests. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val body : NodeBalancerConfig =  // NodeBalancerConfig | Information about the port to configure.

try {
    val result : NodeBalancerConfig = apiInstance.createNodeBalancerConfig(nodeBalancerId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#createNodeBalancerConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#createNodeBalancerConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **body** | [**NodeBalancerConfig**](NodeBalancerConfig.md)| Information about the port to configure. | [optional]


### Return type

[**NodeBalancerConfig**](NodeBalancerConfig.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createNodeBalancerNode"></a>
# **createNodeBalancerNode**
> NodeBalancerNode createNodeBalancerNode(body, nodeBalancerId, configId)

Create Node

Creates a NodeBalancer Node, a backend that can accept traffic for this NodeBalancer Config. Nodes are routed requests on the configured port based on their status. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val body : kotlin.Any =  // kotlin.Any | Information about the Node to create.

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer config to access.

try {
    val result : NodeBalancerNode = apiInstance.createNodeBalancerNode(body, nodeBalancerId, configId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#createNodeBalancerNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#createNodeBalancerNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Information about the Node to create. |
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **configId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer config to access. |


### Return type

[**NodeBalancerNode**](NodeBalancerNode.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteNodeBalancer"></a>
# **deleteNodeBalancer**
> kotlin.Any deleteNodeBalancer(nodeBalancerId)

Delete NodeBalancer

Deletes a NodeBalancer.  **This is a destructive action and cannot be undone.**  Deleting a NodeBalancer will also delete all associated Configs and Nodes, although the backend servers represented by the Nodes will not be changed or removed. Deleting a NodeBalancer will cause you to lose access to the IP Addresses assigned to this NodeBalancer. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

try {
    val result : kotlin.Any = apiInstance.deleteNodeBalancer(nodeBalancerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#deleteNodeBalancer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#deleteNodeBalancer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteNodeBalancerConfig"></a>
# **deleteNodeBalancerConfig**
> kotlin.Any deleteNodeBalancerConfig(nodeBalancerId, configId)

Delete Config

Deletes the Config for a port of this NodeBalancer.  **This cannot be undone.**  Once completed, this NodeBalancer will no longer respond to requests on the given port. This also deletes all associated NodeBalancerNodes, but the Linodes they were routing traffic to will be unchanged and will not be removed. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the config to access.

try {
    val result : kotlin.Any = apiInstance.deleteNodeBalancerConfig(nodeBalancerId, configId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#deleteNodeBalancerConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#deleteNodeBalancerConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **configId** | [**kotlin.Int**](.md)| The ID of the config to access. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteNodeBalancerConfigNode"></a>
# **deleteNodeBalancerConfigNode**
> kotlin.Any deleteNodeBalancerConfigNode(nodeBalancerId, configId, nodeId)

Delete Node

Deletes a Node from this Config. This backend will no longer receive traffic for the configured port of this NodeBalancer.  This does not change or remove the Linode whose address was used in the creation of this Node. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the Config to access

val nodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Node to access

try {
    val result : kotlin.Any = apiInstance.deleteNodeBalancerConfigNode(nodeBalancerId, configId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#deleteNodeBalancerConfigNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#deleteNodeBalancerConfigNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **configId** | [**kotlin.Int**](.md)| The ID of the Config to access |
 **nodeId** | [**kotlin.Int**](.md)| The ID of the Node to access |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getNodeBalancer"></a>
# **getNodeBalancer**
> NodeBalancer getNodeBalancer(nodeBalancerId)

View NodeBalancer

Returns a single NodeBalancer you can access. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

try {
    val result : NodeBalancer = apiInstance.getNodeBalancer(nodeBalancerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#getNodeBalancer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#getNodeBalancer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |


### Return type

[**NodeBalancer**](NodeBalancer.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getNodeBalancerConfig"></a>
# **getNodeBalancerConfig**
> NodeBalancerConfig getNodeBalancerConfig(nodeBalancerId, configId)

View Config

Returns configuration information for a single port of this NodeBalancer. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the config to access.

try {
    val result : NodeBalancerConfig = apiInstance.getNodeBalancerConfig(nodeBalancerId, configId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#getNodeBalancerConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#getNodeBalancerConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **configId** | [**kotlin.Int**](.md)| The ID of the config to access. |


### Return type

[**NodeBalancerConfig**](NodeBalancerConfig.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getNodeBalancerConfigNodes"></a>
# **getNodeBalancerConfigNodes**
> InlineResponse20031 getNodeBalancerConfigNodes(nodeBalancerId, configId, page, pageSize)

List Nodes

Returns a paginated list of NodeBalancer nodes associated with this Config. These are the backends that will be sent traffic for this port. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer config to access.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20031 = apiInstance.getNodeBalancerConfigNodes(nodeBalancerId, configId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#getNodeBalancerConfigNodes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#getNodeBalancerConfigNodes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **configId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer config to access. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getNodeBalancerConfigs"></a>
# **getNodeBalancerConfigs**
> InlineResponse20030 getNodeBalancerConfigs(nodeBalancerId, page, pageSize)

List Configs

Returns a paginated list of NodeBalancer Configs associated with this NodeBalancer. NodeBalancer Configs represent individual ports that this NodeBalancer will accept traffic on, one Config per port.  For example, if you wanted to accept standard HTTP traffic, you would need a Config listening on port 80. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20030 = apiInstance.getNodeBalancerConfigs(nodeBalancerId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#getNodeBalancerConfigs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#getNodeBalancerConfigs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getNodeBalancerNode"></a>
# **getNodeBalancerNode**
> NodeBalancerNode getNodeBalancerNode(nodeBalancerId, configId, nodeId)

View Node

Returns information about a single Node, a backend for this NodeBalancer&#x27;s configured port. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the Config to access

val nodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Node to access

try {
    val result : NodeBalancerNode = apiInstance.getNodeBalancerNode(nodeBalancerId, configId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#getNodeBalancerNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#getNodeBalancerNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **configId** | [**kotlin.Int**](.md)| The ID of the Config to access |
 **nodeId** | [**kotlin.Int**](.md)| The ID of the Node to access |


### Return type

[**NodeBalancerNode**](NodeBalancerNode.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getNodeBalancers"></a>
# **getNodeBalancers**
> InlineResponse20029 getNodeBalancers(page, pageSize)

List NodeBalancers

Returns a paginated list of NodeBalancers you have access to. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20029 = apiInstance.getNodeBalancers(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#getNodeBalancers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#getNodeBalancers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="nodebalancersNodeBalancerIdStatsGet"></a>
# **nodebalancersNodeBalancerIdStatsGet**
> NodeBalancerStats nodebalancersNodeBalancerIdStatsGet(nodeBalancerId)

View NodeBalancer Statistics

Returns detailed statistics about the requested NodeBalancer. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

try {
    val result : NodeBalancerStats = apiInstance.nodebalancersNodeBalancerIdStatsGet(nodeBalancerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#nodebalancersNodeBalancerIdStatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#nodebalancersNodeBalancerIdStatsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |


### Return type

[**NodeBalancerStats**](NodeBalancerStats.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="updateNodeBalancer"></a>
# **updateNodeBalancer**
> NodeBalancer updateNodeBalancer(body, nodeBalancerId)

Update NodeBalancer

Updates information about a NodeBalancer you can access. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val body : NodeBalancer =  // NodeBalancer | The information to update.

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

try {
    val result : NodeBalancer = apiInstance.updateNodeBalancer(body, nodeBalancerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#updateNodeBalancer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#updateNodeBalancer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeBalancer**](NodeBalancer.md)| The information to update. |
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |


### Return type

[**NodeBalancer**](NodeBalancer.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateNodeBalancerConfig"></a>
# **updateNodeBalancerConfig**
> NodeBalancerConfig updateNodeBalancerConfig(body, nodeBalancerId, configId)

Update Config

Updates the configuration for a single port on a NodeBalancer. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val body : NodeBalancerConfig =  // NodeBalancerConfig | The fields to update.

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the config to access.

try {
    val result : NodeBalancerConfig = apiInstance.updateNodeBalancerConfig(body, nodeBalancerId, configId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#updateNodeBalancerConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#updateNodeBalancerConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeBalancerConfig**](NodeBalancerConfig.md)| The fields to update. |
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **configId** | [**kotlin.Int**](.md)| The ID of the config to access. |


### Return type

[**NodeBalancerConfig**](NodeBalancerConfig.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateNodeBalancerNode"></a>
# **updateNodeBalancerNode**
> NodeBalancerNode updateNodeBalancerNode(body, nodeBalancerId, configId, nodeId)

Update Node

Updates information about a Node, a backend for this NodeBalancer&#x27;s configured port. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = NodeBalancersApi()

val body : NodeBalancerNode =  // NodeBalancerNode | The fields to update.

val nodeBalancerId : kotlin.Int = 56 // kotlin.Int | The ID of the NodeBalancer to access.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the Config to access

val nodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Node to access

try {
    val result : NodeBalancerNode = apiInstance.updateNodeBalancerNode(body, nodeBalancerId, configId, nodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NodeBalancersApi#updateNodeBalancerNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NodeBalancersApi#updateNodeBalancerNode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeBalancerNode**](NodeBalancerNode.md)| The fields to update. |
 **nodeBalancerId** | [**kotlin.Int**](.md)| The ID of the NodeBalancer to access. |
 **configId** | [**kotlin.Int**](.md)| The ID of the Config to access |
 **nodeId** | [**kotlin.Int**](.md)| The ID of the Node to access |


### Return type

[**NodeBalancerNode**](NodeBalancerNode.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



