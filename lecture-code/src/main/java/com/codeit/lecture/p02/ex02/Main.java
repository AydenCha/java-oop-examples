package com.codeit.lecture.p02.ex02;

// 파일 이름: Main.java
class Person {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person(); // 객체(인스턴스) 생성

        System.out.println(p.name); // null
    }
}
