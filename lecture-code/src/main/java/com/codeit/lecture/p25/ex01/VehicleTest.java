package com.codeit.lecture.p25.ex01;

// 파일 이름: VehicleTest.java
public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();

        Vehicle vehicle = car;
        vehicle.startEngine();

        Car car2 = (Car) vehicle;
        car2.giveRide();

        // 아래 줄의 주석(//)을 지우면 컴파일 에러가 납니다.
        // MotorBike motorBike = (MotorBike) car;
    }
}

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

class MotorBike extends Vehicle {
    void performTrick() {
        System.out.println("묘기 부리기");
    }
}
