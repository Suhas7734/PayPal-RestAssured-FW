
package org.codevault.models.response.createOrder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Link {

    @JsonProperty("href")
    private String href;
    @JsonProperty("rel")
    private String rel;
    @JsonProperty("method")
    private String method;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Link() {
    }

    public Link(String href, String rel, String method) {
        super();
        this.href = href;
        this.rel = rel;
        this.method = method;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("rel")
    public String getRel() {
        return rel;
    }

    @JsonProperty("rel")
    public void setRel(String rel) {
        this.rel = rel;
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

}
