package com.codeit.lecture.p01.ex01;

// 파일 이름: Main.java
class Cat {
    String name; // 상태: 고양이마다 가지는 이름

    // 행동: 고양이가 할 수 있는 일
    void meow() {
        System.out.println(name + "가 웁니다!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "나비";
        cat.meow();
    }
}
