package com.codeit.lecture.p35.ex02;

// 파일 이름: Main.java
interface PayStrategy {

    void pay();
}

class CardPay implements PayStrategy {
    public void pay() {
        System.out.println("카드 결제");
    }
}

class KakaoPay implements PayStrategy {
    public void pay() {
        System.out.println("카카오페이");
    }
}

class NaverPay implements PayStrategy {
    public void pay() {
        System.out.println("네이버페이");
    }
}

class PaymentService {
    private PayStrategy payStrategy;

    public PaymentService(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void processPayment() {
        payStrategy.pay();
    }
}

public class Main {
    public static void main(String[] args) {
        new PaymentService(new CardPay()).processPayment(); // 카드 결제
        new PaymentService(new KakaoPay()).processPayment(); // 카카오페이
        new PaymentService(new NaverPay()).processPayment(); // 네이버페이
    }
}
