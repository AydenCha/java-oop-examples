package com.codeit.lecture.p05.ex05;

// 파일 이름: Main.java

import static java.lang.Math.*;

class Demo {

    void show() {

        // 원래는 Math.sqrt(16)
        // static import로 클래스명 생략 가능
        System.out.println(sqrt(16)); // Math.sqrt() 생략 가능
    }
}

public class Main {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show(); // 4.0
    }
}
