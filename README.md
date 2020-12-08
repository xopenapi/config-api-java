# config-api-java

配置服务API
- API version: 1.0.0
  - Build date: 2020-12-08T10:34:11.838Z[GMT]

配置服务API


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.xopenapi</groupId>
  <artifactId>config-api-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.xopenapi:config-api-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/config-api-java-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    IdsReq idsReq = new IdsReq(); // IdsReq | 
    try {
      InlineResponse200 result = apiInstance.configBatchDeletePost(idsReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configBatchDeletePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.lucfish.com/configuration/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigApi* | [**configBatchDeletePost**](docs/ConfigApi.md#configBatchDeletePost) | **POST** /config/batchDelete | 批量删除配置
*ConfigApi* | [**configBatchRetrieveByKeysPost**](docs/ConfigApi.md#configBatchRetrieveByKeysPost) | **POST** /config/batchRetrieveByKeys | 查询配置
*ConfigApi* | [**configBatchRetrieveByResourcesPost**](docs/ConfigApi.md#configBatchRetrieveByResourcesPost) | **POST** /config/batchRetrieveByResources | 查询配置
*ConfigApi* | [**configBatchRetrievePost**](docs/ConfigApi.md#configBatchRetrievePost) | **POST** /config/batchRetrieve | 批量查询配置
*ConfigApi* | [**configCursorPost**](docs/ConfigApi.md#configCursorPost) | **POST** /config/cursor | Cursor查询配置
*ConfigApi* | [**configIdDelete**](docs/ConfigApi.md#configIdDelete) | **DELETE** /config/{id} | 删除配置
*ConfigApi* | [**configIdGet**](docs/ConfigApi.md#configIdGet) | **GET** /config/{id} | 查询配置
*ConfigApi* | [**configPagePost**](docs/ConfigApi.md#configPagePost) | **POST** /config/page | Page查询配置
*ConfigApi* | [**configPost**](docs/ConfigApi.md#configPost) | **POST** /config | 创建配置
*ConfigApi* | [**configPut**](docs/ConfigApi.md#configPut) | **PUT** /config | 更新配置
*ConfigApi* | [**configRetrieveByKeyPost**](docs/ConfigApi.md#configRetrieveByKeyPost) | **POST** /config/retrieveByKey | 查询配置
*ConfigApi* | [**configTemplatePut**](docs/ConfigApi.md#configTemplatePut) | **PUT** /configTemplate | 更新配置模版
*ConfigGroupApi* | [**configGroupBatchDeletePost**](docs/ConfigGroupApi.md#configGroupBatchDeletePost) | **POST** /configGroup/batchDelete | 批量删除组
*ConfigGroupApi* | [**configGroupBatchRetrievePost**](docs/ConfigGroupApi.md#configGroupBatchRetrievePost) | **POST** /configGroup/batchRetrieve | 批量查询组
*ConfigGroupApi* | [**configGroupCursorPost**](docs/ConfigGroupApi.md#configGroupCursorPost) | **POST** /configGroup/cursor | Cursor查询组
*ConfigGroupApi* | [**configGroupIdDelete**](docs/ConfigGroupApi.md#configGroupIdDelete) | **DELETE** /configGroup/{id} | 删除组
*ConfigGroupApi* | [**configGroupIdGet**](docs/ConfigGroupApi.md#configGroupIdGet) | **GET** /configGroup/{id} | 查询组
*ConfigGroupApi* | [**configGroupPagePost**](docs/ConfigGroupApi.md#configGroupPagePost) | **POST** /configGroup/page | Page查询组
*ConfigGroupApi* | [**configGroupPost**](docs/ConfigGroupApi.md#configGroupPost) | **POST** /configGroup | 创建组
*ConfigGroupApi* | [**configGroupPut**](docs/ConfigGroupApi.md#configGroupPut) | **PUT** /configGroup | 更新组
*ConfigGroupApi* | [**configGroupRetrieveByNamePost**](docs/ConfigGroupApi.md#configGroupRetrieveByNamePost) | **POST** /configGroup/retrieveByName | 查询组
*ConfigTemplateApi* | [**configTemplateBatchDeletePost**](docs/ConfigTemplateApi.md#configTemplateBatchDeletePost) | **POST** /configTemplate/batchDelete | 批量删除配置模版
*ConfigTemplateApi* | [**configTemplateBatchRetrieveByGroupPost**](docs/ConfigTemplateApi.md#configTemplateBatchRetrieveByGroupPost) | **POST** /configTemplate/batchRetrieveByGroup | 查询配置模版
*ConfigTemplateApi* | [**configTemplateBatchRetrieveByKeysPost**](docs/ConfigTemplateApi.md#configTemplateBatchRetrieveByKeysPost) | **POST** /configTemplate/batchRetrieveByKeys | 查询配置模版
*ConfigTemplateApi* | [**configTemplateBatchRetrievePost**](docs/ConfigTemplateApi.md#configTemplateBatchRetrievePost) | **POST** /configTemplate/batchRetrieve | 批量查询配置模版
*ConfigTemplateApi* | [**configTemplateCursorPost**](docs/ConfigTemplateApi.md#configTemplateCursorPost) | **POST** /configTemplate/cursor | Cursor查询配置模版
*ConfigTemplateApi* | [**configTemplateIdDelete**](docs/ConfigTemplateApi.md#configTemplateIdDelete) | **DELETE** /configTemplate/{id} | 删除配置模版
*ConfigTemplateApi* | [**configTemplateIdGet**](docs/ConfigTemplateApi.md#configTemplateIdGet) | **GET** /configTemplate/{id} | 查询配置模版
*ConfigTemplateApi* | [**configTemplatePagePost**](docs/ConfigTemplateApi.md#configTemplatePagePost) | **POST** /configTemplate/page | Page查询配置模版
*ConfigTemplateApi* | [**configTemplatePost**](docs/ConfigTemplateApi.md#configTemplatePost) | **POST** /configTemplate | 创建配置模版
*ConfigTemplateApi* | [**configTemplateRetrieveByKeyPost**](docs/ConfigTemplateApi.md#configTemplateRetrieveByKeyPost) | **POST** /configTemplate/retrieveByKey | 查询配置模版


## Documentation for Models

 - [BatchRetrieveByKeysReq](docs/BatchRetrieveByKeysReq.md)
 - [BatchRetrieveByResourcesReq](docs/BatchRetrieveByResourcesReq.md)
 - [BatchRetrieveConfigTemplateByKeysReq](docs/BatchRetrieveConfigTemplateByKeysReq.md)
 - [BatchRetrieveConfigTemplatesByGroupRsp](docs/BatchRetrieveConfigTemplatesByGroupRsp.md)
 - [BatchRetrieveConfigTemplatesByKeysRsp](docs/BatchRetrieveConfigTemplatesByKeysRsp.md)
 - [BatchRetrieveConfigTemplatesRsp](docs/BatchRetrieveConfigTemplatesRsp.md)
 - [BatchRetrieveConfigsByKeysRsp](docs/BatchRetrieveConfigsByKeysRsp.md)
 - [BatchRetrieveConfigsRsp](docs/BatchRetrieveConfigsRsp.md)
 - [Config](docs/Config.md)
 - [ConfigGroup](docs/ConfigGroup.md)
 - [ConfigTemplate](docs/ConfigTemplate.md)
 - [CreateConfigGroupReq](docs/CreateConfigGroupReq.md)
 - [CreateConfigGroupRsp](docs/CreateConfigGroupRsp.md)
 - [CreateConfigReq](docs/CreateConfigReq.md)
 - [CreateConfigRsp](docs/CreateConfigRsp.md)
 - [CreateConfigTemplateReq](docs/CreateConfigTemplateReq.md)
 - [CreateConfigTemplateRsp](docs/CreateConfigTemplateRsp.md)
 - [CursorConfigGroupsRsp](docs/CursorConfigGroupsRsp.md)
 - [CursorConfigGroupsRspData](docs/CursorConfigGroupsRspData.md)
 - [CursorConfigTemplatesRsp](docs/CursorConfigTemplatesRsp.md)
 - [CursorConfigTemplatesRspData](docs/CursorConfigTemplatesRspData.md)
 - [CursorConfigsRsp](docs/CursorConfigsRsp.md)
 - [CursorConfigsRspData](docs/CursorConfigsRspData.md)
 - [CursorExtra](docs/CursorExtra.md)
 - [CursorQuery](docs/CursorQuery.md)
 - [GetConfigGroupRsp](docs/GetConfigGroupRsp.md)
 - [GetConfigGroupsRsp](docs/GetConfigGroupsRsp.md)
 - [GetConfigRsp](docs/GetConfigRsp.md)
 - [GetConfigTemplateRsp](docs/GetConfigTemplateRsp.md)
 - [IdsReq](docs/IdsReq.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [PageConfigGroupsRsp](docs/PageConfigGroupsRsp.md)
 - [PageConfigGroupsRspData](docs/PageConfigGroupsRspData.md)
 - [PageConfigTemplatesRsp](docs/PageConfigTemplatesRsp.md)
 - [PageConfigTemplatesRspData](docs/PageConfigTemplatesRspData.md)
 - [PageConfigsRsp](docs/PageConfigsRsp.md)
 - [PageConfigsRspData](docs/PageConfigsRspData.md)
 - [PageQuery](docs/PageQuery.md)
 - [RetrieveConfigByKeyReq](docs/RetrieveConfigByKeyReq.md)
 - [RetrieveConfigByKeyRsp](docs/RetrieveConfigByKeyRsp.md)
 - [RetrieveConfigGroupByNameRsp](docs/RetrieveConfigGroupByNameRsp.md)
 - [RetrieveConfigTemplateByKeyRsp](docs/RetrieveConfigTemplateByKeyRsp.md)
 - [SortSpec](docs/SortSpec.md)
 - [UpdateConfigGroupReq](docs/UpdateConfigGroupReq.md)
 - [UpdateConfigGroupRsp](docs/UpdateConfigGroupRsp.md)
 - [UpdateConfigReq](docs/UpdateConfigReq.md)
 - [UpdateConfigRsp](docs/UpdateConfigRsp.md)
 - [UpdateConfigTemplateReq](docs/UpdateConfigTemplateReq.md)
 - [UpdateConfigTemplateRsp](docs/UpdateConfigTemplateRsp.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKey

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



