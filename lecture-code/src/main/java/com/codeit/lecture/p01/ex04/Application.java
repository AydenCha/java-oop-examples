package com.codeit.lecture.p01.ex04;

// 파일 이름: Application.java
class Calculator {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
}

public class Application {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 5)); // 15
        System.out.println(cal.multiply(10, 5)); // 50
    }
}
