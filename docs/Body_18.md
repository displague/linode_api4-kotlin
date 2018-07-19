
# Body18

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scopes** | [**kotlin.String**](.md) | The scopes to create the token with.  These cannot be changed after creation, and may not exceed the scopes of the acting token. If omitted, the new token will have the same scopes as the acting token.  |  [optional]
**expiry** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this token should be valid until.  If omitted, the new token will be valid until it is manually revoked.  |  [optional]
**label** | [**PersonalAccessTokenSlashpropertiesSlashlabel**](PersonalAccessTokenSlashpropertiesSlashlabel.md) |  |  [optional]




