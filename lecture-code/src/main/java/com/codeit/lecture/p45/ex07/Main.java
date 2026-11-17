package com.codeit.lecture.p45.ex07;

// 파일 이름: Main.java
enum OrderStatus {
    READY, IN_PROGRESS, DONE
}

public class Main {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.READY;

        System.out.println(status); // READY
        // int status = 0; 과 달리, 코드를 읽으면 바로 "준비 상태"라는 뜻이 보입니다.
    }
}
