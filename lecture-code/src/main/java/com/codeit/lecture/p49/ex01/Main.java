package com.codeit.lecture.p49.ex01;

// 파일 이름: Main.java
enum Status {
    READY, // ordinal = 0
    IN_PROGRESS, // ordinal = 1
    DONE // ordinal = 2
}

public class Main {
    public static boolean isFinished(Status status) {
        return status.ordinal() >= 2;
    }

    public static boolean isFinishedSafe(Status status) {
        return status == Status.DONE;
    }

    public static void main(String[] args) {
        System.out.println(isFinished(Status.DONE)); // true (지금은 맞게 나옵니다)
        System.out.println(isFinishedSafe(Status.DONE)); // true

    }
}
