package com.codeit.lecture.p24.ex03;

// 파일 이름: Main.java
class Car { void move() { System.out.println("자동차가 움직입니다."); } }
class Sonata extends Car { @Override void move() { System.out.println("소나타가 움직입니다."); } }
class Morning extends Car { @Override void move() { System.out.println("모닝이 움직입니다."); } }
// 나중에 새로 추가한 차종
class Santafe extends Car { @Override void move() { System.out.println("싼타페가 움직입니다."); } }

public class Main {
    public static void move(Car car) {
        car.move();
    }

    public static void main(String[] args) {
        move(new Sonata());
        move(new Morning());
        move(new Santafe());
    }
}
