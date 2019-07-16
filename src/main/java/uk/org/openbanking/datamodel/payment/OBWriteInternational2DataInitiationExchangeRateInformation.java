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
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Provides details on the currency exchange rate and contract.
 */
@ApiModel(description = "Provides details on the currency exchange rate and contract.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteInternational2DataInitiationExchangeRateInformation {
    @JsonProperty("UnitCurrency")
    private String unitCurrency = null;

    @JsonProperty("ExchangeRate")
    private BigDecimal exchangeRate = null;
    @JsonProperty("RateType")
    private RateTypeEnum rateType = null;
    @JsonProperty("ContractIdentification")
    private String contractIdentification = null;

    public OBWriteInternational2DataInitiationExchangeRateInformation unitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
        return this;
    }

    /**
     * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP &#x3D; xxxCUR, the unit currency is GBP.
     *
     * @return unitCurrency
     **/
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @ApiModelProperty(required = true, value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
    public String getUnitCurrency() {
        return unitCurrency;
    }

    public void setUnitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
    }

    public OBWriteInternational2DataInitiationExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
     *
     * @return exchangeRate
     **/
    @Valid
    @ApiModelProperty(value = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public OBWriteInternational2DataInitiationExchangeRateInformation rateType(RateTypeEnum rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Specifies the type used to complete the currency exchange.
     *
     * @return rateType
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the type used to complete the currency exchange.")
    public RateTypeEnum getRateType() {
        return rateType;
    }

    public void setRateType(RateTypeEnum rateType) {
        this.rateType = rateType;
    }

    public OBWriteInternational2DataInitiationExchangeRateInformation contractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
        return this;
    }

    /**
     * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
     *
     * @return contractIdentification
     **/
    @Size(min = 1, max = 256)
    @ApiModelProperty(value = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")
    public String getContractIdentification() {
        return contractIdentification;
    }

    public void setContractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternational2DataInitiationExchangeRateInformation obWriteInternational2DataInitiationExchangeRateInformation = (OBWriteInternational2DataInitiationExchangeRateInformation) o;
        return Objects.equals(this.unitCurrency, obWriteInternational2DataInitiationExchangeRateInformation.unitCurrency) &&
                Objects.equals(this.exchangeRate, obWriteInternational2DataInitiationExchangeRateInformation.exchangeRate) &&
                Objects.equals(this.rateType, obWriteInternational2DataInitiationExchangeRateInformation.rateType) &&
                Objects.equals(this.contractIdentification, obWriteInternational2DataInitiationExchangeRateInformation.contractIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitCurrency, exchangeRate, rateType, contractIdentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternational2DataInitiationExchangeRateInformation {\n");

        sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
        sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
        sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
        sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
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

    /**
     * Specifies the type used to complete the currency exchange.
     */
    public enum RateTypeEnum {
        ACTUAL("Actual"),

        AGREED("Agreed"),

        INDICATIVE("Indicative");

        private String value;

        RateTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static RateTypeEnum fromValue(String text) {
            for (RateTypeEnum b : RateTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}
