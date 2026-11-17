package com.codeit.lecture.p01.ex06;

// 파일 이름: Application.java
class Order {
    private String user;
    private String item;
    private int price;

    public Order(String user, String item, int price) {
        this.user = user;
        this.item = item;
        this.price = price;
    }

    public void requestPayment(PaymentGateway gateway) {
        gateway.pay(user, item, price);
    }
}

class PaymentGateway {
    public void pay(String user, String item, int price) {
        System.out.println(user + "님이 " + item + "을(를) " + price + "원에 결제하셨습니다.");
    }
}

public class Application {
    public static void main(String[] args) {
        Order order = new Order("lucky", "book", 15000); // 주문 객체 생성
        PaymentGateway gateway = new PaymentGateway(); // 결제 담당 객체 생성
        order.requestPayment(gateway);
    }
}
