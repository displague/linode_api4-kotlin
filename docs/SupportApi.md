# SupportApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTicket**](SupportApi.md#createTicket) | **POST** /support/tickets | Open Support Ticket
[**createTicketAttachment**](SupportApi.md#createTicketAttachment) | **POST** /support/tickets/{ticketId}/attachments | Create Ticket Attachment
[**createTicketReply**](SupportApi.md#createTicketReply) | **POST** /support/tickets/{ticketId}/replies | Create Reply
[**getTicket**](SupportApi.md#getTicket) | **GET** /support/tickets/{ticketId} | View Support Ticket
[**getTicketReplies**](SupportApi.md#getTicketReplies) | **GET** /support/tickets/{ticketId}/replies | List Replies
[**getTickets**](SupportApi.md#getTickets) | **GET** /support/tickets | List Support Tickets




<a name="createTicket"></a>
# **createTicket**
> SupportTicket createTicket(body)

Open Support Ticket

Open a Support Ticket. Only one of the ID attributes (&#x60;linode_id&#x60;, &#x60;domain_id&#x60;, etc.) can be set on a single Support Ticket. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = SupportApi()

val body : SupportTicketRequest =  // SupportTicketRequest | Open a Support Ticket.

try {
    val result : SupportTicket = apiInstance.createTicket(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportApi#createTicket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportApi#createTicket")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SupportTicketRequest**](SupportTicketRequest.md)| Open a Support Ticket. | [optional]


### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createTicketAttachment"></a>
# **createTicketAttachment**
> kotlin.Any createTicketAttachment(ticketId)

Create Ticket Attachment

Adds a file attachment to an existing Support Ticket on your Account. File attachments are used to assist our Support team in resolving your Ticket. Examples of attachments are screen shots and text files that provide additional information. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = SupportApi()

val ticketId : kotlin.Int = 56 // kotlin.Int | The ID of the Support Ticket.

try {
    val result : kotlin.Any = apiInstance.createTicketAttachment(ticketId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportApi#createTicketAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportApi#createTicketAttachment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | [**kotlin.Int**](.md)| The ID of the Support Ticket. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createTicketReply"></a>
# **createTicketReply**
> SupportTicketReply createTicketReply(body, ticketId)

Create Reply

Adds a reply to an existing Support Ticket. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = SupportApi()

val body : Body20 =  // Body20 | Add a reply.

val ticketId : kotlin.Int = 56 // kotlin.Int | The ID of the Support Ticket.

try {
    val result : SupportTicketReply = apiInstance.createTicketReply(body, ticketId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportApi#createTicketReply")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportApi#createTicketReply")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body20**](Body20.md)| Add a reply. |
 **ticketId** | [**kotlin.Int**](.md)| The ID of the Support Ticket. |


### Return type

[**SupportTicketReply**](SupportTicketReply.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="getTicket"></a>
# **getTicket**
> SupportTicket getTicket(ticketId)

View Support Ticket

Returns a Support Ticket under your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = SupportApi()

val ticketId : kotlin.Int = 56 // kotlin.Int | The ID of the Support Ticket.

try {
    val result : SupportTicket = apiInstance.getTicket(ticketId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportApi#getTicket")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportApi#getTicket")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | [**kotlin.Int**](.md)| The ID of the Support Ticket. |


### Return type

[**SupportTicket**](SupportTicket.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getTicketReplies"></a>
# **getTicketReplies**
> InlineResponse20037 getTicketReplies(ticketId, page, pageSize)

List Replies

Returns a collection of replies to a Support Ticket on your Account. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = SupportApi()

val ticketId : kotlin.Int = 56 // kotlin.Int | The ID of the Support Ticket.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20037 = apiInstance.getTicketReplies(ticketId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportApi#getTicketReplies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportApi#getTicketReplies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | [**kotlin.Int**](.md)| The ID of the Support Ticket. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getTickets"></a>
# **getTickets**
> InlineResponse20036 getTickets(page, pageSize)

List Support Tickets

Returns a collection of Support Tickets on your Account. Support Tickets can be both tickets you open with Linode for support, as well as tickets generated by Linode regarding your Account. This collection includes all Support Tickets generated on your Account, with open tickets returned first. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = SupportApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20036 = apiInstance.getTickets(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportApi#getTickets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportApi#getTickets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 



