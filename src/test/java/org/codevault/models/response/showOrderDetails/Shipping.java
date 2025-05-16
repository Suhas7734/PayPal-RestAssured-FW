
package org.codevault.models.response.showOrderDetails;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shipping {

    @JsonProperty("address")
    private Address address;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Shipping() {
    }

    public Shipping(Address address) {
        super();
        this.address = address;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

}
