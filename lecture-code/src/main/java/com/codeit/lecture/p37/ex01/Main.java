package com.codeit.lecture.p37.ex01;

// 파일 이름: Main.java
class Bird {

    void fly() { System.out.println("날아간다"); }
}

class Ostrich extends Bird {

    @Override
    void fly() { throw new UnsupportedOperationException(); }
}

public class Main {
    static void letItFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        letItFly(new Bird());
        letItFly(new Ostrich());
    }
}

/*
실행 결과 (둘째 줄부터는 오류 메시지입니다. 프로그램이 오류로 끝나는 것이 이 예제가 보여 주려는 문제입니다)
날아간다
Exception in thread "main" java.lang.UnsupportedOperationException
*/
