# VolumesApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachVolume**](VolumesApi.md#attachVolume) | **POST** /volumes/{volumeId}/attach | Attach Volume
[**cloneVolume**](VolumesApi.md#cloneVolume) | **POST** /volumes/{volumeId}/clone | Clone Volume
[**createVolume**](VolumesApi.md#createVolume) | **POST** /volumes | Create Volume
[**deleteVolume**](VolumesApi.md#deleteVolume) | **DELETE** /volumes/{volumeId} | Delete Volume
[**detachVolume**](VolumesApi.md#detachVolume) | **POST** /volumes/{volumeId}/detach | Detach Volume
[**getVolume**](VolumesApi.md#getVolume) | **GET** /volumes/{volumeId} | View Volume
[**getVolumes**](VolumesApi.md#getVolumes) | **GET** /volumes | List Volumes
[**resizeVolume**](VolumesApi.md#resizeVolume) | **POST** /volumes/{volumeId}/resize | Resize Volume
[**updateVolume**](VolumesApi.md#updateVolume) | **PUT** /volumes/{volumeId} | Update Volume




<a name="attachVolume"></a>
# **attachVolume**
> Volume attachVolume(body, volumeId)

Attach Volume

Attaches a Volume on your Account to an existing Linode on your Account. In order for this request to complete successfully, your User must have &#x60;read_only&#x60; or &#x60;read_write&#x60; permission to the Volume and &#x60;read_write&#x60; permission to the Linode. Additionally, the Volume and Linode must be located in the same Region. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val body : Body22 =  // Body22 | Volume to attach to a Linode.

val volumeId : kotlin.Int = 56 // kotlin.Int | ID of the Volume to attach.

try {
    val result : Volume = apiInstance.attachVolume(body, volumeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#attachVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#attachVolume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body22**](Body22.md)| Volume to attach to a Linode. |
 **volumeId** | [**kotlin.Int**](.md)| ID of the Volume to attach. |


### Return type

[**Volume**](Volume.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="cloneVolume"></a>
# **cloneVolume**
> kotlin.Any cloneVolume(body, volumeId)

Clone Volume

Creates a Volume on your Account. In order for this request to complete successfully, your User must have the &#x60;add_volumes&#x60; grant. The new Volume will have the same size and data as the source Volume. Creating a new Volume will incur a charge on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val body : Body23 =  // Body23 | The requested state your Volume will be cloned into.

val volumeId : kotlin.Int = 56 // kotlin.Int | ID of the Volume to clone.

try {
    val result : kotlin.Any = apiInstance.cloneVolume(body, volumeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#cloneVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#cloneVolume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body23**](Body23.md)| The requested state your Volume will be cloned into. |
 **volumeId** | [**kotlin.Int**](.md)| ID of the Volume to clone. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createVolume"></a>
# **createVolume**
> Volume createVolume(body)

Create Volume

Creates a Volume on your Account. In order for this to complete successfully, your User must have the &#x60;add_volumes&#x60; grant. Creating a new Volume will start accruing additional charges on your account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val body : Body21 =  // Body21 | The requested initial state of a new Volume.

try {
    val result : Volume = apiInstance.createVolume(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#createVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#createVolume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body21**](Body21.md)| The requested initial state of a new Volume. |


### Return type

[**Volume**](Volume.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteVolume"></a>
# **deleteVolume**
> kotlin.Any deleteVolume(volumeId)

Delete Volume

Deletes a Volume you have permission to &#x60;read_write&#x60;.  **Deleting a Volume is a destructive action and cannot be undone.**  Deleting stops billing for the Volume. You will be billed for time used within the billing period the Volume was active. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val volumeId : kotlin.Int = 56 // kotlin.Int | ID of the Volume to look up.

try {
    val result : kotlin.Any = apiInstance.deleteVolume(volumeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#deleteVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#deleteVolume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **volumeId** | [**kotlin.Int**](.md)| ID of the Volume to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="detachVolume"></a>
# **detachVolume**
> kotlin.Any detachVolume(volumeId)

Detach Volume

Detaches a Volume on your Account from a Linode on your Account. In order for this request to complete successfully, your User must have &#x60;read_write&#x60; access to the Volume and &#x60;read_write&#x60; access to the Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val volumeId : kotlin.Int = 56 // kotlin.Int | ID of the Volume to detach.

try {
    val result : kotlin.Any = apiInstance.detachVolume(volumeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#detachVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#detachVolume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **volumeId** | [**kotlin.Int**](.md)| ID of the Volume to detach. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getVolume"></a>
# **getVolume**
> Volume getVolume(volumeId, page, pageSize)

View Volume

Get information about a single Volume. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val volumeId : kotlin.Int = 56 // kotlin.Int | ID of the Volume to look up.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : Volume = apiInstance.getVolume(volumeId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#getVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#getVolume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **volumeId** | [**kotlin.Int**](.md)| ID of the Volume to look up. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**Volume**](Volume.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getVolumes"></a>
# **getVolumes**
> InlineResponse20016 getVolumes(page, pageSize)

List Volumes

Returns a paginated list of Volumes you have permission to view. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20016 = apiInstance.getVolumes(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#getVolumes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#getVolumes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="resizeVolume"></a>
# **resizeVolume**
> kotlin.Any resizeVolume(body, volumeId)

Resize Volume

Resize an existing Volume on your Account. In order for this request to complete successfully, your User must have the &#x60;read_write&#x60; permissions to the Volume. * Volumes can only be resized up. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val body : Body24 =  // Body24 | The requested size to increase your Volume to.

val volumeId : kotlin.Int = 56 // kotlin.Int | ID of the Volume to resize.

try {
    val result : kotlin.Any = apiInstance.resizeVolume(body, volumeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#resizeVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#resizeVolume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body24**](Body24.md)| The requested size to increase your Volume to. |
 **volumeId** | [**kotlin.Int**](.md)| ID of the Volume to resize. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateVolume"></a>
# **updateVolume**
> Volume updateVolume(body, volumeId)

Update Volume

Updates a Volume that you have permission to &#x60;read_write&#x60;. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = VolumesApi()

val body : kotlin.Any =  // kotlin.Any | If any updated field fails to pass validation, the Volume will not be updated.


val volumeId : kotlin.Int = 56 // kotlin.Int | ID of the Volume to look up.

try {
    val result : Volume = apiInstance.updateVolume(body, volumeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VolumesApi#updateVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VolumesApi#updateVolume")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| If any updated field fails to pass validation, the Volume will not be updated.
 |
 **volumeId** | [**kotlin.Int**](.md)| ID of the Volume to look up. |


### Return type

[**Volume**](Volume.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



