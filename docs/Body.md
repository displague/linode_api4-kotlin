
# Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupId** | [**kotlin.Int**](.md) | A Backup ID from another Linode&#x27;s available backups. Your User must have &#x60;read_write&#x60; access to that Linode, the Backup must have a &#x60;status&#x60; of &#x60;successful&#x60;, and the Linode must be deployed to the same &#x60;region&#x60; as the Backup. See [/linode/instances/{linodeId}/backups](/#operation/getBackups) for a Linode&#x27;s available backups.  This field and the &#x60;image&#x60; field are mutually exclusive.  |  [optional]
**backupsEnabled** | [**kotlin.Boolean**](.md) | If this field is set to &#x60;true&#x60;, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.  Backup pricing is included in the response from [/linodes/types](/#operation/getLinodeTypes)  |  [optional]
**swapSize** | [**kotlin.Int**](.md) | When deploying from an Image, this field is optional, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.  |  [optional]
**type** | [**kotlin.String**](.md) | The [Linode Type](#operation/getLinodeTypes) of the Linode you are creating.  | 
**region** | [**kotlin.String**](.md) | The [Region](#operation/getRegions) where the Linode will be located.  | 
**image** | [**kotlin.String**](.md) | An Image ID to deploy the Disk from. Official Linode Images start with &#x60;linode/ &#x60;, while your Images start with &#x60;private/&#x60;. See [/images](/#operation/getImages) for more information on the Images available for you to use.  |  [optional]
**rootPass** | [**kotlin.String**](.md) | The password for the root user on the newly created Linode. Only accepted if \&quot;image\&quot; is provided.  |  [optional]
**authorizedKeys** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | A list of SSH public keys to deploy for the root user on the newly created Linode.  Only accepted if \&quot;image\&quot; is provided.  |  [optional]
**stackscriptId** | [**kotlin.Int**](.md) | The StackScript to deploy to the newly created Linode.  If provided, \&quot;image\&quot; must also be provided, and must be an Image that is compatible with this StackScript.  |  [optional]
**stackscriptData** | [**kotlin.Any**](.md) | An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if \&quot;stackscript_id\&quot; is given.  The required values depend on the StackScript being deployed.  |  [optional]
**booted** | [**kotlin.Boolean**](.md) | Whether to boot this Linode after the deploy is complete. Defaults to true if an \&quot;image\&quot; is provided.  Not accepted if not deploying from an Image.  |  [optional]
**label** | [**LinodeSlashpropertiesSlashlabel**](LinodeSlashpropertiesSlashlabel.md) |  |  [optional]
**group** | [**LinodeSlashpropertiesSlashgroup**](LinodeSlashpropertiesSlashgroup.md) |  |  [optional]
**privateIp** | [**kotlin.Boolean**](.md) | If true, the created Linode will have private networking enabled.  |  [optional]




