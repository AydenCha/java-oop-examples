package com.codeit.lecture.p17.ex01;

// 파일 이름: Main.java
class ParentEx {
}

class ChildEx extends ParentEx {
}

public class Main {
    public static void main(String[] args) {
        ChildEx child = new ChildEx();

        System.out.println(child.toString());
        System.out.println(child.equals(child)); // true (자기 자신과 비교)
        System.out.println(child instanceof Object);
    }
}
