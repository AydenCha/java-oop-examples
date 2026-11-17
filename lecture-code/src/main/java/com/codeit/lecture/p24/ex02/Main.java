package com.codeit.lecture.p24.ex02;

// 파일 이름: Main.java
class Car {
    void move() { System.out.println("자동차가 움직입니다."); }
}

class Sonata extends Car {
    @Override void move() { System.out.println("소나타가 움직입니다."); }
}

class Morning extends Car {
    @Override void move() { System.out.println("모닝이 움직입니다."); }
}

class Avante extends Car {
    @Override void move() { System.out.println("아반떼가 움직입니다."); }
}

class Grandure extends Car {
    @Override void move() { System.out.println("그랜저가 움직입니다."); }
}

class Porter extends Car {
    @Override void move() { System.out.println("포터가 움직입니다."); }
}

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Sonata();
        cars[1] = new Morning();
        cars[2] = new Avante();
        cars[3] = new Grandure();
        cars[4] = new Porter();

        for (Car car : cars) {
            car.move(); // 각자 override된 move() 실행
        }
    }
}

/*
실행 결과
소나타가 움직입니다.
모닝이 움직입니다.
아반떼가 움직입니다.
그랜저가 움직입니다.
포터가 움직입니다.
*/
