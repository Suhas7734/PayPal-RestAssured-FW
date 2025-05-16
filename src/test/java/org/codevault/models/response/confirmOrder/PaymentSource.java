
package org.codevault.models.response.confirmOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentSource {

    @JsonProperty("card")
    private Card card;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentSource() {
    }

    public PaymentSource(Card card) {
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
