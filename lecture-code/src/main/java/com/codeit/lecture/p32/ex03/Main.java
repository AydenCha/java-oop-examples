package com.codeit.lecture.p32.ex03;

// 파일 이름: Main.java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("날아간다!");
    }

    public void swim() {
        System.out.println("수영한다!");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        Flyable flyable = duck;
        flyable.fly();
        Swimmable swimmable = duck;
        swimmable.swim();
    }
}
