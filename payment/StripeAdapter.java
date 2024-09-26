package com.example.adapter.payment;

public class StripeAdapter implements PaymentGateway {
    private StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void processPayment(double amount) {
        stripePayment.stripePaymentProcess(amount);
    }
}
