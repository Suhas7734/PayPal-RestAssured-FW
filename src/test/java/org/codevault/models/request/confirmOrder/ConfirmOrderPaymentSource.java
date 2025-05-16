
package org.codevault.models.request.confirmOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfirmOrderPaymentSource {

    @JsonProperty("card")
    private Card card;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConfirmOrderPaymentSource() {
    }

    public ConfirmOrderPaymentSource(Card card) {
        super();
        this.card = card;
    }

    @JsonProperty("card")
    public Card getCard() {
        return card;
    }

    @JsonProperty("card")
    public void setCard(Card card) {
        this.card = card;
    }

}
