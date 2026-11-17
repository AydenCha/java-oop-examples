package com.codeit.lecture.p52.ex03;

// 파일 이름: Main.java
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            int data = fr.read(); // 읽다가 문제가 생기면 IOException
            System.out.println("읽은 값: " + data);
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다.");
        }
    }
}
