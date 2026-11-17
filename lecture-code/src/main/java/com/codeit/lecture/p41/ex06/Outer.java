package com.codeit.lecture.p41.ex06;

public class Outer {
    void method() {
        final String localVar = "Local Variable";

        class LocalInner {
            void print() {
                System.out.println(localVar); // effectively final 변수만 접근 가능
            }
        }

        LocalInner inner = new LocalInner();
        inner.print(); // 출력:
    }

    public static void main(String[] args) {
        new Outer().method();
    }
}
