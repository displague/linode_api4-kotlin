
# LinodeBackupsSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**day** | [**inline**](#DayEnum) | The day of the week that your Linode&#x27;s weekly Backup is taken. If not set manually, a day will be chosen for you. Backups are taken every day, but backups taken on this day are preferred when selecting backups to retain for a longer period.   If not set manually, then when backups are initially enabled, this may come back as &#x60;Scheduling&#x60; until the &#x60;day&#x60; is automatically selected.  |  [optional]
**window** | [**inline**](#WindowEnum) | The window in which your backups will be taken, in UTC. A backups window is a two-hour span of time in which the backup may occur.   For example, &#x60;W10&#x60; indicates that your backups should be taken between 10:00 and 12:00. If you do not choose a backup window, one will be selected for you automatically.   If not set manually, when backups are initially enabled this may come back as &#x60;Scheduling&#x60; until the &#x60;window&#x60; is automatically selected.  |  [optional]



<a name="DayEnum"></a>
## Enum: day
Name | Value
---- | -----
day | Scheduling, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday


<a name="WindowEnum"></a>
## Enum: window
Name | Value
---- | -----
window | Scheduling, W0, W2, W4, W8, W10, W12, W14, W16, W18, W20, W22



