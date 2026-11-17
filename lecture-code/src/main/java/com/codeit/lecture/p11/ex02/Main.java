package com.codeit.lecture.p11.ex02;

// 파일 이름: Main.java
public class Main {
    public static void main(String[] args) {
        System.gc(); // GC 요청 (보장되진 않음)

        System.out.println("GC를 요청했습니다.");
    }
}
