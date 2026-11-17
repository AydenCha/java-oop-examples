package com.codeit.lecture.p01.ex02;

// 파일 이름: Main.java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char op = '+'; // 어떤 연산을 할지 나타내는 문자

        if (op == '+') {
            System.out.println(a + b); // 15
        } else if (op == '-') {
            System.out.println(a - b);
        }
    }
}
