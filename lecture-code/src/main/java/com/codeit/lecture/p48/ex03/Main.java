package com.codeit.lecture.p48.ex03;

// 파일 이름: Main.java
enum Day {
    MONDAY, // 월요일
    TUESDAY, // 화요일
    WEDNESDAY, // 수요일
    THURSDAY, // 목요일
    FRIDAY, // 금요일
    SATURDAY, // 토요일
    SUNDAY // 일요일
}

public class Main {
    public static void printDayType(Day day) {
        switch (day) { // day는 반드시 Day 타입
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다.");
                break;
            default: // 나머지 요일
                System.out.println("평일입니다.");
        }
    }

    public static void main(String[] args) {
        printDayType(Day.SATURDAY);
        printDayType(Day.MONDAY);
        // printDayType(Day.SUNDAAY); // 컴파일 에러: 없는 상수
    }
}
