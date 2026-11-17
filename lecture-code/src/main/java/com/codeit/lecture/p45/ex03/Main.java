package com.codeit.lecture.p45.ex03;

// 파일 이름: Main.java
class OrderStatus {
    public static final int READY = 0;
    public static final int IN_PROGRESS = 1;
    public static final int DONE = 2;
}

public class Main {
    public static void main(String[] args) {
        int status = 999; // 말도 안 되는 값이 들어올 수 있음

        System.out.println(status);
    }
}
