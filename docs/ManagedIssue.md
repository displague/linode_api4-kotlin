
# ManagedIssue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This Issue&#x27;s unique ID.  |  [optional]
**created** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | When this Issue was created. Issues are created in response to issues detected with Managed Services, so this is also when the Issue was detected.  |  [optional]
**services** | [**kotlin.Array&lt;kotlin.Int&gt;**](.md) | An array of Managed Service IDs that were affected by this Issue.  |  [optional]
**entity** | [**ManagedIssueEntity**](ManagedIssueEntity.md) |  |  [optional]




