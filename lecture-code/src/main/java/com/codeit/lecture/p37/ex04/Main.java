package com.codeit.lecture.p37.ex04;

// 파일 이름: Main.java
import java.util.List;

class Animal {
    void speak() { System.out.println("동물이 소리를 냅니다."); }
}

class Dog extends Animal {
    @Override
    void speak() { System.out.println("멍멍"); }
}

class Cat extends Animal {
    @Override
    void speak() { System.out.println("야옹"); }
}

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat());

        for (Animal a : animals) {
            a.speak();
        }
        // 멍멍
        // 야옹
    }
}
