package com.codeit.lecture.p48.ex04;

// 파일 이름: Main.java
enum Role {
    ADMIN, // 관리자
    MANAGER, // 매니저
    USER // 일반 사용자
}

public class Main {
    public static void main(String[] args) {
        Role role = Role.MANAGER;
        System.out.println(role); // MANAGER
    }
}
