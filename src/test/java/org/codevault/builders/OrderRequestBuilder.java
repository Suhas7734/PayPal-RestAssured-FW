package org.codevault.builders;

import org.codevault.models.request.confirmOrder.Card;
import org.codevault.models.request.confirmOrder.ConfirmOrderPaymentSource;
import org.codevault.models.request.confirmOrder.ConfirmOrderRequest;
import org.codevault.models.request.createOrder.*;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestBuilder {

    public static OrderRequest createOrderRequestBuilder(){
        ExperienceContext experienceContext = new ExperienceContext("https://developer.paypal.com",
                "https://www.bing.com",
                "PAY_NOW");
        Paypal paypal = new Paypal(experienceContext);
        PaymentSource paymentSource = new PaymentSource(paypal);
        Amount amount = new Amount("USD", "100.00");
        PurchaseUnit purchaseUnit = new PurchaseUnit(amount);
        List<PurchaseUnit> purchaseUnitList = new ArrayList<>();
        purchaseUnitList.add(purchaseUnit);
        return new OrderRequest("CAPTURE", paymentSource, purchaseUnitList);

    }

    public static ConfirmOrderRequest confirmOrderRequestBuilder(){
        Card card = new Card("4111111111111111","2035-12");
        ConfirmOrderPaymentSource paymentSource = new ConfirmOrderPaymentSource(card);
        return new ConfirmOrderRequest(paymentSource);
    }

}
