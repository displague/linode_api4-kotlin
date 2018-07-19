# ImagesApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImage**](ImagesApi.md#createImage) | **POST** /images | Create Image
[**deleteImage**](ImagesApi.md#deleteImage) | **DELETE** /images/{imageId} | Delete Image
[**getImage**](ImagesApi.md#getImage) | **GET** /images/{imageId} | View Image
[**getImages**](ImagesApi.md#getImages) | **GET** /images | List Images
[**updateImage**](ImagesApi.md#updateImage) | **PUT** /images/{imageId} | Update Image




<a name="createImage"></a>
# **createImage**
> ImagePrivate createImage(body)

Create Image

Creates a private gold-master Image from a Linode Disk. There is no additional charge to store Images for Linode users. Images are limited to three per Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ImagesApi()

val body : kotlin.Any =  // kotlin.Any | Information about the Image to create.

try {
    val result : ImagePrivate = apiInstance.createImage(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#createImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#createImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Information about the Image to create. | [optional]


### Return type

[**ImagePrivate**](ImagePrivate.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteImage"></a>
# **deleteImage**
> kotlin.Any deleteImage(imageId)

Delete Image

Deletes a private Image you have permission to &#x60;read_write&#x60;.   **Deleting an Image is a destructive action and cannot be undone.** 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ImagesApi()

val imageId : kotlin.String = imageId_example // kotlin.String | ID of the Image to look up.

try {
    val result : kotlin.Any = apiInstance.deleteImage(imageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#deleteImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#deleteImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageId** | [**kotlin.String**](.md)| ID of the Image to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getImage"></a>
# **getImage**
> ImagePrivate getImage(imageId)

View Image

Get information about a single Image. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ImagesApi()

val imageId : kotlin.String = imageId_example // kotlin.String | ID of the Image to look up.

try {
    val result : ImagePrivate = apiInstance.getImage(imageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#getImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#getImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageId** | [**kotlin.String**](.md)| ID of the Image to look up. |


### Return type

[**ImagePrivate**](ImagePrivate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getImages"></a>
# **getImages**
> InlineResponse20010 getImages(page, pageSize)

List Images

Returns a paginated list of Images.  * Calling this endpoint without authentication returns all public Images. * Authentication is required to return a combined paginated list of all public and   your private Images. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ImagesApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20010 = apiInstance.getImages(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#getImages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#getImages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="updateImage"></a>
# **updateImage**
> ImagePrivate updateImage(body, imageId)

Update Image

Updates a private Image that you have permission to &#x60;read_write&#x60;. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ImagesApi()

val body : ImagePrivate =  // ImagePrivate | The fields to update.


val imageId : kotlin.String = imageId_example // kotlin.String | ID of the Image to look up.

try {
    val result : ImagePrivate = apiInstance.updateImage(body, imageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#updateImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#updateImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImagePrivate**](ImagePrivate.md)| The fields to update.
 |
 **imageId** | [**kotlin.String**](.md)| ID of the Image to look up. |


### Return type

[**ImagePrivate**](ImagePrivate.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



