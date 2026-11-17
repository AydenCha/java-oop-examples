package com.codeit.lecture.p40.ex02;

// 파일 이름: Main.java
enum TransactionType {
    DEPOSIT("D", "입금") {
        @Override
        public int calculateFee(int amount) {
            return 0;
        }
    };

    private final String code;
    private final String desc;

    TransactionType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public abstract int calculateFee(int amount);
}

public class Main {
    public static void main(String[] args) {
        System.out.println(TransactionType.DEPOSIT.calculateFee(50000)); // 0
    }
}
