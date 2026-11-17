package com.codeit.lecture.p50.ex02;

public class Example {
    public static void main(String[] args) {
        methodA();
    }

    static void methodA() {
        methodB();
    }

    static void methodB() {
        String s = null;
        s.length(); // NullPointerException → methodB → methodA → main 순으로 전달
    }
}
