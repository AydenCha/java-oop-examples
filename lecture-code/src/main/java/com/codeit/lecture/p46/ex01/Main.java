package com.codeit.lecture.p46.ex01;

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
        Day today = Day.SUNDAY;
        System.out.println(today); // SUNDAY
    }
}
