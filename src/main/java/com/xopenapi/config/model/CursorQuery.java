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
 * CursorQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:57:31.779Z[GMT]")
public class CursorQuery {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Object filters;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;

  public static final String SERIALIZED_NAME_CURSOR_SORT = "cursorSort";
  @SerializedName(SERIALIZED_NAME_CURSOR_SORT)
  private Object cursorSort = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private Integer direction;


  public CursorQuery filters(Object filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * 查询条件，传键值对
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "查询条件，传键值对")

  public Object getFilters() {
    return filters;
  }


  public void setFilters(Object filters) {
    this.filters = filters;
  }


  public CursorQuery cursor(String cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * 游标值
   * @return cursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "游标值")

  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  public CursorQuery cursorSort(Object cursorSort) {
    
    this.cursorSort = cursorSort;
    return this;
  }

   /**
   * 排序 $ref:\&quot;#/components/schemas/SortSpec\&quot;
   * @return cursorSort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "排序 $ref:\"#/components/schemas/SortSpec\"")

  public Object getCursorSort() {
    return cursorSort;
  }


  public void setCursorSort(Object cursorSort) {
    this.cursorSort = cursorSort;
  }


  public CursorQuery size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * 大小
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "大小")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public CursorQuery direction(Integer direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * 查询方向，0表示游标前，1表示游标后
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "查询方向，0表示游标前，1表示游标后")

  public Integer getDirection() {
    return direction;
  }


  public void setDirection(Integer direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorQuery cursorQuery = (CursorQuery) o;
    return Objects.equals(this.filters, cursorQuery.filters) &&
        Objects.equals(this.cursor, cursorQuery.cursor) &&
        Objects.equals(this.cursorSort, cursorQuery.cursorSort) &&
        Objects.equals(this.size, cursorQuery.size) &&
        Objects.equals(this.direction, cursorQuery.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, cursor, cursorSort, size, direction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorQuery {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    cursorSort: ").append(toIndentedString(cursorSort)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

