package com.codeit.lecture.p43.ex02;

// 파일 이름: Main.java
public class Main {
    void exampleMethod() {
        int value = 100; // final은 생략했지만 값이 바뀌지 않음

        class Inner {
            void print() {
                System.out.println(value); // 가능: effectively final
            }
        }

        new Inner().print();

        // value = 200; → 이 줄의 주석을 지우면 컴파일 에러가 납니다. 값이 바뀌는 순간 effectively final이 아니게 되어
    }

    public static void main(String[] args) {
        new Main().exampleMethod(); // 100
    }
}
