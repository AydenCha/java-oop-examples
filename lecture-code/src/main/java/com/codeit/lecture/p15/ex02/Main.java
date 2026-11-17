package com.codeit.lecture.p15.ex02;

// 파일 이름: Main.java
class Vehicle {
    void run() {
        System.out.println("원래 메서드");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("재정의된 메서드");
    }

    // 아래 주석(//)을 지우면 컴파일 에러가 납니다. 상위 클래스에 rum()이라는 메서드가 없기 때문입니다.
    // @Override
    // void rum() {
    // System.out.println("오타가 난 메서드");
    // }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.run(); // 재정의된 메서드
    }
}
