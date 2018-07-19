# io.swagger.client - Kotlin client library for Linode API

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.linode.com/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**createClient**](docs/AccountApi.md#createclient) | **POST** /account/oauth-clients | Create OAuth Client
*AccountApi* | [**createCreditCard**](docs/AccountApi.md#createcreditcard) | **POST** /account/credit-card | Add/Edit Credit Card
*AccountApi* | [**createPayPalPayment**](docs/AccountApi.md#createpaypalpayment) | **POST** /account/payments/paypal | Stage PayPal Payment
*AccountApi* | [**createPayment**](docs/AccountApi.md#createpayment) | **POST** /account/payments | Make Payment
*AccountApi* | [**createUser**](docs/AccountApi.md#createuser) | **POST** /account/users | Create User
*AccountApi* | [**deleteClient**](docs/AccountApi.md#deleteclient) | **DELETE** /account/oauth-clients/{clientId} | Delete OAuth Client
*AccountApi* | [**deleteUser**](docs/AccountApi.md#deleteuser) | **DELETE** /account/users/{username} | Delete User
*AccountApi* | [**eventRead**](docs/AccountApi.md#eventread) | **POST** /account/events/{eventId}/read | Mark Event as Read
*AccountApi* | [**eventSeen**](docs/AccountApi.md#eventseen) | **POST** /account/events/{eventId}/seen | Mark Event as Seen
*AccountApi* | [**executePayPalPayment**](docs/AccountApi.md#executepaypalpayment) | **POST** /account/payment/paypal/execute | Execute Staged/Approved PayPal Payment
*AccountApi* | [**getAccount**](docs/AccountApi.md#getaccount) | **GET** /account | View Account
*AccountApi* | [**getAccountSettings**](docs/AccountApi.md#getaccountsettings) | **GET** /account/settings | View Account Settings
*AccountApi* | [**getClient**](docs/AccountApi.md#getclient) | **GET** /account/oauth-clients/{clientId} | View OAuth Client
*AccountApi* | [**getClientThumbnail**](docs/AccountApi.md#getclientthumbnail) | **GET** /account/oauth-clients/{clientId}/thumbnail | View OAuth Client Thumbnail
*AccountApi* | [**getClients**](docs/AccountApi.md#getclients) | **GET** /account/oauth-clients | List OAuth Clients
*AccountApi* | [**getEvent**](docs/AccountApi.md#getevent) | **GET** /account/events/{eventId} | View Event
*AccountApi* | [**getEvents**](docs/AccountApi.md#getevents) | **GET** /account/events | List Events
*AccountApi* | [**getInvoice**](docs/AccountApi.md#getinvoice) | **GET** /account/invoices/{invoiceId} | View Invoice
*AccountApi* | [**getInvoiceItems**](docs/AccountApi.md#getinvoiceitems) | **GET** /account/invoices/{invoiceId}/items | List Invoice Items
*AccountApi* | [**getInvoices**](docs/AccountApi.md#getinvoices) | **GET** /account/invoices | List Invoices
*AccountApi* | [**getNotifications**](docs/AccountApi.md#getnotifications) | **GET** /account/notifications | List Notifications
*AccountApi* | [**getPayment**](docs/AccountApi.md#getpayment) | **GET** /account/payments/{paymentId} | View Payment
*AccountApi* | [**getPayments**](docs/AccountApi.md#getpayments) | **GET** /account/payments | List Payments
*AccountApi* | [**getTransfer**](docs/AccountApi.md#gettransfer) | **GET** /account/transfer | View Network Utilization
*AccountApi* | [**getUser**](docs/AccountApi.md#getuser) | **GET** /account/users/{username} | View User
*AccountApi* | [**getUserGrants**](docs/AccountApi.md#getusergrants) | **GET** /account/users/{username}/grants | View User's grants
*AccountApi* | [**getUsers**](docs/AccountApi.md#getusers) | **GET** /account/users | List Users
*AccountApi* | [**resetClientSecret**](docs/AccountApi.md#resetclientsecret) | **POST** /account/oauth-clients/{clientId}/reset-secret | Reset OAuth Client Secret
*AccountApi* | [**setClientThumbnail**](docs/AccountApi.md#setclientthumbnail) | **PUT** /account/oauth-clients/{clientId}/thumbnail | Update OAuth Client Thumbnail
*AccountApi* | [**updateAccount**](docs/AccountApi.md#updateaccount) | **PUT** /account | Update Account
*AccountApi* | [**updateAccountSettings**](docs/AccountApi.md#updateaccountsettings) | **PUT** /account/settings | Update Account Settings
*AccountApi* | [**updateClient**](docs/AccountApi.md#updateclient) | **PUT** /account/oauth-clients/{clientId} | Update OAuth Client
*AccountApi* | [**updateUser**](docs/AccountApi.md#updateuser) | **PUT** /account/users/{username} | Update User
*AccountApi* | [**updateUserGrants**](docs/AccountApi.md#updateusergrants) | **PUT** /account/users/{username}/grants | Update User's grants
*DomainsApi* | [**createDomain**](docs/DomainsApi.md#createdomain) | **POST** /domains | Create Domain
*DomainsApi* | [**createDomainRecord**](docs/DomainsApi.md#createdomainrecord) | **POST** /domains/{domainId}/records | Create Domain Record
*DomainsApi* | [**deleteDomain**](docs/DomainsApi.md#deletedomain) | **DELETE** /domains/{domainId} | Delete Domain
*DomainsApi* | [**deleteDomainRecord**](docs/DomainsApi.md#deletedomainrecord) | **DELETE** /domains/{domainId}/records/{recordId} | Delete Domain Record
*DomainsApi* | [**getDomain**](docs/DomainsApi.md#getdomain) | **GET** /domains/{domainId} | View Domain
*DomainsApi* | [**getDomainRecord**](docs/DomainsApi.md#getdomainrecord) | **GET** /domains/{domainId}/records/{recordId} | View Domain Record
*DomainsApi* | [**getDomainRecords**](docs/DomainsApi.md#getdomainrecords) | **GET** /domains/{domainId}/records | List Domain Records
*DomainsApi* | [**getDomains**](docs/DomainsApi.md#getdomains) | **GET** /domains | List Domains
*DomainsApi* | [**importDomain**](docs/DomainsApi.md#importdomain) | **POST** /domains/import | Import a Domain Zone
*DomainsApi* | [**updateDomain**](docs/DomainsApi.md#updatedomain) | **PUT** /domains/{domainId} | Update Domain
*DomainsApi* | [**updateDomainRecord**](docs/DomainsApi.md#updatedomainrecord) | **PUT** /domains/{domainId}/records/{recordId} | Update Domain Record
*ImagesApi* | [**createImage**](docs/ImagesApi.md#createimage) | **POST** /images | Create Image
*ImagesApi* | [**deleteImage**](docs/ImagesApi.md#deleteimage) | **DELETE** /images/{imageId} | Delete Image
*ImagesApi* | [**getImage**](docs/ImagesApi.md#getimage) | **GET** /images/{imageId} | View Image
*ImagesApi* | [**getImages**](docs/ImagesApi.md#getimages) | **GET** /images | List Images
*ImagesApi* | [**updateImage**](docs/ImagesApi.md#updateimage) | **PUT** /images/{imageId} | Update Image
*LinodeInstancesApi* | [**addLinodeConfig**](docs/LinodeInstancesApi.md#addlinodeconfig) | **POST** /linode/instances/{linodeId}/configs | Create Configuration Profile
*LinodeInstancesApi* | [**addLinodeDisk**](docs/LinodeInstancesApi.md#addlinodedisk) | **POST** /linode/instances/{linodeId}/disks | Create Disk
*LinodeInstancesApi* | [**addLinodeIP**](docs/LinodeInstancesApi.md#addlinodeip) | **POST** /linode/instances/{linodeId}/ips | Allocate IPv4 Address
*LinodeInstancesApi* | [**bootLinodeInstance**](docs/LinodeInstancesApi.md#bootlinodeinstance) | **POST** /linode/instances/{linodeId}/boot | Boot Linode
*LinodeInstancesApi* | [**cancelBackups**](docs/LinodeInstancesApi.md#cancelbackups) | **POST** /linode/instances/{linodeId}/backups/cancel | Cancel Backups
*LinodeInstancesApi* | [**cloneLinodeInstance**](docs/LinodeInstancesApi.md#clonelinodeinstance) | **POST** /linode/instances/{linodeId}/clone | Clone Linode
*LinodeInstancesApi* | [**createLinodeInstance**](docs/LinodeInstancesApi.md#createlinodeinstance) | **POST** /linode/instances | Create Linode
*LinodeInstancesApi* | [**createSnapshot**](docs/LinodeInstancesApi.md#createsnapshot) | **POST** /linode/instances/{linodeId}/backups | Create Snapshot
*LinodeInstancesApi* | [**deleteDisk**](docs/LinodeInstancesApi.md#deletedisk) | **DELETE** /linode/instances/{linodeId}/disks/{diskId} | Delete Disk
*LinodeInstancesApi* | [**deleteLinodeConfig**](docs/LinodeInstancesApi.md#deletelinodeconfig) | **DELETE** /linode/instances/{linodeId}/configs/{configId} | Delete Configuration Profile
*LinodeInstancesApi* | [**deleteLinodeInstance**](docs/LinodeInstancesApi.md#deletelinodeinstance) | **DELETE** /linode/instances/{linodeId} | Delete Linode
*LinodeInstancesApi* | [**enableBackups**](docs/LinodeInstancesApi.md#enablebackups) | **POST** /linode/instances/{linodeId}/backups/enable | Enable Backups
*LinodeInstancesApi* | [**getBackup**](docs/LinodeInstancesApi.md#getbackup) | **GET** /linode/instances/{linodeId}/backups/{backupId} | View Backup
*LinodeInstancesApi* | [**getBackups**](docs/LinodeInstancesApi.md#getbackups) | **GET** /linode/instances/{linodeId}/backups | List Backups
*LinodeInstancesApi* | [**getKernel**](docs/LinodeInstancesApi.md#getkernel) | **GET** /linode/kernels/{kernelId} | View Kernel
*LinodeInstancesApi* | [**getKernels**](docs/LinodeInstancesApi.md#getkernels) | **GET** /linode/kernels | List Kernels
*LinodeInstancesApi* | [**getLinodeConfig**](docs/LinodeInstancesApi.md#getlinodeconfig) | **GET** /linode/instances/{linodeId}/configs/{configId} | View Configuration Profile
*LinodeInstancesApi* | [**getLinodeConfigs**](docs/LinodeInstancesApi.md#getlinodeconfigs) | **GET** /linode/instances/{linodeId}/configs | List Configuration Profiles
*LinodeInstancesApi* | [**getLinodeDisk**](docs/LinodeInstancesApi.md#getlinodedisk) | **GET** /linode/instances/{linodeId}/disks/{diskId} | View Disk
*LinodeInstancesApi* | [**getLinodeDisks**](docs/LinodeInstancesApi.md#getlinodedisks) | **GET** /linode/instances/{linodeId}/disks | List Disks
*LinodeInstancesApi* | [**getLinodeIP**](docs/LinodeInstancesApi.md#getlinodeip) | **GET** /linode/instances/{linodeId}/ips/{address} | View IP Address
*LinodeInstancesApi* | [**getLinodeIPs**](docs/LinodeInstancesApi.md#getlinodeips) | **GET** /linode/instances/{linodeId}/ips | List Networking Information
*LinodeInstancesApi* | [**getLinodeInstance**](docs/LinodeInstancesApi.md#getlinodeinstance) | **GET** /linode/instances/{linodeId} | View Linode
*LinodeInstancesApi* | [**getLinodeInstances**](docs/LinodeInstancesApi.md#getlinodeinstances) | **GET** /linode/instances | List Linodes
*LinodeInstancesApi* | [**getLinodeStats**](docs/LinodeInstancesApi.md#getlinodestats) | **GET** /linode/instances/{linodeId}/stats | View Current Month Statistics
*LinodeInstancesApi* | [**getLinodeStatsByYearMonth**](docs/LinodeInstancesApi.md#getlinodestatsbyyearmonth) | **GET** /linode/instances/{linodeId}/stats/{year}/{month} | View Statistics (year/month)
*LinodeInstancesApi* | [**getLinodeVolumes**](docs/LinodeInstancesApi.md#getlinodevolumes) | **GET** /linode/instances/{linodeId}/volumes | List Linode's Volumes
*LinodeInstancesApi* | [**migrateLinodeInstance**](docs/LinodeInstancesApi.md#migratelinodeinstance) | **POST** /linode/instances/{linodeId}/migrate | Initiate Pending Migration
*LinodeInstancesApi* | [**mutateLinodeInstance**](docs/LinodeInstancesApi.md#mutatelinodeinstance) | **POST** /linode/instances/{linodeId}/mutate | Upgrade Linode
*LinodeInstancesApi* | [**rebootLinodeInstance**](docs/LinodeInstancesApi.md#rebootlinodeinstance) | **POST** /linode/instances/{linodeId}/reboot | Reboot Linode
*LinodeInstancesApi* | [**rebuildLinodeInstance**](docs/LinodeInstancesApi.md#rebuildlinodeinstance) | **POST** /linode/instances/{linodeId}/rebuild | Rebuild Linode
*LinodeInstancesApi* | [**removeLinodeIP**](docs/LinodeInstancesApi.md#removelinodeip) | **DELETE** /linode/instances/{linodeId}/ips/{address} | Delete IPv4 Address
*LinodeInstancesApi* | [**rescueLinodeInstance**](docs/LinodeInstancesApi.md#rescuelinodeinstance) | **POST** /linode/instances/{linodeId}/rescue | Boot Linode into Rescue Mode
*LinodeInstancesApi* | [**resetDiskPassword**](docs/LinodeInstancesApi.md#resetdiskpassword) | **POST** /linode/instances/{linodeId}/disks/{diskId}/password | Reset Disk Root Password
*LinodeInstancesApi* | [**resizeDisk**](docs/LinodeInstancesApi.md#resizedisk) | **POST** /linode/instances/{linodeId}/disks/{diskId}/resize | Resize Disk
*LinodeInstancesApi* | [**resizeLinodeInstance**](docs/LinodeInstancesApi.md#resizelinodeinstance) | **POST** /linode/instances/{linodeId}/resize | Resize Linode
*LinodeInstancesApi* | [**restoreBackup**](docs/LinodeInstancesApi.md#restorebackup) | **POST** /linode/instances/{linodeId}/backups/{backupId}/restore | Restore Backup
*LinodeInstancesApi* | [**shutdownLinodeInstance**](docs/LinodeInstancesApi.md#shutdownlinodeinstance) | **POST** /linode/instances/{linodeId}/shutdown | Shut Down Linode
*LinodeInstancesApi* | [**updateDisk**](docs/LinodeInstancesApi.md#updatedisk) | **PUT** /linode/instances/{linodeId}/disks/{diskId} | Update Disk
*LinodeInstancesApi* | [**updateLinodeConfig**](docs/LinodeInstancesApi.md#updatelinodeconfig) | **PUT** /linode/instances/{linodeId}/configs/{configId} | Update Configuration Profile
*LinodeInstancesApi* | [**updateLinodeIP**](docs/LinodeInstancesApi.md#updatelinodeip) | **PUT** /linode/instances/{linodeId}/ips/{address} | Update IP Address
*LinodeInstancesApi* | [**updateLinodeInstance**](docs/LinodeInstancesApi.md#updatelinodeinstance) | **PUT** /linode/instances/{linodeId} | Update Linode
*LinodeTypesApi* | [**getLinodeType**](docs/LinodeTypesApi.md#getlinodetype) | **GET** /linode/types/{typeId} | View Type
*LinodeTypesApi* | [**getLinodeTypes**](docs/LinodeTypesApi.md#getlinodetypes) | **GET** /linode/types | List Types
*LongviewApi* | [**createLongviewClient**](docs/LongviewApi.md#createlongviewclient) | **POST** /longview/clients | Create Longview Client
*LongviewApi* | [**deleteLongviewClient**](docs/LongviewApi.md#deletelongviewclient) | **DELETE** /longview/clients/{clientId} | Delete Longview Client
*LongviewApi* | [**getLongviewClient**](docs/LongviewApi.md#getlongviewclient) | **GET** /longview/clients/{clientId} | View Longview Client
*LongviewApi* | [**getLongviewClients**](docs/LongviewApi.md#getlongviewclients) | **GET** /longview/clients | List Longview Clients
*LongviewApi* | [**getLongviewSubscription**](docs/LongviewApi.md#getlongviewsubscription) | **GET** /longview/subscriptions/{subscriptionId} | View Longview Subscription
*LongviewApi* | [**getLongviewSubscriptions**](docs/LongviewApi.md#getlongviewsubscriptions) | **GET** /longview/subscriptions | List Longview Subscriptions
*LongviewApi* | [**updateLongviewClient**](docs/LongviewApi.md#updatelongviewclient) | **PUT** /longview/clients/{clientId} | Update Longview Client
*ManagedApi* | [**createManagedContact**](docs/ManagedApi.md#createmanagedcontact) | **POST** /managed/contacts | Create Managed Contact
*ManagedApi* | [**createManagedCredential**](docs/ManagedApi.md#createmanagedcredential) | **POST** /managed/credentials | Create Managed Credential
*ManagedApi* | [**createManagedService**](docs/ManagedApi.md#createmanagedservice) | **POST** /managed/services | Create Managed Service
*ManagedApi* | [**deleteManagedContact**](docs/ManagedApi.md#deletemanagedcontact) | **DELETE** /managed/contacts/{contactId} | Delete Managed Contact
*ManagedApi* | [**deleteManagedCredential**](docs/ManagedApi.md#deletemanagedcredential) | **POST** /managed/credentials/{credentialId}/revoke | Delete Managed Credential
*ManagedApi* | [**deleteManagedService**](docs/ManagedApi.md#deletemanagedservice) | **DELETE** /managed/services/{serviceId} | Delete Managed Service
*ManagedApi* | [**disableManagedService**](docs/ManagedApi.md#disablemanagedservice) | **POST** /managed/services/{serviceId}/disable | Disable Managed Service
*ManagedApi* | [**enableManagedService**](docs/ManagedApi.md#enablemanagedservice) | **POST** /managed/services/{serviceId}/enable | Enable Managed Service
*ManagedApi* | [**getManagedContact**](docs/ManagedApi.md#getmanagedcontact) | **GET** /managed/contacts/{contactId} | View Managed Contact
*ManagedApi* | [**getManagedContacts**](docs/ManagedApi.md#getmanagedcontacts) | **GET** /managed/contacts | List Managed Contacts
*ManagedApi* | [**getManagedCredential**](docs/ManagedApi.md#getmanagedcredential) | **GET** /managed/credentials/{credentialId} | View Managed Credential
*ManagedApi* | [**getManagedCredentials**](docs/ManagedApi.md#getmanagedcredentials) | **GET** /managed/credentials | List Managed Credentials
*ManagedApi* | [**getManagedIssue**](docs/ManagedApi.md#getmanagedissue) | **GET** /managed/issues/{issueId} | View Managed Issue
*ManagedApi* | [**getManagedIssues**](docs/ManagedApi.md#getmanagedissues) | **GET** /managed/issues | List Managed Issues
*ManagedApi* | [**getManagedLinodeSetting**](docs/ManagedApi.md#getmanagedlinodesetting) | **GET** /managed/linode-settings/{linodeId} | View Linode's Managed Settings
*ManagedApi* | [**getManagedLinodeSettings**](docs/ManagedApi.md#getmanagedlinodesettings) | **GET** /managed/linode-settings | List Managed Linode Settings
*ManagedApi* | [**getManagedService**](docs/ManagedApi.md#getmanagedservice) | **GET** /managed/services/{serviceId} | View Managed Service
*ManagedApi* | [**getManagedServices**](docs/ManagedApi.md#getmanagedservices) | **GET** /managed/services | List Managed Services
*ManagedApi* | [**updateManagedContact**](docs/ManagedApi.md#updatemanagedcontact) | **PUT** /managed/contacts/{contactId} | Update Managed Contact
*ManagedApi* | [**updateManagedCredential**](docs/ManagedApi.md#updatemanagedcredential) | **PUT** /managed/credentials/{credentialId} | Update Managed Credential
*ManagedApi* | [**updateManagedLinodeSetting**](docs/ManagedApi.md#updatemanagedlinodesetting) | **PUT** /managed/linode-settings/{linodeId} | Update Linode's Managed Settings
*ManagedApi* | [**updateManagedService**](docs/ManagedApi.md#updatemanagedservice) | **PUT** /managed/services/{serviceId} | Update Managed Service
*NetworkingApi* | [**allocateIP**](docs/NetworkingApi.md#allocateip) | **POST** /networking/ips | Allocate IP Address
*NetworkingApi* | [**assignIPs**](docs/NetworkingApi.md#assignips) | **POST** /networking/ipv4/assign | Assign IPs to Linodes
*NetworkingApi* | [**getIP**](docs/NetworkingApi.md#getip) | **GET** /networking/ips/{address} | View IP Address
*NetworkingApi* | [**getIPs**](docs/NetworkingApi.md#getips) | **GET** /networking/ips | List IP Addresses
*NetworkingApi* | [**getIPv6Pools**](docs/NetworkingApi.md#getipv6pools) | **GET** /networking/ipv6/pools | List IPv6 Pools
*NetworkingApi* | [**getIPv6Ranges**](docs/NetworkingApi.md#getipv6ranges) | **GET** /networking/ipv6/ranges | List IPv6 Ranges
*NetworkingApi* | [**shareIPs**](docs/NetworkingApi.md#shareips) | **POST** /networking/ipv4/share | Configure IP Sharing
*NetworkingApi* | [**updateIP**](docs/NetworkingApi.md#updateip) | **PUT** /networking/ips/{address} | Update IP Address RDNS
*NodeBalancersApi* | [**createNodeBalancer**](docs/NodeBalancersApi.md#createnodebalancer) | **POST** /nodebalancers | Create NodeBalancer
*NodeBalancersApi* | [**createNodeBalancerConfig**](docs/NodeBalancersApi.md#createnodebalancerconfig) | **POST** /nodebalancers/{nodeBalancerId}/configs | Create Config
*NodeBalancersApi* | [**createNodeBalancerNode**](docs/NodeBalancersApi.md#createnodebalancernode) | **POST** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes | Create Node
*NodeBalancersApi* | [**deleteNodeBalancer**](docs/NodeBalancersApi.md#deletenodebalancer) | **DELETE** /nodebalancers/{nodeBalancerId} | Delete NodeBalancer
*NodeBalancersApi* | [**deleteNodeBalancerConfig**](docs/NodeBalancersApi.md#deletenodebalancerconfig) | **DELETE** /nodebalancers/{nodeBalancerId}/configs/{configId} | Delete Config
*NodeBalancersApi* | [**deleteNodeBalancerConfigNode**](docs/NodeBalancersApi.md#deletenodebalancerconfignode) | **DELETE** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes/{nodeId} | Delete Node
*NodeBalancersApi* | [**getNodeBalancer**](docs/NodeBalancersApi.md#getnodebalancer) | **GET** /nodebalancers/{nodeBalancerId} | View NodeBalancer
*NodeBalancersApi* | [**getNodeBalancerConfig**](docs/NodeBalancersApi.md#getnodebalancerconfig) | **GET** /nodebalancers/{nodeBalancerId}/configs/{configId} | View Config
*NodeBalancersApi* | [**getNodeBalancerConfigNodes**](docs/NodeBalancersApi.md#getnodebalancerconfignodes) | **GET** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes | List Nodes
*NodeBalancersApi* | [**getNodeBalancerConfigs**](docs/NodeBalancersApi.md#getnodebalancerconfigs) | **GET** /nodebalancers/{nodeBalancerId}/configs | List Configs
*NodeBalancersApi* | [**getNodeBalancerNode**](docs/NodeBalancersApi.md#getnodebalancernode) | **GET** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes/{nodeId} | View Node
*NodeBalancersApi* | [**getNodeBalancers**](docs/NodeBalancersApi.md#getnodebalancers) | **GET** /nodebalancers | List NodeBalancers
*NodeBalancersApi* | [**nodebalancersNodeBalancerIdStatsGet**](docs/NodeBalancersApi.md#nodebalancersnodebalanceridstatsget) | **GET** /nodebalancers/{nodeBalancerId}/stats | View NodeBalancer Statistics
*NodeBalancersApi* | [**updateNodeBalancer**](docs/NodeBalancersApi.md#updatenodebalancer) | **PUT** /nodebalancers/{nodeBalancerId} | Update NodeBalancer
*NodeBalancersApi* | [**updateNodeBalancerConfig**](docs/NodeBalancersApi.md#updatenodebalancerconfig) | **PUT** /nodebalancers/{nodeBalancerId}/configs/{configId} | Update Config
*NodeBalancersApi* | [**updateNodeBalancerNode**](docs/NodeBalancersApi.md#updatenodebalancernode) | **PUT** /nodebalancers/{nodeBalancerId}/configs/{configId}/nodes/{nodeId} | Update Node
*ProfileApi* | [**createPersonalAccessToken**](docs/ProfileApi.md#createpersonalaccesstoken) | **POST** /profile/tokens | Create Personal Access Token
*ProfileApi* | [**deletePersonalAccessToken**](docs/ProfileApi.md#deletepersonalaccesstoken) | **DELETE** /profile/tokens/{tokenId} | Revoke Personal Access Token
*ProfileApi* | [**deleteProfileApp**](docs/ProfileApi.md#deleteprofileapp) | **DELETE** /profile/apps/{appId} | Revoke App Access
*ProfileApi* | [**getPersonalAccessToken**](docs/ProfileApi.md#getpersonalaccesstoken) | **GET** /profile/tokens/{tokenId} | View Personal Access Token
*ProfileApi* | [**getPersonalAccessTokens**](docs/ProfileApi.md#getpersonalaccesstokens) | **GET** /profile/tokens | List Personal Access Tokens
*ProfileApi* | [**getProfile**](docs/ProfileApi.md#getprofile) | **GET** /profile | View Profile
*ProfileApi* | [**getProfileApp**](docs/ProfileApi.md#getprofileapp) | **GET** /profile/apps/{appId} | View Authorized App
*ProfileApi* | [**getProfileApps**](docs/ProfileApi.md#getprofileapps) | **GET** /profile/apps | List Authorized Apps
*ProfileApi* | [**getProfileGrants**](docs/ProfileApi.md#getprofilegrants) | **GET** /profile/grants | List Grants
*ProfileApi* | [**getTrustedComputer**](docs/ProfileApi.md#gettrustedcomputer) | **GET** /profile/tfa-trusted-computers/{trustedComputerId} | View Trusted Computer
*ProfileApi* | [**getTrustedComputers**](docs/ProfileApi.md#gettrustedcomputers) | **GET** /profile/tfa-trusted-computers | List Trusted Computers
*ProfileApi* | [**tfaConfirm**](docs/ProfileApi.md#tfaconfirm) | **POST** /profile/tfa-enable-confirm | Confirm/Enable Two Factor Authentication
*ProfileApi* | [**tfaDisable**](docs/ProfileApi.md#tfadisable) | **POST** /profile/tfa-disable | Disable Two Factor Authentication
*ProfileApi* | [**tfaEnable**](docs/ProfileApi.md#tfaenable) | **POST** /profile/tfa-enable | Create Two Factor Secret
*ProfileApi* | [**untrustTrustedComputer**](docs/ProfileApi.md#untrusttrustedcomputer) | **POST** /profile/tfa-trusted-computers/{trustedComputerId}/untrust | Untrust Trusted Computer
*ProfileApi* | [**updatePersonalAccessToken**](docs/ProfileApi.md#updatepersonalaccesstoken) | **PUT** /profile/tokens/{tokenId} | Update Personal Access Token
*ProfileApi* | [**updateProfile**](docs/ProfileApi.md#updateprofile) | **PUT** /profile | Update Profile
*RegionsApi* | [**getRegion**](docs/RegionsApi.md#getregion) | **GET** /regions/{regionId} | View Region
*RegionsApi* | [**getRegions**](docs/RegionsApi.md#getregions) | **GET** /regions | List Regions
*StackScriptsApi* | [**addStackScript**](docs/StackScriptsApi.md#addstackscript) | **POST** /linode/stackscripts | Create StackScript
*StackScriptsApi* | [**deleteStackScript**](docs/StackScriptsApi.md#deletestackscript) | **DELETE** /linode/stackscripts/{stackscriptId} | Delete StackScript
*StackScriptsApi* | [**getStackScript**](docs/StackScriptsApi.md#getstackscript) | **GET** /linode/stackscripts/{stackscriptId} | View StackScript
*StackScriptsApi* | [**getStackScripts**](docs/StackScriptsApi.md#getstackscripts) | **GET** /linode/stackscripts | List StackScripts
*StackScriptsApi* | [**updateStackScript**](docs/StackScriptsApi.md#updatestackscript) | **PUT** /linode/stackscripts/{stackscriptId} | Update StackScript
*SupportApi* | [**createTicket**](docs/SupportApi.md#createticket) | **POST** /support/tickets | Open Support Ticket
*SupportApi* | [**createTicketAttachment**](docs/SupportApi.md#createticketattachment) | **POST** /support/tickets/{ticketId}/attachments | Create Ticket Attachment
*SupportApi* | [**createTicketReply**](docs/SupportApi.md#createticketreply) | **POST** /support/tickets/{ticketId}/replies | Create Reply
*SupportApi* | [**getTicket**](docs/SupportApi.md#getticket) | **GET** /support/tickets/{ticketId} | View Support Ticket
*SupportApi* | [**getTicketReplies**](docs/SupportApi.md#getticketreplies) | **GET** /support/tickets/{ticketId}/replies | List Replies
*SupportApi* | [**getTickets**](docs/SupportApi.md#gettickets) | **GET** /support/tickets | List Support Tickets
*VolumesApi* | [**attachVolume**](docs/VolumesApi.md#attachvolume) | **POST** /volumes/{volumeId}/attach | Attach Volume
*VolumesApi* | [**cloneVolume**](docs/VolumesApi.md#clonevolume) | **POST** /volumes/{volumeId}/clone | Clone Volume
*VolumesApi* | [**createVolume**](docs/VolumesApi.md#createvolume) | **POST** /volumes | Create Volume
*VolumesApi* | [**deleteVolume**](docs/VolumesApi.md#deletevolume) | **DELETE** /volumes/{volumeId} | Delete Volume
*VolumesApi* | [**detachVolume**](docs/VolumesApi.md#detachvolume) | **POST** /volumes/{volumeId}/detach | Detach Volume
*VolumesApi* | [**getVolume**](docs/VolumesApi.md#getvolume) | **GET** /volumes/{volumeId} | View Volume
*VolumesApi* | [**getVolumes**](docs/VolumesApi.md#getvolumes) | **GET** /volumes | List Volumes
*VolumesApi* | [**resizeVolume**](docs/VolumesApi.md#resizevolume) | **POST** /volumes/{volumeId}/resize | Resize Volume
*VolumesApi* | [**updateVolume**](docs/VolumesApi.md#updatevolume) | **PUT** /volumes/{volumeId} | Update Volume




<a name="documentation-for-models"></a>
## Documentation for Models


 - [io.swagger.client.models.Account](docs/Account.md)
 - [io.swagger.client.models.AccountCreditCard](docs/AccountCreditCard.md)
 - [io.swagger.client.models.AccountSettings](docs/AccountSettings.md)
 - [io.swagger.client.models.AuthorizedApp](docs/AuthorizedApp.md)
 - [io.swagger.client.models.Backup](docs/Backup.md)
 - [io.swagger.client.models.BackupDisks](docs/BackupDisks.md)
 - [io.swagger.client.models.Body](docs/Body.md)
 - [io.swagger.client.models.Body1](docs/Body1.md)
 - [io.swagger.client.models.Body10](docs/Body10.md)
 - [io.swagger.client.models.Body11](docs/Body11.md)
 - [io.swagger.client.models.Body12](docs/Body12.md)
 - [io.swagger.client.models.Body13](docs/Body13.md)
 - [io.swagger.client.models.Body14](docs/Body14.md)
 - [io.swagger.client.models.Body15](docs/Body15.md)
 - [io.swagger.client.models.Body16](docs/Body16.md)
 - [io.swagger.client.models.Body17](docs/Body17.md)
 - [io.swagger.client.models.Body18](docs/Body18.md)
 - [io.swagger.client.models.Body19](docs/Body19.md)
 - [io.swagger.client.models.Body2](docs/Body2.md)
 - [io.swagger.client.models.Body20](docs/Body20.md)
 - [io.swagger.client.models.Body21](docs/Body21.md)
 - [io.swagger.client.models.Body22](docs/Body22.md)
 - [io.swagger.client.models.Body23](docs/Body23.md)
 - [io.swagger.client.models.Body24](docs/Body24.md)
 - [io.swagger.client.models.Body3](docs/Body3.md)
 - [io.swagger.client.models.Body4](docs/Body4.md)
 - [io.swagger.client.models.Body5](docs/Body5.md)
 - [io.swagger.client.models.Body6](docs/Body6.md)
 - [io.swagger.client.models.Body7](docs/Body7.md)
 - [io.swagger.client.models.Body8](docs/Body8.md)
 - [io.swagger.client.models.Body9](docs/Body9.md)
 - [io.swagger.client.models.CreditCard](docs/CreditCard.md)
 - [io.swagger.client.models.Device](docs/Device.md)
 - [io.swagger.client.models.Devices](docs/Devices.md)
 - [io.swagger.client.models.Disk](docs/Disk.md)
 - [io.swagger.client.models.DiskRequest](docs/DiskRequest.md)
 - [io.swagger.client.models.Domain](docs/Domain.md)
 - [io.swagger.client.models.DomainRecord](docs/DomainRecord.md)
 - [io.swagger.client.models.ErrorObject](docs/ErrorObject.md)
 - [io.swagger.client.models.Event](docs/Event.md)
 - [io.swagger.client.models.EventEntity](docs/EventEntity.md)
 - [io.swagger.client.models.Grant](docs/Grant.md)
 - [io.swagger.client.models.GrantsResponse](docs/GrantsResponse.md)
 - [io.swagger.client.models.GrantsResponseGlobal](docs/GrantsResponseGlobal.md)
 - [io.swagger.client.models.IPAddress](docs/IPAddress.md)
 - [io.swagger.client.models.IPAddressPrivate](docs/IPAddressPrivate.md)
 - [io.swagger.client.models.IPAddressV6LinkLocal](docs/IPAddressV6LinkLocal.md)
 - [io.swagger.client.models.IPAddressV6Slaac](docs/IPAddressV6Slaac.md)
 - [io.swagger.client.models.IPv6Pool](docs/IPv6Pool.md)
 - [io.swagger.client.models.IPv6Range](docs/IPv6Range.md)
 - [io.swagger.client.models.ImagePrivate](docs/ImagePrivate.md)
 - [io.swagger.client.models.ImagePublic](docs/ImagePublic.md)
 - [io.swagger.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [io.swagger.client.models.InlineResponse2001](docs/InlineResponse2001.md)
 - [io.swagger.client.models.InlineResponse20010](docs/InlineResponse20010.md)
 - [io.swagger.client.models.InlineResponse20011](docs/InlineResponse20011.md)
 - [io.swagger.client.models.InlineResponse20012](docs/InlineResponse20012.md)
 - [io.swagger.client.models.InlineResponse20012Snapshot](docs/InlineResponse20012Snapshot.md)
 - [io.swagger.client.models.InlineResponse20013](docs/InlineResponse20013.md)
 - [io.swagger.client.models.InlineResponse20014](docs/InlineResponse20014.md)
 - [io.swagger.client.models.InlineResponse20015](docs/InlineResponse20015.md)
 - [io.swagger.client.models.InlineResponse20016](docs/InlineResponse20016.md)
 - [io.swagger.client.models.InlineResponse20017](docs/InlineResponse20017.md)
 - [io.swagger.client.models.InlineResponse20018](docs/InlineResponse20018.md)
 - [io.swagger.client.models.InlineResponse20019](docs/InlineResponse20019.md)
 - [io.swagger.client.models.InlineResponse2002](docs/InlineResponse2002.md)
 - [io.swagger.client.models.InlineResponse20020](docs/InlineResponse20020.md)
 - [io.swagger.client.models.InlineResponse20021](docs/InlineResponse20021.md)
 - [io.swagger.client.models.InlineResponse20022](docs/InlineResponse20022.md)
 - [io.swagger.client.models.InlineResponse20023](docs/InlineResponse20023.md)
 - [io.swagger.client.models.InlineResponse20024](docs/InlineResponse20024.md)
 - [io.swagger.client.models.InlineResponse20025](docs/InlineResponse20025.md)
 - [io.swagger.client.models.InlineResponse20026](docs/InlineResponse20026.md)
 - [io.swagger.client.models.InlineResponse20027](docs/InlineResponse20027.md)
 - [io.swagger.client.models.InlineResponse20028](docs/InlineResponse20028.md)
 - [io.swagger.client.models.InlineResponse20029](docs/InlineResponse20029.md)
 - [io.swagger.client.models.InlineResponse2003](docs/InlineResponse2003.md)
 - [io.swagger.client.models.InlineResponse20030](docs/InlineResponse20030.md)
 - [io.swagger.client.models.InlineResponse20031](docs/InlineResponse20031.md)
 - [io.swagger.client.models.InlineResponse20032](docs/InlineResponse20032.md)
 - [io.swagger.client.models.InlineResponse20033](docs/InlineResponse20033.md)
 - [io.swagger.client.models.InlineResponse20034](docs/InlineResponse20034.md)
 - [io.swagger.client.models.InlineResponse20035](docs/InlineResponse20035.md)
 - [io.swagger.client.models.InlineResponse20036](docs/InlineResponse20036.md)
 - [io.swagger.client.models.InlineResponse20037](docs/InlineResponse20037.md)
 - [io.swagger.client.models.InlineResponse2004](docs/InlineResponse2004.md)
 - [io.swagger.client.models.InlineResponse2005](docs/InlineResponse2005.md)
 - [io.swagger.client.models.InlineResponse2006](docs/InlineResponse2006.md)
 - [io.swagger.client.models.InlineResponse2007](docs/InlineResponse2007.md)
 - [io.swagger.client.models.InlineResponse2008](docs/InlineResponse2008.md)
 - [io.swagger.client.models.InlineResponse2009](docs/InlineResponse2009.md)
 - [io.swagger.client.models.InlineResponseDefault](docs/InlineResponseDefault.md)
 - [io.swagger.client.models.Invoice](docs/Invoice.md)
 - [io.swagger.client.models.InvoiceItem](docs/InvoiceItem.md)
 - [io.swagger.client.models.Kernel](docs/Kernel.md)
 - [io.swagger.client.models.Linode](docs/Linode.md)
 - [io.swagger.client.models.LinodeAlerts](docs/LinodeAlerts.md)
 - [io.swagger.client.models.LinodeBackups](docs/LinodeBackups.md)
 - [io.swagger.client.models.LinodeBackupsSchedule](docs/LinodeBackupsSchedule.md)
 - [io.swagger.client.models.LinodeBase](docs/LinodeBase.md)
 - [io.swagger.client.models.LinodeConfig](docs/LinodeConfig.md)
 - [io.swagger.client.models.LinodeConfigHelpers](docs/LinodeConfigHelpers.md)
 - [io.swagger.client.models.LinodeRequest](docs/LinodeRequest.md)
 - [io.swagger.client.models.LinodeSpecs](docs/LinodeSpecs.md)
 - [io.swagger.client.models.LinodeStats](docs/LinodeStats.md)
 - [io.swagger.client.models.LinodeStatsIo](docs/LinodeStatsIo.md)
 - [io.swagger.client.models.LinodeStatsNetv4](docs/LinodeStatsNetv4.md)
 - [io.swagger.client.models.LinodeStatsNetv6](docs/LinodeStatsNetv6.md)
 - [io.swagger.client.models.LinodeType](docs/LinodeType.md)
 - [io.swagger.client.models.LinodeTypeAddons](docs/LinodeTypeAddons.md)
 - [io.swagger.client.models.LinodeTypeAddonsBackups](docs/LinodeTypeAddonsBackups.md)
 - [io.swagger.client.models.LinodeTypeAddonsBackupsPrice](docs/LinodeTypeAddonsBackupsPrice.md)
 - [io.swagger.client.models.LinodeTypePrice](docs/LinodeTypePrice.md)
 - [io.swagger.client.models.LongviewClient](docs/LongviewClient.md)
 - [io.swagger.client.models.LongviewClientApps](docs/LongviewClientApps.md)
 - [io.swagger.client.models.LongviewSubscription](docs/LongviewSubscription.md)
 - [io.swagger.client.models.LongviewSubscriptionPrice](docs/LongviewSubscriptionPrice.md)
 - [io.swagger.client.models.ManagedContact](docs/ManagedContact.md)
 - [io.swagger.client.models.ManagedContactPhone](docs/ManagedContactPhone.md)
 - [io.swagger.client.models.ManagedCredential](docs/ManagedCredential.md)
 - [io.swagger.client.models.ManagedIssue](docs/ManagedIssue.md)
 - [io.swagger.client.models.ManagedIssueEntity](docs/ManagedIssueEntity.md)
 - [io.swagger.client.models.ManagedLinodeSettings](docs/ManagedLinodeSettings.md)
 - [io.swagger.client.models.ManagedLinodeSettingsSsh](docs/ManagedLinodeSettingsSsh.md)
 - [io.swagger.client.models.ManagedService](docs/ManagedService.md)
 - [io.swagger.client.models.Networkingipv4assignAssignments](docs/Networkingipv4assignAssignments.md)
 - [io.swagger.client.models.NodeBalancer](docs/NodeBalancer.md)
 - [io.swagger.client.models.NodeBalancerConfig](docs/NodeBalancerConfig.md)
 - [io.swagger.client.models.NodeBalancerConfigNodesStatus](docs/NodeBalancerConfigNodesStatus.md)
 - [io.swagger.client.models.NodeBalancerNode](docs/NodeBalancerNode.md)
 - [io.swagger.client.models.NodeBalancerStats](docs/NodeBalancerStats.md)
 - [io.swagger.client.models.NodeBalancerStatsData](docs/NodeBalancerStatsData.md)
 - [io.swagger.client.models.NodeBalancerStatsDataTraffic](docs/NodeBalancerStatsDataTraffic.md)
 - [io.swagger.client.models.NodeBalancerTransfer](docs/NodeBalancerTransfer.md)
 - [io.swagger.client.models.Notification](docs/Notification.md)
 - [io.swagger.client.models.NotificationEntity](docs/NotificationEntity.md)
 - [io.swagger.client.models.OAuthClient](docs/OAuthClient.md)
 - [io.swagger.client.models.PaginationEnvelope](docs/PaginationEnvelope.md)
 - [io.swagger.client.models.PayPal](docs/PayPal.md)
 - [io.swagger.client.models.PayPalExecute](docs/PayPalExecute.md)
 - [io.swagger.client.models.Payment](docs/Payment.md)
 - [io.swagger.client.models.PaymentRequest](docs/PaymentRequest.md)
 - [io.swagger.client.models.PersonalAccessToken](docs/PersonalAccessToken.md)
 - [io.swagger.client.models.Profile](docs/Profile.md)
 - [io.swagger.client.models.ProfileReferrals](docs/ProfileReferrals.md)
 - [io.swagger.client.models.Region](docs/Region.md)
 - [io.swagger.client.models.RescueDevices](docs/RescueDevices.md)
 - [io.swagger.client.models.StackScript](docs/StackScript.md)
 - [io.swagger.client.models.SupportTicket](docs/SupportTicket.md)
 - [io.swagger.client.models.SupportTicketEntity](docs/SupportTicketEntity.md)
 - [io.swagger.client.models.SupportTicketReply](docs/SupportTicketReply.md)
 - [io.swagger.client.models.SupportTicketRequest](docs/SupportTicketRequest.md)
 - [io.swagger.client.models.TFATrustedComputer](docs/TFATrustedComputer.md)
 - [io.swagger.client.models.Transfer](docs/Transfer.md)
 - [io.swagger.client.models.User](docs/User.md)
 - [io.swagger.client.models.UserDefinedField](docs/UserDefinedField.md)
 - [io.swagger.client.models.Volume](docs/Volume.md)





<a name="documentation-for-authorization"></a>
## Documentation for Authorization








<a name="oauth"></a>
### oauth



- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://login.linode.com/oauth/authorize
- **Scopes**: 
  - : 




<a name="personalAccessToken"></a>
### personalAccessToken





