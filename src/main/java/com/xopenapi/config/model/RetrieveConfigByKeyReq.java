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

/**
 * RetrieveConfigByKeyReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:57:31.779Z[GMT]")
public class RetrieveConfigByKeyReq {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;


  public RetrieveConfigByKeyReq key(String key) {
    
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


  public RetrieveConfigByKeyReq resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * 资源ID
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资源ID")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveConfigByKeyReq retrieveConfigByKeyReq = (RetrieveConfigByKeyReq) o;
    return Objects.equals(this.key, retrieveConfigByKeyReq.key) &&
        Objects.equals(this.resourceId, retrieveConfigByKeyReq.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, resourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveConfigByKeyReq {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

