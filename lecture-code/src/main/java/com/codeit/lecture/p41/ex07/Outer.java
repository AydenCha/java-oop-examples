package com.codeit.lecture.p41.ex07;

interface Greeting {
    void sayHello();
}

public class Outer {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };

        greeting.sayHello(); // 출력:
    }
}
