package com.codeit.lecture.p31.ex02;

// 파일 이름: Main.java
class Example {
    final int number; // 생성자에서 초기화 가능

    Example(int number) {
        this.number = number; // 한 번만 초기화 가능
    }
}

public class Main {
    public static void main(String[] args) {
        Example a = new Example(1);
        Example b = new Example(2);
        System.out.println(a.number); // 1
        System.out.println(b.number); // 2

        // 아래 줄의 주석(//)을 지우면 컴파일 에러가 납니다.
        // a.number = 10;
    }
}
