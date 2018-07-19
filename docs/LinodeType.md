
# LinodeType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.String**](.md) | The ID representing the Linode Type. |  [optional]
**label** | [**kotlin.String**](.md) | The Linode Type&#x27;s label is for display purposes only.  |  [optional]
**disk** | [**kotlin.Int**](.md) | The Disk size, in MB, of the Linode Type.  |  [optional]
**&#x60;class&#x60;** | [**inline**](#&#x60;class&#x60;Enum) | The class of the Linode Type. We currently offer three classes of Linodes:    * nanode - Our entry-level Linode Type.   * standard - Our flagship Linode Type.   * highmem - A Linode Type featuring high memory availability.  |  [optional]
**price** | [**LinodeTypePrice**](LinodeTypePrice.md) |  |  [optional]
**addons** | [**LinodeTypeAddons**](LinodeTypeAddons.md) |  |  [optional]
**networkOut** | [**kotlin.Int**](.md) | The Mbits outbound bandwidth allocation.  |  [optional]
**memory** | [**kotlin.Int**](.md) | Amount of RAM included in this Linode Type.  |  [optional]
**transfer** | [**kotlin.Int**](.md) | The monthly outbound transfer amount, in MB.  |  [optional]
**vcpus** | [**kotlin.Int**](.md) | The number of VCPU cores this Linode Type offers.  |  [optional]



<a name="`class`Enum"></a>
## Enum: class
Name | Value
---- | -----
&#x60;class&#x60; | nanode, standard, highmem



