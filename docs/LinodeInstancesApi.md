# LinodeInstancesApi

All URIs are relative to *https://api.linode.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLinodeConfig**](LinodeInstancesApi.md#addLinodeConfig) | **POST** /linode/instances/{linodeId}/configs | Create Configuration Profile
[**addLinodeDisk**](LinodeInstancesApi.md#addLinodeDisk) | **POST** /linode/instances/{linodeId}/disks | Create Disk
[**addLinodeIP**](LinodeInstancesApi.md#addLinodeIP) | **POST** /linode/instances/{linodeId}/ips | Allocate IPv4 Address
[**bootLinodeInstance**](LinodeInstancesApi.md#bootLinodeInstance) | **POST** /linode/instances/{linodeId}/boot | Boot Linode
[**cancelBackups**](LinodeInstancesApi.md#cancelBackups) | **POST** /linode/instances/{linodeId}/backups/cancel | Cancel Backups
[**cloneLinodeInstance**](LinodeInstancesApi.md#cloneLinodeInstance) | **POST** /linode/instances/{linodeId}/clone | Clone Linode
[**createLinodeInstance**](LinodeInstancesApi.md#createLinodeInstance) | **POST** /linode/instances | Create Linode
[**createSnapshot**](LinodeInstancesApi.md#createSnapshot) | **POST** /linode/instances/{linodeId}/backups | Create Snapshot
[**deleteDisk**](LinodeInstancesApi.md#deleteDisk) | **DELETE** /linode/instances/{linodeId}/disks/{diskId} | Delete Disk
[**deleteLinodeConfig**](LinodeInstancesApi.md#deleteLinodeConfig) | **DELETE** /linode/instances/{linodeId}/configs/{configId} | Delete Configuration Profile
[**deleteLinodeInstance**](LinodeInstancesApi.md#deleteLinodeInstance) | **DELETE** /linode/instances/{linodeId} | Delete Linode
[**enableBackups**](LinodeInstancesApi.md#enableBackups) | **POST** /linode/instances/{linodeId}/backups/enable | Enable Backups
[**getBackup**](LinodeInstancesApi.md#getBackup) | **GET** /linode/instances/{linodeId}/backups/{backupId} | View Backup
[**getBackups**](LinodeInstancesApi.md#getBackups) | **GET** /linode/instances/{linodeId}/backups | List Backups
[**getKernel**](LinodeInstancesApi.md#getKernel) | **GET** /linode/kernels/{kernelId} | View Kernel
[**getKernels**](LinodeInstancesApi.md#getKernels) | **GET** /linode/kernels | List Kernels
[**getLinodeConfig**](LinodeInstancesApi.md#getLinodeConfig) | **GET** /linode/instances/{linodeId}/configs/{configId} | View Configuration Profile
[**getLinodeConfigs**](LinodeInstancesApi.md#getLinodeConfigs) | **GET** /linode/instances/{linodeId}/configs | List Configuration Profiles
[**getLinodeDisk**](LinodeInstancesApi.md#getLinodeDisk) | **GET** /linode/instances/{linodeId}/disks/{diskId} | View Disk
[**getLinodeDisks**](LinodeInstancesApi.md#getLinodeDisks) | **GET** /linode/instances/{linodeId}/disks | List Disks
[**getLinodeIP**](LinodeInstancesApi.md#getLinodeIP) | **GET** /linode/instances/{linodeId}/ips/{address} | View IP Address
[**getLinodeIPs**](LinodeInstancesApi.md#getLinodeIPs) | **GET** /linode/instances/{linodeId}/ips | List Networking Information
[**getLinodeInstance**](LinodeInstancesApi.md#getLinodeInstance) | **GET** /linode/instances/{linodeId} | View Linode
[**getLinodeInstances**](LinodeInstancesApi.md#getLinodeInstances) | **GET** /linode/instances | List Linodes
[**getLinodeStats**](LinodeInstancesApi.md#getLinodeStats) | **GET** /linode/instances/{linodeId}/stats | View Current Month Statistics
[**getLinodeStatsByYearMonth**](LinodeInstancesApi.md#getLinodeStatsByYearMonth) | **GET** /linode/instances/{linodeId}/stats/{year}/{month} | View Statistics (year/month)
[**getLinodeVolumes**](LinodeInstancesApi.md#getLinodeVolumes) | **GET** /linode/instances/{linodeId}/volumes | List Linode&#x27;s Volumes
[**migrateLinodeInstance**](LinodeInstancesApi.md#migrateLinodeInstance) | **POST** /linode/instances/{linodeId}/migrate | Initiate Pending Migration
[**mutateLinodeInstance**](LinodeInstancesApi.md#mutateLinodeInstance) | **POST** /linode/instances/{linodeId}/mutate | Upgrade Linode
[**rebootLinodeInstance**](LinodeInstancesApi.md#rebootLinodeInstance) | **POST** /linode/instances/{linodeId}/reboot | Reboot Linode
[**rebuildLinodeInstance**](LinodeInstancesApi.md#rebuildLinodeInstance) | **POST** /linode/instances/{linodeId}/rebuild | Rebuild Linode
[**removeLinodeIP**](LinodeInstancesApi.md#removeLinodeIP) | **DELETE** /linode/instances/{linodeId}/ips/{address} | Delete IPv4 Address
[**rescueLinodeInstance**](LinodeInstancesApi.md#rescueLinodeInstance) | **POST** /linode/instances/{linodeId}/rescue | Boot Linode into Rescue Mode
[**resetDiskPassword**](LinodeInstancesApi.md#resetDiskPassword) | **POST** /linode/instances/{linodeId}/disks/{diskId}/password | Reset Disk Root Password
[**resizeDisk**](LinodeInstancesApi.md#resizeDisk) | **POST** /linode/instances/{linodeId}/disks/{diskId}/resize | Resize Disk
[**resizeLinodeInstance**](LinodeInstancesApi.md#resizeLinodeInstance) | **POST** /linode/instances/{linodeId}/resize | Resize Linode
[**restoreBackup**](LinodeInstancesApi.md#restoreBackup) | **POST** /linode/instances/{linodeId}/backups/{backupId}/restore | Restore Backup
[**shutdownLinodeInstance**](LinodeInstancesApi.md#shutdownLinodeInstance) | **POST** /linode/instances/{linodeId}/shutdown | Shut Down Linode
[**updateDisk**](LinodeInstancesApi.md#updateDisk) | **PUT** /linode/instances/{linodeId}/disks/{diskId} | Update Disk
[**updateLinodeConfig**](LinodeInstancesApi.md#updateLinodeConfig) | **PUT** /linode/instances/{linodeId}/configs/{configId} | Update Configuration Profile
[**updateLinodeIP**](LinodeInstancesApi.md#updateLinodeIP) | **PUT** /linode/instances/{linodeId}/ips/{address} | Update IP Address
[**updateLinodeInstance**](LinodeInstancesApi.md#updateLinodeInstance) | **PUT** /linode/instances/{linodeId} | Update Linode




<a name="addLinodeConfig"></a>
# **addLinodeConfig**
> LinodeConfig addLinodeConfig(body, linodeId)

Create Configuration Profile

Adds a new Configuration profile to a Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : LinodeConfig =  // LinodeConfig | The parameters to set when creating the Configuration profile.
This determines which kernel, devices, how much memory, etc. a Linode boots with.


val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up Configuration profiles for.

try {
    val result : LinodeConfig = apiInstance.addLinodeConfig(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#addLinodeConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#addLinodeConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinodeConfig**](LinodeConfig.md)| The parameters to set when creating the Configuration profile.
This determines which kernel, devices, how much memory, etc. a Linode boots with.
 |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up Configuration profiles for. |


### Return type

[**LinodeConfig**](LinodeConfig.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="addLinodeDisk"></a>
# **addLinodeDisk**
> Disk addLinodeDisk(body, linodeId)

Create Disk

Adds a new Disk to a Linode. You can optionally create a Disk from an Image (see [/images](/#operation/getImages) for a list of available public images, or use one of your own), and optionally provide a StackScript to deploy with this Disk. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : DiskRequest =  // DiskRequest | The parameters to set when creating the Disk.


val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

try {
    val result : Disk = apiInstance.addLinodeDisk(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#addLinodeDisk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#addLinodeDisk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DiskRequest**](DiskRequest.md)| The parameters to set when creating the Disk.
 |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |


### Return type

[**Disk**](Disk.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="addLinodeIP"></a>
# **addLinodeIP**
> IPAddress addLinodeIP(body, linodeId)

Allocate IPv4 Address

Allocates a public or private IPv4 address to a Linode. Public IP Addresses, after the one included with each Linode, incur an additional monthly charge. If you need an additional public IP Address you must request one - please [open a support ticket](/#operation/createTicket). You may not add more than one private IPv4 address to a single Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Body7 =  // Body7 | Information about the address you are creating.

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

try {
    val result : IPAddress = apiInstance.addLinodeIP(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#addLinodeIP")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#addLinodeIP")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body7**](Body7.md)| Information about the address you are creating. |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |


### Return type

[**IPAddress**](IPAddress.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="bootLinodeInstance"></a>
# **bootLinodeInstance**
> kotlin.Any bootLinodeInstance(linodeId, body)

Boot Linode

Boots a Linode you have permission to modify. If no parameters are given, a Config profile will be chosen for this boot based on the following criteria:  * If there is only one Config profile for this Linode, it will be used. * If there is more than one Config profile, the last booted config will be used. * If there is more than one Config profile and none were the last to be booted (because the   Linode was never booted or the last booted config was deleted) an error will be returned. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode to boot.

val body : Body3 =  // Body3 | Optional configuration to boot into (see above).

try {
    val result : kotlin.Any = apiInstance.bootLinodeInstance(linodeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#bootLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#bootLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode to boot. |
 **body** | [**Body3**](Body3.md)| Optional configuration to boot into (see above). | [optional]


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="cancelBackups"></a>
# **cancelBackups**
> kotlin.Any cancelBackups(linodeId)

Cancel Backups

Cancels the Backup service on the given Linode. Deletes all of this Linode&#x27;s existing backups forever. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode to cancel backup service for.

try {
    val result : kotlin.Any = apiInstance.cancelBackups(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#cancelBackups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#cancelBackups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode to cancel backup service for. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="cloneLinodeInstance"></a>
# **cloneLinodeInstance**
> kotlin.Any cloneLinodeInstance(body, linodeId)

Clone Linode

You can clone your Linode&#x27;s existing Disks or Configuration profiles to another Linode on your Account. In order for this request to complete successfully, your User must have the &#x60;add_linodes&#x60; grant. Cloning to a new Linode will incur a charge on your Account. If cloning to an existing Linode, any actions currently running or queued must be completed first before you can clone to it. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Body4 =  // Body4 | The requested state your Linode will be cloned into.

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to clone.

try {
    val result : kotlin.Any = apiInstance.cloneLinodeInstance(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#cloneLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#cloneLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body4**](Body4.md)| The requested state your Linode will be cloned into. |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to clone. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createLinodeInstance"></a>
# **createLinodeInstance**
> Linode createLinodeInstance(body)

Create Linode

Creates a Linode Instance on your Account. In order for this request to complete successfully, your User must have the &#x60;add_linodes&#x60; grant. Creating a new Linode will incur a charge on your Account.  Linodes can be created using one of the available Types. See [GET /linode/types](/#operation/getLinodeTypes) to get more information about each Type&#x27;s specs and cost.  Linodes can be created in any one of our available [Regions](/#operation/getRegions) for a list of available Regions you can deploy your Linode in.  Linodes can be created in a number of ways:  * Using a Linode Linux Distribution image or an Image you created based on another Linode.   * The Linode will be &#x60;running&#x60; after it completes &#x60;provisioning&#x60;.   * A default config with two Disks, one being a 512 swap disk, is created.     * &#x60;swap_size&#x60; can be used to customize the swap disk size.   * Requires a &#x60;root_pass&#x60; be supplied to use for the root User&#x27;s Account.   * It is recommended to supply SSH keys for the root User using the &#x60;authorized_keys&#x60; field.  * Using a StackScript.   * See [/linode/stackscripts](/#operation/getStackScripts) for     a list of available StackScripts.   * The Linode will be &#x60;running&#x60; after it completes &#x60;provisioning&#x60;.   * Requires a compatible Image to be supplied.     * See [/linode/stackscript/{stackscriptId}](/#operation/getStackScript) for compatible Images.   * Requires a &#x60;root_pass&#x60; be supplied to use for the root User&#x27;s Account.   * It is recommended to supply SSH keys for the root User using the &#x60;authorized_keys&#x60; field.  * Using one of your other Linode&#x27;s backups.   * You must create a Linode large enough to accommodate the Backup&#x27;s size.   * The Disks and Config will match that of the Linode that was backed up.   * The &#x60;root_pass&#x60; will match that of the Linode that was backed up.  * Create an empty Linode.   * The Linode will remain &#x60;offline&#x60; and must be manually started.     * See [POST /linode/instances/{linodeId}/boot](/#operation/bootLinodeInstance).   * Disks and Configs must be created manually.   * This is only recommended for advanced use cases. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Body =  // Body | The requested initial state of a new Linode.

try {
    val result : Linode = apiInstance.createLinodeInstance(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#createLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#createLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)| The requested initial state of a new Linode. |


### Return type

[**Linode**](Linode.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="createSnapshot"></a>
# **createSnapshot**
> Backup createSnapshot(body, linodeId)

Create Snapshot

Creates a snapshot Backup of a Linode. ** If you already have a snapshot of this Linode, this is a destructive action. The previous snapshot will be deleted.** 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Body1 =  // Body1 | The label for the new snapshot.

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode the backups belong to.

try {
    val result : Backup = apiInstance.createSnapshot(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#createSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#createSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body1**](Body1.md)| The label for the new snapshot. |
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode the backups belong to. |


### Return type

[**Backup**](Backup.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="deleteDisk"></a>
# **deleteDisk**
> kotlin.Any deleteDisk(linodeId, diskId)

Delete Disk

Deletes a Disk you have permission to &#x60;read_write&#x60;.  **Deleting a Disk is a destructive action and cannot be undone.** 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

val diskId : kotlin.Int = 56 // kotlin.Int | ID of the Disk to look up.

try {
    val result : kotlin.Any = apiInstance.deleteDisk(linodeId, diskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#deleteDisk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#deleteDisk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |
 **diskId** | [**kotlin.Int**](.md)| ID of the Disk to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteLinodeConfig"></a>
# **deleteLinodeConfig**
> kotlin.Any deleteLinodeConfig(linodeId, configId)

Delete Configuration Profile

Deletes the specified Configuration profile from the specified Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode whose Configuration profile to look up.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the Configuration profile to look up.

try {
    val result : kotlin.Any = apiInstance.deleteLinodeConfig(linodeId, configId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#deleteLinodeConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#deleteLinodeConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode whose Configuration profile to look up. |
 **configId** | [**kotlin.Int**](.md)| The ID of the Configuration profile to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="deleteLinodeInstance"></a>
# **deleteLinodeInstance**
> kotlin.Any deleteLinodeInstance(linodeId)

Delete Linode

Deletes a Linode you have permission to &#x60;read_write&#x60;.  **Deleting a Linode is a destructive action and cannot be undone.**  Additionally, deleting a Linode:    * Gives up any IP addresses the Linode was assigned.   * Deletes all Disks, Backups, Configs, etc.   * Stops billing for the Linode and its associated services. You will be billed for time used     within the billing period the Linode was active. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up

try {
    val result : kotlin.Any = apiInstance.deleteLinodeInstance(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#deleteLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#deleteLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="enableBackups"></a>
# **enableBackups**
> kotlin.Any enableBackups(linodeId)

Enable Backups

Enables backups for the specified Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode to enable backup service for.

try {
    val result : kotlin.Any = apiInstance.enableBackups(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#enableBackups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#enableBackups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode to enable backup service for. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getBackup"></a>
# **getBackup**
> Backup getBackup(linodeId, backupId)

View Backup

Returns information about a Backup. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode the Backup belongs to.

val backupId : kotlin.Int = 56 // kotlin.Int | The ID of the Backup to look up.

try {
    val result : Backup = apiInstance.getBackup(linodeId, backupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getBackup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getBackup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode the Backup belongs to. |
 **backupId** | [**kotlin.Int**](.md)| The ID of the Backup to look up. |


### Return type

[**Backup**](Backup.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getBackups"></a>
# **getBackups**
> InlineResponse20012 getBackups(linodeId)

List Backups

Returns information about this Linode&#x27;s available backups. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode the backups belong to.

try {
    val result : InlineResponse20012 = apiInstance.getBackups(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getBackups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getBackups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode the backups belong to. |


### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getKernel"></a>
# **getKernel**
> Kernel getKernel(kernelId)

View Kernel

Returns information about a single Kernel. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val kernelId : kotlin.String = kernelId_example // kotlin.String | ID of the Kernel to look up.

try {
    val result : Kernel = apiInstance.getKernel(kernelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getKernel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getKernel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kernelId** | [**kotlin.String**](.md)| ID of the Kernel to look up. |


### Return type

[**Kernel**](Kernel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getKernels"></a>
# **getKernels**
> InlineResponse20015 getKernels(page, pageSize)

List Kernels

Lists available Kernels. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20015 = apiInstance.getKernels(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getKernels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getKernels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeConfig"></a>
# **getLinodeConfig**
> LinodeConfig getLinodeConfig(linodeId, configId)

View Configuration Profile

Returns information about a specific Configuration profile. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode whose Configuration profile to look up.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the Configuration profile to look up.

try {
    val result : LinodeConfig = apiInstance.getLinodeConfig(linodeId, configId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode whose Configuration profile to look up. |
 **configId** | [**kotlin.Int**](.md)| The ID of the Configuration profile to look up. |


### Return type

[**LinodeConfig**](LinodeConfig.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeConfigs"></a>
# **getLinodeConfigs**
> InlineResponse20013 getLinodeConfigs(linodeId, page, pageSize)

List Configuration Profiles

Lists Configuration profiles associated with a Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up Configuration profiles for.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20013 = apiInstance.getLinodeConfigs(linodeId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeConfigs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeConfigs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up Configuration profiles for. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeDisk"></a>
# **getLinodeDisk**
> Disk getLinodeDisk(linodeId, diskId)

View Disk

View Disk information for a Disk associated with this Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

val diskId : kotlin.Int = 56 // kotlin.Int | ID of the Disk to look up.

try {
    val result : Disk = apiInstance.getLinodeDisk(linodeId, diskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeDisk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeDisk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |
 **diskId** | [**kotlin.Int**](.md)| ID of the Disk to look up. |


### Return type

[**Disk**](Disk.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeDisks"></a>
# **getLinodeDisks**
> InlineResponse20014 getLinodeDisks(linodeId, page, pageSize)

List Disks

View Disk information for Disks associated with this Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20014 = apiInstance.getLinodeDisks(linodeId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeDisks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeDisks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeIP"></a>
# **getLinodeIP**
> IPAddress getLinodeIP(linodeId, address)

View IP Address

View information about the specified IP address associated with the specified Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode to look up.

val address : kotlin.String = address_example // kotlin.String | The IP address to look up.

try {
    val result : IPAddress = apiInstance.getLinodeIP(linodeId, address)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeIP")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeIP")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode to look up. |
 **address** | [**kotlin.String**](.md)| The IP address to look up. |


### Return type

[**IPAddress**](IPAddress.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeIPs"></a>
# **getLinodeIPs**
> kotlin.Any getLinodeIPs(linodeId)

List Networking Information

Returns networking information for a single Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

try {
    val result : kotlin.Any = apiInstance.getLinodeIPs(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeIPs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeIPs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeInstance"></a>
# **getLinodeInstance**
> Linode getLinodeInstance(linodeId)

View Linode

Get a specific Linode by ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up

try {
    val result : Linode = apiInstance.getLinodeInstance(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up |


### Return type

[**Linode**](Linode.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeInstances"></a>
# **getLinodeInstances**
> InlineResponse20011 getLinodeInstances(page, pageSize)

List Linodes

Returns a paginated list of Linodes you have permission to view. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20011 = apiInstance.getLinodeInstances(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeInstances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeInstances")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeStats"></a>
# **getLinodeStats**
> LinodeStats getLinodeStats(linodeId)

View Current Month Statistics

Returns CPU, IO, IPv4, and IPv6 statistics for your Linode for the past 24 hours. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

try {
    val result : LinodeStats = apiInstance.getLinodeStats(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |


### Return type

[**LinodeStats**](LinodeStats.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeStatsByYearMonth"></a>
# **getLinodeStatsByYearMonth**
> LinodeStats getLinodeStatsByYearMonth(linodeId, year, month)

View Statistics (year/month)

Returns statistics for a specific month. The year/month values must be either a date in the past, or the current month. If the current month, statistics will be retrieved for the past 30 days. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

val year : kotlin.Int = 56 // kotlin.Int | Numeric value representing the year to look up.

val month : kotlin.Int = 56 // kotlin.Int | Numeric value representing the month to look up.

try {
    val result : LinodeStats = apiInstance.getLinodeStatsByYearMonth(linodeId, year, month)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeStatsByYearMonth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeStatsByYearMonth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |
 **year** | [**kotlin.Int**](.md)| Numeric value representing the year to look up. |
 **month** | [**kotlin.Int**](.md)| Numeric value representing the month to look up. | [enum: ]


### Return type

[**LinodeStats**](LinodeStats.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="getLinodeVolumes"></a>
# **getLinodeVolumes**
> InlineResponse20016 getLinodeVolumes(linodeId, page, pageSize)

List Linode&#x27;s Volumes

View Block Storage Volumes attached to this Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

val page : kotlin.Int = 56 // kotlin.Int | The page of a collection to return.

val pageSize : kotlin.Int = 56 // kotlin.Int | The number of items to return per page.

try {
    val result : InlineResponse20016 = apiInstance.getLinodeVolumes(linodeId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#getLinodeVolumes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#getLinodeVolumes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |
 **page** | [**kotlin.Int**](.md)| The page of a collection to return. | [optional] [enum: ]
 **pageSize** | [**kotlin.Int**](.md)| The number of items to return per page. | [optional] [enum: ]


### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="migrateLinodeInstance"></a>
# **migrateLinodeInstance**
> kotlin.Any migrateLinodeInstance(linodeId)

Initiate Pending Migration

In some circumstances, a Linode may have pending migrations scheduled that that you can initiate when convenient.  In these cases, a Notification will be returned from [GET /account/notifications](#getNotifications). This endpoint initiates the scheduled migration, which will shut the Linode down, migrate it, and then bring it back to its original state. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to migrate.

try {
    val result : kotlin.Any = apiInstance.migrateLinodeInstance(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#migrateLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#migrateLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to migrate. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="mutateLinodeInstance"></a>
# **mutateLinodeInstance**
> kotlin.Any mutateLinodeInstance(linodeId)

Upgrade Linode

Linodes created with now-deprecated Types are entitled to a free upgrade to the next generation. A mutating Linode will be allocated any new resources the upgraded Type provides, and will be subsequently restarted if it was currently running. If any actions are currently running or queued, those actions must be completed first before you can initiate a mutate. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to mutate.

try {
    val result : kotlin.Any = apiInstance.mutateLinodeInstance(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#mutateLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#mutateLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to mutate. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="rebootLinodeInstance"></a>
# **rebootLinodeInstance**
> kotlin.Any rebootLinodeInstance(linodeId, body)

Reboot Linode

Reboots a Linode you have permission to modify. If any actions are currently running or queued, those actions must be completed first before you can initiate a reboot. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the linode to reboot.

val body : Body9 =  // Body9 | Optional reboot parameters.

try {
    val result : kotlin.Any = apiInstance.rebootLinodeInstance(linodeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#rebootLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#rebootLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the linode to reboot. |
 **body** | [**Body9**](Body9.md)| Optional reboot parameters. | [optional]


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="rebuildLinodeInstance"></a>
# **rebuildLinodeInstance**
> Linode rebuildLinodeInstance(body, linodeId)

Rebuild Linode

Rebuilds a Linode you have the &#x60;read_write&#x60; permission to modify. A rebuild will first shut down the Linode, delete all disks and configs on the Linode, and then deploy a new &#x60;image&#x60; to the Linode with the given attributes. Additionally:    * Requires an &#x60;image&#x60; be supplied.   * Requires a &#x60;root_pass&#x60; be supplied to use for the root User&#x27;s Account.   * It is recommended to supply SSH keys for the root User using the     &#x60;authorized_keys&#x60; field. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : kotlin.Any =  // kotlin.Any | The requested state your Linode will be rebuilt into.

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to rebuild.

try {
    val result : Linode = apiInstance.rebuildLinodeInstance(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#rebuildLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#rebuildLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| The requested state your Linode will be rebuilt into. |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to rebuild. |


### Return type

[**Linode**](Linode.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="removeLinodeIP"></a>
# **removeLinodeIP**
> kotlin.Any removeLinodeIP(linodeId, address)

Delete IPv4 Address

Deletes a public IPv4 address associated with this Linode. This will fail if it is the Linode&#x27;s last remaining public IPv4 address. Private IPv4 addresses cannot be removed via this endpoint. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode to look up.

val address : kotlin.String = address_example // kotlin.String | The IP address to look up.

try {
    val result : kotlin.Any = apiInstance.removeLinodeIP(linodeId, address)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#removeLinodeIP")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#removeLinodeIP")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode to look up. |
 **address** | [**kotlin.String**](.md)| The IP address to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="rescueLinodeInstance"></a>
# **rescueLinodeInstance**
> kotlin.Any rescueLinodeInstance(linodeId, body)

Boot Linode into Rescue Mode

Rescue Mode is a safe environment for performing many system recovery and disk management tasks. Rescue Mode is based on the Finnix recovery distribution, a self-contained and bootable Linux distribution. You can also use Rescue Mode for tasks other than disaster recovery, such as formatting disks to use different filesystems, copying data between disks, and downloading files from a disk via SSH and SFTP. * Note that \&quot;sdh\&quot; is reserved and unavailable during rescue. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to rescue.

val body : Body11 =  // Body11 | Optional object of devices to be mounted.

try {
    val result : kotlin.Any = apiInstance.rescueLinodeInstance(linodeId, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#rescueLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#rescueLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to rescue. |
 **body** | [**Body11**](Body11.md)| Optional object of devices to be mounted. | [optional]


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="resetDiskPassword"></a>
# **resetDiskPassword**
> kotlin.Any resetDiskPassword(body, linodeId, diskId)

Reset Disk Root Password

Resets the password of a Disk you have permission to &#x60;read_write&#x60;. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Body5 =  // Body5 | The new password.

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

val diskId : kotlin.Int = 56 // kotlin.Int | ID of the Disk to look up.

try {
    val result : kotlin.Any = apiInstance.resetDiskPassword(body, linodeId, diskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#resetDiskPassword")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#resetDiskPassword")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body5**](Body5.md)| The new password. |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |
 **diskId** | [**kotlin.Int**](.md)| ID of the Disk to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="resizeDisk"></a>
# **resizeDisk**
> kotlin.Any resizeDisk(body, linodeId, diskId)

Resize Disk

Resizes a Disk you have permission to &#x60;read_write&#x60;. The Linode this Disk is attached to must be shut down for resizing to take effect. If you are resizing the Disk to a smaller size, it cannot be made smaller than what is required by the total size of the files current on the Disk. The Disk must not be in use. If the Disk is in use, the request will succeed but the resize will ultimately fail. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Body6 =  // Body6 | The new size of the Disk.

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

val diskId : kotlin.Int = 56 // kotlin.Int | ID of the Disk to look up.

try {
    val result : kotlin.Any = apiInstance.resizeDisk(body, linodeId, diskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#resizeDisk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#resizeDisk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body6**](Body6.md)| The new size of the Disk. |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |
 **diskId** | [**kotlin.Int**](.md)| ID of the Disk to look up. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="resizeLinodeInstance"></a>
# **resizeLinodeInstance**
> kotlin.Any resizeLinodeInstance(body, linodeId)

Resize Linode

Resizes a Linode you have the &#x60;read_write&#x60; permission to a different Type. If any actions are currently running or queued, those actions must be completed first before you can initiate a resize. Additionally, the following criteria must be met in order to resize a Linode:    * Any pending free upgrades to the Linode&#x27;s current Type must be performed   before a resize can occur.   * The Linode must not have a pending migration.   * Your Account cannot have an outstanding balance.   * The Linode must not have more disk allocation than the new Type allows.     * In that situation, you must first delete or resize the disk to be smaller. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Body12 =  // Body12 | The Type your current Linode will resize to.

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to resize.

try {
    val result : kotlin.Any = apiInstance.resizeLinodeInstance(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#resizeLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#resizeLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body12**](Body12.md)| The Type your current Linode will resize to. |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to resize. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="restoreBackup"></a>
# **restoreBackup**
> kotlin.Any restoreBackup(body, linodeId, backupId)

Restore Backup

Restores a Linode&#x27;s Backup to the specified Linode. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Body2 =  // Body2 | Parameters to provide when restoring the Backup.

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode that the Backup belongs to.

val backupId : kotlin.Int = 56 // kotlin.Int | The ID of the Backup to restore.

try {
    val result : kotlin.Any = apiInstance.restoreBackup(body, linodeId, backupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#restoreBackup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#restoreBackup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body2**](Body2.md)| Parameters to provide when restoring the Backup. |
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode that the Backup belongs to. |
 **backupId** | [**kotlin.Int**](.md)| The ID of the Backup to restore. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="shutdownLinodeInstance"></a>
# **shutdownLinodeInstance**
> kotlin.Any shutdownLinodeInstance(linodeId)

Shut Down Linode

Shuts down a Linode you have permission to modify. If any actions are currently running or queued, those actions must be completed first before you can initiate a shutdown. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to shutdown.

try {
    val result : kotlin.Any = apiInstance.shutdownLinodeInstance(linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#shutdownLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#shutdownLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to shutdown. |


### Return type

**kotlin.Any**

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 


<a name="updateDisk"></a>
# **updateDisk**
> Disk updateDisk(body, linodeId, diskId)

Update Disk

Updates a Disk that you have permission to &#x60;read_write&#x60;. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : Disk =  // Disk | Updates the parameters of a single Disk.


val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up.

val diskId : kotlin.Int = 56 // kotlin.Int | ID of the Disk to look up.

try {
    val result : Disk = apiInstance.updateDisk(body, linodeId, diskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#updateDisk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#updateDisk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Disk**](Disk.md)| Updates the parameters of a single Disk.
 |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up. |
 **diskId** | [**kotlin.Int**](.md)| ID of the Disk to look up. |


### Return type

[**Disk**](Disk.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateLinodeConfig"></a>
# **updateLinodeConfig**
> LinodeConfig updateLinodeConfig(body, linodeId, configId)

Update Configuration Profile

Updates a Configuration profile. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : LinodeConfig =  // LinodeConfig | The Configuration profile parameters to modify.

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode whose Configuration profile to look up.

val configId : kotlin.Int = 56 // kotlin.Int | The ID of the Configuration profile to look up.

try {
    val result : LinodeConfig = apiInstance.updateLinodeConfig(body, linodeId, configId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#updateLinodeConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#updateLinodeConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinodeConfig**](LinodeConfig.md)| The Configuration profile parameters to modify. |
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode whose Configuration profile to look up. |
 **configId** | [**kotlin.Int**](.md)| The ID of the Configuration profile to look up. |


### Return type

[**LinodeConfig**](LinodeConfig.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateLinodeIP"></a>
# **updateLinodeIP**
> IPAddress updateLinodeIP(linodeId, address, body)

Update IP Address

Updates a particular IP Address associated with this Linode. Only allows setting/resetting reverse DNS. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val linodeId : kotlin.Int = 56 // kotlin.Int | The ID of the Linode to look up.

val address : kotlin.String = address_example // kotlin.String | The IP address to look up.

val body : Body8 =  // Body8 | The information to update for the IP address.

try {
    val result : IPAddress = apiInstance.updateLinodeIP(linodeId, address, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#updateLinodeIP")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#updateLinodeIP")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linodeId** | [**kotlin.Int**](.md)| The ID of the Linode to look up. |
 **address** | [**kotlin.String**](.md)| The IP address to look up. |
 **body** | [**Body8**](Body8.md)| The information to update for the IP address. | [optional]


### Return type

[**IPAddress**](IPAddress.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 


<a name="updateLinodeInstance"></a>
# **updateLinodeInstance**
> Linode updateLinodeInstance(body, linodeId)

Update Linode

Updates a Linode that you have permission to &#x60;read_write&#x60;. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*


val apiInstance = LinodeInstancesApi()

val body : kotlin.Any =  // kotlin.Any | Any field that is not marked as `readOnly` may be updated. Fields that are marked `readOnly` will be ignored. If any updated field fails to pass validation, the Linode will not be updated.


val linodeId : kotlin.Int = 56 // kotlin.Int | ID of the Linode to look up

try {
    val result : Linode = apiInstance.updateLinodeInstance(body, linodeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LinodeInstancesApi#updateLinodeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LinodeInstancesApi#updateLinodeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Any**](kotlin.Any.md)| Any field that is not marked as &#x60;readOnly&#x60; may be updated. Fields that are marked &#x60;readOnly&#x60; will be ignored. If any updated field fails to pass validation, the Linode will not be updated.
 |
 **linodeId** | [**kotlin.Int**](.md)| ID of the Linode to look up |


### Return type

[**Linode**](Linode.md)

### Authorization

[oauth](../README.md#oauth), [personalAccessToken](../README.md#personalAccessToken)

### HTTP request headers

 - **Content-Type**: 
 - **Accept**: 



