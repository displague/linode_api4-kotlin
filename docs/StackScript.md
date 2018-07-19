
# StackScript

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | The unique ID of this StackScript. |  [optional]
**username** | [**kotlin.String**](.md) | The User who created the StackScript.  |  [optional]
**userGravatarId** | [**kotlin.String**](.md) | The Gravatar ID for the User who created the StackScript.  |  [optional]
**label** | [**kotlin.String**](.md) | The StackScript&#x27;s label is for display purposes only.  |  [optional]
**description** | [**kotlin.String**](.md) | A description for the StackScript.  |  [optional]
**images** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of Image IDs representing the Images that this StackScript is compatible for deploying with.  |  [optional]
**deploymentsTotal** | [**kotlin.Int**](.md) | The total number of times this StackScript has been deployed.  |  [optional]
**deploymentsActive** | [**kotlin.Int**](.md) | Count of currently active, deployed Linodes created from this StackScript.  |  [optional]
**isPublic** | [**kotlin.Boolean**](.md) | This determines whether other users can use your StackScript. **Once a StackScript is made public, it cannot be made private.**  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date this StackScript was created.  |  [optional]
**updated** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date this StackScript was last updated.  |  [optional]
**revNote** | [**kotlin.String**](.md) | This field allows you to add notes for the set of revisions made to this StackScript.  |  [optional]
**script** | [**kotlin.String**](.md) | The script to execute when provisioning a new Linode with this StackScript.  |  [optional]
**userDefinedFields** | [**kotlin.Array&lt;UserDefinedField&gt;**](UserDefinedField.md) | This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment. See [Variables and UDFs](https://www.linode.com/docs/platform/stackscripts/#variables-and-udfs) for more information.  |  [optional]




