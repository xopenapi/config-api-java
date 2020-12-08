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
import com.xopenapi.config.model.ConfigTemplate;
import com.xopenapi.config.model.CursorExtra;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CursorConfigTemplatesRspData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T10:34:11.838Z[GMT]")
public class CursorConfigTemplatesRspData {
  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private CursorExtra extra;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ConfigTemplate> items = null;


  public CursorConfigTemplatesRspData extra(CursorExtra extra) {
    
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CursorExtra getExtra() {
    return extra;
  }


  public void setExtra(CursorExtra extra) {
    this.extra = extra;
  }


  public CursorConfigTemplatesRspData items(List<ConfigTemplate> items) {
    
    this.items = items;
    return this;
  }

  public CursorConfigTemplatesRspData addItemsItem(ConfigTemplate itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ConfigTemplate>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ConfigTemplate> getItems() {
    return items;
  }


  public void setItems(List<ConfigTemplate> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorConfigTemplatesRspData cursorConfigTemplatesRspData = (CursorConfigTemplatesRspData) o;
    return Objects.equals(this.extra, cursorConfigTemplatesRspData.extra) &&
        Objects.equals(this.items, cursorConfigTemplatesRspData.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorConfigTemplatesRspData {\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
