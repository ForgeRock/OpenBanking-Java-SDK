/*
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
 *  Copyright 2017 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.discovery;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Provides the endpoints details for payments and accounts API
 */
@ApiModel(description = "Provides the endpoints details for payments and accounts API")
public class OBDiscovery {

    @JsonProperty("PaymentInitiationAPI")
    private List<OBDiscoveryAPI<OBDiscoveryAPILinksPayment>> paymentInitiationAPIs = new ArrayList<OBDiscoveryAPI<OBDiscoveryAPILinksPayment>>();

    @JsonProperty("AccountAndTransactionAPI")
    private List<OBDiscoveryAPI<OBDiscoveryAPILinksAccount>> accountAndTransactionAPIs = new ArrayList<OBDiscoveryAPI<OBDiscoveryAPILinksAccount>>();

    public OBDiscovery paymentInitiationAPI(List<OBDiscoveryAPI<OBDiscoveryAPILinksPayment>> paymentInitiationAPIs) {
        this.paymentInitiationAPIs = paymentInitiationAPIs;
        return this;
    }

    public OBDiscovery addPaymentInitiationAPI(OBDiscoveryAPI<OBDiscoveryAPILinksPayment> paymentInitiationAPI) {
        this.paymentInitiationAPIs.add(paymentInitiationAPI);
        return this;
    }

    public List<OBDiscoveryAPI<OBDiscoveryAPILinksPayment>> getPaymentInitiationAPIs() {
        return paymentInitiationAPIs;
    }

    public void setPaymentInitiationAPIs(List<OBDiscoveryAPI<OBDiscoveryAPILinksPayment>> paymentInitiationAPIs) {
        this.paymentInitiationAPIs = paymentInitiationAPIs;
    }

    public Optional<OBDiscoveryAPI<OBDiscoveryAPILinksPayment>> getPaymentInitiationAPI(String version) {
    	Optional<OBDiscoveryAPI<OBDiscoveryAPILinksPayment>> result = paymentInitiationAPIs.stream().filter(apis -> apis.getVersion().equals(version)).findFirst();
    	if (!result.isPresent()) {
    		OBDiscoveryAPILinksPayment obdapilp = new OBDiscoveryAPILinksPayment();
    		OBDiscoveryAPI<OBDiscoveryAPILinksPayment> obDiscoveryAPILinksPayment = new OBDiscoveryAPI<OBDiscoveryAPILinksPayment>();
    		obDiscoveryAPILinksPayment.setVersion(version);
    		obDiscoveryAPILinksPayment.setLinks(obdapilp);
    		this.addPaymentInitiationAPI(obDiscoveryAPILinksPayment);
    		result = Optional.of(obDiscoveryAPILinksPayment);
    	}
        return result;
    }

    public OBDiscovery accountAndTransactionAPIs(List<OBDiscoveryAPI<OBDiscoveryAPILinksAccount>> accountAndTransactionAPIs) {
        this.accountAndTransactionAPIs = accountAndTransactionAPIs;
        return this;
    }

    public OBDiscovery addAccountAndTransactionAPI(OBDiscoveryAPI<OBDiscoveryAPILinksAccount> accountAndTransactionAPI) {
        this.accountAndTransactionAPIs.add(accountAndTransactionAPI);
        return this;
    }

    public List<OBDiscoveryAPI<OBDiscoveryAPILinksAccount>> getAccountAndTransactionAPIs() {
        return accountAndTransactionAPIs;
    }

    public void setAccountAndTransactionAPIs(List<OBDiscoveryAPI<OBDiscoveryAPILinksAccount>> accountAndTransactionAPIs) {
        this.accountAndTransactionAPIs = accountAndTransactionAPIs;
    }

    public Optional<OBDiscoveryAPI<OBDiscoveryAPILinksAccount>> getAccountAndTransactionAPI(String version) {
    	
    	Optional<OBDiscoveryAPI<OBDiscoveryAPILinksAccount>> result = accountAndTransactionAPIs.stream().filter(apis -> apis.getVersion().equals(version)).findFirst();
    	if (!result.isPresent()) {
    		OBDiscoveryAPILinksAccount obdapilp = new OBDiscoveryAPILinksAccount();
    		OBDiscoveryAPI<OBDiscoveryAPILinksAccount> obDiscoveryAPILinksAccount = new OBDiscoveryAPI<OBDiscoveryAPILinksAccount>();
    		obDiscoveryAPILinksAccount.setVersion(version);
    		obDiscoveryAPILinksAccount.setLinks(obdapilp);
    		this.addAccountAndTransactionAPI(obDiscoveryAPILinksAccount);
    		result = Optional.of(obDiscoveryAPILinksAccount);
    	}
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscovery that = (OBDiscovery) o;
        return Objects.equals(paymentInitiationAPIs, that.paymentInitiationAPIs) &&
                Objects.equals(accountAndTransactionAPIs, that.accountAndTransactionAPIs);
    }

    @Override
    public int hashCode() {

        return Objects.hash(paymentInitiationAPIs, accountAndTransactionAPIs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDiscovery {\n");
        sb.append("    paymentInitiationAPIs: ").append(toIndentedString(paymentInitiationAPIs)).append("\n");
        sb.append("    accountAndTransactionAPIs: ").append(toIndentedString(accountAndTransactionAPIs)).append("\n");
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
