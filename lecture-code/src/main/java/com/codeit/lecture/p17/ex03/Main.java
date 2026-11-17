package com.codeit.lecture.p17.ex03;

// 파일 이름: Main.java
public class Main {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2); // false (주소 비교)

        System.out.println(s1.equals(s2)); // true  (내용 비교)
    }
}
