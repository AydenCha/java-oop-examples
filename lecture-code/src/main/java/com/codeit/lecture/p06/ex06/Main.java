package com.codeit.lecture.p06.ex06;

// 파일 이름: Main.java
class Logger {
    void log(String... messages) {
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("시작합니다."); // 인자 1개
        logger.log("DB 연결", "쿼리 실행", "연결 종료");
    }
}

/*
실행 결과
시작합니다.
DB 연결
쿼리 실행
연결 종료
*/
