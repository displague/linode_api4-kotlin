# AccountApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClient**](AccountApi.md#createClient) | **POST** /account/oauth-clients | Create OAuth Client
[**createCreditCard**](AccountApi.md#createCreditCard) | **POST** /account/credit-card | Add/Edit Credit Card
[**createPayPalPayment**](AccountApi.md#createPayPalPayment) | **POST** /account/payments/paypal | Stage PayPal Payment
[**createPayment**](AccountApi.md#createPayment) | **POST** /account/payments | Make Payment
[**createUser**](AccountApi.md#createUser) | **POST** /account/users | Create User
[**deleteClient**](AccountApi.md#deleteClient) | **DELETE** /account/oauth-clients/{clientId} | Delete OAuth Client
[**deleteUser**](AccountApi.md#deleteUser) | **DELETE** /account/users/{username} | Delete User
[**eventRead**](AccountApi.md#eventRead) | **POST** /account/events/{eventId}/read | Mark Event as Read
[**eventSeen**](AccountApi.md#eventSeen) | **POST** /account/events/{eventId}/seen | Mark Event as Seen
[**executePayPalPayment**](AccountApi.md#executePayPalPayment) | **POST** /account/payment/paypal/execute | Execute Staged/Approved PayPal Payment
[**getAccount**](AccountApi.md#getAccount) | **GET** /account | View Account
[**getAccountSettings**](AccountApi.md#getAccountSettings) | **GET** /account/settings | View Account Settings
[**getClient**](AccountApi.md#getClient) | **GET** /account/oauth-clients/{clientId} | View OAuth Client
[**getClientThumbnail**](AccountApi.md#getClientThumbnail) | **GET** /account/oauth-clients/{clientId}/thumbnail | View OAuth Client Thumbnail
[**getClients**](AccountApi.md#getClients) | **GET** /account/oauth-clients | List OAuth Clients
[**getEvent**](AccountApi.md#getEvent) | **GET** /account/events/{eventId} | View Event
[**getEvents**](AccountApi.md#getEvents) | **GET** /account/events | List Events
[**getInvoice**](AccountApi.md#getInvoice) | **GET** /account/invoices/{invoiceId} | View Invoice
[**getInvoiceItems**](AccountApi.md#getInvoiceItems) | **GET** /account/invoices/{invoiceId}/items | List Invoice Items
[**getInvoices**](AccountApi.md#getInvoices) | **GET** /account/invoices | List Invoices
[**getNotifications**](AccountApi.md#getNotifications) | **GET** /account/notifications | List Notifications
[**getPayment**](AccountApi.md#getPayment) | **GET** /account/payments/{paymentId} | View Payment
[**getPayments**](AccountApi.md#getPayments) | **GET** /account/payments | List Payments
[**getTransfer**](AccountApi.md#getTransfer) | **GET** /account/transfer | View Network Utilization
[**getUser**](AccountApi.md#getUser) | **GET** /account/users/{username} | View User
[**getUserGrants**](AccountApi.md#getUserGrants) | **GET** /account/users/{username}/grants | View User&#x27;s grants
[**getUsers**](AccountApi.md#getUsers) | **GET** /account/users | List Users
[**resetClientSecret**](AccountApi.md#resetClientSecret) | **POST** /account/oauth-clients/{clientId}/reset-secret | Reset OAuth Client Secret
[**setClientThumbnail**](AccountApi.md#setClientThumbnail) | **PUT** /account/oauth-clients/{clientId}/thumbnail | Update OAuth Client Thumbnail
[**updateAccount**](AccountApi.md#updateAccount) | **PUT** /account | Update Account
[**updateAccountSettings**](AccountApi.md#updateAccountSettings) | **PUT** /account/settings | Update Account Settings
[**updateClient**](AccountApi.md#updateClient) | **PUT** /account/oauth-clients/{clientId} | Update OAuth Client
[**updateUser**](AccountApi.md#updateUser) | **PUT** /account/users/{username} | Update User
[**updateUserGrants**](AccountApi.md#updateUserGrants) | **PUT** /account/users/{username}/grants | Update User&#x27;s grants




<a name="createClient"></a>
# **createClient**
> OAuthClient createClient(body)

Create OAuth Client

Creates an OAuth Client, which can be used to allow users (using their Linode account) to log in to your own application, and optionally grant your application some amount of access to their Linodes or other entities. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : kotlin.Any =  // kotlin.Any | Information about the OAuth Client to create.

try {
    val result : OAuthClient = apiInstance.createClient(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Information about the OAuth Client to create. | [optional]


### Return type

[**OAuthClient**](OAuthClient.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createCreditCard"></a>
# **createCreditCard**
> kotlin.Any createCreditCard(body)

Add/Edit Credit Card

Adds/edit credit card information to your Account. Only one credit card can be associated with your Account, so using this endpoint will overwrite your currently active card information with the new credit card. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : CreditCard =  // CreditCard | Update the credit card information associated with your Account.

try {
    val result : kotlin.Any = apiInstance.createCreditCard(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createCreditCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createCreditCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreditCard**](CreditCard.md)| Update the credit card information associated with your Account. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createPayPalPayment"></a>
# **createPayPalPayment**
> InlineResponse2006 createPayPalPayment(body)

Stage PayPal Payment

This begins the process of submitting a Payment via PayPal. After calling this endpoint, you must take the resulting &#x60;payment_id&#x60; along with the &#x60;payer_id&#x60; from your PayPal account and [POST /account/payments/paypal-execute](/#operation/executePayPalPayment) to complete the Payment. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : PayPal =  // PayPal | The amount of the Payment to submit via PayPal.


try {
    val result : InlineResponse2006 = apiInstance.createPayPalPayment(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createPayPalPayment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createPayPalPayment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PayPal**](PayPal.md)| The amount of the Payment to submit via PayPal.
 |


### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createPayment"></a>
# **createPayment**
> Payment createPayment(body)

Make Payment

Makes a Payment to your Account via credit card. This will charge your credit card the requested amount. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : PaymentRequest =  // PaymentRequest | Information about the Payment you are making.

try {
    val result : Payment = apiInstance.createPayment(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createPayment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createPayment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PaymentRequest**](PaymentRequest.md)| Information about the Payment you are making. |


### Return type

[**Payment**](Payment.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createUser"></a>
# **createUser**
> User createUser(body)

Create User

Creates a User on your Account. Once created, the User will be able to log in and access portions of your Account. Access is determined by whether or not they are restricted, and what grants they have been given. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : kotlin.Any =  // kotlin.Any | Information about the User to create.

try {
    val result : User = apiInstance.createUser(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#createUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Information about the User to create. | [optional]


### Return type

[**User**](User.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteClient"></a>
# **deleteClient**
> kotlin.Any deleteClient(clientId)

Delete OAuth Client

Deletes an OAuth Client registered with Linode. The Client ID and Client secret will no longer be accepted by https://login.linode.com, and all tokens issued to this client will be invalidated (meaning that if your application was using a token, it will no longer work). 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val clientId : kotlin.String = clientId_example // kotlin.String | The OAuth Client ID to look up.

try {
    val result : kotlin.Any = apiInstance.deleteClient(clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#deleteClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#deleteClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**kotlin.String**](.md)| The OAuth Client ID to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteUser"></a>
# **deleteUser**
> kotlin.Any deleteUser(username)

Delete User

Deletes a User. The deleted User will be immediately logged out and may no longer log in or perform any actions. All of the User&#x27;s Grants will be removed. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val username : kotlin.String = username_example // kotlin.String | The username to look up.

try {
    val result : kotlin.Any = apiInstance.deleteUser(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#deleteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**kotlin.String**](.md)| The username to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="eventRead"></a>
# **eventRead**
> kotlin.Any eventRead(eventId)

Mark Event as Read

Marks a single Event as read.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val eventId : kotlin.Int = 56 // kotlin.Int | The ID of the Event to designate as read.

try {
    val result : kotlin.Any = apiInstance.eventRead(eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#eventRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#eventRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | [**kotlin.Int**](.md)| The ID of the Event to designate as read. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="eventSeen"></a>
# **eventSeen**
> kotlin.Any eventSeen(eventId)

Mark Event as Seen

Marks all Events up to and including this Event by ID as seen. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val eventId : kotlin.Int = 56 // kotlin.Int | The ID of the Event to designate as seen.

try {
    val result : kotlin.Any = apiInstance.eventSeen(eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#eventSeen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#eventSeen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | [**kotlin.Int**](.md)| The ID of the Event to designate as seen. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="executePayPalPayment"></a>
# **executePayPalPayment**
> kotlin.Any executePayPalPayment(body)

Execute Staged/Approved PayPal Payment

Given a PaymentID and PayerID - as generated by PayPal during the transaction authorization process - this endpoint executes the Payment to capture the funds and credit your Linode Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : PayPalExecute =  // PayPalExecute | The details of the Payment to execute.


try {
    val result : kotlin.Any = apiInstance.executePayPalPayment(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#executePayPalPayment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#executePayPalPayment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PayPalExecute**](PayPalExecute.md)| The details of the Payment to execute.
 |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="getAccount"></a>
# **getAccount**
> Account getAccount()

View Account

Returns the contact and billing information related to your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

try {
    val result : Account = apiInstance.getAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getAccount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**Account**](Account.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getAccountSettings"></a>
# **getAccountSettings**
> AccountSettings getAccountSettings()

View Account Settings

Returns information related to your Account settings: Managed service subscription, Longview subscription, and network helper. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

try {
    val result : AccountSettings = apiInstance.getAccountSettings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getAccountSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getAccountSettings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**AccountSettings**](AccountSettings.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getClient"></a>
# **getClient**
> OAuthClient getClient(clientId)

View OAuth Client

Returns information about a single OAuth client. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val clientId : kotlin.String = clientId_example // kotlin.String | The OAuth Client ID to look up.

try {
    val result : OAuthClient = apiInstance.getClient(clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**kotlin.String**](.md)| The OAuth Client ID to look up. |


### Return type

[**OAuthClient**](OAuthClient.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getClientThumbnail"></a>
# **getClientThumbnail**
> kotlin.Array&lt;kotlin.Byte&gt; getClientThumbnail(clientId)

View OAuth Client Thumbnail

Returns the thumbnail for this OAuth Client.  This is a publicly-viewable endpoint, and can be accessed without authentication. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val clientId : kotlin.String = clientId_example // kotlin.String | The OAuth Client ID to look up.

try {
    val result : kotlin.Array<kotlin.Byte> = apiInstance.getClientThumbnail(clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getClientThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getClientThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**kotlin.String**](.md)| The OAuth Client ID to look up. |


### Return type

[**kotlin.Array&lt;kotlin.Byte&gt;**](kotlin.Array&lt;kotlin.Byte&gt;.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getClients"></a>
# **getClients**
> InlineResponse2004 getClients(page, pageSize)

List OAuth Clients

Returns a paginated list of OAuth Clients registered to your Account.  OAuth Clients allow users to log into applications you write or host using their Linode Account, and may allow them to grant some level of access to their Linodes or other entities to your application. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse2004 = apiInstance.getClients(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getClients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getClients")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getEvent"></a>
# **getEvent**
> Event getEvent(eventId)

View Event

Returns a single Event object.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val eventId : kotlin.Int = 56 // kotlin.Int | The ID of the Event.

try {
    val result : Event = apiInstance.getEvent(eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | [**kotlin.Int**](.md)| The ID of the Event. |


### Return type

[**Event**](Event.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getEvents"></a>
# **getEvents**
> InlineResponse200 getEvents(page, pageSize)

List Events

Returns a collection of Event objects representing actions taken on your Account. The Events returned depends on your grants. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse200 = apiInstance.getEvents(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getInvoice"></a>
# **getInvoice**
> Invoice getInvoice(invoiceId)

View Invoice

Returns a single Invoice object.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val invoiceId : kotlin.Int = 56 // kotlin.Int | The ID of the Invoice.

try {
    val result : Invoice = apiInstance.getInvoice(invoiceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | [**kotlin.Int**](.md)| The ID of the Invoice. |


### Return type

[**Invoice**](Invoice.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getInvoiceItems"></a>
# **getInvoiceItems**
> InlineResponse2002 getInvoiceItems(invoiceId, page, pageSize)

List Invoice Items

Returns a paginated list of Invoice items.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val invoiceId : kotlin.Int = 56 // kotlin.Int | The ID of the Invoice.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse2002 = apiInstance.getInvoiceItems(invoiceId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getInvoiceItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getInvoiceItems")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | [**kotlin.Int**](.md)| The ID of the Invoice. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getInvoices"></a>
# **getInvoices**
> InlineResponse2001 getInvoices(page, pageSize)

List Invoices

Returns a paginated list of Invoices against your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse2001 = apiInstance.getInvoices(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getInvoices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getNotifications"></a>
# **getNotifications**
> InlineResponse2003 getNotifications()

List Notifications

Returns a collection of Notification objects representing important, often time-sensitive items related to your Account. You cannot interact directly with Notifications, and a Notification will disappear when the circumstances causing it have been resolved. For example, if you have an important Ticket open, you must respond to the Ticket to dismiss the Notification. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

try {
    val result : InlineResponse2003 = apiInstance.getNotifications()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getNotifications")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getPayment"></a>
# **getPayment**
> Payment getPayment(paymentId)

View Payment

Returns information about a specific Payment. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val paymentId : kotlin.Int = 56 // kotlin.Int | The ID of the Payment to look up.

try {
    val result : Payment = apiInstance.getPayment(paymentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getPayment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getPayment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | [**kotlin.Int**](.md)| The ID of the Payment to look up. |


### Return type

[**Payment**](Payment.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getPayments"></a>
# **getPayments**
> InlineResponse2005 getPayments(page, pageSize)

List Payments

Returns a paginated list of Payments made on this Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse2005 = apiInstance.getPayments(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getPayments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getPayments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getTransfer"></a>
# **getTransfer**
> Transfer getTransfer()

View Network Utilization

Returns a Transfer object showing your network utilization, in GB, for the current month. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

try {
    val result : Transfer = apiInstance.getTransfer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getTransfer")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**Transfer**](Transfer.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getUser"></a>
# **getUser**
> User getUser(username)

View User

Returns information about a single User on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val username : kotlin.String = username_example // kotlin.String | The username to look up.

try {
    val result : User = apiInstance.getUser(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**kotlin.String**](.md)| The username to look up. |


### Return type

[**User**](User.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getUserGrants"></a>
# **getUserGrants**
> GrantsResponse getUserGrants(username)

View User&#x27;s grants

Returns the full grants structure for this User. This includes all entities on the Account alongside what level of access this User has to each of them. Individual users may view their own grants at the [/profile/grants](/#operation/getProfileGrants) endpoint, but will not see entities that they have no access to. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val username : kotlin.String = username_example // kotlin.String | The username to look up.

try {
    val result : GrantsResponse = apiInstance.getUserGrants(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getUserGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getUserGrants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**kotlin.String**](.md)| The username to look up. |


### Return type

[**GrantsResponse**](GrantsResponse.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getUsers"></a>
# **getUsers**
> InlineResponse2007 getUsers(page, pageSize)

List Users

Returns a paginated list of Users on your Account. Users may access all or part of your Account based on their restricted status and grants.  An unrestricted User may access everything on the account, whereas restricted User may only access entities or perform actions they&#x27;ve been given specific grants to. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse2007 = apiInstance.getUsers(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#getUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#getUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="resetClientSecret"></a>
# **resetClientSecret**
> OAuthClient resetClientSecret(clientId)

Reset OAuth Client Secret

Resets the OAuth Client secret for a client you own, and returns the OAuth Client with the plaintext secret. This secret is not supposed to be publicly known or disclosed anywhere. This can be used to generate a new secret in case the one you have has been leaked, or to get a new secret if you lost the original. The old secret is expired immediately, and logins to your client with the old secret will fail. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val clientId : kotlin.String = clientId_example // kotlin.String | The OAuth Client ID to look up.

try {
    val result : OAuthClient = apiInstance.resetClientSecret(clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#resetClientSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#resetClientSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**kotlin.String**](.md)| The OAuth Client ID to look up. |


### Return type

[**OAuthClient**](OAuthClient.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="setClientThumbnail"></a>
# **setClientThumbnail**
> kotlin.Any setClientThumbnail(body, clientId)

Update OAuth Client Thumbnail

Upload a thumbnail for a client you own.  You must upload an image file that will be returned when the thumbnail is retrieved.  This image will be publicly-viewable. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : Object =  // Object | The image to set as the thumbnail.

val clientId : kotlin.String = clientId_example // kotlin.String | The OAuth Client ID to look up.

try {
    val result : kotlin.Any = apiInstance.setClientThumbnail(body, clientId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#setClientThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#setClientThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| The image to set as the thumbnail. |
 **clientId** | [**kotlin.String**](.md)| The OAuth Client ID to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateAccount"></a>
# **updateAccount**
> Account updateAccount(body)

Update Account

Updates contact and billing information related to your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : Account =  // Account | Update contact and billing information.

try {
    val result : Account = apiInstance.updateAccount(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#updateAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#updateAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Account**](Account.md)| Update contact and billing information. |


### Return type

[**Account**](Account.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateAccountSettings"></a>
# **updateAccountSettings**
> AccountSettings updateAccountSettings(body)

Update Account Settings

Updates your Account settings. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : AccountSettings =  // AccountSettings | Update Account settings information.

try {
    val result : AccountSettings = apiInstance.updateAccountSettings(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#updateAccountSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#updateAccountSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountSettings**](AccountSettings.md)| Update Account settings information. |


### Return type

[**AccountSettings**](AccountSettings.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateClient"></a>
# **updateClient**
> OAuthClient updateClient(clientId, body)

Update OAuth Client

Update information about an OAuth Client on your Account. This can be especially useful to update the &#x60;redirect_uri&#x60; of your client in the event that the callback url changed in your application. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val clientId : kotlin.String = clientId_example // kotlin.String | The OAuth Client ID to look up.

val body : OAuthClient =  // OAuthClient | The fields to update.

try {
    val result : OAuthClient = apiInstance.updateClient(clientId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#updateClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#updateClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**kotlin.String**](.md)| The OAuth Client ID to look up. |
 **body** | [**OAuthClient**](OAuthClient.md)| The fields to update. | [optional]


### Return type

[**OAuthClient**](OAuthClient.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateUser"></a>
# **updateUser**
> User updateUser(username, body)

Update User

Update information about a User on your Account. This can be used to change the restricted status of a User. When making a User restricted, no grants will be configured by default and you must then set up grants in order for the User to access anything on the Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val username : kotlin.String = username_example // kotlin.String | The username to look up.

val body : User =  // User | The information to update.

try {
    val result : User = apiInstance.updateUser(username, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**kotlin.String**](.md)| The username to look up. |
 **body** | [**User**](User.md)| The information to update. | [optional]


### Return type

[**User**](User.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateUserGrants"></a>
# **updateUserGrants**
> GrantsResponse updateUserGrants(body, username)

Update User&#x27;s grants

Update the grants a User has. This can be used to give a User access to new entities or actions, or take access away.  You do not need to include the grant for every entity on the Account in this request; any that are not included will remain unchanged. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = AccountApi()

val body : GrantsResponse =  // GrantsResponse | The grants to update. Omitted grants will be left unchanged.

val username : kotlin.String = username_example // kotlin.String | The username to look up.

try {
    val result : GrantsResponse = apiInstance.updateUserGrants(body, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#updateUserGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#updateUserGrants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantsResponse**](GrantsResponse.md)| The grants to update. Omitted grants will be left unchanged. |
 **username** | [**kotlin.String**](.md)| The username to look up. |


### Return type

[**GrantsResponse**](GrantsResponse.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



