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
import io.swagger.client.model.InlineResponse2008Categories;
import java.math.BigDecimal;

/**
 * Cash flow
 */
@ApiModel(description = "Cash flow")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class CashFlow {
  @SerializedName("category")
  private InlineResponse2008Categories category = null;

  @SerializedName("income")
  private BigDecimal income = null;

  @SerializedName("spending")
  private BigDecimal spending = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  public CashFlow category(InlineResponse2008Categories category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse2008Categories getCategory() {
    return category;
  }

  public void setCategory(InlineResponse2008Categories category) {
    this.category = category;
  }

  public CashFlow income(BigDecimal income) {
    this.income = income;
    return this;
  }

   /**
   * The total calculated income for the given category
   * @return income
  **/
  @ApiModelProperty(example = "null", required = true, value = "The total calculated income for the given category")
  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }

  public CashFlow spending(BigDecimal spending) {
    this.spending = spending;
    return this;
  }

   /**
   * The total calculated spending for the given category
   * @return spending
  **/
  @ApiModelProperty(example = "null", required = true, value = "The total calculated spending for the given category")
  public BigDecimal getSpending() {
    return spending;
  }

  public void setSpending(BigDecimal spending) {
    this.spending = spending;
  }

  public CashFlow balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The calculated balance for the given category
   * @return balance
  **/
  @ApiModelProperty(example = "null", required = true, value = "The calculated balance for the given category")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlow cashFlow = (CashFlow) o;
    return Objects.equals(this.category, cashFlow.category) &&
        Objects.equals(this.income, cashFlow.income) &&
        Objects.equals(this.spending, cashFlow.spending) &&
        Objects.equals(this.balance, cashFlow.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, income, spending, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlow {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    spending: ").append(toIndentedString(spending)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

