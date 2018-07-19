
# InvoiceItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**kotlin.Int**](.md) | The price, in US dollars, of unit price multiplied by quantity. |  [optional]
**from** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date the Invoice Item started, based on month. |  [optional]
**label** | [**kotlin.String**](.md) | The Invoice Item&#x27;s display label. |  [optional]
**quantity** | [**kotlin.Int**](.md) | The quantity of this Item for the specified Invoice. |  [optional]
**to** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date the Invoice Item ended, based on month. |  [optional]
**type** | [**inline**](#TypeEnum) | The type of service, ether &#x60;prepay&#x60; or &#x60;misc&#x60;. |  [optional]
**unitprice** | [**kotlin.Int**](.md) | The monthly service fee in US Dollars for this Item. |  [optional]



<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | hourly, prepay, misc



