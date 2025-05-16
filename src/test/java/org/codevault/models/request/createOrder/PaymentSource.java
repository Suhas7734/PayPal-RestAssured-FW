
package org.codevault.models.request.createOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentSource {

    @JsonProperty("paypal")
    private Paypal paypal;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentSource() {
    }

    public PaymentSource(Paypal paypal) {
        super();
        this.paypal = paypal;
    }

    @JsonProperty("paypal")
    public Paypal getPaypal() {
        return paypal;
    }

    @JsonProperty("paypal")
    public void setPaypal(Paypal paypal) {
        this.paypal = paypal;
    }

}
