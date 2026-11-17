package com.codeit.lecture.p04.ex04;

// 파일 이름: Main.java
class Test {
    void doSomething() {
        int temp = 10;
        System.out.println(temp);
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.doSomething(); // 10
    }
}
