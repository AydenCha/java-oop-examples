package com.codeit.lecture.p02.ex01;

// 파일 이름: Main.java
class Person {
    String name; // 필드 (상태)

    void greet() { // 메서드 (행동)
        System.out.println(name + "님, 반가워요!");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "영수";
        p.greet();
    }
}
