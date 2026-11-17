package com.codeit.lecture.p05.ex04;

// 파일 이름: Main.java

class AppConfig {

    // 정적 필드
    static String version;

    // static 초기화 블록
    // 클래스 로딩 시 맨 먼저 실행됨
    static {
        version = "1.0.0";
        System.out.println("AppConfig 초기화 완료");
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("main 시작");

        System.out.println(AppConfig.version);

        System.out.println(AppConfig.version);
    }
}

/*
실행 결과
main 시작
AppConfig 초기화 완료
1.0.0
1.0.0
*/
