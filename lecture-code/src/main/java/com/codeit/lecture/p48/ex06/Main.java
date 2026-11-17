package com.codeit.lecture.p48.ex06;

// 파일 이름: Main.java
enum PaymentType {
    CARD, // 카드
    BANK_TRANSFER, // 계좌이체
    CASH // 현금
}

public class Main {
    public static void main(String[] args) {
        PaymentType type = PaymentType.BANK_TRANSFER;
        System.out.println(type); // BANK_TRANSFER
    }
}
