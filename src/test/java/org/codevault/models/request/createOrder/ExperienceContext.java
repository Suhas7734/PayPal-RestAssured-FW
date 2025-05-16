
package org.codevault.models.request.createOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExperienceContext {

    @JsonProperty("return_url")
    private String returnUrl;
    @JsonProperty("cancel_url")
    private String cancelUrl;
    @JsonProperty("user_action")
    private String userAction;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExperienceContext() {
    }

    public ExperienceContext(String returnUrl, String cancelUrl, String userAction) {
        super();
        this.returnUrl = returnUrl;
        this.cancelUrl = cancelUrl;
        this.userAction = userAction;
    }

    @JsonProperty("return_url")
    public String getReturnUrl() {
        return returnUrl;
    }

    @JsonProperty("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    @JsonProperty("cancel_url")
    public String getCancelUrl() {
        return cancelUrl;
    }

    @JsonProperty("cancel_url")
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    @JsonProperty("user_action")
    public String getUserAction() {
        return userAction;
    }

    @JsonProperty("user_action")
    public void setUserAction(String userAction) {
        this.userAction = userAction;
    }

}
