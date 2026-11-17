package com.codeit.lecture.p05.ex02;

/*
 * ================================
 * 2-2. static 필드의 값 공유
 * ================================
 *
 * 핵심 맥락:
 * - 인스턴스 변수는 객체마다 따로 존재한다.
 * - static 변수는 클래스에 하나만 존재하며 모든 객체가 공유한다.
 */

class StaticField {

    // 인스턴스 변수
    // 객체가 생성될 때마다 힙 영역에 각각 생성됨
    // 객체 고유의 상태를 표현
    int num1 = 10;

    // static 변수 (정적 필드)
    // 클래스가 메모리에 로드될 때 클래스 영역에 단 한 번 생성됨
    // 모든 인스턴스가 하나의 값을 공유
    static int num2 = 15;
}

public class StaticFieldTest {

    public static void main(String[] args) {

        // 객체 두 개 생성
        StaticField a = new StaticField();
        StaticField b = new StaticField();

        // -----------------------------
        // 인스턴스 변수는 객체마다 독립적
        // -----------------------------
        a.num1 = 100;
        b.num1 = 200;

        // 서로 다른 객체이므로 값이 다르게 유지됨
        System.out.println(a.num1); //
        System.out.println(b.num1); //

        // -----------------------------
        // static 변수는 모든 객체가 공유
        // -----------------------------
        a.num2 = 300;  // 클래스 변수 값 변경
        b.num2 = 400;  // 같은 클래스 변수 값 다시 변경

        // num2는 하나뿐이므로 마지막에 대입된 값으로 통일됨
        System.out.println(a.num2); //
        System.out.println(b.num2); //
    }
}
