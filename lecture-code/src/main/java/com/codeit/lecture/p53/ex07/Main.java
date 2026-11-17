package com.codeit.lecture.p53.ex07;

// 파일 이름: Main.java
public class Main {
    public static void main(String[] args) {
        throw new IllegalArgumentException("오류 발생");
    }
}

/*
실행 결과 (오류 메시지입니다. 이 메시지만 보고는 원인을 알 수 없다는 것을 확인합니다)
Exception in thread "main" java.lang.IllegalArgumentException: 오류 발생
	at Main.main(Main.java:5)
*/
