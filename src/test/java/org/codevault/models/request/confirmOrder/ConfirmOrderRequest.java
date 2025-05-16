
package org.codevault.models.request.confirmOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfirmOrderRequest {

    @JsonProperty("payment_source")
    private ConfirmOrderPaymentSource payment_source;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConfirmOrderRequest() {
    }

    public ConfirmOrderRequest(ConfirmOrderPaymentSource payment_source) {
        super();
        this.payment_source = payment_source;
    }

    @JsonProperty("payment_source")
    public ConfirmOrderPaymentSource getPaymentSource() {
        return payment_source;
    }

    @JsonProperty("payment_source")
    public void setPaymentSource(ConfirmOrderPaymentSource confirmOrderPaymentSource) {
        this.payment_source = confirmOrderPaymentSource;
    }

}
