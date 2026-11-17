package com.codeit.lecture.p22.ex01;

// 파일 이름: Main.java
final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("김코딩", 20);
        System.out.println(person.getName()); // 김코딩
        System.out.println(person.getAge()); // 20

        Person older = new Person(person.getName(), person.getAge() + 1);
        System.out.println(older.getAge()); // 21
        System.out.println(person.getAge()); // 20 (원래 객체는 그대로입니다)
    }
}
