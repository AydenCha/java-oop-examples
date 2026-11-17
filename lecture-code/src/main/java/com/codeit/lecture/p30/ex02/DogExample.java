package com.codeit.lecture.p30.ex02;

// 파일 이름: DogExample.java
abstract class Animal {
    public String kind; // 동물의 분류 (공통 속성)
    public abstract void sound();
}

class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public Cat() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

public class DogExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // 멍멍

        Cat cat = new Cat();
        cat.sound(); // 야옹
    }
}

/*
출력 결과
멍멍
야옹
*/
