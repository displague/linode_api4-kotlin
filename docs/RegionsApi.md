# RegionsApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRegion**](RegionsApi.md#getRegion) | **GET** /regions/{regionId} | View Region
[**getRegions**](RegionsApi.md#getRegions) | **GET** /regions | List Regions




<a name="getRegion"></a>
# **getRegion**
> Region getRegion(regionId)

View Region

Returns a single Region. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = RegionsApi()

val regionId : kotlin.String = regionId_example // kotlin.String | ID of the Region to look up.

try {
    val result : Region = apiInstance.getRegion(regionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegionsApi#getRegion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegionsApi#getRegion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | [**kotlin.String**](.md)| ID of the Region to look up. |


### Return type

[**Region**](Region.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getRegions"></a>
# **getRegions**
> InlineResponse20035 getRegions()

List Regions

Lists the Regions available for Linode services. Not all services are guaranteed to be available in all Regions. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = RegionsApi()

try {
    val result : InlineResponse20035 = apiInstance.getRegions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegionsApi#getRegions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegionsApi#getRegions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 



