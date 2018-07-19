
# NodeBalancerConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Int**](.md) | This config&#x27;s unique ID |  [optional]
**port** | [**kotlin.Int**](.md) | The port this Config is for. These values must be unique across configs on a single NodeBalancer (you can&#x27;t have two configs for port 80, for example).  While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443.  |  [optional]
**protocol** | [**inline**](#ProtocolEnum) | The protocol this port is configured to serve. * If this is set to &#x60;https&#x60; you must include an &#x60;ssl_cert&#x60; and an &#x60;ssl_key&#x60;.  |  [optional]
**algorithm** | [**inline**](#AlgorithmEnum) | What algorithm this NodeBalancer should use for routing traffic to backends.  |  [optional]
**stickiness** | [**inline**](#StickinessEnum) | Controls how session stickiness is handled on this port. * If set to &#x60;none&#x60; connections will always be assigned a backend based on the algorithm configured. * If set to &#x60;table&#x60; sessions from the same remote address will be routed to the same   backend.  * For HTTP or HTTPS clients, &#x60;http_cookie&#x60; allows sessions to be   routed to the same backend based on a cookie set by the NodeBalancer.  |  [optional]
**check** | [**inline**](#CheckEnum) | The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. * If &#x60;none&#x60; no check is performed. * &#x60;connection&#x60; requires only a connection to the backend to succeed. * &#x60;http&#x60; and &#x60;http_body&#x60; rely on the backend serving HTTP, and that   the response returned matches what is expected.  |  [optional]
**checkInterval** | [**kotlin.Int**](.md) | How often, in seconds, to check that backends are up and serving requests.  |  [optional]
**checkTimeout** | [**kotlin.Int**](.md) | How long, in seconds, to wait for a check attempt before considering it failed.  |  [optional]
**checkAttempts** | [**kotlin.Int**](.md) | How many times to attempt a check before considering a backend to be down.  |  [optional]
**checkPath** | [**kotlin.String**](.md) | The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.  |  [optional]
**checkBody** | [**kotlin.String**](.md) | This value must be present in the response body of the check in order for it to pass. If this value is not present in the response body of a check request, the backend is considered to be down.  |  [optional]
**checkPassive** | [**kotlin.Boolean**](.md) | If true, any response from this backend with a &#x60;5xx&#x60; status code will be enough for it to be considered unhealthy and taken out of rotation.  |  [optional]
**cipherSuite** | [**inline**](#CipherSuiteEnum) | What ciphers to use for SSL connections served by this NodeBalancer.  * &#x60;legacy&#x60; is considered insecure and should only be used if necessary.  |  [optional]
**nodebalancerId** | [**kotlin.Int**](.md) | The ID for the NodeBalancer this config belongs to.  |  [optional]
**sslCommonname** | [**kotlin.String**](.md) | The common name for the SSL certification this port is serving if this port is not configured to use SSL.  |  [optional]
**sslFingerprint** | [**kotlin.String**](.md) | The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.  |  [optional]
**sslCert** | [**kotlin.String**](.md) | The certificate this port is serving. This is not returned. If set, this field will come back as \&quot;&amp;lt;REDACTED&amp;gt;\&quot;. Please use the &#x60;ssl_commonname&#x60; and &#x60;ssl_fingerprint&#x60; to identify the certificate.  |  [optional]
**sslKey** | [**kotlin.String**](.md) | The private key corresponding to this port&#x27;s certificate.  This is not returned. If set, this field will come back as \&quot;&amp;lt;REDACTED&amp;gt;\&quot;. Please use the &#x60;ssl_commonname&#x60; and &#x60;ssl_fingerprint&#x60; to identify the certificate.  |  [optional]
**nodesStatus** | [**NodeBalancerConfigNodesStatus**](NodeBalancerConfigNodesStatus.md) |  |  [optional]



<a name="ProtocolEnum"></a>
## Enum: protocol
Name | Value
---- | -----
protocol | http, https, tcp


<a name="AlgorithmEnum"></a>
## Enum: algorithm
Name | Value
---- | -----
algorithm | roundrobin, leastconn, source


<a name="StickinessEnum"></a>
## Enum: stickiness
Name | Value
---- | -----
stickiness | none, table, http_cookie


<a name="CheckEnum"></a>
## Enum: check
Name | Value
---- | -----
check | none, connection, http, http_body


<a name="CipherSuiteEnum"></a>
## Enum: cipher_suite
Name | Value
---- | -----
cipherSuite | recommended, legacy



