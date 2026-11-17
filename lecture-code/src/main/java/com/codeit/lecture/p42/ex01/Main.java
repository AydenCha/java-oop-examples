package com.codeit.lecture.p42.ex01;

class Outer {
    private int num = 1;         // 외부 클래스의 인스턴스 변수
    private static int sNum = 2; // 외부 클래스의 static 변수

    private InClass inClass;     // 내부 클래스 자료형 변수 선언

    public Outer() {
        inClass = new InClass(); // 외부 클래스 생성자에서 내부 클래스 초기화
    }

    class InClass {
        int inNum = 10; // 내부 클래스의 인스턴스 변수

        void test() {
            System.out.println("Outer num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("Outer sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }
    }

    public void testClass() {
        inClass.test();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("외부 클래스를 통해 내부 클래스 메서드 호출");
        outer.testClass();
    }
}
