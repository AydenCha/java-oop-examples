package com.codeit.lecture.p29.ex02;

// 파일 이름: Main.java
abstract class AbstractExample {
    abstract void start();
}

class Engine extends AbstractExample {
    @Override
    void start() {
        System.out.println("엔진을 시작합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        // 아래 줄의 주석(//)을 지우면 컴파일 에러가 납니다.
        // AbstractExample example = new AbstractExample();

        AbstractExample example = new Engine();
        example.start();
    }
}
