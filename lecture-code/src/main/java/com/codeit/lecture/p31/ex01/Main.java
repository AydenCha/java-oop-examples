package com.codeit.lecture.p31.ex01;

// 파일 이름: Main.java
final class FinalClass {
    final int x = 100; // final 필드: 값 변경 불가

    final int getValue() { // final 메서드: 오버라이딩 불가
        final int localVar = x; // final 지역 변수: 지역 상수
        return localVar;
    }
}

// 아래 주석을 지우면 컴파일 에러가 납니다. FinalClass는 final이라 상속할 수 없습니다.
// class SubClass extends FinalClass {
// }

public class Main {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        System.out.println(finalClass.getValue()); // 100

        // 아래 줄의 주석(//)을 지우면 컴파일 에러가 납니다.
        // finalClass.x = 200;
    }
}
