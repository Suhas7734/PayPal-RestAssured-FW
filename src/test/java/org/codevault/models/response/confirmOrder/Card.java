
package org.codevault.models.response.confirmOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Card {

    @JsonProperty("last_digits")
    private String lastDigits;
    @JsonProperty("expiry")
    private String expiry;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("type")
    private String type;
    @JsonProperty("bin_details")
    private BinDetails binDetails;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Card() {
    }

    public Card(String lastDigits, String expiry, String brand, String type, BinDetails binDetails) {
        super();
        this.lastDigits = lastDigits;
        this.expiry = expiry;
        this.brand = brand;
        this.type = type;
        this.binDetails = binDetails;
    }

    @JsonProperty("last_digits")
    public String getLastDigits() {
        return lastDigits;
    }

    @JsonProperty("last_digits")
    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    @JsonProperty("expiry")
    public String getExpiry() {
        return expiry;
    }

    @JsonProperty("expiry")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("bin_details")
    public BinDetails getBinDetails() {
        return binDetails;
    }

    @JsonProperty("bin_details")
    public void setBinDetails(BinDetails binDetails) {
        this.binDetails = binDetails;
    }

}
