package com.codeit.lecture.p30.ex01;

// 파일 이름: Main.java
abstract class AbstractExample {
    abstract void method();

    public void method2() {
        System.out.println("완성된 메서드도 정의 가능");
    }
}

class Concrete extends AbstractExample {
    @Override
    void method() {
        System.out.println("하위 클래스에서 완성한 추상 메서드");
    }
}

public class Main {
    public static void main(String[] args) {
        Concrete concrete = new Concrete();
        concrete.method(); // 하위 클래스에서 완성한 추상 메서드
        concrete.method2(); // 완성된 메서드도 정의 가능
    }
}
