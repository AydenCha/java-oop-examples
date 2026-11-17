package com.codeit.lecture.p32.ex02;

// 파일 이름: Main.java
interface InterfaceEx {
    int ROCK = 1;
    int SCISSORS = 2;
    int PAPER = 3;
    String getPlayingNum();
    void call();
}

// 구현체 클래스: 인터페이스의 추상 메서드를 모두 완성해야 합니다. 하나라도 빠지면 컴파일 에러가 납니다.
class MyClass implements InterfaceEx {
    public String getPlayingNum() {
        return "1";
    }

    public void call() {
        System.out.println("called!");
    }
}

public class Main {
    public static void main(String[] args) {
        // 아래 줄의 주석(//)을 지우면 컴파일 에러가 납니다.
        // InterfaceEx ex = new InterfaceEx();

        InterfaceEx ex = new MyClass();
        System.out.println(ex.getPlayingNum()); // 1
        ex.call();
    }
}
