package com.codeit.lecture.p42.ex02;

class Outer {
    private int num = 3;         // 외부 클래스의 인스턴스 변수
    private static int sNum = 4; // 외부 클래스의 static 변수

    void getPrint() {
        System.out.println("인스턴스 메서드");
    }

    static void getPrintStatic() {
        System.out.println("스태틱 메서드");
    }

    static class StaticInClass {
        void test() {
            System.out.println("Outer sNum = " + sNum + "(외부 클래스의 정적 변수)");
            getPrintStatic(); // static 메서드 호출 가능
            // System.out.println(num);         → 에러 (인스턴스 멤버 접근 불가)
            // getPrint();                      → 에러 (인스턴스 메서드 접근 불가)
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.StaticInClass a = new Outer.StaticInClass(); // 외부 클래스 인스턴스 없이 사용
        a.test();
    }
}
