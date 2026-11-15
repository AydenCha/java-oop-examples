package com.codeit.solid.ocp.after;

public class Application {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CardPay());
        // 결제 방식에 따라 다르게 동작하는 서비스입니다.
        paymentService.processPayment();
    }
}
