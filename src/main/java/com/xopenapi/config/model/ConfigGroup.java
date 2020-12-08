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
 * ConfigGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T09:21:35.124Z[GMT]")
public class ConfigGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CTIME = "ctime";
  @SerializedName(SERIALIZED_NAME_CTIME)
  private Long ctime;

  public static final String SERIALIZED_NAME_MTIME = "mtime";
  @SerializedName(SERIALIZED_NAME_MTIME)
  private Long mtime;


  public ConfigGroup id(String id) {
    
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


  public ConfigGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConfigGroup ctime(Long ctime) {
    
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


  public ConfigGroup mtime(Long mtime) {
    
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
    ConfigGroup configGroup = (ConfigGroup) o;
    return Objects.equals(this.id, configGroup.id) &&
        Objects.equals(this.name, configGroup.name) &&
        Objects.equals(this.ctime, configGroup.ctime) &&
        Objects.equals(this.mtime, configGroup.mtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ctime, mtime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

