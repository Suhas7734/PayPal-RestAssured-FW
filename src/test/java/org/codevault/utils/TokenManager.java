package org.codevault.utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codevault.service.BaseService;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.form;
import static io.restassured.RestAssured.given;

public class TokenManager {

    private static String accessToken;
    private static Instant expiryTime;

    public static String getToken() {
        try {
            if (accessToken == null || Instant.now().isAfter(expiryTime)) {
                System.out.println("Renewing the token . . . ");
                Response response = generateToken();
                accessToken = response.path("access_token");
                int expiryDurationInSeconds = response.path("expires_in");
                expiryTime = Instant.now().plusSeconds(expiryDurationInSeconds - 300);
            } else {
                System.out.println("Token is good to use ");
            }
        } catch (Exception e) {
            throw new RuntimeException("ABORT!!! Token Generation Failed");
        }
        return accessToken;
    }

    private static Response generateToken() {

        String clientId = System.getenv("CLIENT_ID");
        String clientSecret = System.getenv("CLIENT_SECRET");

        // If env vars are missing, fallback to config file
        if (clientId == null || clientId.isEmpty()) {
            clientId = DataLoader.getInstance().getClientId();
        }
        if (clientSecret == null || clientSecret.isEmpty()) {
            clientSecret = DataLoader.getInstance().getClientSecret();
        }


        Map<String, String> formParams = new HashMap<>();
        formParams.put("grant_type", "client_credentials");
        formParams.put("ignoreCache", "true");
        formParams.put("return_authn_schemes", "true");
        formParams.put("return_client_metadata", "true");
        formParams.put("return_unconsented_scopes", "true");

        Response response = given().baseUri("https://api-m.sandbox.paypal.com")
                .auth().preemptive().basic(clientId, clientSecret)
                .contentType(ContentType.URLENC)
                .formParams(formParams)
                .when().post("/v1/oauth2/token")
                .then().extract().response();


        if (response.statusCode() != 200) {
            throw new RuntimeException("ABORT!!! Token Generation Failed");
        }
        return response;

    }

}
