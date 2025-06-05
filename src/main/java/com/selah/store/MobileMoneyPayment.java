package com.selah.store;

public class MobileMoneyPayment implements PaymentService{
    public void processPayment(double amount) {
        System.out.println("MOBILE MONEY");
        System.out.println("Amount: " + amount);
    }
}
