
package org.codevault.models.response.showOrderDetails;

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
    @JsonProperty("invoice_id")
    private String invoiceId;
    @JsonProperty("shipping")
    private Shipping shipping;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PurchaseUnit() {
    }

    public PurchaseUnit(String referenceId, Amount amount, Payee payee, String invoiceId, Shipping shipping) {
        super();
        this.referenceId = referenceId;
        this.amount = amount;
        this.payee = payee;
        this.invoiceId = invoiceId;
        this.shipping = shipping;
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

    @JsonProperty("invoice_id")
    public String getInvoiceId() {
        return invoiceId;
    }

    @JsonProperty("invoice_id")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

}
