package com.codeit.lecture.p03.ex01;

/*
 * Person 클래스
 *
 * 객체지향 관점:
 * - "사람"이라는 개념을 객체로 표현
 * - 객체는 상태(State)와 행동(Behavior)을 함께 가진다
 */
class Person {

    // 상태(State)
    // 이 객체가 가지고 있는 데이터
    String name;

    // 행동(Behavior)
    // 객체가 할 수 있는 일
    void sayHello() {

        // 자신의 상태(name)를 사용하여 동작 수행
        // 즉, 행동은 내부 상태를 기반으로 한다
        System.out.println(name + "님, 안녕하세요!");
    }
}

public class Main {

    public static void main(String[] args) {

        // 1. 객체 생성
        // new 키워드는 힙 메모리에 Person 객체를 생성한다
        // p 변수에는 객체 자체 대신 "객체의 참조값"이 저장된다
        Person p = new Person();

        // 2. 객체의 상태 변경
        // p가 가리키는 객체의 name 값을 설정
        // → 객체의 내부 상태를 바꾸는 행위
        p.name = "영수";

        // 3. 객체에게 메시지 전달
        // p 객체에게 "sayHello" 메시지를 보낸다
        // 객체지향에서 메서드 호출은 메시지 전달이다
        p.sayHello();
    }
}
