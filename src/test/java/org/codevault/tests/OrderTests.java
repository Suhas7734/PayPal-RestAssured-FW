package org.codevault.tests;

import io.restassured.response.Response;
import org.codevault.listeners.TestListener;
import org.codevault.service.OrderService;
import org.codevault.builders.OrderRequestBuilder;
import org.codevault.models.response.confirmOrder.ConfirmOrderResponse;
import org.codevault.models.response.createOrder.OrderResponse;
import org.codevault.models.response.showOrderDetails.ShowOrderResponse;
import org.codevault.utils.HeaderUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Listeners(TestListener.class)
public class OrderTests {

    private static String orderId;
    private final OrderService orderService = new OrderService();


    private String ensureOrderId() {

        if (orderId == null) {
            Response response = orderService
                    .createOrder(
                            OrderRequestBuilder.createOrderRequestBuilder(),
                            HeaderUtils.defaultOrderHeaders());
            OrderResponse orderResponse = response.as(OrderResponse.class);
            orderId = orderResponse.getId();
        }
        return orderId;
    }


    @Test(description = "Create the order",priority = 1)
    public void createOrderTest() {

        Response response = orderService
                .createOrder(
                        OrderRequestBuilder.createOrderRequestBuilder(),
                        HeaderUtils.defaultOrderHeaders());
        OrderResponse orderResponse = response.as(OrderResponse.class);
        orderId = orderResponse.getId();

        Assert.assertEquals(orderResponse.getIntent(), "CAPTURE");

    }

    @Test(description = "Confirm payment source for an order",priority = 2)
    public void confirmPaymentSourceTest() {
        String localOrderId = ensureOrderId();

        Response response = orderService.confirmPaymentSource(
                localOrderId,
                OrderRequestBuilder.confirmOrderRequestBuilder(),
                HeaderUtils.defaultOrderHeaders());

        Assert.assertEquals(response.getStatusCode(), 200, "Payment confirmation request failed");
        ConfirmOrderResponse confirmOrderResponse = response.as(ConfirmOrderResponse.class);
        Assert.assertEquals(confirmOrderResponse.getStatus(), "APPROVED", "Payment status is not APPROVED");
    }

    @Test(description = "Show order details",priority = 3)
    public void showOrderDetailsTest() {
        String localOrderId = ensureOrderId();

        Response response = orderService.showOrderDetails(localOrderId);
        ShowOrderResponse showOrderResponse = response.as(ShowOrderResponse.class);
        Assert.assertNotNull(showOrderResponse.getStatus(), "Status should not be null");

    }


}
