package com.codeit.lecture.p47.ex02;

// 파일 이름: OrderStatusTest.java
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

public class OrderStatusTest {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.IN_PROGRESS;

        System.out.println(status); // IN_PROGRESS (상수 이름)
        System.out.println(status.getCode()); // IP (상수가 가진 코드값)
    }
}
