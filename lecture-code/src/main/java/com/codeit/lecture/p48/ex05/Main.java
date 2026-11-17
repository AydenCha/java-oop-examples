package com.codeit.lecture.p48.ex05;

// 파일 이름: Main.java
enum Role {
    ADMIN, // 관리자
    MANAGER, // 매니저
    USER // 일반 사용자
}

public class Main {
    public static void authorize(Role role) {
        switch (role) {
            case ADMIN:
                System.out.println("모든 기능 접근 허용");
                break;
            case MANAGER:
                System.out.println("일부 관리자 기능 접근 허용");
                break;
            case USER:
                System.out.println("일반 사용자 기능만 접근 허용");
                break;
        }
    }

    public static void main(String[] args) {
        authorize(Role.ADMIN); // 모든 기능 접근 허용
        authorize(Role.MANAGER); // 일부 관리자 기능 접근 허용
        authorize(Role.USER); // 일반 사용자 기능만 접근 허용
    }
}
