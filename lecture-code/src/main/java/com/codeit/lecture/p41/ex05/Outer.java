package com.codeit.lecture.p41.ex05;

public class Outer {
    private static String staticField = "Static Field";

    static class StaticInner {
        void print() {
            System.out.println(staticField); // 외부 static 필드 접근 가능
        }
    }

    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();
        inner.print(); // 출력:
    }
}
