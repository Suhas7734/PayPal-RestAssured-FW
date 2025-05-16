
package org.codevault.models.request.createOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseUnit {

    @JsonProperty("amount")
    private Amount amount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PurchaseUnit() {
    }

    public PurchaseUnit(Amount amount) {
        super();
        this.amount = amount;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

}
