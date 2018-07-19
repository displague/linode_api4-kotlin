
# OAuthClient

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.String**](.md) | The OAuth Client ID.  This is used to identify the client, and is a publicly-known value (it is not a secret).  |  [optional]
**redirectUri** | [**kotlin.String**](.md) | The location a successful log in from https://login.linode.com should be redirected to for this client.  The receiver of this redirect should be ready to accept an OAuth exchange code and finish the OAuth exchange.  |  [optional]
**label** | [**kotlin.String**](.md) | The name of this application.  This will be presented to users when they are asked to grant it access to their Account.  |  [optional]
**status** | [**inline**](#StatusEnum) | The status of this application.  &#x60;active&#x60; by default.  |  [optional]
**secret** | [**kotlin.String**](.md) | The OAuth Client secret, used in the OAuth exchange.  This is returned as &#x60;&lt;REDACTED&gt;&#x60; except when an OAuth Client is created or its secret is reset.  This is a secret, and should not be shared or disclosed publicly.  |  [optional]
**thumbnailUrl** | [**kotlin.String**](.md) | The URL where this client&#x27;s thumbnail may be viewed, or &#x60;null&#x60; if this client does not have a thumbnail set.  |  [optional]
**&#x60;public&#x60;** | [**kotlin.Boolean**](.md) | If this is a public or private OAuth Client.  Public clients have a slightly different authentication workflow than private clients.  See the [OAuth spec](https://oauth.net/2/) for more details.  |  [optional]



<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | active, disabled, suspended



