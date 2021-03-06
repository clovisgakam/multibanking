/*
 * finAPI RESTful Services
 * finAPI RESTful Services
 *
 * OpenAPI spec version: v1.20.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container for pagination information
 */
@ApiModel(description = "Container for pagination information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class Paging {
  @SerializedName("page")
  private Integer page = null;

  @SerializedName("perPage")
  private Integer perPage = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("totalCount")
  private Long totalCount = null;

  public Paging page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Current page number
   * @return page
  **/
  @ApiModelProperty(example = "null", required = true, value = "Current page number")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Paging perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Current page size (number of entries in this page)
   * @return perPage
  **/
  @ApiModelProperty(example = "null", required = true, value = "Current page size (number of entries in this page)")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public Paging pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Total number of pages
   * @return pageCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "Total number of pages")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public Paging totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of entries across all pages
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "Total number of entries across all pages")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paging paging = (Paging) o;
    return Objects.equals(this.page, paging.page) &&
        Objects.equals(this.perPage, paging.perPage) &&
        Objects.equals(this.pageCount, paging.pageCount) &&
        Objects.equals(this.totalCount, paging.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, perPage, pageCount, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paging {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

