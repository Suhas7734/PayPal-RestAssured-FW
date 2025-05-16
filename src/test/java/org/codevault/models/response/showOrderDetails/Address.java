
package org.codevault.models.response.showOrderDetails;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

    @JsonProperty("address_line_1")
    private String addressLine1;
    @JsonProperty("address_line_2")
    private String addressLine2;
    @JsonProperty("admin_area_2")
    private String adminArea2;
    @JsonProperty("admin_area_1")
    private String adminArea1;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("country_code")
    private String countryCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    public Address(String addressLine1, String addressLine2, String adminArea2, String adminArea1, String postalCode, String countryCode) {
        super();
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.adminArea2 = adminArea2;
        this.adminArea1 = adminArea1;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
    }

    @JsonProperty("address_line_1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("address_line_1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("address_line_2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("address_line_2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("admin_area_2")
    public String getAdminArea2() {
        return adminArea2;
    }

    @JsonProperty("admin_area_2")
    public void setAdminArea2(String adminArea2) {
        this.adminArea2 = adminArea2;
    }

    @JsonProperty("admin_area_1")
    public String getAdminArea1() {
        return adminArea1;
    }

    @JsonProperty("admin_area_1")
    public void setAdminArea1(String adminArea1) {
        this.adminArea1 = adminArea1;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
