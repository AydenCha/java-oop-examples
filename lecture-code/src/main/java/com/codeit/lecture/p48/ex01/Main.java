package com.codeit.lecture.p48.ex01;

// 파일 이름: Main.java
public class Main {
    public static void printDayType(String day) {
        if (day.equals("SATURDAY") || day.equals("SUNDAY")) {
            System.out.println("주말입니다.");
        } else {
            System.out.println("평일입니다.");
        }
    }

    public static void main(String[] args) {
        printDayType("SATURDAY");
        printDayType("MONDAY");

        printDayType("sunday"); // 평일입니다. (일요일인데 틀린 결과)
        printDayType("SUNDAAY"); // 평일입니다. (오타인데 틀린 결과)
    }
}
