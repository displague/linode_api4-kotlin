
# GrantsResponseGlobal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addLinodes** | [**kotlin.Boolean**](.md) | If true, this User may create Linodes. |  [optional]
**addLongview** | [**kotlin.Boolean**](.md) | If true, this User may create Longview clients. |  [optional]
**longviewSubscription** | [**kotlin.Boolean**](.md) | If true, this User may manage the Account&#x27;s Longview subscription. |  [optional]
**accountAccess** | [**inline**](#AccountAccessEnum) | The level of access this User has to Account-level actions, like billing information. A restricted User will never be able to manage users.  |  [optional]
**cancelAccount** | [**kotlin.Boolean**](.md) | If true, this User may cancel the entire Account. |  [optional]
**addDomains** | [**kotlin.Boolean**](.md) | If true, this User may add Domains. |  [optional]
**addStackscripts** | [**kotlin.Boolean**](.md) | If true, this User may add StackScripts. |  [optional]
**addNodebalancers** | [**kotlin.Boolean**](.md) | If true, this User may add NodeBalancers. |  [optional]
**addImages** | [**kotlin.Boolean**](.md) | If true, this User may add Images. |  [optional]
**addVolumes** | [**kotlin.Boolean**](.md) | If true, this User may add Volumes. |  [optional]



<a name="AccountAccessEnum"></a>
## Enum: account_access
Name | Value
---- | -----
accountAccess | null, read_only, read_write



