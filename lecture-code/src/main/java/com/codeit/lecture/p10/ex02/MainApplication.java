package com.codeit.lecture.p10.ex02;

// 파일 이름: MainApplication.java
class Student {
    String name;
    int age;
}

public class MainApplication {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "민지";
        s.age = 20;

        System.out.println(s.name + ", " + s.age + "세"); // 민지, 20세
    }
}
