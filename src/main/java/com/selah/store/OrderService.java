package com.selah.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService paymentService;
    OrderService(PaymentService paymentService){
    this.paymentService=paymentService;
    }
    public void placeOrder() {
        paymentService.processPayment(1000.00);
    }
}
