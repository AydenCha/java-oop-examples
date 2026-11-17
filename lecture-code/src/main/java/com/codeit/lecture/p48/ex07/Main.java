package com.codeit.lecture.p48.ex07;

// 파일 이름: Main.java
enum PaymentType {
    CARD, // 카드
    BANK_TRANSFER, // 계좌이체
    CASH // 현금
}

public class Main {
    public static void processPayment(PaymentType type) {
        switch (type) {
            case CARD:
                System.out.println("카드 결제를 처리합니다.");
                break;
            case BANK_TRANSFER:
                System.out.println("계좌이체 결제를 처리합니다.");
                break;
            case CASH:
                System.out.println("현금 결제를 처리합니다.");
                break;
        }
    }

    public static void main(String[] args) {
        processPayment(PaymentType.CARD);
        processPayment(PaymentType.BANK_TRANSFER);
        processPayment(PaymentType.CASH);
    }
}
