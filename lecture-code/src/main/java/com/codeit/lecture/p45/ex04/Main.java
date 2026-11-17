package com.codeit.lecture.p45.ex04;

// 파일 이름: Main.java
class Answer {
    public static final int YES = 1; // "예"를 뜻하는 상수
}

class OrderStatus {
    public static final int IN_PROGRESS = 1; // "진행 중"을 뜻하는 상수
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Answer.YES == OrderStatus.IN_PROGRESS); // true

        int status = Answer.YES;
        System.out.println(status); // 1
    }
}
