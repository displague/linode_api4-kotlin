
# Body4

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region** | [**kotlin.String**](.md) | This is the Region where the Linode will be deployed. To view all available Regions you can deploy to see [/regions](/#operation/getRegions). * Region can only be provided when cloning to a new Linode.  |  [optional]
**type** | [**kotlin.String**](.md) | A Linode&#x27;s Type determines what resources are available to it, including disk space, memory, and virtual cpus. The amounts available to a specific Linode are returned as &#x60;specs&#x60; on the Linode object.  To view all available Linode Types you can deploy with see [/linode/types](/#operation/getLinodeTypes).  * Type can only be provided when cloning to a new Linode.  |  [optional]
**linodeId** | [**kotlin.Int**](.md) | If an existing Linode is to be the target for the clone, the ID of that Linode. The existing Linode must have enough resources to accept the clone.  |  [optional]
**label** | [**kotlin.String**](.md) | The label to assign this Linode when cloning to a new Linode. * Can only be provided when cloning to a new Linode. * Defaults to \&quot;linode\&quot;.  |  [optional]
**group** | [**kotlin.String**](.md) | A label used to group Linodes for display. Linodes are not required to have a group.  |  [optional]
**backupsEnabled** | [**kotlin.Boolean**](.md) | If this field is set to &#x60;true&#x60;, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. Pricing is included in the response from [/linodes/types](/#operation/getLinodeTypes).  * Can only be included when cloning to a new Linode.  |  [optional]
**disks** | [**kotlin.Array&lt;kotlin.Int&gt;**](.md) | All disks attached to configs will be cloned from the source Linode if not provided.  |  [optional]
**configs** | [**kotlin.Array&lt;kotlin.Int&gt;**](.md) | All configs attached to will be cloned from the source Linode if not provided.  |  [optional]




