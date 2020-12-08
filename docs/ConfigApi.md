# ConfigApi

All URIs are relative to *https://api.lucfish.com/configuration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configBatchDeletePost**](ConfigApi.md#configBatchDeletePost) | **POST** /config/batchDelete | 批量删除配置
[**configBatchRetrieveByKeysPost**](ConfigApi.md#configBatchRetrieveByKeysPost) | **POST** /config/batchRetrieveByKeys | 查询配置
[**configBatchRetrieveByResourcesPost**](ConfigApi.md#configBatchRetrieveByResourcesPost) | **POST** /config/batchRetrieveByResources | 查询配置
[**configBatchRetrievePost**](ConfigApi.md#configBatchRetrievePost) | **POST** /config/batchRetrieve | 批量查询配置
[**configCursorPost**](ConfigApi.md#configCursorPost) | **POST** /config/cursor | Cursor查询配置
[**configIdDelete**](ConfigApi.md#configIdDelete) | **DELETE** /config/{id} | 删除配置
[**configIdGet**](ConfigApi.md#configIdGet) | **GET** /config/{id} | 查询配置
[**configPagePost**](ConfigApi.md#configPagePost) | **POST** /config/page | Page查询配置
[**configPost**](ConfigApi.md#configPost) | **POST** /config | 创建配置
[**configPut**](ConfigApi.md#configPut) | **PUT** /config | 更新配置
[**configRetrieveByKeyPost**](ConfigApi.md#configRetrieveByKeyPost) | **POST** /config/retrieveByKey | 查询配置
[**configTemplatePut**](ConfigApi.md#configTemplatePut) | **PUT** /configTemplate | 更新配置模版


<a name="configBatchDeletePost"></a>
# **configBatchDeletePost**
> InlineResponse200 configBatchDeletePost(idsReq)

批量删除配置

批量删除配置通过配置Id

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idsReq** | [**IdsReq**](IdsReq.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configBatchRetrieveByKeysPost"></a>
# **configBatchRetrieveByKeysPost**
> BatchRetrieveConfigsByKeysRsp configBatchRetrieveByKeysPost(batchRetrieveByKeysReq)

查询配置

查询配置通过配置Keys和资源ID

### Example
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
    BatchRetrieveByKeysReq batchRetrieveByKeysReq = new BatchRetrieveByKeysReq(); // BatchRetrieveByKeysReq | 
    try {
      BatchRetrieveConfigsByKeysRsp result = apiInstance.configBatchRetrieveByKeysPost(batchRetrieveByKeysReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configBatchRetrieveByKeysPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchRetrieveByKeysReq** | [**BatchRetrieveByKeysReq**](BatchRetrieveByKeysReq.md)|  | [optional]

### Return type

[**BatchRetrieveConfigsByKeysRsp**](BatchRetrieveConfigsByKeysRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configBatchRetrieveByResourcesPost"></a>
# **configBatchRetrieveByResourcesPost**
> InlineResponse2001 configBatchRetrieveByResourcesPost(batchRetrieveByResourcesReq)

查询配置

查询配置通过配置GroupID

### Example
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
    BatchRetrieveByResourcesReq batchRetrieveByResourcesReq = new BatchRetrieveByResourcesReq(); // BatchRetrieveByResourcesReq | 
    try {
      InlineResponse2001 result = apiInstance.configBatchRetrieveByResourcesPost(batchRetrieveByResourcesReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configBatchRetrieveByResourcesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchRetrieveByResourcesReq** | [**BatchRetrieveByResourcesReq**](BatchRetrieveByResourcesReq.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configBatchRetrievePost"></a>
# **configBatchRetrievePost**
> BatchRetrieveConfigsRsp configBatchRetrievePost(idsReq)

批量查询配置

批量查询配置通过配置Id

### Example
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
      BatchRetrieveConfigsRsp result = apiInstance.configBatchRetrievePost(idsReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configBatchRetrievePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idsReq** | [**IdsReq**](IdsReq.md)|  | [optional]

### Return type

[**BatchRetrieveConfigsRsp**](BatchRetrieveConfigsRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configCursorPost"></a>
# **configCursorPost**
> CursorConfigsRsp configCursorPost(cursorQuery)

Cursor查询配置

Cursor查询配置

### Example
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
    CursorQuery cursorQuery = new CursorQuery(); // CursorQuery | 
    try {
      CursorConfigsRsp result = apiInstance.configCursorPost(cursorQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configCursorPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursorQuery** | [**CursorQuery**](CursorQuery.md)|  | [optional]

### Return type

[**CursorConfigsRsp**](CursorConfigsRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configIdDelete"></a>
# **configIdDelete**
> InlineResponse200 configIdDelete(id)

删除配置

删除配置

### Example
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
    String id = "id_example"; // String | 删除配置
    try {
      InlineResponse200 result = apiInstance.configIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 删除配置 |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configIdGet"></a>
# **configIdGet**
> GetConfigRsp configIdGet(id)

查询配置

查询配置通过配置ID

### Example
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
    String id = "id_example"; // String | 查询配置通过配置ID
    try {
      GetConfigRsp result = apiInstance.configIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 查询配置通过配置ID |

### Return type

[**GetConfigRsp**](GetConfigRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configPagePost"></a>
# **configPagePost**
> PageConfigsRsp configPagePost(pageQuery)

Page查询配置

Page查询配置

### Example
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
    PageQuery pageQuery = new PageQuery(); // PageQuery | 
    try {
      PageConfigsRsp result = apiInstance.configPagePost(pageQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configPagePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageQuery** | [**PageQuery**](PageQuery.md)|  | [optional]

### Return type

[**PageConfigsRsp**](PageConfigsRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configPost"></a>
# **configPost**
> CreateConfigRsp configPost(createConfigReq)

创建配置

创建配置

### Example
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
    CreateConfigReq createConfigReq = new CreateConfigReq(); // CreateConfigReq | 
    try {
      CreateConfigRsp result = apiInstance.configPost(createConfigReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConfigReq** | [**CreateConfigReq**](CreateConfigReq.md)|  | [optional]

### Return type

[**CreateConfigRsp**](CreateConfigRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configPut"></a>
# **configPut**
> UpdateConfigRsp configPut(updateConfigReq)

更新配置

更新配置，需要全部的配置信息

### Example
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
    UpdateConfigReq updateConfigReq = new UpdateConfigReq(); // UpdateConfigReq | 
    try {
      UpdateConfigRsp result = apiInstance.configPut(updateConfigReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateConfigReq** | [**UpdateConfigReq**](UpdateConfigReq.md)|  | [optional]

### Return type

[**UpdateConfigRsp**](UpdateConfigRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configRetrieveByKeyPost"></a>
# **configRetrieveByKeyPost**
> RetrieveConfigByKeyRsp configRetrieveByKeyPost(retrieveConfigByKeyReq)

查询配置

查询配置通过配置Key和资源ID

### Example
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
    RetrieveConfigByKeyReq retrieveConfigByKeyReq = new RetrieveConfigByKeyReq(); // RetrieveConfigByKeyReq | 
    try {
      RetrieveConfigByKeyRsp result = apiInstance.configRetrieveByKeyPost(retrieveConfigByKeyReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configRetrieveByKeyPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retrieveConfigByKeyReq** | [**RetrieveConfigByKeyReq**](RetrieveConfigByKeyReq.md)|  | [optional]

### Return type

[**RetrieveConfigByKeyRsp**](RetrieveConfigByKeyRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

<a name="configTemplatePut"></a>
# **configTemplatePut**
> UpdateConfigTemplateRsp configTemplatePut(updateConfigTemplateReq)

更新配置模版

更新配置模版，需要全部的配置模版信息

### Example
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
    UpdateConfigTemplateReq updateConfigTemplateReq = new UpdateConfigTemplateReq(); // UpdateConfigTemplateReq | 
    try {
      UpdateConfigTemplateRsp result = apiInstance.configTemplatePut(updateConfigTemplateReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configTemplatePut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateConfigTemplateReq** | [**UpdateConfigTemplateReq**](UpdateConfigTemplateReq.md)|  | [optional]

### Return type

[**UpdateConfigTemplateRsp**](UpdateConfigTemplateRsp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**405** | Invalid input |  -  |

