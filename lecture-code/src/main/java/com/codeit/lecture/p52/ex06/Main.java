package com.codeit.lecture.p52.ex06;

// 파일 이름: Main.java
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 예외가 발생해도 닫아 주므로 finally에서 직접 닫을 필요가 없습니다.
        try (FileInputStream fis = new FileInputStream("data.txt")) {
            int data = fis.read();
            System.out.println("읽은 값: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
