
# LinodeSpecs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disk** | [**kotlin.Int**](.md) | The amount of storage space, in GB. this Linode has access to. A typical Linode will divide this space between a primary disk with an &#x60;image&#x60; deployed to it, and a swap disk, usually 512 MB. This is the default configuration created when deploying a Linode with an &#x60;image&#x60; through [POST /linode/instances](/#operation/createLinodeInstance). While this configuration is suitable for 99% of use cases, if you need finer control over your Linode&#x27;s disks, see the [/linode/instances/{linodeId}/disks](/#operation/getLinodeDisks) endpoints.  |  [optional]
**memory** | [**kotlin.Int**](.md) | The amount of RAM, in MB, this Linode has access to. Typically a Linode will choose to boot with all of its available RAM, but this can be configured in a Config profile, see the [/linode/instances/{linodeId}/configs](/#operation/getLinodeConfigs) endpoints and the LinodeConfig object for more information.  |  [optional]
**vcpus** | [**kotlin.Int**](.md) | The number of vcpus this Linode has access to.  Typically a Linode will choose to boot with all of its available vcpus, but this can be configured in a Config Profile, see the [/linode/instances/{linodeId}/configs](/#operation/getLinodeConfigs) endpoints and the LinodeConfig object for more information.  |  [optional]
**transfer** | [**kotlin.Int**](.md) | The amount of network transfer this Linode is allotted each month. |  [optional]




