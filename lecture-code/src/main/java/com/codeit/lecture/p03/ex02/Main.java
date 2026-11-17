package com.codeit.lecture.p03.ex02;

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

        // 객체 생성
        Order order = new Order();
        PaymentProcessor processor = new PaymentProcessor();

        // 객체 간 협력 발생
        // "processPayment()" 메시지를 전달
        order.pay(processor);
    }
}
