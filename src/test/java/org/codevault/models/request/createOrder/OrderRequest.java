
package org.codevault.models.request.createOrder;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderRequest {

    @JsonProperty("intent")
    private String intent;
    @JsonProperty("payment_source")
    private PaymentSource paymentSource;
    @JsonProperty("purchase_units")
    private List<PurchaseUnit> purchaseUnits;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderRequest() {
    }

    public OrderRequest(String intent, PaymentSource paymentSource, List<PurchaseUnit> purchaseUnits) {
        super();
        this.intent = intent;
        this.paymentSource = paymentSource;
        this.purchaseUnits = purchaseUnits;
    }

    @JsonProperty("intent")
    public String getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(String intent) {
        this.intent = intent;
    }

    @JsonProperty("payment_source")
    public PaymentSource getPaymentSource() {
        return paymentSource;
    }

    @JsonProperty("payment_source")
    public void setPaymentSource(PaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    @JsonProperty("purchase_units")
    public List<PurchaseUnit> getPurchaseUnits() {
        return purchaseUnits;
    }

    @JsonProperty("purchase_units")
    public void setPurchaseUnits(List<PurchaseUnit> purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

}
