
# Body21

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region** | [**kotlin.String**](.md) | The Region to deploy this Volume in. This is only required if a linode_id is not given.  |  [optional]
**linodeId** | [**kotlin.Int**](.md) | The Linode this volume should be attached to upon creation. If not given, the volume will be created without an attachment.  |  [optional]
**size** | [**kotlin.Int**](.md) | The initial size of this volume, in GB.  Be aware that volumes may only be resized up after creation.  |  [optional]
**label** | [**kotlin.String**](.md) | The Volume&#x27;s label, which is also used in the &#x60;filesystem_path&#x60; of the resulting volume.  |  [optional]
**configId** | [**kotlin.Int**](.md) | When creating a Volume attached to a Linode, the ID of the Linode Config to include the new Volume in. This Config must belong to the Linode referenced by &#x60;linode_id&#x60;. Must _not_ be provided if &#x60;linode_id&#x60; is not sent. If a &#x60;linode_id&#x60; is sent without a &#x60;config_id&#x60;, the volume will be attached:    * to the Linode&#x27;s only config if it only has one config.   * to the Linode&#x27;s last used config, if possible.  If no config can be selected for attachment, an error will be returned.  |  [optional]




