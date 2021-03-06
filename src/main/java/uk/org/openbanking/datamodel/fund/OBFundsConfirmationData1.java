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
 *  Copyright 2019 ForgeRock AS.
 */
/*
 * Confirmation of Funds API Specification
 * Swagger for Confirmation of Funds API Specification
 *
 * OpenAPI spec version: v3.0.0
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.fund;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.payment.OBActiveOrHistoricCurrencyAndAmount;

import java.util.Objects;

/**
 * OBFundsConfirmationData1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T11:58:26.525Z")
public class OBFundsConfirmationData1 {
  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("InstructedAmount")
  private OBActiveOrHistoricCurrencyAndAmount instructedAmount = null;

  public OBFundsConfirmationData1 consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

   /**
   * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmationData1 reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBFundsConfirmationData1 instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFundsConfirmationData1 obFundsConfirmationData1 = (OBFundsConfirmationData1) o;
    return Objects.equals(this.consentId, obFundsConfirmationData1.consentId) &&
        Objects.equals(this.reference, obFundsConfirmationData1.reference) &&
        Objects.equals(this.instructedAmount, obFundsConfirmationData1.instructedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, reference, instructedAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationData1 {\n");

    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

