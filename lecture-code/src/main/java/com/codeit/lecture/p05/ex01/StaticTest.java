package com.codeit.lecture.p05.ex01;

/*
 * StaticExample 클래스
 *
 * 객체지향에서 변수는 두 수준으로 나뉩니다.
 *
 * 1) 인스턴스 수준 → 객체마다 따로 존재
 * 2) 클래스 수준(static) → 클래스에 하나만 존재, 모든 객체가 공유
 */
class StaticExample {

    // -----------------------------
    // 인스턴스 변수
    // -----------------------------
    // 객체가 생성될 때마다 새로 만들어짐
    // 각 객체가 독립적으로 가지는 상태
    int num1 = 10;

    // -----------------------------
    // 클래스 변수 (static)
    // -----------------------------
    // 클래스가 메모리에 로드될 때 단 한 번 생성
    // 모든 객체가 공유
    static int num2 = -10;
}

public class StaticTest {

    public static void main(String[] args) {

        // 객체 생성
        // new를 통해 인스턴스가 힙 메모리에 생성됨
        StaticExample staticExample = new StaticExample();

        /*
         * 인스턴스 변수 접근
         * → 객체를 통해 접근해야 한다.
         * → num1은 객체에 속한 값이기 때문
         */
        System.out.println("인스턴스 변수: " + staticExample.num1);

        /*
         * 클래스 변수 접근
         * → 객체마다 따로 있지 않고 클래스에 속한 값
         * → 클래스명.변수명 으로 접근하는 것이 바람직
         */
        System.out.println("클래스 변수: " + StaticExample.num2);
    }
}
