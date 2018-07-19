/**
* Linode API
* # Introduction The Linode API provides the ability to programmatically manage the full range of Linode products and services.  This reference is designed to assist application developers and system administrators.  Each endpoint includes descriptions, request syntax, and examples using standard HTTP requests. Response data is returned in JSON format.   This document was generated from our OpenAPI Specification.  See the [OpenAPI website](https://www.openapis.org) for more information.  [Download the Linode OpenAPI Specification](/openapi.yaml)   # Changelog  [View our Changelog](/changelog) to see release notes on all changes made to our API.  # Access and Authentication  Some endpoints are publicly accessible without requiring authentication. All endpoints affecting your Account, however, require either a Personal Access Token or OAuth authentication (when using third-party applications).  ## Personal Access Token  The easiest way to access the API is with a Personal Access Token (PAT) generated from the [Linode Cloud Manager](https://cloud.linode.com/profile/tokens).  All scopes for the OAuth security model (defined below) apply to this security model as well.  ### Authentication  | Security Scheme Type: | HTTP | |-----------------------|------| | **HTTP Authorization Scheme** | bearer |  ## OAuth  The OAuth workflow is a three-step process to authenticate a User before an application can start making API calls on the User's behalf. If all you need is a Personal Access Token, feel free to skip ahead to the next section.  First, the User visits the application's website and is directed to log with Linode. The User is then redirected to Linode's authentication server and presented the scope levels the application is requesting. Once the User accepts the request for access, we redirect them back to the application's specified redirect URI with an access code.  Once the User has logged in to Linode and you have received an exchange code, you will need to exchange that access code for an Authorization token. You do this by making an HTTP POST request to the following address:  ``` https://login.linode.com/oauth/token ```  Make this request as `application/x-www-form-urlencoded` or as `multipart/form-data` and include the following parameters in the POST body:  | PARAMETER | DESCRIPTION | |-----------|-------------| | client_id | Your app's client ID | | client_secret | Your app's client secret | | code | The code you just received from the redirect |  You'll get a reponse like this:  ```json {   \"scope\": \"linodes:create\",   \"access_token\": \"03d084436a6c91fbafd5c4b20c82e5056a2e9ce1635920c30dc8d81dc7a6665c\"   \"token_type\": \"bearer\",   \"expires_in\": 7200, } ```  Included in the reponse is `access_token`. With this token, you can proceed to make authenticated HTTP requests to the API by adding this header to each request:  ``` Authorization: Bearer 03d084436a6c91fbafd5c4b20c82e5056a2e9ce1635920c30dc8d81dc7a6665c ```  ### Authentication  | Security Scheme Type: | Oauth2 | |-----------------------|--------| | **AuthorizationCode Oauth Flow** |  **Authorization URL:** https://login.linode.com/oauth/authorize<br />**Token URL:** https://login.linode.com/oauth/token<br />**Scopes:**<br /><ul><li>`account:read_only` - Allows access to GET information about your Account.</li><li>`account:read_write` - Allows access to all endpoints related to your Account.</li><li>`domains:read_only` - Allows access to GET Domains on your Account.</li><li>`domains:read_write` - Allows access to all Domain endpoints.</li><li>`events:read_only` - Allows access to GET your Events.</li><li>`events:read_write` - Allows access to all endpoints related to your Events.</li><li>`images:read_only` - Allows access to GET your Images.</li><li>`images:read_write` - Allows access to all endpoints related to your Images.</li><li>`ips:read_only` - Allows access to GET your ips.</li><li>`ips:read_write` - Allows access to all endpoints related to your ips.</li><li>`linodes:read_only` - Allows access to GET Linodes on your Account.</li><li>`linodes:read_write` - Allow access to all endpoints related to your Linodes.</li><li>`longview:read_only` - Allows access to GET your Longview Clients.</li><li>`longview:read_write` - Allows access to all endpoints related to your Longview Clients.</li><li>`nodebalancers:read_only` - Allows access to GET NodeBalancers on your Account.</li><li>`nodebalancers:read_write` - Allows access to all NodeBalancer endpoints.</li><li>`stackscripts:read_only` - Allows access to GET your StackScripts.</li><li>`stackscripts:read_write` - Allows access to all endpoints related to your StackScripts.</li><li>`volumes:read_only` - Allows access to GET your Volumes.</li><li>`volumes:read_write` - Allows access to all endpoints related to your Volumes.</li></ul><br />|  # Requests  Requests must be made over HTTPS to ensure transactions are encrypted. The following Request methods are supported:  | METHOD | USAGE | |--------|-------| | GET    | Retrieves data about collections and individual resources. | | POST   | For collections, creates a new resource of that type. Also used to perform actions on action endpoints. | | PUT    | Updates an existing resource. | | DELETE | Deletes a resource. This is a destructive action. |   # Responses  Actions will return one following HTTP response status codes:  | STATUS  | DESCRIPTION | |---------|-------------| | 200 OK  | The request was successful. | | 204 No Content | The server successfully fulfilled the request and there is no additional content to send. | | 400 Bad Request | You submitted an invalid request (missing parameters, etc.). | | 401 Unauthorized | You failed to authenticate for this resource. | | 403 Forbidden | You are authenticated, but don't have permission to do this. | | 404 Not Found | The resource you're requesting does not exist. | | 429 Too Many Requests | You've hit a rate limit. | | 500 Internal Server Error | Please [open a Support Ticket](/#operation/createTicket). |  # Errors  Success is indicated via [Standard HTTP status codes](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). `2xx` codes indicate success, `4xx` codes indicate a request error, and `5xx` errors indicate a server error. A request error might be an invalid input, a required parameter being omitted, or a malformed request. A server error means something went wrong processing your request. If this occurs, please [open a Support Ticket](/#operation/createTicket) and let us know. Though errors are logged and we work quickly to resolve issues, opening a ticket and providing us with reproducable steps and data is always helpful.  The `errors` field is an array of the things that went wrong with your request. We will try to include as many of the problems in the response as possible, but it's conceivable that fixing these errors and resubmitting may result in new errors coming back once we are able to get further along in the process of handling your request.   Within each error object, the `field` parameter will be included if the error pertains to a specific field in the JSON you've submitted. This will be omitted if there is no relevant field. The `reason` is a human-readable explanation of the error, and will always be included.  # Pagination  Resource lists are always paginated. The response will look similar to this:  ```json {     \"data\": [ ... ],     \"page\": 1,     \"pages\": 3,     \"results\": 300 } ```  Pages start at 1. You may retrieve a specific page of results by adding `?page=x` to your URL (for example, `?page=4`). Page sizes default to 100, and can be set to return between 25 and 100. Page size can be set using `?page_size=x`.  # Filtering and Sorting  Collections are searchable by fields they include, marked in the spec as `x-linode-filterable: true`. Filters are passed in the `X-Filter` header and are formatted as JSON objects. Here is a request call for Linode Types in our \"standard\" class:  ```Shell curl \"https://api.linode.com/v4/linode/types\" \\   -H 'X-Filter: { \\     \"class\": \"standard\"   }' ```  The filter object's keys are the keys of the object you're filtering, and the values are accepted values. You can add multiple filters by including more than one key. For example, filtering for \"standard\" Linode Types that offer one vcpu:  ```Shell  curl \"https://api.linode.com/v4/linode/types\" \\   -H 'X-Filter: { \\     \"class\": \"standard\",     \"vcpus\": 1   }' ```  In the above example, both filters are combined with an \"and\" operation. However, if you wanted either Types with one vcpu or Types in our \"standard\" class, you can add an operator:  ```Shell curl \"https://api.linode.com/v4/linode/types\" \\   -H 'X-Filter: {     \"+or\": [       { \"vcpus\": 1 },       { \"class\": \"standard\" }     ]   }' ```  Each filter in the `+or` array is its own filter object, and all conditions in it are combined with an \"and\" operation as they were in the previous example.  Other operators are also available. Operators are keys of a Filter JSON object. Their value must be of the appropriate type, and they are evaluated as described below:  | OPERATOR | TYPE   | DESCRIPTION                       | |----------|--------|-----------------------------------| | +and     | array  | All conditions must be true.       | | +or      | array  | One condition must be true.        | | +gt      | number | Value must be greater than number. | | +gte     | number | Value must be greater than or equal to number. | | +lt      | number | Value must be less than number. | | +lte     | number | Value must be less than or equal to number. | | +contains | string | Given string must be in the value. | | +neq      | string | Does not equal the value.          | | +order_by | string | Attribute to order the results by - must be filterable. | | +order    | string | Either \"asc\" or \"desc\". Defaults to \"asc\". Requires `+order_by`. |  For example, filtering for [Linode Types](/#operation/getLinodeTypes) that offer memory equal to or higher than 61440:  ```Shell curl \"https://api.linode.com/v4/linode/types\" \\   -H 'X-Filter: {     \"memory\": {       \"+gte\": 61440     }   }' ```  You can combine and nest operators to construct arbitrarily-complex queries. For example, give me all [Linode Types](/#operation/getLinodeTypes) which are either `standard` or `highmem` class, and have between 12 and 20 vcpus:  ```Shell curl \"https://api.linode.com/v4/linode/types\" \\   -H 'X-Filter: {     \"+or\": [       {         \"+or\": [           {             \"class\": \"standard\"           },           {             \"class\": \"highmem\"           }         ]       },       {         \"+and\": [           {             \"vcpus\": {               \"+gte\": 12             }           },           {             \"vcpus\": {               \"+lte\": 20             }           }         ]       }     ]   }' ```  # CLI (Command Line Interface)  The [Linode CLI](https://github.com/linode/linode-cli) allows you to easily work with the API using intuitive and simple syntax. It requires a [Personal Access Token](/#section/Personal-Access-Token) for authentication, and gives you access to all of the features and functionality of the Linode API that are documented here with CLI examples.  Endpoints that do not have CLI examples are currently unavailable through the CLI, but can be accessed via other methods such as Shell commands and other third-party applications. 
*
* OpenAPI spec version: 4.0.3
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.apis

import io.swagger.client.models.Backup
import io.swagger.client.models.Body
import io.swagger.client.models.Body1
import io.swagger.client.models.Body11
import io.swagger.client.models.Body12
import io.swagger.client.models.Body2
import io.swagger.client.models.Body3
import io.swagger.client.models.Body4
import io.swagger.client.models.Body5
import io.swagger.client.models.Body6
import io.swagger.client.models.Body7
import io.swagger.client.models.Body8
import io.swagger.client.models.Body9
import io.swagger.client.models.Disk
import io.swagger.client.models.DiskRequest
import io.swagger.client.models.IPAddress
import io.swagger.client.models.InlineResponse20011
import io.swagger.client.models.InlineResponse20012
import io.swagger.client.models.InlineResponse20013
import io.swagger.client.models.InlineResponse20014
import io.swagger.client.models.InlineResponse20015
import io.swagger.client.models.InlineResponse20016
import io.swagger.client.models.InlineResponseDefault
import io.swagger.client.models.Kernel
import io.swagger.client.models.Linode
import io.swagger.client.models.LinodeConfig
import io.swagger.client.models.LinodeStats


import io.swagger.client.infrastructure.*



class LinodeInstancesApi(basePath: kotlin.String = "https://api.linode.com/v4") : ApiClient(basePath) {

    
    /**
    * Create Configuration Profile
    * Adds a new Configuration profile to a Linode. 
    * @param body The parameters to set when creating the Configuration profile.
This determines which kernel, devices, how much memory, etc. a Linode boots with.
 
    * @param linodeId ID of the Linode to look up Configuration profiles for. 
    * @return LinodeConfig
    */
    @Suppress("UNCHECKED_CAST")
    fun addLinodeConfig(body: LinodeConfig, linodeId: kotlin.Int) : LinodeConfig {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/configs".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LinodeConfig>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LinodeConfig
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Create Disk
    * Adds a new Disk to a Linode. You can optionally create a Disk from an Image (see [/images](/#operation/getImages) for a list of available public images, or use one of your own), and optionally provide a StackScript to deploy with this Disk. 
    * @param body The parameters to set when creating the Disk.
 
    * @param linodeId ID of the Linode to look up. 
    * @return Disk
    */
    @Suppress("UNCHECKED_CAST")
    fun addLinodeDisk(body: DiskRequest, linodeId: kotlin.Int) : Disk {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/disks".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Disk>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Disk
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Allocate IPv4 Address
    * Allocates a public or private IPv4 address to a Linode. Public IP Addresses, after the one included with each Linode, incur an additional monthly charge. If you need an additional public IP Address you must request one - please [open a support ticket](/#operation/createTicket). You may not add more than one private IPv4 address to a single Linode. 
    * @param body Information about the address you are creating. 
    * @param linodeId ID of the Linode to look up. 
    * @return IPAddress
    */
    @Suppress("UNCHECKED_CAST")
    fun addLinodeIP(body: Body7, linodeId: kotlin.Int) : IPAddress {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/ips".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<IPAddress>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as IPAddress
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Boot Linode
    * Boots a Linode you have permission to modify. If no parameters are given, a Config profile will be chosen for this boot based on the following criteria:  * If there is only one Config profile for this Linode, it will be used. * If there is more than one Config profile, the last booted config will be used. * If there is more than one Config profile and none were the last to be booted (because the   Linode was never booted or the last booted config was deleted) an error will be returned. 
    * @param linodeId The ID of the Linode to boot. 
    * @param body Optional configuration to boot into (see above). (optional)
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun bootLinodeInstance(linodeId: kotlin.Int, body: Body3) : kotlin.Any {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/boot".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Cancel Backups
    * Cancels the Backup service on the given Linode. Deletes all of this Linode&#x27;s existing backups forever. 
    * @param linodeId The ID of the Linode to cancel backup service for. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun cancelBackups(linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/backups/cancel".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Clone Linode
    * You can clone your Linode&#x27;s existing Disks or Configuration profiles to another Linode on your Account. In order for this request to complete successfully, your User must have the &#x60;add_linodes&#x60; grant. Cloning to a new Linode will incur a charge on your Account. If cloning to an existing Linode, any actions currently running or queued must be completed first before you can clone to it. 
    * @param body The requested state your Linode will be cloned into. 
    * @param linodeId ID of the Linode to clone. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun cloneLinodeInstance(body: Body4, linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/clone".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Create Linode
    * Creates a Linode Instance on your Account. In order for this request to complete successfully, your User must have the &#x60;add_linodes&#x60; grant. Creating a new Linode will incur a charge on your Account.  Linodes can be created using one of the available Types. See [GET /linode/types](/#operation/getLinodeTypes) to get more information about each Type&#x27;s specs and cost.  Linodes can be created in any one of our available [Regions](/#operation/getRegions) for a list of available Regions you can deploy your Linode in.  Linodes can be created in a number of ways:  * Using a Linode Linux Distribution image or an Image you created based on another Linode.   * The Linode will be &#x60;running&#x60; after it completes &#x60;provisioning&#x60;.   * A default config with two Disks, one being a 512 swap disk, is created.     * &#x60;swap_size&#x60; can be used to customize the swap disk size.   * Requires a &#x60;root_pass&#x60; be supplied to use for the root User&#x27;s Account.   * It is recommended to supply SSH keys for the root User using the &#x60;authorized_keys&#x60; field.  * Using a StackScript.   * See [/linode/stackscripts](/#operation/getStackScripts) for     a list of available StackScripts.   * The Linode will be &#x60;running&#x60; after it completes &#x60;provisioning&#x60;.   * Requires a compatible Image to be supplied.     * See [/linode/stackscript/{stackscriptId}](/#operation/getStackScript) for compatible Images.   * Requires a &#x60;root_pass&#x60; be supplied to use for the root User&#x27;s Account.   * It is recommended to supply SSH keys for the root User using the &#x60;authorized_keys&#x60; field.  * Using one of your other Linode&#x27;s backups.   * You must create a Linode large enough to accommodate the Backup&#x27;s size.   * The Disks and Config will match that of the Linode that was backed up.   * The &#x60;root_pass&#x60; will match that of the Linode that was backed up.  * Create an empty Linode.   * The Linode will remain &#x60;offline&#x60; and must be manually started.     * See [POST /linode/instances/{linodeId}/boot](/#operation/bootLinodeInstance).   * Disks and Configs must be created manually.   * This is only recommended for advanced use cases. 
    * @param body The requested initial state of a new Linode. 
    * @return Linode
    */
    @Suppress("UNCHECKED_CAST")
    fun createLinodeInstance(body: Body) : Linode {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Linode>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Linode
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Create Snapshot
    * Creates a snapshot Backup of a Linode. ** If you already have a snapshot of this Linode, this is a destructive action. The previous snapshot will be deleted.** 
    * @param body The label for the new snapshot. 
    * @param linodeId The ID of the Linode the backups belong to. 
    * @return Backup
    */
    @Suppress("UNCHECKED_CAST")
    fun createSnapshot(body: Body1, linodeId: kotlin.Int) : Backup {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/backups".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Backup>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Backup
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Delete Disk
    * Deletes a Disk you have permission to &#x60;read_write&#x60;.  **Deleting a Disk is a destructive action and cannot be undone.** 
    * @param linodeId ID of the Linode to look up. 
    * @param diskId ID of the Disk to look up. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun deleteDisk(linodeId: kotlin.Int, diskId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/linode/instances/{linodeId}/disks/{diskId}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"diskId"+"}", "$diskId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Delete Configuration Profile
    * Deletes the specified Configuration profile from the specified Linode. 
    * @param linodeId The ID of the Linode whose Configuration profile to look up. 
    * @param configId The ID of the Configuration profile to look up. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun deleteLinodeConfig(linodeId: kotlin.Int, configId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/linode/instances/{linodeId}/configs/{configId}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"configId"+"}", "$configId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Delete Linode
    * Deletes a Linode you have permission to &#x60;read_write&#x60;.  **Deleting a Linode is a destructive action and cannot be undone.**  Additionally, deleting a Linode:    * Gives up any IP addresses the Linode was assigned.   * Deletes all Disks, Backups, Configs, etc.   * Stops billing for the Linode and its associated services. You will be billed for time used     within the billing period the Linode was active. 
    * @param linodeId ID of the Linode to look up 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun deleteLinodeInstance(linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/linode/instances/{linodeId}".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Enable Backups
    * Enables backups for the specified Linode. 
    * @param linodeId The ID of the Linode to enable backup service for. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun enableBackups(linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/backups/enable".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * View Backup
    * Returns information about a Backup. 
    * @param linodeId The ID of the Linode the Backup belongs to. 
    * @param backupId The ID of the Backup to look up. 
    * @return Backup
    */
    @Suppress("UNCHECKED_CAST")
    fun getBackup(linodeId: kotlin.Int, backupId: kotlin.Int) : Backup {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/backups/{backupId}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"backupId"+"}", "$backupId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Backup>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Backup
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * List Backups
    * Returns information about this Linode&#x27;s available backups. 
    * @param linodeId The ID of the Linode the backups belong to. 
    * @return InlineResponse20012
    */
    @Suppress("UNCHECKED_CAST")
    fun getBackups(linodeId: kotlin.Int) : InlineResponse20012 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/backups".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse20012>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse20012
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * View Kernel
    * Returns information about a single Kernel. 
    * @param kernelId ID of the Kernel to look up. 
    * @return Kernel
    */
    @Suppress("UNCHECKED_CAST")
    fun getKernel(kernelId: kotlin.String) : Kernel {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/kernels/{kernelId}".replace("{"+"kernelId"+"}", "$kernelId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Kernel>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Kernel
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * List Kernels
    * Lists available Kernels. 
    * @param page The page of a collection to return. (optional)
    * @param pageSize The number of items to return per page. (optional)
    * @return InlineResponse20015
    */
    @Suppress("UNCHECKED_CAST")
    fun getKernels(page: kotlin.Int, pageSize: kotlin.Int) : InlineResponse20015 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "page_size" to listOf("$pageSize"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/kernels",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse20015>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse20015
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * View Configuration Profile
    * Returns information about a specific Configuration profile. 
    * @param linodeId The ID of the Linode whose Configuration profile to look up. 
    * @param configId The ID of the Configuration profile to look up. 
    * @return LinodeConfig
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeConfig(linodeId: kotlin.Int, configId: kotlin.Int) : LinodeConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/configs/{configId}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"configId"+"}", "$configId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LinodeConfig>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LinodeConfig
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * List Configuration Profiles
    * Lists Configuration profiles associated with a Linode. 
    * @param linodeId ID of the Linode to look up Configuration profiles for. 
    * @param page The page of a collection to return. (optional)
    * @param pageSize The number of items to return per page. (optional)
    * @return InlineResponse20013
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeConfigs(linodeId: kotlin.Int, page: kotlin.Int, pageSize: kotlin.Int) : InlineResponse20013 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "page_size" to listOf("$pageSize"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/configs".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse20013>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse20013
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * View Disk
    * View Disk information for a Disk associated with this Linode. 
    * @param linodeId ID of the Linode to look up. 
    * @param diskId ID of the Disk to look up. 
    * @return Disk
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeDisk(linodeId: kotlin.Int, diskId: kotlin.Int) : Disk {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/disks/{diskId}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"diskId"+"}", "$diskId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Disk>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Disk
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * List Disks
    * View Disk information for Disks associated with this Linode. 
    * @param linodeId ID of the Linode to look up. 
    * @param page The page of a collection to return. (optional)
    * @param pageSize The number of items to return per page. (optional)
    * @return InlineResponse20014
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeDisks(linodeId: kotlin.Int, page: kotlin.Int, pageSize: kotlin.Int) : InlineResponse20014 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "page_size" to listOf("$pageSize"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/disks".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse20014>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse20014
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * View IP Address
    * View information about the specified IP address associated with the specified Linode. 
    * @param linodeId The ID of the Linode to look up. 
    * @param address The IP address to look up. 
    * @return IPAddress
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeIP(linodeId: kotlin.Int, address: kotlin.String) : IPAddress {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/ips/{address}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"address"+"}", "$address"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<IPAddress>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as IPAddress
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * List Networking Information
    * Returns networking information for a single Linode. 
    * @param linodeId ID of the Linode to look up. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeIPs(linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/ips".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * View Linode
    * Get a specific Linode by ID.
    * @param linodeId ID of the Linode to look up 
    * @return Linode
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeInstance(linodeId: kotlin.Int) : Linode {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Linode>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Linode
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * List Linodes
    * Returns a paginated list of Linodes you have permission to view. 
    * @param page The page of a collection to return. (optional)
    * @param pageSize The number of items to return per page. (optional)
    * @return InlineResponse20011
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeInstances(page: kotlin.Int, pageSize: kotlin.Int) : InlineResponse20011 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "page_size" to listOf("$pageSize"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse20011>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse20011
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * View Current Month Statistics
    * Returns CPU, IO, IPv4, and IPv6 statistics for your Linode for the past 24 hours. 
    * @param linodeId ID of the Linode to look up. 
    * @return LinodeStats
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeStats(linodeId: kotlin.Int) : LinodeStats {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/stats".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LinodeStats>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LinodeStats
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * View Statistics (year/month)
    * Returns statistics for a specific month. The year/month values must be either a date in the past, or the current month. If the current month, statistics will be retrieved for the past 30 days. 
    * @param linodeId ID of the Linode to look up. 
    * @param year Numeric value representing the year to look up. 
    * @param month Numeric value representing the month to look up. 
    * @return LinodeStats
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeStatsByYearMonth(linodeId: kotlin.Int, year: kotlin.Int, month: kotlin.Int) : LinodeStats {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/stats/{year}/{month}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"year"+"}", "$year").replace("{"+"month"+"}", "$month"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LinodeStats>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LinodeStats
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * List Linode&#x27;s Volumes
    * View Block Storage Volumes attached to this Linode. 
    * @param linodeId ID of the Linode to look up. 
    * @param page The page of a collection to return. (optional)
    * @param pageSize The number of items to return per page. (optional)
    * @return InlineResponse20016
    */
    @Suppress("UNCHECKED_CAST")
    fun getLinodeVolumes(linodeId: kotlin.Int, page: kotlin.Int, pageSize: kotlin.Int) : InlineResponse20016 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "page_size" to listOf("$pageSize"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/linode/instances/{linodeId}/volumes".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<InlineResponse20016>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse20016
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Initiate Pending Migration
    * In some circumstances, a Linode may have pending migrations scheduled that that you can initiate when convenient.  In these cases, a Notification will be returned from [GET /account/notifications](#getNotifications). This endpoint initiates the scheduled migration, which will shut the Linode down, migrate it, and then bring it back to its original state. 
    * @param linodeId ID of the Linode to migrate. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun migrateLinodeInstance(linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/migrate".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Upgrade Linode
    * Linodes created with now-deprecated Types are entitled to a free upgrade to the next generation. A mutating Linode will be allocated any new resources the upgraded Type provides, and will be subsequently restarted if it was currently running. If any actions are currently running or queued, those actions must be completed first before you can initiate a mutate. 
    * @param linodeId ID of the Linode to mutate. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun mutateLinodeInstance(linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/mutate".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Reboot Linode
    * Reboots a Linode you have permission to modify. If any actions are currently running or queued, those actions must be completed first before you can initiate a reboot. 
    * @param linodeId ID of the linode to reboot. 
    * @param body Optional reboot parameters. (optional)
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun rebootLinodeInstance(linodeId: kotlin.Int, body: Body9) : kotlin.Any {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/reboot".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Rebuild Linode
    * Rebuilds a Linode you have the &#x60;read_write&#x60; permission to modify. A rebuild will first shut down the Linode, delete all disks and configs on the Linode, and then deploy a new &#x60;image&#x60; to the Linode with the given attributes. Additionally:    * Requires an &#x60;image&#x60; be supplied.   * Requires a &#x60;root_pass&#x60; be supplied to use for the root User&#x27;s Account.   * It is recommended to supply SSH keys for the root User using the     &#x60;authorized_keys&#x60; field. 
    * @param body The requested state your Linode will be rebuilt into. 
    * @param linodeId ID of the Linode to rebuild. 
    * @return Linode
    */
    @Suppress("UNCHECKED_CAST")
    fun rebuildLinodeInstance(body: kotlin.Any, linodeId: kotlin.Int) : Linode {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/rebuild".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Linode>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Linode
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Delete IPv4 Address
    * Deletes a public IPv4 address associated with this Linode. This will fail if it is the Linode&#x27;s last remaining public IPv4 address. Private IPv4 addresses cannot be removed via this endpoint. 
    * @param linodeId The ID of the Linode to look up. 
    * @param address The IP address to look up. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun removeLinodeIP(linodeId: kotlin.Int, address: kotlin.String) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/linode/instances/{linodeId}/ips/{address}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"address"+"}", "$address"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Boot Linode into Rescue Mode
    * Rescue Mode is a safe environment for performing many system recovery and disk management tasks. Rescue Mode is based on the Finnix recovery distribution, a self-contained and bootable Linux distribution. You can also use Rescue Mode for tasks other than disaster recovery, such as formatting disks to use different filesystems, copying data between disks, and downloading files from a disk via SSH and SFTP. * Note that \&quot;sdh\&quot; is reserved and unavailable during rescue. 
    * @param linodeId ID of the Linode to rescue. 
    * @param body Optional object of devices to be mounted. (optional)
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun rescueLinodeInstance(linodeId: kotlin.Int, body: Body11) : kotlin.Any {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/rescue".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Reset Disk Root Password
    * Resets the password of a Disk you have permission to &#x60;read_write&#x60;. 
    * @param body The new password. 
    * @param linodeId ID of the Linode to look up. 
    * @param diskId ID of the Disk to look up. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun resetDiskPassword(body: Body5, linodeId: kotlin.Int, diskId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/disks/{diskId}/password".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"diskId"+"}", "$diskId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Resize Disk
    * Resizes a Disk you have permission to &#x60;read_write&#x60;. The Linode this Disk is attached to must be shut down for resizing to take effect. If you are resizing the Disk to a smaller size, it cannot be made smaller than what is required by the total size of the files current on the Disk. The Disk must not be in use. If the Disk is in use, the request will succeed but the resize will ultimately fail. 
    * @param body The new size of the Disk. 
    * @param linodeId ID of the Linode to look up. 
    * @param diskId ID of the Disk to look up. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun resizeDisk(body: Body6, linodeId: kotlin.Int, diskId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/disks/{diskId}/resize".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"diskId"+"}", "$diskId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Resize Linode
    * Resizes a Linode you have the &#x60;read_write&#x60; permission to a different Type. If any actions are currently running or queued, those actions must be completed first before you can initiate a resize. Additionally, the following criteria must be met in order to resize a Linode:    * Any pending free upgrades to the Linode&#x27;s current Type must be performed   before a resize can occur.   * The Linode must not have a pending migration.   * Your Account cannot have an outstanding balance.   * The Linode must not have more disk allocation than the new Type allows.     * In that situation, you must first delete or resize the disk to be smaller. 
    * @param body The Type your current Linode will resize to. 
    * @param linodeId ID of the Linode to resize. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun resizeLinodeInstance(body: Body12, linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/resize".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Restore Backup
    * Restores a Linode&#x27;s Backup to the specified Linode. 
    * @param body Parameters to provide when restoring the Backup. 
    * @param linodeId The ID of the Linode that the Backup belongs to. 
    * @param backupId The ID of the Backup to restore. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun restoreBackup(body: Body2, linodeId: kotlin.Int, backupId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/backups/{backupId}/restore".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"backupId"+"}", "$backupId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Shut Down Linode
    * Shuts down a Linode you have permission to modify. If any actions are currently running or queued, those actions must be completed first before you can initiate a shutdown. 
    * @param linodeId ID of the Linode to shutdown. 
    * @return kotlin.Any
    */
    @Suppress("UNCHECKED_CAST")
    fun shutdownLinodeInstance(linodeId: kotlin.Int) : kotlin.Any {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/linode/instances/{linodeId}/shutdown".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Any>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Any
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Update Disk
    * Updates a Disk that you have permission to &#x60;read_write&#x60;. 
    * @param body Updates the parameters of a single Disk.
 
    * @param linodeId ID of the Linode to look up. 
    * @param diskId ID of the Disk to look up. 
    * @return Disk
    */
    @Suppress("UNCHECKED_CAST")
    fun updateDisk(body: Disk, linodeId: kotlin.Int, diskId: kotlin.Int) : Disk {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/linode/instances/{linodeId}/disks/{diskId}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"diskId"+"}", "$diskId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Disk>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Disk
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Update Configuration Profile
    * Updates a Configuration profile. 
    * @param body The Configuration profile parameters to modify. 
    * @param linodeId The ID of the Linode whose Configuration profile to look up. 
    * @param configId The ID of the Configuration profile to look up. 
    * @return LinodeConfig
    */
    @Suppress("UNCHECKED_CAST")
    fun updateLinodeConfig(body: LinodeConfig, linodeId: kotlin.Int, configId: kotlin.Int) : LinodeConfig {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/linode/instances/{linodeId}/configs/{configId}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"configId"+"}", "$configId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LinodeConfig>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LinodeConfig
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Update IP Address
    * Updates a particular IP Address associated with this Linode. Only allows setting/resetting reverse DNS. 
    * @param linodeId The ID of the Linode to look up. 
    * @param address The IP address to look up. 
    * @param body The information to update for the IP address. (optional)
    * @return IPAddress
    */
    @Suppress("UNCHECKED_CAST")
    fun updateLinodeIP(linodeId: kotlin.Int, address: kotlin.String, body: Body8) : IPAddress {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/linode/instances/{linodeId}/ips/{address}".replace("{"+"linodeId"+"}", "$linodeId").replace("{"+"address"+"}", "$address"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<IPAddress>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as IPAddress
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
    /**
    * Update Linode
    * Updates a Linode that you have permission to &#x60;read_write&#x60;. 
    * @param body Any field that is not marked as &#x60;readOnly&#x60; may be updated. Fields that are marked &#x60;readOnly&#x60; will be ignored. If any updated field fails to pass validation, the Linode will not be updated.
 
    * @param linodeId ID of the Linode to look up 
    * @return Linode
    */
    @Suppress("UNCHECKED_CAST")
    fun updateLinodeInstance(body: kotlin.Any, linodeId: kotlin.Int) : Linode {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/linode/instances/{linodeId}".replace("{"+"linodeId"+"}", "$linodeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Linode>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Linode
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    
}

