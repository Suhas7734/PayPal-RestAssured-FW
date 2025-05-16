
package org.codevault.models.response.createOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseUnit {

    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("payee")
    private Payee payee;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PurchaseUnit() {
    }

    public PurchaseUnit(String referenceId, Amount amount, Payee payee) {
        super();
        this.referenceId = referenceId;
        this.amount = amount;
        this.payee = payee;
    }

    @JsonProperty("reference_id")
    public String getReferenceId() {
        return referenceId;
    }

    @JsonProperty("reference_id")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("payee")
    public Payee getPayee() {
        return payee;
    }

    @JsonProperty("payee")
    public void setPayee(Payee payee) {
        this.payee = payee;
    }

}
