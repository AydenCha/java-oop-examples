package com.codeit.lecture.p52.ex05;

// 파일 이름: Main.java
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("data.txt");
            System.out.println("파일을 열었습니다.");
        } catch (IOException e) {
            System.out.println("파일을 열지 못했습니다.");
        } finally {
            if (fis != null) {
                try { fis.close(); } catch (IOException e) {}
            }
            System.out.println("finally에서 자원을 정리했습니다.");
        }
    }
}

/*
실행 결과 (data.txt 파일이 없는 폴더에서 실행한 경우)
파일을 열지 못했습니다.
finally에서 자원을 정리했습니다.
*/
