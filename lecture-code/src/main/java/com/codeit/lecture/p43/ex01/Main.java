package com.codeit.lecture.p43.ex01;

class Outer {
    int num = 5; // 외부 클래스의 인스턴스 변수

    void test() {
        int num2 = 6; // 지역 변수

        class LocalInClass {
            void getPrint() {
                System.out.println(num);   // 외부 클래스 인스턴스 변수 접근
                System.out.println(num2);  // 지역 변수 접근 (final 또는 effectively final이어야 함)
            }
        }

        LocalInClass localInClass = new LocalInClass(); // 지역 내부 클래스 객체 생성
        localInClass.getPrint();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test(); // 지역 내부 클래스 실행
    }
}
