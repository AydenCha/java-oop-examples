package com.codeit.lecture.p03.ex04;

/*
 * CarTest 클래스
 *
 * 프로그램 실행 시작점(main 메서드 포함)
 *
 * 여기서 우리는:
 * 1. Car 객체를 생성하고
 * 2. 객체의 상태를 확인하고
 * 3. 객체의 행동을 호출한다
 */
public class CarTest {

    public static void main(String[] args) {

        // 1. 객체 생성
        // new Car(...) → 힙 메모리에 Car 객체 생성
        // tesla 변수에는 객체의 참조값이 저장됨
        Car tesla = new Car("Model 3", "빨강");

        // 2. 객체의 상태 접근
        // model, color는 객체가 가진 상태(State)
        System.out.println(
                "내 차의 모델은 "
                        + tesla.model
                        + "이고 색은 "
                        + tesla.color
                        + "입니다."
        );

        // 3. 객체의 행동 호출
        // 메서드 호출은 객체에게 메시지를 보내는 것
        tesla.power();       // 시동 걸기
        tesla.accelerate();  // 가속하기
        tesla.stop();        // 정지하기
    }
}

/*
 * Car 클래스
 *
 * 객체지향 관점:
 * - "자동차"라는 개념을 객체로 표현
 * - 자동차는 상태와 행동을 함께 가진다
 */
class Car {

    // 상태(State)
    // 자동차가 가지고 있는 데이터
    public String model;
    public String color;

    // 생성자
    // 객체 생성 시 초기 상태 설정
    // this는 현재 객체 자신을 의미
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 행동(Behavior)
    // 자동차가 할 수 있는 동작들

    void power() {
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("더 빠르게!");
    }

    void stop(){
        System.out.println("멈춰!!");
    }
}
