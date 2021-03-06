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
import java.util.ArrayList;
import java.util.List;

/**
 * Category data
 */
@ApiModel(description = "Category data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class InlineResponse2008Categories {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("parentName")
  private String parentName = null;

  @SerializedName("isCustom")
  private Boolean isCustom = false;

  @SerializedName("children")
  private List<Long> children = new ArrayList<Long>();

  public InlineResponse2008Categories id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Category identifier
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Category identifier")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InlineResponse2008Categories name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Category name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Category name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2008Categories parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Identifier of the parent category (if a parent category exists)
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "Identifier of the parent category (if a parent category exists)")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public InlineResponse2008Categories parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

   /**
   * Name of the parent category (if a parent category exists)
   * @return parentName
  **/
  @ApiModelProperty(example = "null", value = "Name of the parent category (if a parent category exists)")
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public InlineResponse2008Categories isCustom(Boolean isCustom) {
    this.isCustom = isCustom;
    return this;
  }

   /**
   * Whether the category is a finAPI global category (in which case this field will be false), or the category was created by a user (in which case this field will be true)
   * @return isCustom
  **/
  @ApiModelProperty(example = "null", required = true, value = "Whether the category is a finAPI global category (in which case this field will be false), or the category was created by a user (in which case this field will be true)")
  public Boolean getIsCustom() {
    return isCustom;
  }

  public void setIsCustom(Boolean isCustom) {
    this.isCustom = isCustom;
  }

  public InlineResponse2008Categories children(List<Long> children) {
    this.children = children;
    return this;
  }

  public InlineResponse2008Categories addChildrenItem(Long childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

   /**
   * List of sub-categories identifiers (if any exist)
   * @return children
  **/
  @ApiModelProperty(example = "null", value = "List of sub-categories identifiers (if any exist)")
  public List<Long> getChildren() {
    return children;
  }

  public void setChildren(List<Long> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Categories inlineResponse2008Categories = (InlineResponse2008Categories) o;
    return Objects.equals(this.id, inlineResponse2008Categories.id) &&
        Objects.equals(this.name, inlineResponse2008Categories.name) &&
        Objects.equals(this.parentId, inlineResponse2008Categories.parentId) &&
        Objects.equals(this.parentName, inlineResponse2008Categories.parentName) &&
        Objects.equals(this.isCustom, inlineResponse2008Categories.isCustom) &&
        Objects.equals(this.children, inlineResponse2008Categories.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parentId, parentName, isCustom, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Categories {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    isCustom: ").append(toIndentedString(isCustom)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

