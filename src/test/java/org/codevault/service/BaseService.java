package org.codevault.service;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codevault.filters.LoggingFilter;
import org.codevault.utils.TokenManager;

import java.util.Map;

import static io.restassured.RestAssured.*;

public class BaseService { //wrapper for Rest assured F

    //Handles BASE URI
    //Building the request
    //handling the response

//    private static final String BASE_URL = "https://api-m.sandbox.paypal.com";
private static final String BASE_URL;

    static {
        String env = System.getProperty("env", "dev");
        switch (env.toLowerCase()) {
            case "qa":
                BASE_URL = "https://api-m.sandbox.paypal.com";
                break;
            case "staging":
                BASE_URL = "https://api-m.sandbox.paypal.com";
                break;
            case "prod":
                BASE_URL = "https://api-m.sandbox.paypal.com";
                break;
            default:
                BASE_URL = "https://api-m.sandbox.paypal.com";
        }
    }

    private RequestSpecification requestSpecification;

    static {
        RestAssured.filters(new LoggingFilter());
    }

    public BaseService() {
        this.requestSpecification = given()
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + TokenManager.getToken());
    }

    protected Response postRequest(Object payload, String endPoint, Map<String, String> additionalHeaders) {
        if (additionalHeaders != null) {
            requestSpecification.headers(additionalHeaders); // add other dynamic headers
        }
        return requestSpecification
                .body(payload)
                .post(endPoint);
    }

    protected Response getRequest(String endPoint) {
        return requestSpecification.get(endPoint);
    }

}
