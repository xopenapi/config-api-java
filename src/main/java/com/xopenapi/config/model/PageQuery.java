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
import com.xopenapi.config.model.SortSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PageQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-08T12:57:31.779Z[GMT]")
public class PageQuery {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Object filters;

  public static final String SERIALIZED_NAME_PAGE_NO = "pageNo";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private Integer pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private List<SortSpec> sort = null;


  public PageQuery filters(Object filters) {
    
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


  public PageQuery pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * 页码
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "页码")

  public Integer getPageNo() {
    return pageNo;
  }


  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public PageQuery pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页数据量
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "每页数据量")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public PageQuery sort(List<SortSpec> sort) {
    
    this.sort = sort;
    return this;
  }

  public PageQuery addSortItem(SortSpec sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<SortSpec>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * 排序
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "排序")

  public List<SortSpec> getSort() {
    return sort;
  }


  public void setSort(List<SortSpec> sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageQuery pageQuery = (PageQuery) o;
    return Objects.equals(this.filters, pageQuery.filters) &&
        Objects.equals(this.pageNo, pageQuery.pageNo) &&
        Objects.equals(this.pageSize, pageQuery.pageSize) &&
        Objects.equals(this.sort, pageQuery.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, pageNo, pageSize, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageQuery {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

