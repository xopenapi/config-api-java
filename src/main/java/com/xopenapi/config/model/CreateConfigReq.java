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
 * CreateConfigReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T09:21:35.124Z[GMT]")
public class CreateConfigReq {
  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;


  public CreateConfigReq resourceId(String resourceId) {
    
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


  public CreateConfigReq groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 组ID
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "组ID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public CreateConfigReq templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 模版ID
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模版ID")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public CreateConfigReq key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 对应的字段名
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "对应的字段名")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CreateConfigReq value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * json格式的键值对数据
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "json格式的键值对数据")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfigReq createConfigReq = (CreateConfigReq) o;
    return Objects.equals(this.resourceId, createConfigReq.resourceId) &&
        Objects.equals(this.groupId, createConfigReq.groupId) &&
        Objects.equals(this.templateId, createConfigReq.templateId) &&
        Objects.equals(this.key, createConfigReq.key) &&
        Objects.equals(this.value, createConfigReq.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, groupId, templateId, key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConfigReq {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

