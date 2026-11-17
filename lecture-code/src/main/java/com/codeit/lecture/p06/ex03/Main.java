package com.codeit.lecture.p06.ex03;

// 파일 이름: Main.java
public class Main {

    static void printHello() {
        System.out.println("hello!");
    }

    static int getNumSeven() {
        return 7;
    }

    static double multiply(int x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        printHello();
        getNumSeven();
        multiply(4, 4.0); // 반환: 16.0

        int seven = getNumSeven();
        System.out.println(seven); // 7
        System.out.println(multiply(4, 4.0)); // 16.0
    }
}
