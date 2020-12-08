# ConfigGroupApi

All URIs are relative to *https://api.lucfish.com/configuration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configGroupBatchDeletePost**](ConfigGroupApi.md#configGroupBatchDeletePost) | **POST** /configGroup/batchDelete | 批量删除组
[**configGroupBatchRetrievePost**](ConfigGroupApi.md#configGroupBatchRetrievePost) | **POST** /configGroup/batchRetrieve | 批量查询组
[**configGroupCursorPost**](ConfigGroupApi.md#configGroupCursorPost) | **POST** /configGroup/cursor | Cursor查询组
[**configGroupIdDelete**](ConfigGroupApi.md#configGroupIdDelete) | **DELETE** /configGroup/{id} | 删除组
[**configGroupIdGet**](ConfigGroupApi.md#configGroupIdGet) | **GET** /configGroup/{id} | 查询组
[**configGroupPagePost**](ConfigGroupApi.md#configGroupPagePost) | **POST** /configGroup/page | Page查询组
[**configGroupPost**](ConfigGroupApi.md#configGroupPost) | **POST** /configGroup | 创建组
[**configGroupPut**](ConfigGroupApi.md#configGroupPut) | **PUT** /configGroup | 更新组
[**configGroupRetrieveByNamePost**](ConfigGroupApi.md#configGroupRetrieveByNamePost) | **POST** /configGroup/retrieveByName | 查询组


<a name="configGroupBatchDeletePost"></a>
# **configGroupBatchDeletePost**
> InlineResponse2001 configGroupBatchDeletePost(idsReq)

批量删除组

批量删除组通过组Id

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    IdsReq idsReq = new IdsReq(); // IdsReq | 
    try {
      InlineResponse2001 result = apiInstance.configGroupBatchDeletePost(idsReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupBatchDeletePost");
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

<a name="configGroupBatchRetrievePost"></a>
# **configGroupBatchRetrievePost**
> InlineResponse20010 configGroupBatchRetrievePost(idsReq)

批量查询组

批量查询组通过组Id

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    IdsReq idsReq = new IdsReq(); // IdsReq | 
    try {
      InlineResponse20010 result = apiInstance.configGroupBatchRetrievePost(idsReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupBatchRetrievePost");
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

[**InlineResponse20010**](InlineResponse20010.md)

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

<a name="configGroupCursorPost"></a>
# **configGroupCursorPost**
> InlineResponse20012 configGroupCursorPost(cursorQuery)

Cursor查询组

Cursor查询组

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    CursorQuery cursorQuery = new CursorQuery(); // CursorQuery | 
    try {
      InlineResponse20012 result = apiInstance.configGroupCursorPost(cursorQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupCursorPost");
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

[**InlineResponse20012**](InlineResponse20012.md)

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

<a name="configGroupIdDelete"></a>
# **configGroupIdDelete**
> InlineResponse2001 configGroupIdDelete(id)

删除组

删除组

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    String id = "id_example"; // String | 删除组
    try {
      InlineResponse2001 result = apiInstance.configGroupIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupIdDelete");
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
 **id** | **String**| 删除组 |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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

<a name="configGroupIdGet"></a>
# **configGroupIdGet**
> InlineResponse2009 configGroupIdGet(id)

查询组

查询组通过组ID

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    String id = "id_example"; // String | 查询组通过组ID
    try {
      InlineResponse2009 result = apiInstance.configGroupIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupIdGet");
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
 **id** | **String**| 查询组通过组ID |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

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

<a name="configGroupPagePost"></a>
# **configGroupPagePost**
> InlineResponse20011 configGroupPagePost(pageQuery)

Page查询组

Page查询组

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    PageQuery pageQuery = new PageQuery(); // PageQuery | 
    try {
      InlineResponse20011 result = apiInstance.configGroupPagePost(pageQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupPagePost");
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

[**InlineResponse20011**](InlineResponse20011.md)

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

<a name="configGroupPost"></a>
# **configGroupPost**
> InlineResponse2009 configGroupPost(createConfigGroupReq)

创建组

创建组

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    CreateConfigGroupReq createConfigGroupReq = new CreateConfigGroupReq(); // CreateConfigGroupReq | 
    try {
      InlineResponse2009 result = apiInstance.configGroupPost(createConfigGroupReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupPost");
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
 **createConfigGroupReq** | [**CreateConfigGroupReq**](CreateConfigGroupReq.md)|  | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

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

<a name="configGroupPut"></a>
# **configGroupPut**
> InlineResponse2009 configGroupPut(updateConfigGroupReq)

更新组

更新组，需要全部的组信息

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    UpdateConfigGroupReq updateConfigGroupReq = new UpdateConfigGroupReq(); // UpdateConfigGroupReq | 
    try {
      InlineResponse2009 result = apiInstance.configGroupPut(updateConfigGroupReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupPut");
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
 **updateConfigGroupReq** | [**UpdateConfigGroupReq**](UpdateConfigGroupReq.md)|  | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

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

<a name="configGroupRetrieveByNamePost"></a>
# **configGroupRetrieveByNamePost**
> InlineResponse2005 configGroupRetrieveByNamePost(name)

查询组

查询组通过Name

### Example
```java
// Import classes:
import com.xopenapi.ApiClient;
import com.xopenapi.ApiException;
import com.xopenapi.Configuration;
import com.xopenapi.auth.*;
import com.xopenapi.models.*;
import com.xopenapi.config.ConfigGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lucfish.com/configuration/v1");
    
    // Configure HTTP bearer authorization: ApiKey
    HttpBearerAuth ApiKey = (HttpBearerAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setBearerToken("BEARER TOKEN");

    ConfigGroupApi apiInstance = new ConfigGroupApi(defaultClient);
    String name = "name_example"; // String | 查询组通过Name
    try {
      InlineResponse2005 result = apiInstance.configGroupRetrieveByNamePost(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigGroupApi#configGroupRetrieveByNamePost");
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
 **name** | **String**| 查询组通过Name |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

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

