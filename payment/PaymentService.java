package com.example.adapter.payment;

public class PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(double amount) {
        paymentGateway.processPayment(amount);
    }

    public static void main(String[] args) {
        StripePayment stripePayment = new StripePayment();
        PayPalPayment payPalPayment = new PayPalPayment();

        PaymentGateway stripeAdapter = new StripeAdapter(stripePayment);
        PaymentGateway payPalAdapter = new PayPalAdapter(payPalPayment);

        PaymentService paymentService1 = new PaymentService(stripeAdapter);
        paymentService1.makePayment(100.0);

        PaymentService paymentService2 = new PaymentService(payPalAdapter);
        paymentService2.makePayment(200.0);
    }
}
