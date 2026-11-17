package com.codeit.lecture.p19.ex01;

public class Parent {
    private int a = 1;
    int b = 2;            // default
    protected int c = 3;
    public int d = 4;

    public void printAll() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        // System.out.println(p.a); // 에러 발생: private 접근 불가
        System.out.println(p.b);    // default: 같은 패키지 접근 가능
        System.out.println(p.c);    // protected: 같은 패키지 접근 가능
        System.out.println(p.d);    // public: 어디서든 접근 가능
    }
}
