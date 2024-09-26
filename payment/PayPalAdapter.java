package com.example.adapter.payment;

public class PayPalAdapter implements PaymentGateway {
    private PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(double amount) {
        payPalPayment.payPalPaymentProcess(amount);
    }
}
