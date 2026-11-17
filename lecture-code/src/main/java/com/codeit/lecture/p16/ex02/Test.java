package com.codeit.lecture.p16.ex02;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Human {
    Human() {
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human {
    Student() {
        super(); // 생략 가능, 자동 삽입됨
        System.out.println("학생 클래스 생성자");
    }
}
