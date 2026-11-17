package com.codeit.lecture.p04.ex02;

// 파일 이름: Main.java
class Person {
    String name; // 인스턴스 변수
    int age;
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "영수";
        p2.name = "민지";

        System.out.println(p1.name); // 영수
        System.out.println(p2.name); // 민지
    }
}
