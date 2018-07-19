
# Profile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | [**kotlin.Int**](.md) | Your unique ID in our system. This value will never change, and can safely be used to identify your User.  |  [optional]
**username** | [**kotlin.String**](.md) | Your username, used for logging in to our system.  |  [optional]
**email** | [**kotlin.String**](.md) | Your email address.  This address will be used for communication with Linode as necessary.  |  [optional]
**timezone** | [**kotlin.String**](.md) | The timezone you prefer to see times in.  This is not used by the API, and is for the benefit of clients only.  All times the API returns are in UTC.  |  [optional]
**emailNotifications** | [**kotlin.Boolean**](.md) | If true, you will receive email notifications about account activity.  If false, you may still receive business-critical communications through email.  |  [optional]
**referrals** | [**ProfileReferrals**](ProfileReferrals.md) |  |  [optional]
**ipWhitelistEnabled** | [**kotlin.Boolean**](.md) | If true, logins for your User will only be allowed from whitelisted IPs. This setting is currently deprecated, and cannot be enabled.  If you disable this setting, you will not be able to re-enable it.  |  [optional]
**lishAuthMethod** | [**inline**](#LishAuthMethodEnum) | What methods of authentication are allowed when connecting via Lish.  \&quot;keys_only\&quot; is the most secure if you intend to use Lish, and \&quot;disabled\&quot; is recommended if you do not intend to use Lish at all.  |  [optional]
**authorizedKeys** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | The list of SSH Keys authorized to use Lish for your User. This value is ignored if &#x60;lish_auth_method&#x60; is \&quot;disabled.\&quot;  |  [optional]
**twoFactorAuth** | [**kotlin.Boolean**](.md) | If true, logins from untrusted computers will require Two Factor Authentication.  See [/profile/tfa-enable](/#operation/tfaEnable) to enable Two Factor Authentication.  |  [optional]
**restricted** | [**kotlin.Boolean**](.md) | If true, your User has restrictions on what can be accessed on your Account. To get details on what entities/actions you can access/perform, see [/profile/grants](/#operation/getProfileGrants).  |  [optional]



<a name="LishAuthMethodEnum"></a>
## Enum: lish_auth_method
Name | Value
---- | -----
lishAuthMethod | password_keys, keys_only, disabled



