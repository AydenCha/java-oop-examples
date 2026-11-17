package com.codeit.lecture.p07.ex01;

public class ConstructorExample {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("Hello World");
        Constructor c3 = new Constructor(5, 10);
    }
}

class Constructor {
    Constructor() {
        System.out.println("1번 생성자");
    }

    Constructor(String str) {
        System.out.println("2번 생성자");
    }

    Constructor(int a, int b) {
        System.out.println("3번 생성자");
    }
}
