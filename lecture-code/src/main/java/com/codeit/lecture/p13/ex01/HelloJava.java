package com.codeit.lecture.p13.ex01;

class Person {
    String name;
    int age;

    void learn() { System.out.println("공부를 합니다."); }
    void walk() { System.out.println("걷습니다."); }
    void eat() { System.out.println("밥을 먹습니다."); }
}

class Programmer extends Person {
    String companyName;
    void coding() { System.out.println("코딩을 합니다."); }
}

public class HelloJava {
    public static void main(String[] args) {
        Programmer pg = new Programmer();
        pg.name = "박해커";
        pg.learn();     // Person의 메서드 사용
        pg.coding();    // Programmer 고유 메서드
    }
}
