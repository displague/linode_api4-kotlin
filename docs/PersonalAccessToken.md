
# PersonalAccessToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This token&#x27;s unique ID, which can be used to revoke it.  |  [optional]
**scopes** | [**kotlin.String**](.md) | The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the [Linode CLI](https://github.com/linode/linode-cli), require tokens with access to &#x60;*&#x60;. Tokens with more restrictive scopes are generally more secure.  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date and time this token was created.  |  [optional]
**label** | [**kotlin.String**](.md) | This token&#x27;s label.  This is for display purposes only, but can be used to more easily track what you&#x27;re using each token for.  |  [optional]
**token** | [**kotlin.String**](.md) | The token used to access the API.  When the token is created, the full token is returned here.  Otherwise, only the first 16 characters are returned.  |  [optional]
**expiry** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this token will expire.  Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated.  Tokens may be created with \&quot;null\&quot; as their expiry and will never expire unless revoked.  |  [optional]




