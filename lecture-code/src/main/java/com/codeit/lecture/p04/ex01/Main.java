package com.codeit.lecture.p04.ex01;

// 파일 이름: Main.java
class Example {
    int instanceVariable;
    static int classVariable;

    void method() {
        int localVariable = 0;
        System.out.println("지역 변수: " + localVariable);
    }
}

public class Main {
    public static void main(String[] args) {
        Example example = new Example();

        System.out.println("인스턴스 변수: " + example.instanceVariable); // 인스턴스 변수: 0 (객체를 통해 접근)
        System.out.println("클래스 변수: " + Example.classVariable); // 클래스 변수: 0 (클래스 이름으로 접근)
        example.method(); // 지역 변수: 0
    }
}
