package com.codeit.lecture.p12.ex02;

// 파일 이름: Main.java
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s = new Student();
        list.add(s);
        System.out.println(list.size()); // 1

        list.remove(s);
        s = null;

        System.out.println(list.size()); // 0
    }
}
