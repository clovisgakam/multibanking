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
import io.swagger.client.model.InlineResponse2005Bank;
import io.swagger.client.model.InlineResponse2005LastManualUpdate;
import io.swagger.client.model.InlineResponse2005TwoStepProcedures;
import java.util.ArrayList;
import java.util.List;

/**
 * Container for a bank connection&#39;s data
 */
@ApiModel(description = "Container for a bank connection's data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class InlineResponse2005Connections {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("bankId")
  private Long bankId = null;

  @SerializedName("bank")
  private InlineResponse2005Bank bank = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("bankingUserId")
  private String bankingUserId = null;

  @SerializedName("bankingCustomerId")
  private String bankingCustomerId = null;

  @SerializedName("bankingPin")
  private String bankingPin = null;

  /**
   * Bank connection type
   */
  public enum TypeEnum {
    @SerializedName("ONLINE")
    ONLINE("ONLINE"),
    
    @SerializedName("DEMO")
    DEMO("DEMO");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Current status of transactions download. The POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to IN_PROGRESS before they return. Once the import or update has finished, the status will be changed to READY.
   */
  public enum UpdateStatusEnum {
    @SerializedName("IN_PROGRESS")
    IN_PROGRESS("IN_PROGRESS"),
    
    @SerializedName("READY")
    READY("READY");

    private String value;

    UpdateStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("updateStatus")
  private UpdateStatusEnum updateStatus = null;

  /**
   * Current status of transactions categorization. The asynchronous download process that is triggered by a call of the POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to PENDING once the download has finished and a categorization is scheduled for the imported transactions. A separate categorization thread will then start to categorize the transactions (during this process, the status is IN_PROGRESS). When categorization has finished, the status will be (re-)set to READY. Note that the current categorization status should only be queried after the download has finished, i.e. once the download status has switched from IN_PROGRESS to READY.
   */
  public enum CategorizationStatusEnum {
    @SerializedName("IN_PROGRESS")
    IN_PROGRESS("IN_PROGRESS"),
    
    @SerializedName("PENDING")
    PENDING("PENDING"),
    
    @SerializedName("READY")
    READY("READY");

    private String value;

    CategorizationStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("categorizationStatus")
  private CategorizationStatusEnum categorizationStatus = null;

  @SerializedName("lastManualUpdate")
  private InlineResponse2005LastManualUpdate lastManualUpdate = null;

  @SerializedName("lastAutoUpdate")
  private InlineResponse2005LastManualUpdate lastAutoUpdate = null;

  @SerializedName("twoStepProcedures")
  private List<InlineResponse2005TwoStepProcedures> twoStepProcedures = new ArrayList<InlineResponse2005TwoStepProcedures>();

  @SerializedName("ibanOnlyMoneyTransferSupported")
  private Boolean ibanOnlyMoneyTransferSupported = false;

  @SerializedName("collectiveMoneyTransferSupported")
  private Boolean collectiveMoneyTransferSupported = false;

  @SerializedName("defaultTwoStepProcedureId")
  private String defaultTwoStepProcedureId = null;

  @SerializedName("accountIds")
  private List<Long> accountIds = new ArrayList<Long>();

  public InlineResponse2005Connections id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Bank connection identifier
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Bank connection identifier")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InlineResponse2005Connections bankId(Long bankId) {
    this.bankId = bankId;
    return this;
  }

   /**
   * Identifier of the bank that this connection belongs to. NOTE: This field is DEPRECATED and will get removed at some point. Please refer to the 'bank' field instead.
   * @return bankId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the bank that this connection belongs to. NOTE: This field is DEPRECATED and will get removed at some point. Please refer to the 'bank' field instead.")
  public Long getBankId() {
    return bankId;
  }

  public void setBankId(Long bankId) {
    this.bankId = bankId;
  }

  public InlineResponse2005Connections bank(InlineResponse2005Bank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse2005Bank getBank() {
    return bank;
  }

  public void setBank(InlineResponse2005Bank bank) {
    this.bank = bank;
  }

  public InlineResponse2005Connections name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Custom name for the bank connection. You can set this field with the 'Edit a bank connection' service, as well as during the initial import of the bank connection. Maximum length is 64.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Custom name for the bank connection. You can set this field with the 'Edit a bank connection' service, as well as during the initial import of the bank connection. Maximum length is 64.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2005Connections bankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
    return this;
  }

   /**
   * Stored online banking user ID credential. This field may be null for the 'demo connection'.
   * @return bankingUserId
  **/
  @ApiModelProperty(example = "null", value = "Stored online banking user ID credential. This field may be null for the 'demo connection'.")
  public String getBankingUserId() {
    return bankingUserId;
  }

  public void setBankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
  }

  public InlineResponse2005Connections bankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
    return this;
  }

   /**
   * Stored online banking customer ID credential
   * @return bankingCustomerId
  **/
  @ApiModelProperty(example = "null", value = "Stored online banking customer ID credential")
  public String getBankingCustomerId() {
    return bankingCustomerId;
  }

  public void setBankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
  }

  public InlineResponse2005Connections bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

   /**
   * Stored online banking PIN. Note that each symbol of the PIN is distorted with an 'X' character.
   * @return bankingPin
  **/
  @ApiModelProperty(example = "null", value = "Stored online banking PIN. Note that each symbol of the PIN is distorted with an 'X' character.")
  public String getBankingPin() {
    return bankingPin;
  }

  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  public InlineResponse2005Connections type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Bank connection type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "Bank connection type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InlineResponse2005Connections updateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

   /**
   * Current status of transactions download. The POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to IN_PROGRESS before they return. Once the import or update has finished, the status will be changed to READY.
   * @return updateStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "Current status of transactions download. The POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to IN_PROGRESS before they return. Once the import or update has finished, the status will be changed to READY.")
  public UpdateStatusEnum getUpdateStatus() {
    return updateStatus;
  }

  public void setUpdateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
  }

  public InlineResponse2005Connections categorizationStatus(CategorizationStatusEnum categorizationStatus) {
    this.categorizationStatus = categorizationStatus;
    return this;
  }

   /**
   * Current status of transactions categorization. The asynchronous download process that is triggered by a call of the POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to PENDING once the download has finished and a categorization is scheduled for the imported transactions. A separate categorization thread will then start to categorize the transactions (during this process, the status is IN_PROGRESS). When categorization has finished, the status will be (re-)set to READY. Note that the current categorization status should only be queried after the download has finished, i.e. once the download status has switched from IN_PROGRESS to READY.
   * @return categorizationStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "Current status of transactions categorization. The asynchronous download process that is triggered by a call of the POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to PENDING once the download has finished and a categorization is scheduled for the imported transactions. A separate categorization thread will then start to categorize the transactions (during this process, the status is IN_PROGRESS). When categorization has finished, the status will be (re-)set to READY. Note that the current categorization status should only be queried after the download has finished, i.e. once the download status has switched from IN_PROGRESS to READY.")
  public CategorizationStatusEnum getCategorizationStatus() {
    return categorizationStatus;
  }

  public void setCategorizationStatus(CategorizationStatusEnum categorizationStatus) {
    this.categorizationStatus = categorizationStatus;
  }

  public InlineResponse2005Connections lastManualUpdate(InlineResponse2005LastManualUpdate lastManualUpdate) {
    this.lastManualUpdate = lastManualUpdate;
    return this;
  }

   /**
   * Get lastManualUpdate
   * @return lastManualUpdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse2005LastManualUpdate getLastManualUpdate() {
    return lastManualUpdate;
  }

  public void setLastManualUpdate(InlineResponse2005LastManualUpdate lastManualUpdate) {
    this.lastManualUpdate = lastManualUpdate;
  }

  public InlineResponse2005Connections lastAutoUpdate(InlineResponse2005LastManualUpdate lastAutoUpdate) {
    this.lastAutoUpdate = lastAutoUpdate;
    return this;
  }

   /**
   * Get lastAutoUpdate
   * @return lastAutoUpdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse2005LastManualUpdate getLastAutoUpdate() {
    return lastAutoUpdate;
  }

  public void setLastAutoUpdate(InlineResponse2005LastManualUpdate lastAutoUpdate) {
    this.lastAutoUpdate = lastAutoUpdate;
  }

  public InlineResponse2005Connections twoStepProcedures(List<InlineResponse2005TwoStepProcedures> twoStepProcedures) {
    this.twoStepProcedures = twoStepProcedures;
    return this;
  }

  public InlineResponse2005Connections addTwoStepProceduresItem(InlineResponse2005TwoStepProcedures twoStepProceduresItem) {
    this.twoStepProcedures.add(twoStepProceduresItem);
    return this;
  }

   /**
   * Available two-step-procedures for this bank connection, e.g. for submitting a money transfer request (see /accounts/requestSepaMoneyTransfer). The available two-step-procedures are re-evaluated each time this bank connection is updated (/bankConnections/update). This means that this list may change as a result of an update.
   * @return twoStepProcedures
  **/
  @ApiModelProperty(example = "null", value = "Available two-step-procedures for this bank connection, e.g. for submitting a money transfer request (see /accounts/requestSepaMoneyTransfer). The available two-step-procedures are re-evaluated each time this bank connection is updated (/bankConnections/update). This means that this list may change as a result of an update.")
  public List<InlineResponse2005TwoStepProcedures> getTwoStepProcedures() {
    return twoStepProcedures;
  }

  public void setTwoStepProcedures(List<InlineResponse2005TwoStepProcedures> twoStepProcedures) {
    this.twoStepProcedures = twoStepProcedures;
  }

  public InlineResponse2005Connections ibanOnlyMoneyTransferSupported(Boolean ibanOnlyMoneyTransferSupported) {
    this.ibanOnlyMoneyTransferSupported = ibanOnlyMoneyTransferSupported;
    return this;
  }

   /**
   * Whether this bank connection accepts money transfer requests where the recipient's account is defined just by the IBAN (without an additional BIC). This field is re-evaluated each time this bank connection is updated. See also: /accounts/requestSepaMoneyTransfer
   * @return ibanOnlyMoneyTransferSupported
  **/
  @ApiModelProperty(example = "null", required = true, value = "Whether this bank connection accepts money transfer requests where the recipient's account is defined just by the IBAN (without an additional BIC). This field is re-evaluated each time this bank connection is updated. See also: /accounts/requestSepaMoneyTransfer")
  public Boolean getIbanOnlyMoneyTransferSupported() {
    return ibanOnlyMoneyTransferSupported;
  }

  public void setIbanOnlyMoneyTransferSupported(Boolean ibanOnlyMoneyTransferSupported) {
    this.ibanOnlyMoneyTransferSupported = ibanOnlyMoneyTransferSupported;
  }

  public InlineResponse2005Connections collectiveMoneyTransferSupported(Boolean collectiveMoneyTransferSupported) {
    this.collectiveMoneyTransferSupported = collectiveMoneyTransferSupported;
    return this;
  }

   /**
   * Whether this bank connection supports submitting collective money transfers. This field is re-evaluated each time this bank connection is updated. See also: /accounts/requestSepaMoneyTransfer
   * @return collectiveMoneyTransferSupported
  **/
  @ApiModelProperty(example = "null", required = true, value = "Whether this bank connection supports submitting collective money transfers. This field is re-evaluated each time this bank connection is updated. See also: /accounts/requestSepaMoneyTransfer")
  public Boolean getCollectiveMoneyTransferSupported() {
    return collectiveMoneyTransferSupported;
  }

  public void setCollectiveMoneyTransferSupported(Boolean collectiveMoneyTransferSupported) {
    this.collectiveMoneyTransferSupported = collectiveMoneyTransferSupported;
  }

  public InlineResponse2005Connections defaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
    return this;
  }

   /**
   * The default two-step-procedure. Must match one of the available 'procedureId's from the 'twoStepProcedures' list. When this field is set, you can execute two-step-procedures (e.g. accounts/requestSepaMoneyTransfer) without having to give a procedure explicitly. finAPI will use the default procedure in such cases. Note that the list of available procedures of a bank connection may change as a result of an update of the connection, and if this field references a procedure that is no longer available, finAPI will automatically clear the default procedure (set it to null).
   * @return defaultTwoStepProcedureId
  **/
  @ApiModelProperty(example = "null", value = "The default two-step-procedure. Must match one of the available 'procedureId's from the 'twoStepProcedures' list. When this field is set, you can execute two-step-procedures (e.g. accounts/requestSepaMoneyTransfer) without having to give a procedure explicitly. finAPI will use the default procedure in such cases. Note that the list of available procedures of a bank connection may change as a result of an update of the connection, and if this field references a procedure that is no longer available, finAPI will automatically clear the default procedure (set it to null).")
  public String getDefaultTwoStepProcedureId() {
    return defaultTwoStepProcedureId;
  }

  public void setDefaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
  }

  public InlineResponse2005Connections accountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public InlineResponse2005Connections addAccountIdsItem(Long accountIdsItem) {
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * Accounts which relate to this bank connection
   * @return accountIds
  **/
  @ApiModelProperty(example = "null", required = true, value = "Accounts which relate to this bank connection")
  public List<Long> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005Connections inlineResponse2005Connections = (InlineResponse2005Connections) o;
    return Objects.equals(this.id, inlineResponse2005Connections.id) &&
        Objects.equals(this.bankId, inlineResponse2005Connections.bankId) &&
        Objects.equals(this.bank, inlineResponse2005Connections.bank) &&
        Objects.equals(this.name, inlineResponse2005Connections.name) &&
        Objects.equals(this.bankingUserId, inlineResponse2005Connections.bankingUserId) &&
        Objects.equals(this.bankingCustomerId, inlineResponse2005Connections.bankingCustomerId) &&
        Objects.equals(this.bankingPin, inlineResponse2005Connections.bankingPin) &&
        Objects.equals(this.type, inlineResponse2005Connections.type) &&
        Objects.equals(this.updateStatus, inlineResponse2005Connections.updateStatus) &&
        Objects.equals(this.categorizationStatus, inlineResponse2005Connections.categorizationStatus) &&
        Objects.equals(this.lastManualUpdate, inlineResponse2005Connections.lastManualUpdate) &&
        Objects.equals(this.lastAutoUpdate, inlineResponse2005Connections.lastAutoUpdate) &&
        Objects.equals(this.twoStepProcedures, inlineResponse2005Connections.twoStepProcedures) &&
        Objects.equals(this.ibanOnlyMoneyTransferSupported, inlineResponse2005Connections.ibanOnlyMoneyTransferSupported) &&
        Objects.equals(this.collectiveMoneyTransferSupported, inlineResponse2005Connections.collectiveMoneyTransferSupported) &&
        Objects.equals(this.defaultTwoStepProcedureId, inlineResponse2005Connections.defaultTwoStepProcedureId) &&
        Objects.equals(this.accountIds, inlineResponse2005Connections.accountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bankId, bank, name, bankingUserId, bankingCustomerId, bankingPin, type, updateStatus, categorizationStatus, lastManualUpdate, lastAutoUpdate, twoStepProcedures, ibanOnlyMoneyTransferSupported, collectiveMoneyTransferSupported, defaultTwoStepProcedureId, accountIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005Connections {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankingUserId: ").append(toIndentedString(bankingUserId)).append("\n");
    sb.append("    bankingCustomerId: ").append(toIndentedString(bankingCustomerId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    categorizationStatus: ").append(toIndentedString(categorizationStatus)).append("\n");
    sb.append("    lastManualUpdate: ").append(toIndentedString(lastManualUpdate)).append("\n");
    sb.append("    lastAutoUpdate: ").append(toIndentedString(lastAutoUpdate)).append("\n");
    sb.append("    twoStepProcedures: ").append(toIndentedString(twoStepProcedures)).append("\n");
    sb.append("    ibanOnlyMoneyTransferSupported: ").append(toIndentedString(ibanOnlyMoneyTransferSupported)).append("\n");
    sb.append("    collectiveMoneyTransferSupported: ").append(toIndentedString(collectiveMoneyTransferSupported)).append("\n");
    sb.append("    defaultTwoStepProcedureId: ").append(toIndentedString(defaultTwoStepProcedureId)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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

