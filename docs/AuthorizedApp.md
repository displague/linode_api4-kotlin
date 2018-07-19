
# AuthorizedApp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This authorization&#x27;s ID, used for revoking access.  |  [optional]
**label** | [**kotlin.String**](.md) | The name of the application you&#x27;ve authorized.  |  [optional]
**thumbnailUrl** | [**kotlin.String**](.md) | The URL at which this app&#x27;s thumbnail may be accessed.  |  [optional]
**scopes** | [**kotlin.String**](.md) | The OAuth scopes this app was authorized with.  This defines what parts of your Account the app is allowed to access.  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this app was authorized. |  [optional]
**expiry** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this app&#x27;s access token expires.  Please note that apps may still have active refresh tokens after this time passes.  |  [optional]
**website** | [**kotlin.String**](.md) | The website where you can get more information about this app.  |  [optional]




