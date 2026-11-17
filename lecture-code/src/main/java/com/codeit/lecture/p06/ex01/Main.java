package com.codeit.lecture.p06.ex01;

// 파일 이름: Main.java
public class Main {

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {
        int sum = add(3, 4);
        System.out.println(sum); // 7
    }
}
