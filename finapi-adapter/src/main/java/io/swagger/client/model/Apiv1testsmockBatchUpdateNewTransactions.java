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
import java.math.BigDecimal;

/**
 * Mock transaction data
 */
@ApiModel(description = "Mock transaction data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class Apiv1testsmockBatchUpdateNewTransactions {
  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("counterpart")
  private String counterpart = null;

  @SerializedName("counterpartIban")
  private String counterpartIban = null;

  @SerializedName("counterpartBlz")
  private String counterpartBlz = null;

  @SerializedName("counterpartBic")
  private String counterpartBic = null;

  @SerializedName("bookingDate")
  private String bookingDate = null;

  @SerializedName("valueDate")
  private String valueDate = null;

  public Apiv1testsmockBatchUpdateNewTransactions amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount. Required.
   * @return amount
  **/
  @ApiModelProperty(example = "null", required = true, value = "Amount. Required.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Apiv1testsmockBatchUpdateNewTransactions purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Purpose. Maximum length is 2000. Optional. Default value: null.
   * @return purpose
  **/
  @ApiModelProperty(example = "null", value = "Purpose. Maximum length is 2000. Optional. Default value: null.")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Apiv1testsmockBatchUpdateNewTransactions counterpart(String counterpart) {
    this.counterpart = counterpart;
    return this;
  }

   /**
   * Counterpart. Maximum length is 270. Optional. Default value: null.
   * @return counterpart
  **/
  @ApiModelProperty(example = "null", value = "Counterpart. Maximum length is 270. Optional. Default value: null.")
  public String getCounterpart() {
    return counterpart;
  }

  public void setCounterpart(String counterpart) {
    this.counterpart = counterpart;
  }

  public Apiv1testsmockBatchUpdateNewTransactions counterpartIban(String counterpartIban) {
    this.counterpartIban = counterpartIban;
    return this;
  }

   /**
   * Counterpart IBAN. Optional. Default value: null.
   * @return counterpartIban
  **/
  @ApiModelProperty(example = "null", value = "Counterpart IBAN. Optional. Default value: null.")
  public String getCounterpartIban() {
    return counterpartIban;
  }

  public void setCounterpartIban(String counterpartIban) {
    this.counterpartIban = counterpartIban;
  }

  public Apiv1testsmockBatchUpdateNewTransactions counterpartBlz(String counterpartBlz) {
    this.counterpartBlz = counterpartBlz;
    return this;
  }

   /**
   * Counterpart BLZ. Optional. Default value: null.
   * @return counterpartBlz
  **/
  @ApiModelProperty(example = "null", value = "Counterpart BLZ. Optional. Default value: null.")
  public String getCounterpartBlz() {
    return counterpartBlz;
  }

  public void setCounterpartBlz(String counterpartBlz) {
    this.counterpartBlz = counterpartBlz;
  }

  public Apiv1testsmockBatchUpdateNewTransactions counterpartBic(String counterpartBic) {
    this.counterpartBic = counterpartBic;
    return this;
  }

   /**
   * Counterpart BIC. Optional. Default value: null.
   * @return counterpartBic
  **/
  @ApiModelProperty(example = "null", value = "Counterpart BIC. Optional. Default value: null.")
  public String getCounterpartBic() {
    return counterpartBic;
  }

  public void setCounterpartBic(String counterpartBic) {
    this.counterpartBic = counterpartBic;
  }

  public Apiv1testsmockBatchUpdateNewTransactions bookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

   /**
   * Booking date in the format 'yyyy-MM-dd'.<br><br>If the date lies back more than 10 days from the booking date of the latest transaction that currently exists in the account, then this transaction will be ignored and not imported. If the date depicts a date in the future, then finAPI will deal with it the same way as it does with real transactions during a real update (see fields 'bankBookingDate' and 'finapiBookingDate' in the Transaction Resource for explanation).<br><br>This field is optional, default value is the current date.
   * @return bookingDate
  **/
  @ApiModelProperty(example = "null", value = "Booking date in the format 'yyyy-MM-dd'.<br><br>If the date lies back more than 10 days from the booking date of the latest transaction that currently exists in the account, then this transaction will be ignored and not imported. If the date depicts a date in the future, then finAPI will deal with it the same way as it does with real transactions during a real update (see fields 'bankBookingDate' and 'finapiBookingDate' in the Transaction Resource for explanation).<br><br>This field is optional, default value is the current date.")
  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }

  public Apiv1testsmockBatchUpdateNewTransactions valueDate(String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Value date in the format 'yyyy-MM-dd'. Optional. Default value: Same as the booking date.
   * @return valueDate
  **/
  @ApiModelProperty(example = "null", value = "Value date in the format 'yyyy-MM-dd'. Optional. Default value: Same as the booking date.")
  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apiv1testsmockBatchUpdateNewTransactions apiv1testsmockBatchUpdateNewTransactions = (Apiv1testsmockBatchUpdateNewTransactions) o;
    return Objects.equals(this.amount, apiv1testsmockBatchUpdateNewTransactions.amount) &&
        Objects.equals(this.purpose, apiv1testsmockBatchUpdateNewTransactions.purpose) &&
        Objects.equals(this.counterpart, apiv1testsmockBatchUpdateNewTransactions.counterpart) &&
        Objects.equals(this.counterpartIban, apiv1testsmockBatchUpdateNewTransactions.counterpartIban) &&
        Objects.equals(this.counterpartBlz, apiv1testsmockBatchUpdateNewTransactions.counterpartBlz) &&
        Objects.equals(this.counterpartBic, apiv1testsmockBatchUpdateNewTransactions.counterpartBic) &&
        Objects.equals(this.bookingDate, apiv1testsmockBatchUpdateNewTransactions.bookingDate) &&
        Objects.equals(this.valueDate, apiv1testsmockBatchUpdateNewTransactions.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, purpose, counterpart, counterpartIban, counterpartBlz, counterpartBic, bookingDate, valueDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apiv1testsmockBatchUpdateNewTransactions {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    counterpart: ").append(toIndentedString(counterpart)).append("\n");
    sb.append("    counterpartIban: ").append(toIndentedString(counterpartIban)).append("\n");
    sb.append("    counterpartBlz: ").append(toIndentedString(counterpartBlz)).append("\n");
    sb.append("    counterpartBic: ").append(toIndentedString(counterpartBic)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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

