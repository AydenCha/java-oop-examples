package com.codeit.lecture.p26.ex01;

// 파일 이름: InstanceOfExample.java
public class InstanceOfExample {
    public static void main(String[] args) {
        // 실제 객체가 Animal인 경우
        Animal animal = new Animal();
        System.out.println(animal instanceof Object);
        System.out.println(animal instanceof Animal); // true  (자기 자신의 타입)
        System.out.println(animal instanceof Bat);

        Animal cat = new Cat();
        System.out.println(cat instanceof Object); // true
        System.out.println(cat instanceof Animal); // true  (Cat은 Animal의 하위 클래스)
        System.out.println(cat instanceof Cat); // true  (실제 객체가 Cat)
        System.out.println(cat instanceof Bat);

        Animal nothing = null;
        System.out.println(nothing instanceof Animal); // false
    }
}

class Animal {}
class Bat extends Animal {}
class Cat extends Animal {}
