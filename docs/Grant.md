
# Grant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | The ID of the entity this grant applies to.  |  [optional]
**permissions** | [**inline**](#PermissionsEnum) | The level of access this User has to this entity.  If null, this User has no access.  |  [optional]
**label** | [**kotlin.String**](.md) | The current label of the entity this grant applies to, for display purposes.  |  [optional]



<a name="PermissionsEnum"></a>
## Enum: permissions
Name | Value
---- | -----
permissions | null, read_only, read_write



