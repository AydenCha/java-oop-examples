package com.codeit.lecture.p47.ex04;

// 파일 이름: Main.java
enum PaymentType {
    CARD("신용카드"),
    CASH("현금"),
    BANK_TRANSFER("계좌이체");

    private final String displayName; // 화면에 보여 줄 이름

    PaymentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isCashMethod() {
        return this == CASH;
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentType type = PaymentType.CARD;

        System.out.println(type.isCashMethod()); // false
    }
}
