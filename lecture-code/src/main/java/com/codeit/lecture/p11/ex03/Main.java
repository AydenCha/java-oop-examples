package com.codeit.lecture.p11.ex03;

// 파일 이름: Main.java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s = null;

        System.out.println(s); // null

        // null인 변수로 필드나 메서드를 사용하면 실행 도중 오류가 납니다.
        // System.out.println(s.name);
    }
}
