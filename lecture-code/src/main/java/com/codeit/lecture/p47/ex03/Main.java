package com.codeit.lecture.p47.ex03;

// 파일 이름: Main.java
enum Level {
    BASIC(1), // 인자 1개 → 생성자 Level(int)
    INTERMEDIATE(2, "중급 레벨"),
    ADVANCED(3, "고급 레벨");

    private final int grade;
    private final String description;

    Level(int grade) {
        this.grade = grade;
        this.description = "기본 설명 없음";
    }

    Level(int grade, String description) {
        this.grade = grade;
        this.description = description;
    }

    public int getGrade() {
        return grade;
    }

    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Level.BASIC.getGrade()); // 1
        System.out.println(Level.BASIC.getDescription()); // 기본 설명 없음
        System.out.println(Level.ADVANCED.getGrade()); // 3
        System.out.println(Level.ADVANCED.getDescription()); // 고급 레벨
    }
}
