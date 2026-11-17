package com.codeit.lecture.p49.ex05;

// 파일 이름: Main.java
enum ErrorCode {
    INVALID_PARAMETER(400, "잘못된 요청입니다."),
    UNAUTHORIZED(401, "인증이 필요합니다."),
    NOT_FOUND(404, "데이터를 찾을 수 없습니다."),
    SERVER_ERROR(500, "서버 오류입니다.");

    private final int status;
    private final String message;

    ErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() { return status; }
    public String getMessage() { return message; }
}

public class Main {
    public static void main(String[] args) {
        ErrorCode error = ErrorCode.NOT_FOUND;

        System.out.println(error.getStatus() + " " + error.getMessage());
    }
}
