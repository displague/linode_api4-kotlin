# ManagedApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createManagedContact**](ManagedApi.md#createManagedContact) | **POST** /managed/contacts | Create Managed Contact
[**createManagedCredential**](ManagedApi.md#createManagedCredential) | **POST** /managed/credentials | Create Managed Credential
[**createManagedService**](ManagedApi.md#createManagedService) | **POST** /managed/services | Create Managed Service
[**deleteManagedContact**](ManagedApi.md#deleteManagedContact) | **DELETE** /managed/contacts/{contactId} | Delete Managed Contact
[**deleteManagedCredential**](ManagedApi.md#deleteManagedCredential) | **POST** /managed/credentials/{credentialId}/revoke | Delete Managed Credential
[**deleteManagedService**](ManagedApi.md#deleteManagedService) | **DELETE** /managed/services/{serviceId} | Delete Managed Service
[**disableManagedService**](ManagedApi.md#disableManagedService) | **POST** /managed/services/{serviceId}/disable | Disable Managed Service
[**enableManagedService**](ManagedApi.md#enableManagedService) | **POST** /managed/services/{serviceId}/enable | Enable Managed Service
[**getManagedContact**](ManagedApi.md#getManagedContact) | **GET** /managed/contacts/{contactId} | View Managed Contact
[**getManagedContacts**](ManagedApi.md#getManagedContacts) | **GET** /managed/contacts | List Managed Contacts
[**getManagedCredential**](ManagedApi.md#getManagedCredential) | **GET** /managed/credentials/{credentialId} | View Managed Credential
[**getManagedCredentials**](ManagedApi.md#getManagedCredentials) | **GET** /managed/credentials | List Managed Credentials
[**getManagedIssue**](ManagedApi.md#getManagedIssue) | **GET** /managed/issues/{issueId} | View Managed Issue
[**getManagedIssues**](ManagedApi.md#getManagedIssues) | **GET** /managed/issues | List Managed Issues
[**getManagedLinodeSetting**](ManagedApi.md#getManagedLinodeSetting) | **GET** /managed/linode-settings/{linodeId} | View Linode&#x27;s Managed Settings
[**getManagedLinodeSettings**](ManagedApi.md#getManagedLinodeSettings) | **GET** /managed/linode-settings | List Managed Linode Settings
[**getManagedService**](ManagedApi.md#getManagedService) | **GET** /managed/services/{serviceId} | View Managed Service
[**getManagedServices**](ManagedApi.md#getManagedServices) | **GET** /managed/services | List Managed Services
[**updateManagedContact**](ManagedApi.md#updateManagedContact) | **PUT** /managed/contacts/{contactId} | Update Managed Contact
[**updateManagedCredential**](ManagedApi.md#updateManagedCredential) | **PUT** /managed/credentials/{credentialId} | Update Managed Credential
[**updateManagedLinodeSetting**](ManagedApi.md#updateManagedLinodeSetting) | **PUT** /managed/linode-settings/{linodeId} | Update Linode&#x27;s Managed Settings
[**updateManagedService**](ManagedApi.md#updateManagedService) | **PUT** /managed/services/{serviceId} | Update Managed Service




<a name="createManagedContact"></a>
# **createManagedContact**
> ManagedContact createManagedContact(body)

Create Managed Contact

Creates a Managed Contact.  A Managed Contact is someone Linode special forces can contact in the course of attempting to resolve an issue with a Managed Service. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val body : ManagedContact =  // ManagedContact | Information about the contact to create.

try {
    val result : ManagedContact = apiInstance.createManagedContact(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#createManagedContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#createManagedContact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManagedContact**](ManagedContact.md)| Information about the contact to create. | [optional]


### Return type

[**ManagedContact**](ManagedContact.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createManagedCredential"></a>
# **createManagedCredential**
> ManagedCredential createManagedCredential(body)

Create Managed Credential

Creates a Managed Credential. A Managed Credential is stored securely to allow Linode special forces to access your Managed Services and resolve issues. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val body : kotlin.Any =  // kotlin.Any | Information about the Credential to create.

try {
    val result : ManagedCredential = apiInstance.createManagedCredential(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#createManagedCredential")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#createManagedCredential")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Information about the Credential to create. | [optional]


### Return type

[**ManagedCredential**](ManagedCredential.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createManagedService"></a>
# **createManagedService**
> ManagedService createManagedService(body)

Create Managed Service

Creates a Managed Service. Linode Managed will being monitoring this service and reporting and attempting to resolve any Issues. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val body : kotlin.Any =  // kotlin.Any | Information about the service to monitor.

try {
    val result : ManagedService = apiInstance.createManagedService(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#createManagedService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#createManagedService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Information about the service to monitor. | [optional]


### Return type

[**ManagedService**](ManagedService.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteManagedContact"></a>
# **deleteManagedContact**
> kotlin.Any deleteManagedContact(contactId)

Delete Managed Contact

Deletes a Managed Contact. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val contactId : kotlin.Int = 56 // kotlin.Int | The ID of the contact to access.

try {
    val result : kotlin.Any = apiInstance.deleteManagedContact(contactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#deleteManagedContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#deleteManagedContact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | [**kotlin.Int**](.md)| The ID of the contact to access. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteManagedCredential"></a>
# **deleteManagedCredential**
> kotlin.Any deleteManagedCredential(credentialId)

Delete Managed Credential

Deletes a Managed Credential.  Linode special forces will no longer have access to this Credential when attempting to resolve issues. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val credentialId : kotlin.Int = 56 // kotlin.Int | The ID of the Credential to access.

try {
    val result : kotlin.Any = apiInstance.deleteManagedCredential(credentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#deleteManagedCredential")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#deleteManagedCredential")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentialId** | [**kotlin.Int**](.md)| The ID of the Credential to access. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteManagedService"></a>
# **deleteManagedService**
> kotlin.Any deleteManagedService(serviceId)

Delete Managed Service

Deletes a Managed Service.  This service will no longer be monitored by Linode Managed. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val serviceId : kotlin.Int = 56 // kotlin.Int | The ID of the Managed Service to access.

try {
    val result : kotlin.Any = apiInstance.deleteManagedService(serviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#deleteManagedService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#deleteManagedService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | [**kotlin.Int**](.md)| The ID of the Managed Service to access. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="disableManagedService"></a>
# **disableManagedService**
> ManagedService disableManagedService(serviceId)

Disable Managed Service

Temporarily disables monitoring of a Managed Service. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val serviceId : kotlin.Int = 56 // kotlin.Int | The ID of the Managed Service to disable.

try {
    val result : ManagedService = apiInstance.disableManagedService(serviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#disableManagedService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#disableManagedService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | [**kotlin.Int**](.md)| The ID of the Managed Service to disable. |


### Return type

[**ManagedService**](ManagedService.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="enableManagedService"></a>
# **enableManagedService**
> ManagedService enableManagedService(serviceId)

Enable Managed Service

Enables monitoring of a Managed Service. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val serviceId : kotlin.Int = 56 // kotlin.Int | The ID of the Managed Service to enable.

try {
    val result : ManagedService = apiInstance.enableManagedService(serviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#enableManagedService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#enableManagedService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | [**kotlin.Int**](.md)| The ID of the Managed Service to enable. |


### Return type

[**ManagedService**](ManagedService.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedContact"></a>
# **getManagedContact**
> ManagedContact getManagedContact(contactId)

View Managed Contact

Returns a single Managed Contact. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val contactId : kotlin.Int = 56 // kotlin.Int | The ID of the contact to access.

try {
    val result : ManagedContact = apiInstance.getManagedContact(contactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedContact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | [**kotlin.Int**](.md)| The ID of the contact to access. |


### Return type

[**ManagedContact**](ManagedContact.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedContacts"></a>
# **getManagedContacts**
> InlineResponse20021 getManagedContacts(page, pageSize)

List Managed Contacts

Returns a paginated list of Managed Contacts on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20021 = apiInstance.getManagedContacts(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedCredential"></a>
# **getManagedCredential**
> ManagedCredential getManagedCredential(credentialId)

View Managed Credential

Returns a single Managed Credential. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val credentialId : kotlin.Int = 56 // kotlin.Int | The ID of the Credential to access.

try {
    val result : ManagedCredential = apiInstance.getManagedCredential(credentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedCredential")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedCredential")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentialId** | [**kotlin.Int**](.md)| The ID of the Credential to access. |


### Return type

[**ManagedCredential**](ManagedCredential.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedCredentials"></a>
# **getManagedCredentials**
> InlineResponse20022 getManagedCredentials(page, pageSize)

List Managed Credentials

Returns a paginated list of Managed Credentials on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20022 = apiInstance.getManagedCredentials(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedCredentials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedCredentials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedIssue"></a>
# **getManagedIssue**
> ManagedIssue getManagedIssue(issueId)

View Managed Issue

Returns a single Issue that is impacting or did impact one of your Managed Services. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val issueId : kotlin.Int = 56 // kotlin.Int | The Issue to look up.

try {
    val result : ManagedIssue = apiInstance.getManagedIssue(issueId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueId** | [**kotlin.Int**](.md)| The Issue to look up. |


### Return type

[**ManagedIssue**](ManagedIssue.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedIssues"></a>
# **getManagedIssues**
> InlineResponse20023 getManagedIssues(page, pageSize)

List Managed Issues

Returns a paginated list of recent and ongoing issues detected on your Managed Services. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20023 = apiInstance.getManagedIssues(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedIssues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedIssues")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedLinodeSetting"></a>
# **getManagedLinodeSetting**
> ManagedLinodeSettings getManagedLinodeSetting(linodeId)

View Linode&#x27;s Managed Settings

Returns a single Linode&#x27;s Managed settings. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The Linode ID whose settings we are accessing.

try {
    val result : ManagedLinodeSettings = apiInstance.getManagedLinodeSetting(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedLinodeSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedLinodeSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The Linode ID whose settings we are accessing. |


### Return type

[**ManagedLinodeSettings**](ManagedLinodeSettings.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedLinodeSettings"></a>
# **getManagedLinodeSettings**
> InlineResponse20024 getManagedLinodeSettings(page, pageSize)

List Managed Linode Settings

Returns a paginated list of Managed Settings for your Linodes. There will be one entry per Linode on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20024 = apiInstance.getManagedLinodeSettings(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedLinodeSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedLinodeSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedService"></a>
# **getManagedService**
> ManagedService getManagedService(serviceId)

View Managed Service

Returns information about a single Managed Service on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val serviceId : kotlin.Int = 56 // kotlin.Int | The ID of the Managed Service to access.

try {
    val result : ManagedService = apiInstance.getManagedService(serviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | [**kotlin.Int**](.md)| The ID of the Managed Service to access. |


### Return type

[**ManagedService**](ManagedService.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getManagedServices"></a>
# **getManagedServices**
> InlineResponse20025 getManagedServices()

List Managed Services

Returns a paginated list of Managed Services on your Account. These are the services Linode Managed is monitoring and will report and attempt to resolve issues with. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

try {
    val result : InlineResponse20025 = apiInstance.getManagedServices()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#getManagedServices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#getManagedServices")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="updateManagedContact"></a>
# **updateManagedContact**
> ManagedContact updateManagedContact(body, contactId)

Update Managed Contact

Updates information about a Managed Contact. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val body : ManagedContact =  // ManagedContact | The fields to update.

val contactId : kotlin.Int = 56 // kotlin.Int | The ID of the contact to access.

try {
    val result : ManagedContact = apiInstance.updateManagedContact(body, contactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#updateManagedContact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#updateManagedContact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManagedContact**](ManagedContact.md)| The fields to update. |
 **contactId** | [**kotlin.Int**](.md)| The ID of the contact to access. |


### Return type

[**ManagedContact**](ManagedContact.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateManagedCredential"></a>
# **updateManagedCredential**
> ManagedCredential updateManagedCredential(body, credentialId)

Update Managed Credential

Updates information about a Managed Credential. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val body : ManagedCredential =  // ManagedCredential | The fields to update.

val credentialId : kotlin.Int = 56 // kotlin.Int | The ID of the Credential to access.

try {
    val result : ManagedCredential = apiInstance.updateManagedCredential(body, credentialId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#updateManagedCredential")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#updateManagedCredential")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManagedCredential**](ManagedCredential.md)| The fields to update. |
 **credentialId** | [**kotlin.Int**](.md)| The ID of the Credential to access. |


### Return type

[**ManagedCredential**](ManagedCredential.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateManagedLinodeSetting"></a>
# **updateManagedLinodeSetting**
> ManagedLinodeSettings updateManagedLinodeSetting(body, linodeId)

Update Linode&#x27;s Managed Settings

Updates a single Linode&#x27;s Managed settings. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val body : ManagedLinodeSettings =  // ManagedLinodeSettings | The settings to update.

val linodeId : kotlin.Int = 56 // kotlin.Int | The Linode ID whose settings we are accessing.

try {
    val result : ManagedLinodeSettings = apiInstance.updateManagedLinodeSetting(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#updateManagedLinodeSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#updateManagedLinodeSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManagedLinodeSettings**](ManagedLinodeSettings.md)| The settings to update. |
 **linodeId** | [**kotlin.Int**](.md)| The Linode ID whose settings we are accessing. |


### Return type

[**ManagedLinodeSettings**](ManagedLinodeSettings.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateManagedService"></a>
# **updateManagedService**
> ManagedService updateManagedService(body, serviceId)

Update Managed Service

Updates information about a Managed Service. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ManagedApi()

val body : ManagedService =  // ManagedService | The fields to update.

val serviceId : kotlin.Int = 56 // kotlin.Int | The ID of the Managed Service to access.

try {
    val result : ManagedService = apiInstance.updateManagedService(body, serviceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ManagedApi#updateManagedService")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ManagedApi#updateManagedService")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManagedService**](ManagedService.md)| The fields to update. |
 **serviceId** | [**kotlin.Int**](.md)| The ID of the Managed Service to access. |


### Return type

[**ManagedService**](ManagedService.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



