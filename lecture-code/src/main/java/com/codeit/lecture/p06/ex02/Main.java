package com.codeit.lecture.p06.ex02;

// 파일 이름: Main.java
class Sample {

    void printHello() {
        System.out.println("hello!");
    }

    int getNumSeven() {
        return 7;
    }

    double multiply(int x, double y) {
        double result = x * y;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();

        sample.printHello();
        System.out.println(sample.getNumSeven()); // 7
        System.out.println(sample.multiply(4, 4.0)); // 16.0
    }
}
