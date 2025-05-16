package org.codevault.tests;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOrderTestSecondApproach {

    @Test(description = "Create the order")
    public void createOrderTest() {
        Response response = given().baseUri("https://api-m.sandbox.paypal.com")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer A21AAJSLe_skEJVsS4S-zz5bK-zkf0j08lcAKw33ijvbVf6Aio9WUKBrerHn0MLU44jZ6ZqgeSGJboqPDPkR4-vFv4H_cs_UQ")
                .header("Prefer", "return=representation")
                .header("PayPal-Request-Id", "65bc3fe3-71d0-41e5-bb05-fc52824f91a4")
                .body("{\n" +
                        "    \"intent\": \"CAPTURE\",\n" +
                        "    \"payment_source\": {\n" +
                        "        \"paypal\": {\n" +
                        "            \"experience_context\": {\n" +
                        "                \"return_url\": \"https://developer.paypal.com\",\n" +
                        "                \"cancel_url\": \"https://www.bing.com\",\n" +
                        "                \"user_action\": \"PAY_NOW\"\n" +
                        "            }\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"purchase_units\": [\n" +
                        "        {\n" +
                        "            \"amount\": {\n" +
                        "                \"currency_code\": \"USD\",\n" +
                        "                \"value\": \"100.00\"\n" +
                        "            }\n" +
                        "        }\n" +
                        "    ]\n" +
                        "}").post("v2/checkout/orders");
        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.statusCode(), 200);


    }
}
