package com.example.adapter.payment;

public class StripePayment {
    public void stripePaymentProcess(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
