# ConfigTemplateApi

All URIs are relative to *https://api.lucfish.com/configuration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configTemplateBatchDeletePost**](ConfigTemplateApi.md#configTemplateBatchDeletePost) | **POST** /configTemplate/batchDelete | 批量删除配置模版
[**configTemplateBatchRetrieveByGroupPost**](ConfigTemplateApi.md#configTemplateBatchRetrieveByGroupPost) | **POST** /configTemplate/batchRetrieveByGroup | 查询配置模版
[**configTemplateBatchRetrieveByKeysPost**](ConfigTemplateApi.md#configTemplateBatchRetrieveByKeysPost) | **POST** /configTemplate/batchRetrieveByKeys | 查询配置模版
[**configTemplateBatchRetrievePost**](ConfigTemplateApi.md#configTemplateBatchRetrievePost) | **POST** /configTemplate/batchRetrieve | 批量查询配置模版
[**configTemplateCursorPost**](ConfigTemplateApi.md#configTemplateCursorPost) | **POST** /configTemplate/cursor | Cursor查询配置模版
[**configTemplateIdDelete**](ConfigTemplateApi.md#configTemplateIdDelete) | **DELETE** /configTemplate/{id} | 删除配置模版
[**configTemplateIdGet**](ConfigTemplateApi.md#configTemplateIdGet) | **GET** /configTemplate/{id} | 查询配置模版
[**configTemplatePagePost**](ConfigTemplateApi.md#configTemplatePagePost) | **POST** /configTemplate/page | Page查询配置模版
[**configTemplatePost**](ConfigTemplateApi.md#configTemplatePost) | **POST** /configTemplate | 创建配置模版
[**configTemplateRetrieveByKeyPost**](ConfigTemplateApi.md#configTemplateRetrieveByKeyPost) | **POST** /configTemplate/retrieveByKey | 查询配置模版


<a name="configTemplateBatchDeletePost"></a>
# **configTemplateBatchDeletePost**
> InlineResponse200 configTemplateBatchDeletePost(idsReq)

批量删除配置模版

批量删除配置模版通过配置Id

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    IdsReq idsReq = new IdsReq(); // IdsReq | 
    try {
      InlineResponse200 result = apiInstance.configTemplateBatchDeletePost(idsReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplateBatchDeletePost");
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

<a name="configTemplateBatchRetrieveByGroupPost"></a>
# **configTemplateBatchRetrieveByGroupPost**
> BatchRetrieveConfigTemplatesByGroupRsp configTemplateBatchRetrieveByGroupPost(groupName)

查询配置模版

查询配置模版通过配置模版GroupID

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    String groupName = "groupName_example"; // String | 分组标签名
    try {
      BatchRetrieveConfigTemplatesByGroupRsp result = apiInstance.configTemplateBatchRetrieveByGroupPost(groupName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplateBatchRetrieveByGroupPost");
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
 **groupName** | **String**| 分组标签名 |

### Return type

[**BatchRetrieveConfigTemplatesByGroupRsp**](BatchRetrieveConfigTemplatesByGroupRsp.md)

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

<a name="configTemplateBatchRetrieveByKeysPost"></a>
# **configTemplateBatchRetrieveByKeysPost**
> BatchRetrieveConfigTemplatesByKeysRsp configTemplateBatchRetrieveByKeysPost(batchRetrieveConfigTemplateByKeysReq)

查询配置模版

查询配置通过配置Keys

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    BatchRetrieveConfigTemplateByKeysReq batchRetrieveConfigTemplateByKeysReq = new BatchRetrieveConfigTemplateByKeysReq(); // BatchRetrieveConfigTemplateByKeysReq | 
    try {
      BatchRetrieveConfigTemplatesByKeysRsp result = apiInstance.configTemplateBatchRetrieveByKeysPost(batchRetrieveConfigTemplateByKeysReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplateBatchRetrieveByKeysPost");
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
 **batchRetrieveConfigTemplateByKeysReq** | [**BatchRetrieveConfigTemplateByKeysReq**](BatchRetrieveConfigTemplateByKeysReq.md)|  | [optional]

### Return type

[**BatchRetrieveConfigTemplatesByKeysRsp**](BatchRetrieveConfigTemplatesByKeysRsp.md)

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

<a name="configTemplateBatchRetrievePost"></a>
# **configTemplateBatchRetrievePost**
> BatchRetrieveConfigTemplatesRsp configTemplateBatchRetrievePost(idsReq)

批量查询配置模版

批量查询配置模版通过配置Id

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    IdsReq idsReq = new IdsReq(); // IdsReq | 
    try {
      BatchRetrieveConfigTemplatesRsp result = apiInstance.configTemplateBatchRetrievePost(idsReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplateBatchRetrievePost");
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

[**BatchRetrieveConfigTemplatesRsp**](BatchRetrieveConfigTemplatesRsp.md)

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

<a name="configTemplateCursorPost"></a>
# **configTemplateCursorPost**
> CursorConfigTemplatesRsp configTemplateCursorPost(cursorQuery)

Cursor查询配置模版

Cursor查询配置模版

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    CursorQuery cursorQuery = new CursorQuery(); // CursorQuery | 
    try {
      CursorConfigTemplatesRsp result = apiInstance.configTemplateCursorPost(cursorQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplateCursorPost");
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

[**CursorConfigTemplatesRsp**](CursorConfigTemplatesRsp.md)

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

<a name="configTemplateIdDelete"></a>
# **configTemplateIdDelete**
> InlineResponse200 configTemplateIdDelete(id)

删除配置模版

删除配置模版

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    String id = "id_example"; // String | 删除配置模版
    try {
      InlineResponse200 result = apiInstance.configTemplateIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplateIdDelete");
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
 **id** | **String**| 删除配置模版 |

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

<a name="configTemplateIdGet"></a>
# **configTemplateIdGet**
> GetConfigTemplateRsp configTemplateIdGet(id)

查询配置模版

查询配置通过配置模版ID

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    String id = "id_example"; // String | 查询配置通过配置ID
    try {
      GetConfigTemplateRsp result = apiInstance.configTemplateIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplateIdGet");
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

[**GetConfigTemplateRsp**](GetConfigTemplateRsp.md)

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

<a name="configTemplatePagePost"></a>
# **configTemplatePagePost**
> PageConfigTemplatesRsp configTemplatePagePost(pageQuery)

Page查询配置模版

Page查询配置模版

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    PageQuery pageQuery = new PageQuery(); // PageQuery | 
    try {
      PageConfigTemplatesRsp result = apiInstance.configTemplatePagePost(pageQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplatePagePost");
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

[**PageConfigTemplatesRsp**](PageConfigTemplatesRsp.md)

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

<a name="configTemplatePost"></a>
# **configTemplatePost**
> CreateConfigTemplateRsp configTemplatePost(createConfigTemplateReq)

创建配置模版

创建配置模版

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    CreateConfigTemplateReq createConfigTemplateReq = new CreateConfigTemplateReq(); // CreateConfigTemplateReq | 
    try {
      CreateConfigTemplateRsp result = apiInstance.configTemplatePost(createConfigTemplateReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplatePost");
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
 **createConfigTemplateReq** | [**CreateConfigTemplateReq**](CreateConfigTemplateReq.md)|  | [optional]

### Return type

[**CreateConfigTemplateRsp**](CreateConfigTemplateRsp.md)

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

<a name="configTemplateRetrieveByKeyPost"></a>
# **configTemplateRetrieveByKeyPost**
> RetrieveConfigTemplateByKeyRsp configTemplateRetrieveByKeyPost(key)

查询配置模版

查询配置模版通过配置Key

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigTemplateApi apiInstance = new ConfigTemplateApi(defaultClient);
    String key = "key_example"; // String | 主键Key
    try {
      RetrieveConfigTemplateByKeyRsp result = apiInstance.configTemplateRetrieveByKeyPost(key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigTemplateApi#configTemplateRetrieveByKeyPost");
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
 **key** | **String**| 主键Key |

### Return type

[**RetrieveConfigTemplateByKeyRsp**](RetrieveConfigTemplateByKeyRsp.md)

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

