
package org.codevault.models.request.createOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paypal {

    @JsonProperty("experience_context")
    private ExperienceContext experienceContext;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Paypal() {
    }

    public Paypal(ExperienceContext experienceContext) {
        super();
        this.experienceContext = experienceContext;
    }

    @JsonProperty("experience_context")
    public ExperienceContext getExperienceContext() {
        return experienceContext;
    }

    @JsonProperty("experience_context")
    public void setExperienceContext(ExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

}
