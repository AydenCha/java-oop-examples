package com.codeit.lecture.p33.ex02;

// 파일 이름: Main.java
interface Movable {
    void move(); // 움직일 수 있는 능력
}

class Car implements Movable {
    public void move() {
        System.out.println("자동차가 바퀴로 움직입니다.");
    }
}

class Robot implements Movable {
    public void move() {
        System.out.println("로봇이 두 다리로 움직입니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Movable[] movables = { new Car(), new Robot() };
        for (Movable movable : movables) {
            movable.move();
        }
    }
}
