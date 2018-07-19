# DomainsApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomain**](DomainsApi.md#createDomain) | **POST** /domains | Create Domain
[**createDomainRecord**](DomainsApi.md#createDomainRecord) | **POST** /domains/{domainId}/records | Create Domain Record
[**deleteDomain**](DomainsApi.md#deleteDomain) | **DELETE** /domains/{domainId} | Delete Domain
[**deleteDomainRecord**](DomainsApi.md#deleteDomainRecord) | **DELETE** /domains/{domainId}/records/{recordId} | Delete Domain Record
[**getDomain**](DomainsApi.md#getDomain) | **GET** /domains/{domainId} | View Domain
[**getDomainRecord**](DomainsApi.md#getDomainRecord) | **GET** /domains/{domainId}/records/{recordId} | View Domain Record
[**getDomainRecords**](DomainsApi.md#getDomainRecords) | **GET** /domains/{domainId}/records | List Domain Records
[**getDomains**](DomainsApi.md#getDomains) | **GET** /domains | List Domains
[**importDomain**](DomainsApi.md#importDomain) | **POST** /domains/import | Import a Domain Zone
[**updateDomain**](DomainsApi.md#updateDomain) | **PUT** /domains/{domainId} | Update Domain
[**updateDomainRecord**](DomainsApi.md#updateDomainRecord) | **PUT** /domains/{domainId}/records/{recordId} | Update Domain Record




<a name="createDomain"></a>
# **createDomain**
> Domain createDomain(body)

Create Domain

Adds a new Domain to Linode&#x27;s DNS Manager. Linode is not a registrar, and you must own the domain before adding it here. Be sure to point your registrar to Linode&#x27;s nameservers so that the records hosted here are used. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val body : Domain =  // Domain | Information about the domain you are registering.

try {
    val result : Domain = apiInstance.createDomain(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#createDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#createDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Domain**](Domain.md)| Information about the domain you are registering. |


### Return type

[**Domain**](Domain.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createDomainRecord"></a>
# **createDomainRecord**
> DomainRecord createDomainRecord(body, domainId)

Create Domain Record

Adds a new Domain Record to the zonefile this Domain represents. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val body : kotlin.Any =  // kotlin.Any | Information about the new Record to add.


val domainId : kotlin.Int = 56 // kotlin.Int | The ID of the Domain we are accessing Records for.

try {
    val result : DomainRecord = apiInstance.createDomainRecord(body, domainId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#createDomainRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#createDomainRecord")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Information about the new Record to add.
 |
 **domainId** | [**kotlin.Int**](.md)| The ID of the Domain we are accessing Records for. |


### Return type

[**DomainRecord**](DomainRecord.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteDomain"></a>
# **deleteDomain**
> kotlin.Any deleteDomain(domainId)

Delete Domain

Deletes a Domain from Linode&#x27;s DNS Manager. The Domain will be removed from Linode&#x27;s nameservers shortly after this operation completes. This also deletes all associated Domain Records. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val domainId : kotlin.Int = 56 // kotlin.Int | The ID of the Domain to access.

try {
    val result : kotlin.Any = apiInstance.deleteDomain(domainId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#deleteDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#deleteDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | [**kotlin.Int**](.md)| The ID of the Domain to access. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteDomainRecord"></a>
# **deleteDomainRecord**
> kotlin.Any deleteDomainRecord(domainId, recordId)

Delete Domain Record

Deletes a Record on this Domain. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val domainId : kotlin.Int = 56 // kotlin.Int | The ID of the Domain whose Record you are accessing.

val recordId : kotlin.Int = 56 // kotlin.Int | The ID of the Record you are accessing.

try {
    val result : kotlin.Any = apiInstance.deleteDomainRecord(domainId, recordId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#deleteDomainRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#deleteDomainRecord")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | [**kotlin.Int**](.md)| The ID of the Domain whose Record you are accessing. |
 **recordId** | [**kotlin.Int**](.md)| The ID of the Record you are accessing. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getDomain"></a>
# **getDomain**
> Domain getDomain(domainId)

View Domain

This is a single Domain that you have registered in Linode&#x27;s DNS Manager. Linode is not a registrar, and in order for this Domain record to work you must own the domain and point your registrar at Linode&#x27;s nameservers. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val domainId : kotlin.Int = 56 // kotlin.Int | The ID of the Domain to access.

try {
    val result : Domain = apiInstance.getDomain(domainId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#getDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#getDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | [**kotlin.Int**](.md)| The ID of the Domain to access. |


### Return type

[**Domain**](Domain.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getDomainRecord"></a>
# **getDomainRecord**
> DomainRecord getDomainRecord(domainId, recordId)

View Domain Record

View a single Record on this Domain. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val domainId : kotlin.Int = 56 // kotlin.Int | The ID of the Domain whose Record you are accessing.

val recordId : kotlin.Int = 56 // kotlin.Int | The ID of the Record you are accessing.

try {
    val result : DomainRecord = apiInstance.getDomainRecord(domainId, recordId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#getDomainRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#getDomainRecord")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | [**kotlin.Int**](.md)| The ID of the Domain whose Record you are accessing. |
 **recordId** | [**kotlin.Int**](.md)| The ID of the Record you are accessing. |


### Return type

[**DomainRecord**](DomainRecord.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getDomainRecords"></a>
# **getDomainRecords**
> InlineResponse2009 getDomainRecords(domainId, page, pageSize)

List Domain Records

Returns a paginated list of Records configured on a Domain in Linode&#x27;s DNS Manager. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val domainId : kotlin.Int = 56 // kotlin.Int | The ID of the Domain we are accessing Records for.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse2009 = apiInstance.getDomainRecords(domainId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#getDomainRecords")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#getDomainRecords")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | [**kotlin.Int**](.md)| The ID of the Domain we are accessing Records for. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getDomains"></a>
# **getDomains**
> InlineResponse2008 getDomains(page, pageSize)

List Domains

This is a collection of Domains that you have registered in Linode&#x27;s DNS Manager.  Linode is not a registrar, and in order for these to work you must own the domains and point your registrar at Linode&#x27;s nameservers. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse2008 = apiInstance.getDomains(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#getDomains")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#getDomains")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="importDomain"></a>
# **importDomain**
> Domain importDomain(body)

Import a Domain Zone

Imports a domain zone from a remote nameserver. Your nameserver must allow zone transfers (AXFR) from the following IPs:   - 96.126.114.97   - 96.126.114.98   - 2600:3c00::5e   - 2600:3c00::5f 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val body : kotlin.Any =  // kotlin.Any | Information about the Domain to import.

try {
    val result : Domain = apiInstance.importDomain(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#importDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#importDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Information about the Domain to import. | [optional]


### Return type

[**Domain**](Domain.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateDomain"></a>
# **updateDomain**
> Domain updateDomain(body, domainId)

Update Domain

Update information about a Domain in Linode&#x27;s DNS Manager. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val body : Domain =  // Domain | The Domain information to update.

val domainId : kotlin.Int = 56 // kotlin.Int | The ID of the Domain to access.

try {
    val result : Domain = apiInstance.updateDomain(body, domainId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#updateDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#updateDomain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Domain**](Domain.md)| The Domain information to update. |
 **domainId** | [**kotlin.Int**](.md)| The ID of the Domain to access. |


### Return type

[**Domain**](Domain.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateDomainRecord"></a>
# **updateDomainRecord**
> DomainRecord updateDomainRecord(body, domainId, recordId)

Update Domain Record

Updates a single Record on this Domain. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = DomainsApi()

val body : DomainRecord =  // DomainRecord | The values to change.

val domainId : kotlin.Int = 56 // kotlin.Int | The ID of the Domain whose Record you are accessing.

val recordId : kotlin.Int = 56 // kotlin.Int | The ID of the Record you are accessing.

try {
    val result : DomainRecord = apiInstance.updateDomainRecord(body, domainId, recordId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainsApi#updateDomainRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainsApi#updateDomainRecord")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DomainRecord**](DomainRecord.md)| The values to change. |
 **domainId** | [**kotlin.Int**](.md)| The ID of the Domain whose Record you are accessing. |
 **recordId** | [**kotlin.Int**](.md)| The ID of the Record you are accessing. |


### Return type

[**DomainRecord**](DomainRecord.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



