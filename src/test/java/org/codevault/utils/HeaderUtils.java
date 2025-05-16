package org.codevault.utils;

import java.util.*;

public class HeaderUtils {

    public static Map<String, String> defaultOrderHeaders() {
        Map<String, String> headers = new HashMap<>();
//        headers.put("Authorization","Bearer "+ TokenManager.getToken());
        headers.put("Prefer", "return=representation");
        headers.put("PayPal-Request-Id", "12345-abcd-req-id");
        return headers;
    }

}
