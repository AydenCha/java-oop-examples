package com.codeit.lecture.p46.ex02;

// 파일 이름: EnumBasicExample.java
enum Day {
    MONDAY, // 월요일
    TUESDAY, // 화요일
    WEDNESDAY, // 수요일
    THURSDAY, // 목요일
    FRIDAY, // 금요일
    SATURDAY, // 토요일
    SUNDAY // 일요일
}

public class EnumBasicExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY; // Enum 타입 변수 선언

        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());
    }
}
