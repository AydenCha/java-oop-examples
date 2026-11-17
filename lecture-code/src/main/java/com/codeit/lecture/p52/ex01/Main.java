package com.codeit.lecture.p52.ex01;

// 파일 이름: Main.java
public class Main {
    public static void main(String[] args) {
        // try 블록: 예외가 발생할 수도 있는 코드를 감쌉니다. try만 단독으로 쓸 수는 없고 catch나 finally가 뒤따라야 합니다.
        try {
            // 예외가 발생할 수도 있는 코드
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage()); // 예외가 발생했습니다: / by zero
        }
    }
}
