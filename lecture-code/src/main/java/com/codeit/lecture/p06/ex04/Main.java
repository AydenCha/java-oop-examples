package com.codeit.lecture.p06.ex04;

// 파일 이름: Main.java
class Shape {
    public void area() { // 매개변수 없음
        System.out.println("넓이");
    }

    public void area(int r) { // int 1개
        System.out.println("원 넓이 = " + 3.14 * r * r);
    }

    public void area(int w, int h) { // int 2개
        System.out.println("직사각형 넓이 = " + w * h);
    }

    public void area(double b, double h) { // double 2개
        System.out.println("삼각형 넓이 = " + 0.5 * b * h);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.area(); // 넓이
        shape.area(5); // 원 넓이 = 78.5
        shape.area(10, 10); // 직사각형 넓이 = 100
        shape.area(6.0, 12.0); // 삼각형 넓이 = 36.0
    }
}
