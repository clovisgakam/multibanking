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
 * Container for bank connection edit params
 */
@ApiModel(description = "Container for bank connection edit params")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class EditBankConnectionParams {
  @SerializedName("bankingUserId")
  private String bankingUserId = null;

  @SerializedName("bankingCustomerId")
  private String bankingCustomerId = null;

  @SerializedName("bankingPin")
  private String bankingPin = null;

  @SerializedName("defaultTwoStepProcedureId")
  private String defaultTwoStepProcedureId = null;

  @SerializedName("name")
  private String name = null;

  public EditBankConnectionParams bankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
    return this;
  }

   /**
   * New online banking user ID. If you do not want to change the current user ID let this field remain unset. Note that you cannot clear the current user ID, i.e. a bank connection must always have a user ID (except for when it is a 'demo connection').
   * @return bankingUserId
  **/
  @ApiModelProperty(example = "null", value = "New online banking user ID. If you do not want to change the current user ID let this field remain unset. Note that you cannot clear the current user ID, i.e. a bank connection must always have a user ID (except for when it is a 'demo connection').")
  public String getBankingUserId() {
    return bankingUserId;
  }

  public void setBankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
  }

  public EditBankConnectionParams bankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
    return this;
  }

   /**
   * New online banking customer ID. If you do not want to change the current customer ID let this field remain unset. If you want to clear the current customer ID, set the field's value to an empty string (\"\").
   * @return bankingCustomerId
  **/
  @ApiModelProperty(example = "null", value = "New online banking customer ID. If you do not want to change the current customer ID let this field remain unset. If you want to clear the current customer ID, set the field's value to an empty string (\"\").")
  public String getBankingCustomerId() {
    return bankingCustomerId;
  }

  public void setBankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
  }

  public EditBankConnectionParams bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

   /**
   * New online banking PIN. If you do not want to change the current PIN let this field remain unset. If you want to clear the current PIN, set the field's value to an empty string (\"\").
   * @return bankingPin
  **/
  @ApiModelProperty(example = "null", value = "New online banking PIN. If you do not want to change the current PIN let this field remain unset. If you want to clear the current PIN, set the field's value to an empty string (\"\").")
  public String getBankingPin() {
    return bankingPin;
  }

  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  public EditBankConnectionParams defaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
    return this;
  }

   /**
   * New default two-step-procedure. Must match the 'procedureId' of one of the procedures that are listed in the bank connection. If you do not want to change this field let it remain unset. If you want to clear the current default two-step-procedure, set the field's value to an empty string (\"\").
   * @return defaultTwoStepProcedureId
  **/
  @ApiModelProperty(example = "null", value = "New default two-step-procedure. Must match the 'procedureId' of one of the procedures that are listed in the bank connection. If you do not want to change this field let it remain unset. If you want to clear the current default two-step-procedure, set the field's value to an empty string (\"\").")
  public String getDefaultTwoStepProcedureId() {
    return defaultTwoStepProcedureId;
  }

  public void setDefaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
  }

  public EditBankConnectionParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * New name for the bank connection. Maximum length is 64. If you do not want to change the current name let this field remain unset. If you want to clear the current name, set the field's value to an empty string (\"\").
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "New name for the bank connection. Maximum length is 64. If you do not want to change the current name let this field remain unset. If you want to clear the current name, set the field's value to an empty string (\"\").")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditBankConnectionParams editBankConnectionParams = (EditBankConnectionParams) o;
    return Objects.equals(this.bankingUserId, editBankConnectionParams.bankingUserId) &&
        Objects.equals(this.bankingCustomerId, editBankConnectionParams.bankingCustomerId) &&
        Objects.equals(this.bankingPin, editBankConnectionParams.bankingPin) &&
        Objects.equals(this.defaultTwoStepProcedureId, editBankConnectionParams.defaultTwoStepProcedureId) &&
        Objects.equals(this.name, editBankConnectionParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankingUserId, bankingCustomerId, bankingPin, defaultTwoStepProcedureId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditBankConnectionParams {\n");
    
    sb.append("    bankingUserId: ").append(toIndentedString(bankingUserId)).append("\n");
    sb.append("    bankingCustomerId: ").append(toIndentedString(bankingCustomerId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    defaultTwoStepProcedureId: ").append(toIndentedString(defaultTwoStepProcedureId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

