# StackScriptsApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStackScript**](StackScriptsApi.md#addStackScript) | **POST** /linode/stackscripts | Create StackScript
[**deleteStackScript**](StackScriptsApi.md#deleteStackScript) | **DELETE** /linode/stackscripts/{stackscriptId} | Delete StackScript
[**getStackScript**](StackScriptsApi.md#getStackScript) | **GET** /linode/stackscripts/{stackscriptId} | View StackScript
[**getStackScripts**](StackScriptsApi.md#getStackScripts) | **GET** /linode/stackscripts | List StackScripts
[**updateStackScript**](StackScriptsApi.md#updateStackScript) | **PUT** /linode/stackscripts/{stackscriptId} | Update StackScript




<a name="addStackScript"></a>
# **addStackScript**
> StackScript addStackScript(body)

Create StackScript

Creates a StackScript in your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = StackScriptsApi()

val body : kotlin.Any =  // kotlin.Any | The properties to set for the new StackScript.

try {
    val result : StackScript = apiInstance.addStackScript(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StackScriptsApi#addStackScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StackScriptsApi#addStackScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| The properties to set for the new StackScript. |


### Return type

[**StackScript**](StackScript.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteStackScript"></a>
# **deleteStackScript**
> kotlin.Any deleteStackScript(stackscriptId)

Delete StackScript

Deletes a private StackScript you have permission to &#x60;read_write&#x60;. You cannot delete a public StackScript. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = StackScriptsApi()

val stackscriptId : kotlin.String = stackscriptId_example // kotlin.String | The ID of the StackScript to look up.

try {
    val result : kotlin.Any = apiInstance.deleteStackScript(stackscriptId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StackScriptsApi#deleteStackScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StackScriptsApi#deleteStackScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stackscriptId** | [**kotlin.String**](.md)| The ID of the StackScript to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getStackScript"></a>
# **getStackScript**
> StackScript getStackScript(stackscriptId)

View StackScript

Returns all of the information about a specified StackScript, including the contents of the script. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = StackScriptsApi()

val stackscriptId : kotlin.String = stackscriptId_example // kotlin.String | The ID of the StackScript to look up.

try {
    val result : StackScript = apiInstance.getStackScript(stackscriptId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StackScriptsApi#getStackScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StackScriptsApi#getStackScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stackscriptId** | [**kotlin.String**](.md)| The ID of the StackScript to look up. |


### Return type

[**StackScript**](StackScript.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getStackScripts"></a>
# **getStackScripts**
> InlineResponse20017 getStackScripts(page, pageSize)

List StackScripts

If the request is not authenticated, only public StackScripts are returned.  For more information on StackScripts, please read our guide: [Automate Deployment with StackScripts](https://linode.com/docs/platform/stackscripts/). 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = StackScriptsApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20017 = apiInstance.getStackScripts(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StackScriptsApi#getStackScripts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StackScriptsApi#getStackScripts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="updateStackScript"></a>
# **updateStackScript**
> StackScript updateStackScript(stackscriptId, body)

Update StackScript

Updates a StackScript.  **Once a StackScript is made public, it cannot be made private.** 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = StackScriptsApi()

val stackscriptId : kotlin.String = stackscriptId_example // kotlin.String | The ID of the StackScript to look up.

val body : StackScript =  // StackScript | The fields to update.

try {
    val result : StackScript = apiInstance.updateStackScript(stackscriptId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StackScriptsApi#updateStackScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StackScriptsApi#updateStackScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stackscriptId** | [**kotlin.String**](.md)| The ID of the StackScript to look up. |
 **body** | [**StackScript**](StackScript.md)| The fields to update. | [optional]


### Return type

[**StackScript**](StackScript.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



