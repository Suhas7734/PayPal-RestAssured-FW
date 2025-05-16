
package org.codevault.models.response.showOrderDetails;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payee {

    @JsonProperty("email_address")
    private String emailAddress;
    @JsonProperty("merchant_id")
    private String merchantId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payee() {
    }

    public Payee(String emailAddress, String merchantId) {
        super();
        this.emailAddress = emailAddress;
        this.merchantId = merchantId;
    }

    @JsonProperty("email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty("merchant_id")
    public String getMerchantId() {
        return merchantId;
    }

    @JsonProperty("merchant_id")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

}
