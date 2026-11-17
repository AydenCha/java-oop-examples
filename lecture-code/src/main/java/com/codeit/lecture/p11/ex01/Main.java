package com.codeit.lecture.p11.ex01;

// 파일 이름: Main.java
class Person {
    private String name;

    Person() {}

    Person(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person(); // (1) 첫 번째 객체 생성
        person.setName("김코딩");
        person = null;

        person = new Person(); // (2) 두 번째 객체 생성
        person.setName("박해커");

        person = new Person("김러키");

        System.out.println(person.getName());
    }
}
