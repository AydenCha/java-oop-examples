package com.codeit.lecture.p52.ex02;

// 파일 이름: Main.java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("결과: " + result); // try의 나머지 줄은 건너뛰고
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        System.out.println("프로그램이 계속 실행됩니다.");
    }
}

/*
실행 결과
0으로 나눌 수 없습니다.
프로그램이 계속 실행됩니다.
*/
