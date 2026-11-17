package com.codeit.lecture.p05.ex03;

// 파일 이름: Main.java

class MathUtil {

    // 정적 메서드
    // 클래스 로딩 시 메서드 영역에 준비됨
    // 객체 생성 없이 사용 가능
    static int square(int x) {
        return x * x;
    }
}

public class Main {

    public static void main(String[] args) {

        // 객체 생성 없이 호출
        // 클래스명.메서드명 으로 접근
        int result = MathUtil.square(5); // 객체 생성 없이 호출 가능
        System.out.println(result); // 25

        System.out.println(Math.sqrt(16)); // 4.0 (제곱근)
        System.out.println(Integer.parseInt("123")); // 123 (문자열을 int로 변환)
    }
}
