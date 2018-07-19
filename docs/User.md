
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | [**kotlin.String**](.md) | This User&#x27;s username. This is used for logging in, and may also be displayed alongside actions the User performs (for example, in Events or public StackScripts).  |  [optional]
**email** | [**kotlin.String**](.md) | The email address for this User, for account management communications, and may be used for other communications as configured.  |  [optional]
**restricted** | [**kotlin.Boolean**](.md) | If true, this User must be granted access to perform actions or access entities on this Account. See [/account/users/{username}/grants](/#operation/getUserGrants) for details on how to configure grants for a restricted User.  |  [optional]




