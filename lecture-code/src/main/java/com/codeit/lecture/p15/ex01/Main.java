package com.codeit.lecture.p15.ex01;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        bike.run();
        car.run();
        motorBike.run();
    }
}

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle {
    @Override
    void run() {
        System.out.println("MotorBike is running");
    }
}
