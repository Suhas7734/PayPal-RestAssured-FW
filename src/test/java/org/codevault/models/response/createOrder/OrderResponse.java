
package org.codevault.models.response.createOrder;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("intent")
    private String intent;
    @JsonProperty("status")
    private String status;
    @JsonProperty("payment_source")
    private PaymentSource paymentSource;
    @JsonProperty("purchase_units")
    private List<PurchaseUnit> purchaseUnits;
    @JsonProperty("links")
    private List<Link> links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderResponse() {
    }

    public OrderResponse(String id, String intent, String status, PaymentSource paymentSource, List<PurchaseUnit> purchaseUnits, List<Link> links) {
        super();
        this.id = id;
        this.intent = intent;
        this.status = status;
        this.paymentSource = paymentSource;
        this.purchaseUnits = purchaseUnits;
        this.links = links;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("intent")
    public String getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(String intent) {
        this.intent = intent;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

}
