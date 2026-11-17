package com.codeit.lecture.p53.ex03;

// 파일 이름: Main.java
public class Main {
    static void someDangerousOperation() {
        throw new IllegalStateException("중요한 작업이 실패했습니다.");
    }

    public static void main(String[] args) {
        try {
            someDangerousOperation();
        } catch (Exception e) {
        }

        System.out.println("작업이 성공한 것처럼 계속 실행됩니다.");
    }
}
