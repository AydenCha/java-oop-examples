package com.codeit.lecture.p33.ex01;

// 파일 이름: Main.java
abstract class Animal {
    String name; // 모든 동물은 이름이 있고

    void eat() {
        System.out.println(name + ": 먹는다");
    }
}

class Dog extends Animal {}
class Cat extends Animal {}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "강아지";
        dog.eat();

        Cat cat = new Cat();
        cat.name = "고양이";
        cat.eat();
    }
}
