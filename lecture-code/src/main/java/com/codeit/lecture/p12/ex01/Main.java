package com.codeit.lecture.p12.ex01;

// 파일 이름: Main.java
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(); // Student 객체를 담는 상자

        Student s = new Student();
        list.add(s);
        s = null; // 변수 s는 더 이상 객체를 가리키지 않지만,

        System.out.println(list.size()); // 1 (객체는 상자 안에 그대로 남아 있습니다)
    }
}
