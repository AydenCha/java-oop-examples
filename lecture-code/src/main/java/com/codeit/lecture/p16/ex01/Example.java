package com.codeit.lecture.p16.ex01;

public class Example {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.callNum();
    }
}

class SuperClass {
    int count = 20; // super.count
}

class SubClass extends SuperClass {
    int count = 15; // this.count

    void callNum() {
        System.out.println("count = " + count);           //
        System.out.println("this.count = " + this.count); //
        System.out.println("super.count = " + super.count); //
    }
}
