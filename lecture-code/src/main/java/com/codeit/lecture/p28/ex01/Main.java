package com.codeit.lecture.p28.ex01;

// 파일 이름: Main.java
abstract class Shape {
    int x, y; // 도형의 위치
}

class Circle extends Shape {
    int radius; // 원만 가지는 속성
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10; // Shape에게서 물려받은 필드
        circle.y = 20;
        circle.radius = 5; // Circle의 필드

        System.out.println("위치: (" + circle.x + ", " + circle.y + "), 반지름: " + circle.radius);
        // 위치: (10, 20), 반지름: 5
    }
}
