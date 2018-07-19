
# LinodeConfigHelpers

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updatedbDisabled** | [**kotlin.Boolean**](.md) | Disables updatedb cron job to avoid disk thrashing. |  [optional]
**distro** | [**kotlin.Boolean**](.md) | Helps maintain correct inittab/upstart console device. |  [optional]
**modulesDep** | [**kotlin.Boolean**](.md) | Creates a modules dependency file for the Kernel you run. |  [optional]
**network** | [**kotlin.Boolean**](.md) | Automatically configures static networking. |  [optional]
**devtmpfsAutomount** | [**kotlin.Boolean**](.md) | Populates the /dev directory early during boot without udev.  Defaults to false.  |  [optional]




