package com.codeit.lecture.p52.ex04;

// 파일 이름: Main.java
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt"); // 파일이 없으면 예외 발생
            System.out.println("파일을 열었습니다.");
        } catch (IOException e) {
            System.out.println("IOException 발생");
        } finally {
            // finally 블록은 예외가 발생해도, 발생하지 않아도 마지막에 반드시 실행됩니다.
            System.out.println("항상 실행됩니다!");
        }
    }
}

/*
실행 결과 (data.txt 파일이 없는 폴더에서 실행한 경우)
IOException 발생
항상 실행됩니다!
*/
