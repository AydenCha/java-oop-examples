package com.codeit.lecture.p47.ex01;

// 파일 이름: Main.java
enum OrderStatus {
    READY("RD"), // 준비중
    IN_PROGRESS("IP"), // 진행중
    DONE("DN");

    private final String code; // 각 Enum 상수의 고유 코드값

    OrderStatus(String code) { // 생성자
        this.code = code;
    }

    public String getCode() { // getter 메서드
        return code;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(OrderStatus.READY.getCode()); // RD
        System.out.println(OrderStatus.DONE.getCode()); // DN
    }
}
