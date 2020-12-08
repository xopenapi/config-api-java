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
 * ConfigTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:57:31.779Z[GMT]")
public class ConfigTemplate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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

  public static final String SERIALIZED_NAME_CTIME = "ctime";
  @SerializedName(SERIALIZED_NAME_CTIME)
  private Long ctime;

  public static final String SERIALIZED_NAME_MTIME = "mtime";
  @SerializedName(SERIALIZED_NAME_MTIME)
  private Long mtime;


  public ConfigTemplate id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 配置ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配置ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConfigTemplate groupId(String groupId) {
    
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


  public ConfigTemplate templateId(String templateId) {
    
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


  public ConfigTemplate key(String key) {
    
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


  public ConfigTemplate value(Object value) {
    
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


  public ConfigTemplate ctime(Long ctime) {
    
    this.ctime = ctime;
    return this;
  }

   /**
   * 创建时间，返回时间戳
   * @return ctime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间，返回时间戳")

  public Long getCtime() {
    return ctime;
  }


  public void setCtime(Long ctime) {
    this.ctime = ctime;
  }


  public ConfigTemplate mtime(Long mtime) {
    
    this.mtime = mtime;
    return this;
  }

   /**
   * 更新时间，返回时间戳
   * @return mtime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "更新时间，返回时间戳")

  public Long getMtime() {
    return mtime;
  }


  public void setMtime(Long mtime) {
    this.mtime = mtime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigTemplate configTemplate = (ConfigTemplate) o;
    return Objects.equals(this.id, configTemplate.id) &&
        Objects.equals(this.groupId, configTemplate.groupId) &&
        Objects.equals(this.templateId, configTemplate.templateId) &&
        Objects.equals(this.key, configTemplate.key) &&
        Objects.equals(this.value, configTemplate.value) &&
        Objects.equals(this.ctime, configTemplate.ctime) &&
        Objects.equals(this.mtime, configTemplate.mtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, templateId, key, value, ctime, mtime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
    sb.append("    mtime: ").append(toIndentedString(mtime)).append("\n");
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

