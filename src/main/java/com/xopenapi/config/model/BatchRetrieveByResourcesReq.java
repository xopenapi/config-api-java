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


package com.xopenapi.config.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchRetrieveByResourcesReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T10:34:11.838Z[GMT]")
public class BatchRetrieveByResourcesReq {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_RESOURCE_IDS = "resourceIds";
  @SerializedName(SERIALIZED_NAME_RESOURCE_IDS)
  private List<String> resourceIds = null;


  public BatchRetrieveByResourcesReq key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "key")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public BatchRetrieveByResourcesReq resourceIds(List<String> resourceIds) {
    
    this.resourceIds = resourceIds;
    return this;
  }

  public BatchRetrieveByResourcesReq addResourceIdsItem(String resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<String>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

   /**
   * 资源ID组
   * @return resourceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资源ID组")

  public List<String> getResourceIds() {
    return resourceIds;
  }


  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRetrieveByResourcesReq batchRetrieveByResourcesReq = (BatchRetrieveByResourcesReq) o;
    return Objects.equals(this.key, batchRetrieveByResourcesReq.key) &&
        Objects.equals(this.resourceIds, batchRetrieveByResourcesReq.resourceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, resourceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRetrieveByResourcesReq {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

