package com.codeit.lecture.p46.ex03;

// 파일 이름: EnumValuesExample.java
enum Day {
    MONDAY, // 월요일
    TUESDAY, // 화요일
    WEDNESDAY, // 수요일
    THURSDAY, // 목요일
    FRIDAY, // 금요일
    SATURDAY, // 토요일
    SUNDAY // 일요일
}

public class EnumValuesExample {
    public static void main(String[] args) {
        for (Day day : Day.values()) { // 모든 Enum 상수 조회
            System.out.println(day);
        }
    }
}
