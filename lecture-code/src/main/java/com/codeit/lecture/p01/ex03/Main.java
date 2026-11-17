package com.codeit.lecture.p01.ex03;

// 파일 이름: Main.java
class Calculator {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }

    int multiply(int a, int b) { return a * b; }
}

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 5)); // 15
        System.out.println(cal.subtract(10, 5)); // 5
        System.out.println(cal.multiply(10, 5)); // 50
    }
}
