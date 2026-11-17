package com.codeit.lecture.p07.ex02;

// 파일 이름: Main.java
class Car {
    public String model;
    public String color;

    public Car() {} // 기본 생성자: 매개변수가 없는 생성자

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void power() {
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("더 빠르게!");
    }

    void stop() {
        System.out.println("멈춤");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Model 3", "빨강");
        System.out.println("내 차의 모델은 " + c.model + "이고 색은 " + c.color + "입니다.");
        c.power();
        c.accelerate();
        c.stop();
    }
}

/*
출력 결과
내 차의 모델은 Model 3이고 색은 빨강입니다.
시동을 걸었습니다.
더 빠르게!
멈춤
*/
