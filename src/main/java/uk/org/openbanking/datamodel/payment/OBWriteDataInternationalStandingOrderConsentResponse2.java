/**
 *
 * The contents of this file are subject to the terms of the Common Development and
 *  Distribution License (the License). You may not use this file except in compliance with the
 *  License.
 *
 *  You can obtain a copy of the License at https://forgerock.org/cddlv1-0/. See the License for the
 *  specific language governing permission and limitations under the License.
 *
 *  When distributing Covered Software, include this CDDL Header Notice in each file and include
 *  the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 *  Header, with the fields enclosed by brackets [] replaced by your own identifying
 *  information: "Portions copyright [year] [name of copyright owner]".
 *
 *  Copyright 2018 ForgeRock AS.
 */
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteDataInternationalStandingOrderConsentResponse2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBWriteDataInternationalStandingOrderConsentResponse2   {
  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private DateTime creationDateTime = null;

  @JsonProperty("Status")
  private OBExternalConsentStatus1Code status = null;

  @JsonProperty("StatusUpdateDateTime")
  private DateTime statusUpdateDateTime = null;

  @JsonProperty("Permission")
  private OBExternalPermissions2Code permission = null;

  @JsonProperty("CutOffDateTime")
  private DateTime cutOffDateTime = null;

  @JsonProperty("Charges")
  @Valid
  private List<OBCharge1> charges = null;

  @JsonProperty("Initiation")
  private OBInternationalStandingOrder2 initiation = null;

  @JsonProperty("Authorisation")
  private OBAuthorisation1 authorisation = null;

  public OBWriteDataInternationalStandingOrderConsentResponse2 consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
  @NotNull

@Size(min=1,max=128) 
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 status(OBExternalConsentStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalConsentStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBExternalConsentStatus1Code status) {
    this.status = status;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 statusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 permission(OBExternalPermissions2Code permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalPermissions2Code getPermission() {
    return permission;
  }

  public void setPermission(OBExternalPermissions2Code permission) {
    this.permission = permission;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 cutOffDateTime(DateTime cutOffDateTime) {
    this.cutOffDateTime = cutOffDateTime;
    return this;
  }

  /**
   * Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return cutOffDateTime
  **/
  @ApiModelProperty(value = "Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getCutOffDateTime() {
    return cutOffDateTime;
  }

  public void setCutOffDateTime(DateTime cutOffDateTime) {
    this.cutOffDateTime = cutOffDateTime;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 charges(List<OBCharge1> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 addChargesItem(OBCharge1 chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<OBCharge1>();
    }
    this.charges.add(chargesItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a charge for the payment initiation.
   * @return charges
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a charge for the payment initiation.")

  @Valid

  public List<OBCharge1> getCharges() {
    return charges;
  }

  public void setCharges(List<OBCharge1> charges) {
    this.charges = charges;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 initiation(OBInternationalStandingOrder2 initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBInternationalStandingOrder2 getInitiation() {
    return initiation;
  }

  public void setInitiation(OBInternationalStandingOrder2 initiation) {
    this.initiation = initiation;
  }

  public OBWriteDataInternationalStandingOrderConsentResponse2 authorisation(OBAuthorisation1 authorisation) {
    this.authorisation = authorisation;
    return this;
  }

  /**
   * Get authorisation
   * @return authorisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBAuthorisation1 getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBAuthorisation1 authorisation) {
    this.authorisation = authorisation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDataInternationalStandingOrderConsentResponse2 obWriteDataInternationalStandingOrderConsentResponse2 = (OBWriteDataInternationalStandingOrderConsentResponse2) o;
    return Objects.equals(this.consentId, obWriteDataInternationalStandingOrderConsentResponse2.consentId) &&
        Objects.equals(this.creationDateTime, obWriteDataInternationalStandingOrderConsentResponse2.creationDateTime) &&
        Objects.equals(this.status, obWriteDataInternationalStandingOrderConsentResponse2.status) &&
        Objects.equals(this.statusUpdateDateTime, obWriteDataInternationalStandingOrderConsentResponse2.statusUpdateDateTime) &&
        Objects.equals(this.permission, obWriteDataInternationalStandingOrderConsentResponse2.permission) &&
        Objects.equals(this.cutOffDateTime, obWriteDataInternationalStandingOrderConsentResponse2.cutOffDateTime) &&
        Objects.equals(this.charges, obWriteDataInternationalStandingOrderConsentResponse2.charges) &&
        Objects.equals(this.initiation, obWriteDataInternationalStandingOrderConsentResponse2.initiation) &&
        Objects.equals(this.authorisation, obWriteDataInternationalStandingOrderConsentResponse2.authorisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, permission, cutOffDateTime, charges, initiation, authorisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDataInternationalStandingOrderConsentResponse2 {\n");

    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

