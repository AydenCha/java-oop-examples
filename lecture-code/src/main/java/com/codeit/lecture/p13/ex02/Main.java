package com.codeit.lecture.p13.ex02;

// 파일 이름: Main.java
class A { void a() { System.out.println("A의 메서드"); } }
class B extends A {}
class C extends B {}
class D extends C {}

public class Main {
    public static void main(String[] args) {
        D d = new D();
        d.a();

    }
}
