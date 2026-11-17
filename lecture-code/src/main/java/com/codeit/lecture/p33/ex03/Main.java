package com.codeit.lecture.p33.ex03;

// 파일 이름: Main.java
abstract class Employee {
    String name;
    int employeeId;

    abstract void writeCode();
}

class Admin extends Employee {
    @Override
    void writeCode() {
        throw new UnsupportedOperationException("관리자는 코드를 작성하지 않음");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee admin = new Admin();
        System.out.println("관리자에게 코드 작성을 시킵니다.");

        admin.writeCode();

        System.out.println("이 줄은 실행되지 않습니다.");
    }
}

/*
실행 결과 (두 번째 줄부터는 오류 메시지입니다. 프로그램이 오류로 끝나는 것이 이 예제가 보여 주려는 문제입니다)
관리자에게 코드 작성을 시킵니다.
Exception in thread "main" java.lang.UnsupportedOperationException: 관리자는 코드를 작성하지 않음
*/
