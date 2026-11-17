package com.codeit.lecture.p49.ex03;

// 파일 이름: Main.java
enum OrderStatus {
    READY("RD", "준비중"),
    IN_PROGRESS("IP", "진행중"),
    DONE("DN", "완료됨");

    private final String code; // 저장하거나 주고받을 때 쓰는 고정 코드값
    private final String description; // 사람에게 보여 줄 설명

    OrderStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static OrderStatus fromCode(String code) {
        for (OrderStatus status : values()) {
            if (status.code.equals(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + code); // 없는 코드값이면 예외(7장)
    }
}

public class Main {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.fromCode("IP");

        System.out.println(status); // IN_PROGRESS
        System.out.println(status.getCode()); // IP
        System.out.println(status.getDescription()); // 진행중
    }
}
