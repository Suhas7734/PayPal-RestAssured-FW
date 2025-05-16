package org.codevault.service;

import io.restassured.response.Response;

import java.util.Map;

public class OrderService extends BaseService {

    private static final String BASE_PATH = "/v2/checkout/orders";

    public Response createOrder(Object payload, Map<String, String> headers) {
        return postRequest(payload, BASE_PATH, headers);
    }

    public Response confirmPaymentSource(String orderId, Object payload, Map<String, String> headers) {
        String path = BASE_PATH + "/" + orderId + "/confirm-payment-source";
        return postRequest(payload, path, headers);
    }

    public Response showOrderDetails(String orderId) {
        return getRequest(BASE_PATH + "/" + orderId);
    }


}
