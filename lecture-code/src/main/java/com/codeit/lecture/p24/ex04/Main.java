package com.codeit.lecture.p24.ex04;

// 파일 이름: Main.java
class Animal {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // 변수 타입은 Animal, 실제 객체는 Dog
        a.sound();
    }
}
