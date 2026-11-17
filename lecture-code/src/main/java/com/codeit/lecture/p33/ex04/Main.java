package com.codeit.lecture.p33.ex04;

// 파일 이름: Main.java
abstract class Employee {
    String name;
    int employeeId;
}

interface Coder {
    void writeCode();
}

class Developer extends Employee implements Coder {
    public void writeCode() {
        System.out.println("코드를 작성합니다.");
    }
}

class Admin extends Employee {
}

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.writeCode();

        Admin admin = new Admin();
        // admin.writeCode(); // 컴파일 에러: Admin에는 writeCode()가 없습니다.

        System.out.println(developer instanceof Coder); // true
        System.out.println(admin instanceof Coder); // false
    }
}
