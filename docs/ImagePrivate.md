
# ImagePrivate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.String**](.md) | The unique ID of this Image. |  [optional]
**label** | [**kotlin.String**](.md) | A short description of the Image. Labels cannot contain special characters.  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Image was created. |  [optional]
**createdBy** | [**kotlin.String**](.md) | The name of the User who created this Image.  |  [optional]
**deprecated** | [**kotlin.Boolean**](.md) | Whether or not this Image is deprecated. Will only be True for deprecated public Images.  |  [optional]
**description** | [**kotlin.String**](.md) | An optional detailed description of this Image. |  [optional]
**isPublic** | [**kotlin.Boolean**](.md) | True if the Image is public. |  [optional]
**size** | [**kotlin.Int**](.md) | The minimum size this Image needs to deploy. Size is in MB.  |  [optional]
**type** | [**inline**](#TypeEnum) | How the Image was created. \&quot;Manual\&quot; Images can be created at any time. \&quot;Automatic\&quot; images are created automatically from a deleted Linode.  |  [optional]
**vendor** | [**kotlin.String**](.md) | The upstream distribution vendor. &#x60;None&#x60; for private Images.  |  [optional]



<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | manual, automatic



