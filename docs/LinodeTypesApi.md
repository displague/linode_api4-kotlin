# LinodeTypesApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLinodeType**](LinodeTypesApi.md#getLinodeType) | **GET** /linode/types/{typeId} | View Type
[**getLinodeTypes**](LinodeTypesApi.md#getLinodeTypes) | **GET** /linode/types | List Types




<a name="getLinodeType"></a>
# **getLinodeType**
> LinodeType getLinodeType(typeId)

View Type

Returns information about a specific Linode Type, including pricing and specifications. This is used when [creating](/#operation/createLinodeInstance) or [resizing](/#operation/resizeLinodeInstance) Linodes. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeTypesApi()

val typeId : kotlin.String = typeId_example // kotlin.String | The ID of the Linode Type to look up.

try {
    val result : LinodeType = apiInstance.getLinodeType(typeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeTypesApi#getLinodeType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeTypesApi#getLinodeType")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeId** | [**kotlin.String**](.md)| The ID of the Linode Type to look up. |


### Return type

[**LinodeType**](LinodeType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeTypes"></a>
# **getLinodeTypes**
> InlineResponse20018 getLinodeTypes()

List Types

Returns collection of Linode Types, including pricing and specifications for each Type. These are used when [creating](/#operation/createLinodeInstance) or [resizing](/#operation/resizeLinodeInstance) Linodes. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeTypesApi()

try {
    val result : InlineResponse20018 = apiInstance.getLinodeTypes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeTypesApi#getLinodeTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeTypesApi#getLinodeTypes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 



