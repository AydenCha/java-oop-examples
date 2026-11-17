package com.codeit.lecture.p45.ex05;

// 파일 이름: Main.java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println(today); // MONDAY (출력하면 숫자 대신 이름이 나옵니다)
    }
}
