package com.codeit.lecture.p03.ex03;

// 파일 이름: Main.java
class Order {
    void pay(PaymentProcessor processor) {
        processor.processPayment();
    }
}

class PaymentProcessor {
    void processPayment() {
        System.out.println("결제를 처리합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        PaymentProcessor processor = new PaymentProcessor();

        order.pay(processor);
    }
}
