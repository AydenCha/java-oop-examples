package com.codeit.lecture.p29.ex01;

// 파일 이름: Main.java
abstract class AbstractExample {
    abstract void start(); // 추상 메서드
}

class Engine extends AbstractExample {
    @Override
    void start() {
        System.out.println("엔진을 시작합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractExample example = new Engine();
        example.start();
    }
}
