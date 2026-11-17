package com.codeit.lecture.p46.ex06;

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
    public static void main(String[] args) {
        System.out.println(Day.MONDAY.ordinal()); // 0
        System.out.println(Day.FRIDAY.ordinal()); // 4

    }
}
