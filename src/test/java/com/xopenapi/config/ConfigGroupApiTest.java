/*
 * 配置服务API
 * 配置服务API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xopenapi.config;

import com.xopenapi.ApiException;
import com.xopenapi.config.model.CreateConfigGroupReq;
import com.xopenapi.config.model.CreateConfigGroupRsp;
import com.xopenapi.config.model.CursorConfigGroupsRsp;
import com.xopenapi.config.model.CursorQuery;
import com.xopenapi.config.model.DeleteRsp;
import com.xopenapi.config.model.GetConfigGroupRsp;
import com.xopenapi.config.model.GetConfigGroupsRsp;
import com.xopenapi.config.model.IdsReq;
import com.xopenapi.config.model.PageConfigGroupsRsp;
import com.xopenapi.config.model.PageQuery;
import com.xopenapi.config.model.RetrieveConfigGroupByNameRsp;
import com.xopenapi.config.model.UpdateConfigGroupReq;
import com.xopenapi.config.model.UpdateConfigGroupRsp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigGroupApi
 */
@Ignore
public class ConfigGroupApiTest {

    private final ConfigGroupApi api = new ConfigGroupApi();

    
    /**
     * 批量删除组
     *
     * 批量删除组通过组Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupBatchDeletePostTest() throws ApiException {
        IdsReq idsReq = null;
        DeleteRsp response = api.configGroupBatchDeletePost(idsReq);

        // TODO: test validations
    }
    
    /**
     * 批量查询组
     *
     * 批量查询组通过组Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupBatchRetrievePostTest() throws ApiException {
        IdsReq idsReq = null;
        GetConfigGroupsRsp response = api.configGroupBatchRetrievePost(idsReq);

        // TODO: test validations
    }
    
    /**
     * Cursor查询组
     *
     * Cursor查询组
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupCursorPostTest() throws ApiException {
        CursorQuery cursorQuery = null;
        CursorConfigGroupsRsp response = api.configGroupCursorPost(cursorQuery);

        // TODO: test validations
    }
    
    /**
     * 删除组
     *
     * 删除组
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupIdDeleteTest() throws ApiException {
        String id = null;
        DeleteRsp response = api.configGroupIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * 查询组
     *
     * 查询组通过组ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupIdGetTest() throws ApiException {
        String id = null;
        GetConfigGroupRsp response = api.configGroupIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Page查询组
     *
     * Page查询组
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupPagePostTest() throws ApiException {
        PageQuery pageQuery = null;
        PageConfigGroupsRsp response = api.configGroupPagePost(pageQuery);

        // TODO: test validations
    }
    
    /**
     * 创建组
     *
     * 创建组
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupPostTest() throws ApiException {
        CreateConfigGroupReq createConfigGroupReq = null;
        CreateConfigGroupRsp response = api.configGroupPost(createConfigGroupReq);

        // TODO: test validations
    }
    
    /**
     * 更新组
     *
     * 更新组，需要全部的组信息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupPutTest() throws ApiException {
        UpdateConfigGroupReq updateConfigGroupReq = null;
        UpdateConfigGroupRsp response = api.configGroupPut(updateConfigGroupReq);

        // TODO: test validations
    }
    
    /**
     * 查询组
     *
     * 查询组通过Name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configGroupRetrieveByNamePostTest() throws ApiException {
        String name = null;
        RetrieveConfigGroupByNameRsp response = api.configGroupRetrieveByNamePost(name);

        // TODO: test validations
    }
    
}
