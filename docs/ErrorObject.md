
# ErrorObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**kotlin.String**](.md) | What happened to cause this error. In most cases, this can be fixed immediately by changing the data you sent in the request, but in some cases you will be instructed to [open a Support Ticket](/#operation/createTicket) or perform some other action before you can complete the request successfully.  |  [optional]
**field** | [**kotlin.String**](.md) | The field in the request that caused this error. This may be a path, separated by periods in the case of nested fields. In some cases this may come back as \&quot;null\&quot; if the error is not specific to any single element of the request.  |  [optional]




