package com.codeit.lecture.p25.ex02;

// 파일 이름: Main.java
class Vehicle {
    void startEngine() {
        System.out.println("시동 걸기");
    }
}

class Car extends Vehicle {
    void giveRide() {
        System.out.println("사람을 태운다");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        // vehicle.giveRide();           // 컴파일 에러: Vehicle 타입에는 giveRide()가 없습니다.

        ((Car) vehicle).giveRide();
    }
}
