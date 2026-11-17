package com.codeit.lecture.p45.ex02;

// 파일 이름: Main.java
class OrderStatus {
    public static final int READY = 0;
    public static final int IN_PROGRESS = 1;
    public static final int DONE = 2;
}

public class Main {
    public static void main(String[] args) {
        int status = OrderStatus.READY;

        if (status == OrderStatus.READY) {
            System.out.println("주문 준비 중입니다.");
        }
    }
}
