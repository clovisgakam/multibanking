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
import io.swagger.client.model.InlineResponse2005Connections;
import java.util.ArrayList;
import java.util.List;

/**
 * Container for data of multiple bank connections
 */
@ApiModel(description = "Container for data of multiple bank connections")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class InlineResponse2005 {
  @SerializedName("connections")
  private List<InlineResponse2005Connections> connections = new ArrayList<InlineResponse2005Connections>();

  public InlineResponse2005 connections(List<InlineResponse2005Connections> connections) {
    this.connections = connections;
    return this;
  }

  public InlineResponse2005 addConnectionsItem(InlineResponse2005Connections connectionsItem) {
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * List of bank connections
   * @return connections
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of bank connections")
  public List<InlineResponse2005Connections> getConnections() {
    return connections;
  }

  public void setConnections(List<InlineResponse2005Connections> connections) {
    this.connections = connections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.connections, inlineResponse2005.connections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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

