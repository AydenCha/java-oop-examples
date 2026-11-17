package com.codeit.lecture.p26.ex02;

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Cat(); // 업캐스팅 (Animal ← Cat)

        if (animal instanceof Cat) {
            ((Cat) animal).meow(); // 안전한 다운캐스팅
        } else if (animal instanceof Bat) {
            ((Bat) animal).fly();
        }
    }
}

class Animal {}

class Bat extends Animal {
    void fly() {
        System.out.println("박쥐가 날아다닙니다.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("고양이가 야옹하고 웁니다.");
    }
}
