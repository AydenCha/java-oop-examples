package com.codeit.lecture.p13.ex03;

// 파일 이름: Main.java
class Person {
    void introduce() { System.out.println("저는 사람입니다."); }
}

class Programmer extends Person {
    @Override
    void introduce() { System.out.println("저는 프로그래머입니다."); }
}

class Dancer extends Person {
    @Override
    void introduce() { System.out.println("저는 댄서입니다."); }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Programmer();
        Person p2 = new Dancer();

        p1.introduce();
        p2.introduce();
    }
}
