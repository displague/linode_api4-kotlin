
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address1** | [**kotlin.String**](.md) | First line of this Account&#x27;s billing address. |  [optional]
**address2** | [**kotlin.String**](.md) | Second line of this Account&#x27;s billing address. |  [optional]
**balance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | This Account&#x27;s balance, in US dollars. |  [optional]
**city** | [**kotlin.String**](.md) | The city for this Account&#x27;s billing address. |  [optional]
**creditCard** | [**AccountCreditCard**](AccountCreditCard.md) |  |  [optional]
**company** | [**kotlin.String**](.md) | The company name associated with this Account. |  [optional]
**country** | [**kotlin.String**](.md) | The two-letter country code of this Account&#x27;s billing address.  |  [optional]
**email** | [**kotlin.String**](.md) | The email address of the person associated with this Account. |  [optional]
**firstName** | [**kotlin.String**](.md) | The first name of the person associated with this Account. |  [optional]
**lastName** | [**kotlin.String**](.md) | The last name of the person associated with this Account. |  [optional]
**phone** | [**kotlin.String**](.md) | The phone number associated with this Account. |  [optional]
**state** | [**kotlin.String**](.md) | If billing address is in the United States, this is the State portion of the Account&#x27;s billing address. If the address is outside the US, this is the Province associated with the Account&#x27;s billing address.  |  [optional]
**taxId** | [**kotlin.String**](.md) | The tax identification number associated with this Account, for tax calculations in some countries. If you do not live in a country that collects tax, this should be &#x60;null&#x60;.  |  [optional]
**zip** | [**kotlin.String**](.md) | The zip code of this Account&#x27;s billing address. |  [optional]




