
package org.codevault.models.request.confirmOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Card {

    @JsonProperty("number")
    private String number;
    @JsonProperty("expiry")
    private String expiry;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Card() {
    }

    public Card(String number, String expiry) {
        super();
        this.number = number;
        this.expiry = expiry;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("expiry")
    public String getExpiry() {
        return expiry;
    }

    @JsonProperty("expiry")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

}
