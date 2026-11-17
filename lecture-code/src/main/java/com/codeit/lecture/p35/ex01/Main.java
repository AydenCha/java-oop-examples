package com.codeit.lecture.p35.ex01;

// 파일 이름: Main.java
class PaymentService {
    void pay(String method) {

        if (method.equals("card")) {
            System.out.println("카드 결제");
        } else if (method.equals("kakao")) {
            System.out.println("카카오페이");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.pay("card"); // 카드 결제
        service.pay("kakao"); // 카카오페이
        service.pay("naver");
    }
}
