package com.spring.toss.pay.model;

import lombok.Data;

@Data
public class CallbackPayload {
    private String secret;
    private String status;
    private String orderId;
}
