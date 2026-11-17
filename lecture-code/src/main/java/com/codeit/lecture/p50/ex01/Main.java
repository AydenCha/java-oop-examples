package com.codeit.lecture.p50.ex01;

// 파일 이름: Main.java
public class Main {
    public static void main(String[] args) {
        String text = null;

        System.out.println(text.length());

        System.out.println("이 줄은 실행되지 않습니다.");
    }
}

/*
실행 결과 (오류 메시지입니다. 프로그램이 오류로 끝나는 것이 이 예제가 보여 주려는 내용입니다)
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
	at Main.main(Main.java:8)
*/
