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
package io.swagger.client.models

import io.swagger.client.models.NodeBalancerConfigNodesStatus





/**
 * A NodeBalancer config represents the configuration of this NodeBalancer on a single port.  For example, a NodeBalancer Config on port 80 would typically represent how this NodeBalancer response to HTTP requests.  NodeBalancer configs have a list of backends, called \"nodes,\" that they forward requests between based on their configuration.  
 * @param id This config's unique ID 
 * @param port The port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example).  While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443.  
 * @param protocol The protocol this port is configured to serve. * If this is set to `https` you must include an `ssl_cert` and an `ssl_key`.  
 * @param algorithm What algorithm this NodeBalancer should use for routing traffic to backends.  
 * @param stickiness Controls how session stickiness is handled on this port. * If set to `none` connections will always be assigned a backend based on the algorithm configured. * If set to `table` sessions from the same remote address will be routed to the same   backend.  * For HTTP or HTTPS clients, `http_cookie` allows sessions to be   routed to the same backend based on a cookie set by the NodeBalancer.  
 * @param check The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. * If `none` no check is performed. * `connection` requires only a connection to the backend to succeed. * `http` and `http_body` rely on the backend serving HTTP, and that   the response returned matches what is expected.  
 * @param checkInterval How often, in seconds, to check that backends are up and serving requests.  
 * @param checkTimeout How long, in seconds, to wait for a check attempt before considering it failed.  
 * @param checkAttempts How many times to attempt a check before considering a backend to be down.  
 * @param checkPath The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.  
 * @param checkBody This value must be present in the response body of the check in order for it to pass. If this value is not present in the response body of a check request, the backend is considered to be down.  
 * @param checkPassive If true, any response from this backend with a `5xx` status code will be enough for it to be considered unhealthy and taken out of rotation.  
 * @param cipherSuite What ciphers to use for SSL connections served by this NodeBalancer.  * `legacy` is considered insecure and should only be used if necessary.  
 * @param nodebalancerId The ID for the NodeBalancer this config belongs to.  
 * @param sslCommonname The common name for the SSL certification this port is serving if this port is not configured to use SSL.  
 * @param sslFingerprint The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.  
 * @param sslCert The certificate this port is serving. This is not returned. If set, this field will come back as \"&lt;REDACTED&gt;\". Please use the `ssl_commonname` and `ssl_fingerprint` to identify the certificate.  
 * @param sslKey The private key corresponding to this port's certificate.  This is not returned. If set, this field will come back as \"&lt;REDACTED&gt;\". Please use the `ssl_commonname` and `ssl_fingerprint` to identify the certificate.  
 * @param nodesStatus */
data class NodeBalancerConfig (
    /* This config's unique ID */
    val id: kotlin.Int? = null,
    /* The port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example).  While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443.  */
    val port: kotlin.Int? = null,
    /* The protocol this port is configured to serve. * If this is set to `https` you must include an `ssl_cert` and an `ssl_key`.  */
    val protocol: NodeBalancerConfig.Protocol? = null,
    /* What algorithm this NodeBalancer should use for routing traffic to backends.  */
    val algorithm: NodeBalancerConfig.Algorithm? = null,
    /* Controls how session stickiness is handled on this port. * If set to `none` connections will always be assigned a backend based on the algorithm configured. * If set to `table` sessions from the same remote address will be routed to the same   backend.  * For HTTP or HTTPS clients, `http_cookie` allows sessions to be   routed to the same backend based on a cookie set by the NodeBalancer.  */
    val stickiness: NodeBalancerConfig.Stickiness? = null,
    /* The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. * If `none` no check is performed. * `connection` requires only a connection to the backend to succeed. * `http` and `http_body` rely on the backend serving HTTP, and that   the response returned matches what is expected.  */
    val check: NodeBalancerConfig.Check? = null,
    /* How often, in seconds, to check that backends are up and serving requests.  */
    val checkInterval: kotlin.Int? = null,
    /* How long, in seconds, to wait for a check attempt before considering it failed.  */
    val checkTimeout: kotlin.Int? = null,
    /* How many times to attempt a check before considering a backend to be down.  */
    val checkAttempts: kotlin.Int? = null,
    /* The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.  */
    val checkPath: kotlin.String? = null,
    /* This value must be present in the response body of the check in order for it to pass. If this value is not present in the response body of a check request, the backend is considered to be down.  */
    val checkBody: kotlin.String? = null,
    /* If true, any response from this backend with a `5xx` status code will be enough for it to be considered unhealthy and taken out of rotation.  */
    val checkPassive: kotlin.Boolean? = null,
    /* What ciphers to use for SSL connections served by this NodeBalancer.  * `legacy` is considered insecure and should only be used if necessary.  */
    val cipherSuite: NodeBalancerConfig.CipherSuite? = null,
    /* The ID for the NodeBalancer this config belongs to.  */
    val nodebalancerId: kotlin.Int? = null,
    /* The common name for the SSL certification this port is serving if this port is not configured to use SSL.  */
    val sslCommonname: kotlin.String? = null,
    /* The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.  */
    val sslFingerprint: kotlin.String? = null,
    /* The certificate this port is serving. This is not returned. If set, this field will come back as \"&lt;REDACTED&gt;\". Please use the `ssl_commonname` and `ssl_fingerprint` to identify the certificate.  */
    val sslCert: kotlin.String? = null,
    /* The private key corresponding to this port's certificate.  This is not returned. If set, this field will come back as \"&lt;REDACTED&gt;\". Please use the `ssl_commonname` and `ssl_fingerprint` to identify the certificate.  */
    val sslKey: kotlin.String? = null,
    val nodesStatus: NodeBalancerConfigNodesStatus? = null
) {

    /**
    * The protocol this port is configured to serve. * If this is set to `https` you must include an `ssl_cert` and an `ssl_key`. 
    * Values: http,https,tcp
    */
    enum class Protocol(val value: kotlin.String){
    
        http("http"),
    
        https("https"),
    
        tcp("tcp");
    
    }

    /**
    * What algorithm this NodeBalancer should use for routing traffic to backends. 
    * Values: roundrobin,leastconn,source
    */
    enum class Algorithm(val value: kotlin.String){
    
        roundrobin("roundrobin"),
    
        leastconn("leastconn"),
    
        source("source");
    
    }

    /**
    * Controls how session stickiness is handled on this port. * If set to `none` connections will always be assigned a backend based on the algorithm configured. * If set to `table` sessions from the same remote address will be routed to the same   backend.  * For HTTP or HTTPS clients, `http_cookie` allows sessions to be   routed to the same backend based on a cookie set by the NodeBalancer. 
    * Values: none,table,httpCookie
    */
    enum class Stickiness(val value: kotlin.String){
    
        none("none"),
    
        table("table"),
    
        httpCookie("http_cookie");
    
    }

    /**
    * The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. * If `none` no check is performed. * `connection` requires only a connection to the backend to succeed. * `http` and `http_body` rely on the backend serving HTTP, and that   the response returned matches what is expected. 
    * Values: none,connection,http,httpBody
    */
    enum class Check(val value: kotlin.String){
    
        none("none"),
    
        connection("connection"),
    
        http("http"),
    
        httpBody("http_body");
    
    }

    /**
    * What ciphers to use for SSL connections served by this NodeBalancer.  * `legacy` is considered insecure and should only be used if necessary. 
    * Values: recommended,legacy
    */
    enum class CipherSuite(val value: kotlin.String){
    
        recommended("recommended"),
    
        legacy("legacy");
    
    }

}


