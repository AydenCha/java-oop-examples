package com.codeit.lecture.p37.ex02;

// 파일 이름: Main.java
class Payment {
    void refund(int amount) {
        System.out.println(amount + "원 환불 완료");
    }
}

class SecurePayment extends Payment {
    @Override
    void refund(int amount) {
        if (amount > 1000) throw new IllegalArgumentException("1000원을 넘는 금액은 환불할 수 없습니다.");
        System.out.println(amount + "원 환불 완료");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment = new SecurePayment();

        payment.refund(500); // 500원 환불 완료

        try {
            payment.refund(5000);
        } catch (IllegalArgumentException e) {
            System.out.println("환불 실패: " + e.getMessage());
        }
    }
}
