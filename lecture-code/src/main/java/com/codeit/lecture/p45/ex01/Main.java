package com.codeit.lecture.p45.ex01;

// 파일 이름: Main.java
public class Main {
    public static final int READY = 0; // 준비
    public static final int IN_PROGRESS = 1; // 진행 중
    public static final int DONE = 2; // 완료

    public static void main(String[] args) {
        int status = IN_PROGRESS;
        System.out.println(status);
    }
}
