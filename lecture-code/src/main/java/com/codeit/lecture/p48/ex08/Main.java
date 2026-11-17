package com.codeit.lecture.p48.ex08;

// 파일 이름: Main.java
public class Main {
    public static void process(String status) {
        if (status.equals("READY")) {
            System.out.println("준비됨");
        } else if (status.equals("IN_PROGRESS")) {
            System.out.println("진행중");
        } else if (status.equals("DONE")) {
            System.out.println("완료됨");
        }
    }

    public static void main(String[] args) {
        process("READY"); // 준비됨
        process("IN_PROGRESS"); // 진행중
        process("DONE"); // 완료됨
        process("DOEN");
    }
}
