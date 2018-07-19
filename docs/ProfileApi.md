# ProfileApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPersonalAccessToken**](ProfileApi.md#createPersonalAccessToken) | **POST** /profile/tokens | Create Personal Access Token
[**deletePersonalAccessToken**](ProfileApi.md#deletePersonalAccessToken) | **DELETE** /profile/tokens/{tokenId} | Revoke Personal Access Token
[**deleteProfileApp**](ProfileApi.md#deleteProfileApp) | **DELETE** /profile/apps/{appId} | Revoke App Access
[**getPersonalAccessToken**](ProfileApi.md#getPersonalAccessToken) | **GET** /profile/tokens/{tokenId} | View Personal Access Token
[**getPersonalAccessTokens**](ProfileApi.md#getPersonalAccessTokens) | **GET** /profile/tokens | List Personal Access Tokens
[**getProfile**](ProfileApi.md#getProfile) | **GET** /profile | View Profile
[**getProfileApp**](ProfileApi.md#getProfileApp) | **GET** /profile/apps/{appId} | View Authorized App
[**getProfileApps**](ProfileApi.md#getProfileApps) | **GET** /profile/apps | List Authorized Apps
[**getProfileGrants**](ProfileApi.md#getProfileGrants) | **GET** /profile/grants | List Grants
[**getTrustedComputer**](ProfileApi.md#getTrustedComputer) | **GET** /profile/tfa-trusted-computers/{trustedComputerId} | View Trusted Computer
[**getTrustedComputers**](ProfileApi.md#getTrustedComputers) | **GET** /profile/tfa-trusted-computers | List Trusted Computers
[**tfaConfirm**](ProfileApi.md#tfaConfirm) | **POST** /profile/tfa-enable-confirm | Confirm/Enable Two Factor Authentication
[**tfaDisable**](ProfileApi.md#tfaDisable) | **POST** /profile/tfa-disable | Disable Two Factor Authentication
[**tfaEnable**](ProfileApi.md#tfaEnable) | **POST** /profile/tfa-enable | Create Two Factor Secret
[**untrustTrustedComputer**](ProfileApi.md#untrustTrustedComputer) | **POST** /profile/tfa-trusted-computers/{trustedComputerId}/untrust | Untrust Trusted Computer
[**updatePersonalAccessToken**](ProfileApi.md#updatePersonalAccessToken) | **PUT** /profile/tokens/{tokenId} | Update Personal Access Token
[**updateProfile**](ProfileApi.md#updateProfile) | **PUT** /profile | Update Profile




<a name="createPersonalAccessToken"></a>
# **createPersonalAccessToken**
> PersonalAccessToken createPersonalAccessToken(body)

Create Personal Access Token

Creates a Personal Access Token for your User. The raw token will be returned in the response, but will never be returned again afterward so be sure to take note of it. You may create a token with _at most_ the scopes of your current token. The created token will be able to access your Account until the given expiry, or until it is revoked. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val body : Body18 =  // Body18 | Information about the requested token.

try {
    val result : PersonalAccessToken = apiInstance.createPersonalAccessToken(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#createPersonalAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#createPersonalAccessToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body18**](Body18.md)| Information about the requested token. |


### Return type

[**PersonalAccessToken**](PersonalAccessToken.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deletePersonalAccessToken"></a>
# **deletePersonalAccessToken**
> kotlin.Any deletePersonalAccessToken(tokenId)

Revoke Personal Access Token

Revokes a Personal Access Token. The token will be invalidated immediately, and requests using that token will fail with a 401. It is possible to revoke access to the token making the request to revoke a token, but keep in mind that doing so could lose you access to the api and require you to create a new token through some other means. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val tokenId : kotlin.Int = 56 // kotlin.Int | The ID of the token to access.

try {
    val result : kotlin.Any = apiInstance.deletePersonalAccessToken(tokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#deletePersonalAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#deletePersonalAccessToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**kotlin.Int**](.md)| The ID of the token to access. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteProfileApp"></a>
# **deleteProfileApp**
> kotlin.Any deleteProfileApp(appId)

Revoke App Access

Expires this app token. This token may no longer be used to access your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val appId : kotlin.Int = 56 // kotlin.Int | The authorized app ID to manage.

try {
    val result : kotlin.Any = apiInstance.deleteProfileApp(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#deleteProfileApp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#deleteProfileApp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**kotlin.Int**](.md)| The authorized app ID to manage. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getPersonalAccessToken"></a>
# **getPersonalAccessToken**
> PersonalAccessToken getPersonalAccessToken(tokenId)

View Personal Access Token

Returns a single Personal Access Token. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val tokenId : kotlin.Int = 56 // kotlin.Int | The ID of the token to access.

try {
    val result : PersonalAccessToken = apiInstance.getPersonalAccessToken(tokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#getPersonalAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#getPersonalAccessToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | [**kotlin.Int**](.md)| The ID of the token to access. |


### Return type

[**PersonalAccessToken**](PersonalAccessToken.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getPersonalAccessTokens"></a>
# **getPersonalAccessTokens**
> InlineResponse20034 getPersonalAccessTokens()

List Personal Access Tokens

Returns a paginated list of Personal Access Tokens currently active for your User. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

try {
    val result : InlineResponse20034 = apiInstance.getPersonalAccessTokens()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#getPersonalAccessTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#getPersonalAccessTokens")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getProfile"></a>
# **getProfile**
> Profile getProfile()

View Profile

Returns information about the current User. This can be used to see who is acting in applications where more than one token is managed. For example, in third-party OAuth applications.  This endpoint is always accessible, no matter what OAuth scopes the acting token has. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

try {
    val result : Profile = apiInstance.getProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#getProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#getProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**Profile**](Profile.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getProfileApp"></a>
# **getProfileApp**
> AuthorizedApp getProfileApp(appId)

View Authorized App

Returns information about a single app you&#x27;ve authorized to access your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val appId : kotlin.Int = 56 // kotlin.Int | The authorized app ID to manage.

try {
    val result : AuthorizedApp = apiInstance.getProfileApp(appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#getProfileApp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#getProfileApp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**kotlin.Int**](.md)| The authorized app ID to manage. |


### Return type

[**AuthorizedApp**](AuthorizedApp.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getProfileApps"></a>
# **getProfileApps**
> InlineResponse20032 getProfileApps(page, pageSize)

List Authorized Apps

This is a collection of OAuth apps that you&#x27;ve given access to your Account, and includes the level of access granted. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20032 = apiInstance.getProfileApps(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#getProfileApps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#getProfileApps")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getProfileGrants"></a>
# **getProfileGrants**
> GrantsResponse getProfileGrants()

List Grants

This returns a GrantsResponse describing what the acting User has been granted access to.  For unrestricted users, this will return a  204 and no body because unrestricted users have access to everything without grants.  This will not return information about entities you do not have access to.  This endpoint is useful when writing third-party OAuth applications to see what options you should present to the acting User.  For example, if they do not have &#x60;global.add_linodes&#x60;, you might not display a button to deploy a new Linode.  Any client may access this endpoint; no OAuth scopes are required. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

try {
    val result : GrantsResponse = apiInstance.getProfileGrants()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#getProfileGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#getProfileGrants")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**GrantsResponse**](GrantsResponse.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getTrustedComputer"></a>
# **getTrustedComputer**
> TFATrustedComputer getTrustedComputer(trustedComputerId)

View Trusted Computer

View a single Trusted Computer by ID. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val trustedComputerId : kotlin.String = trustedComputerId_example // kotlin.String | ID of the Trusted Computer to look up.

try {
    val result : TFATrustedComputer = apiInstance.getTrustedComputer(trustedComputerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#getTrustedComputer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#getTrustedComputer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trustedComputerId** | [**kotlin.String**](.md)| ID of the Trusted Computer to look up. |


### Return type

[**TFATrustedComputer**](TFATrustedComputer.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getTrustedComputers"></a>
# **getTrustedComputers**
> InlineResponse20033 getTrustedComputers()

List Trusted Computers

Returns a paginated list of Trusted Computers that can skip two-factor authentication. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

try {
    val result : InlineResponse20033 = apiInstance.getTrustedComputers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#getTrustedComputers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#getTrustedComputers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="tfaConfirm"></a>
# **tfaConfirm**
> kotlin.Any tfaConfirm(body)

Confirm/Enable Two Factor Authentication

Confirms that you can successfully generate Two Factor codes and enables TFA on your Account. Once this is complete, login attempts from untrusted computers will be required to provide a Two Factor code before they are successful. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val body : Body17 =  // Body17 | The Two Factor code you generated with your Two Factor secret.

try {
    val result : kotlin.Any = apiInstance.tfaConfirm(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#tfaConfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#tfaConfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body17**](Body17.md)| The Two Factor code you generated with your Two Factor secret. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="tfaDisable"></a>
# **tfaDisable**
> kotlin.Any tfaDisable()

Disable Two Factor Authentication

Disables Two Factor Authentication for your User. Once successful, login attempts from untrusted computers will only require a password before being successful. This is less secure, and is discouraged. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

try {
    val result : kotlin.Any = apiInstance.tfaDisable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#tfaDisable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#tfaDisable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="tfaEnable"></a>
# **tfaEnable**
> kotlin.Any tfaEnable()

Create Two Factor Secret

Generates a Two Factor secret for your User. TFA will not be enabled until you have successfully confirmed the code you were given with [tfa-enable-confirm](/#operation/tfaConfirm) (see below). Once enabled, logins from untrusted computers will be required to provide a TFA code before they are successful. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

try {
    val result : kotlin.Any = apiInstance.tfaEnable()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#tfaEnable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#tfaEnable")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="untrustTrustedComputer"></a>
# **untrustTrustedComputer**
> kotlin.Any untrustTrustedComputer(trustedComputerId)

Untrust Trusted Computer

Revokes two-factor authentication for a Trusted Computer associated with your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val trustedComputerId : kotlin.String = trustedComputerId_example // kotlin.String | ID of the Trusted Computer to look up.

try {
    val result : kotlin.Any = apiInstance.untrustTrustedComputer(trustedComputerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#untrustTrustedComputer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#untrustTrustedComputer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trustedComputerId** | [**kotlin.String**](.md)| ID of the Trusted Computer to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="updatePersonalAccessToken"></a>
# **updatePersonalAccessToken**
> PersonalAccessToken updatePersonalAccessToken(body, tokenId)

Update Personal Access Token

Updates a Personal Access Token. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val body : PersonalAccessToken =  // PersonalAccessToken | The fields to update.

val tokenId : kotlin.Int = 56 // kotlin.Int | The ID of the token to access.

try {
    val result : PersonalAccessToken = apiInstance.updatePersonalAccessToken(body, tokenId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#updatePersonalAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#updatePersonalAccessToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonalAccessToken**](PersonalAccessToken.md)| The fields to update. |
 **tokenId** | [**kotlin.Int**](.md)| The ID of the token to access. |


### Return type

[**PersonalAccessToken**](PersonalAccessToken.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateProfile"></a>
# **updateProfile**
> Profile updateProfile(body)

Update Profile

Update information in your Profile.  This endpoint requires the \&quot;account:read_write\&quot; OAuth Scope. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = ProfileApi()

val body : Profile =  // Profile | The fields to update.

try {
    val result : Profile = apiInstance.updateProfile(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#updateProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#updateProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Profile**](Profile.md)| The fields to update. |


### Return type

[**Profile**](Profile.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



