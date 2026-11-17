package com.codeit.lecture.p41.ex04;

public class Outer {
    private String outerField = "Outer Field";

    class Inner {
        void print() {
            System.out.println(outerField); // 외부 인스턴스 필드 접근 가능
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.print(); // 출력:
    }
}
