# LongviewApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLongviewClient**](LongviewApi.md#createLongviewClient) | **POST** /longview/clients | Create Longview Client
[**deleteLongviewClient**](LongviewApi.md#deleteLongviewClient) | **DELETE** /longview/clients/{clientId} | Delete Longview Client
[**getLongviewClient**](LongviewApi.md#getLongviewClient) | **GET** /longview/clients/{clientId} | View Longview Client
[**getLongviewClients**](LongviewApi.md#getLongviewClients) | **GET** /longview/clients | List Longview Clients
[**getLongviewSubscription**](LongviewApi.md#getLongviewSubscription) | **GET** /longview/subscriptions/{subscriptionId} | View Longview Subscription
[**getLongviewSubscriptions**](LongviewApi.md#getLongviewSubscriptions) | **GET** /longview/subscriptions | List Longview Subscriptions
[**updateLongviewClient**](LongviewApi.md#updateLongviewClient) | **PUT** /longview/clients/{clientId} | Update Longview Client




<a name="createLongviewClient"></a>
# **createLongviewClient**
> LongviewClient createLongviewClient(body)

Create Longview Client

Creates a Longview Client.  This Client will not begin monitoring the status of your server until you configure the Longview Client application on your Linode using the returning &#x60;install_code&#x60; and &#x60;api_key&#x60;. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LongviewApi()

val body : LongviewClient =  // LongviewClient | Information about the LongviewClient to create.

try {
    val result : LongviewClient = apiInstance.createLongviewClient(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LongviewApi#createLongviewClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LongviewApi#createLongviewClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LongviewClient**](LongviewClient.md)| Information about the LongviewClient to create. |


### Return type

[**LongviewClient**](LongviewClient.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteLongviewClient"></a>
# **deleteLongviewClient**
> kotlin.Any deleteLongviewClient(clientId)

Delete Longview Client

Deletes a Longview Client from your Account.  **All information stored for this client will be lost.**  This _does not_ uninstall the Longview Client application for your Linode - you must do that manually. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LongviewApi()

val clientId : kotlin.Int = 56 // kotlin.Int | The Longview Client ID to access.

try {
    val result : kotlin.Any = apiInstance.deleteLongviewClient(clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LongviewApi#deleteLongviewClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LongviewApi#deleteLongviewClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**kotlin.Int**](.md)| The Longview Client ID to access. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLongviewClient"></a>
# **getLongviewClient**
> LongviewClient getLongviewClient(clientId)

View Longview Client

Returns a single Longview Client you can access. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LongviewApi()

val clientId : kotlin.Int = 56 // kotlin.Int | The Longview Client ID to access.

try {
    val result : LongviewClient = apiInstance.getLongviewClient(clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LongviewApi#getLongviewClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LongviewApi#getLongviewClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**kotlin.Int**](.md)| The Longview Client ID to access. |


### Return type

[**LongviewClient**](LongviewClient.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLongviewClients"></a>
# **getLongviewClients**
> InlineResponse20019 getLongviewClients(page, pageSize)

List Longview Clients

Returns a paginated list of Longview Clients you have access to. Longview Client is used to monitor stats on your Linode with the help of the Longview Client application. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LongviewApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20019 = apiInstance.getLongviewClients(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LongviewApi#getLongviewClients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LongviewApi#getLongviewClients")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLongviewSubscription"></a>
# **getLongviewSubscription**
> LongviewSubscription getLongviewSubscription(subscriptionId)

View Longview Subscription

Returns a single LongviewSubscription object.  This is a public endpoint and requires no authentication. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LongviewApi()

val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | The Longview Subscription to look up.

try {
    val result : LongviewSubscription = apiInstance.getLongviewSubscription(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LongviewApi#getLongviewSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LongviewApi#getLongviewSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | [**kotlin.String**](.md)| The Longview Subscription to look up. |


### Return type

[**LongviewSubscription**](LongviewSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLongviewSubscriptions"></a>
# **getLongviewSubscriptions**
> InlineResponse20020 getLongviewSubscriptions(page, pageSize)

List Longview Subscriptions

Returns a paginated list of available Longview Subscriptions. This is a public endpoint and requires no authentication. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LongviewApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20020 = apiInstance.getLongviewSubscriptions(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LongviewApi#getLongviewSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LongviewApi#getLongviewSubscriptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="updateLongviewClient"></a>
# **updateLongviewClient**
> LongviewClient updateLongviewClient(body, clientId)

Update Longview Client

Updates a Longview Client.  This cannot update how it monitors your server; use the Longview Client application on your Linode for monitoring configuration. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LongviewApi()

val body : LongviewClient =  // LongviewClient | The fields to update.

val clientId : kotlin.Int = 56 // kotlin.Int | The Longview Client ID to access.

try {
    val result : LongviewClient = apiInstance.updateLongviewClient(body, clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LongviewApi#updateLongviewClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LongviewApi#updateLongviewClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LongviewClient**](LongviewClient.md)| The fields to update. |
 **clientId** | [**kotlin.Int**](.md)| The Longview Client ID to access. |


### Return type

[**LongviewClient**](LongviewClient.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



