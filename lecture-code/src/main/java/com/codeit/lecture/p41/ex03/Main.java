package com.codeit.lecture.p41.ex03;

// 파일 이름: Main.java
class Outer {
    private class HiddenHelper {
        void help() {
            System.out.println("숨겨진 내부 로직 수행");
        }
    }

    public void run() {
        HiddenHelper helper = new HiddenHelper();
        helper.help();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.run(); // 숨겨진 내부 로직 수행

        // 아래 줄의 주석(//)을 지우면 컴파일 에러가 납니다. HiddenHelper는 private이라 밖에서 쓸 수 없습니다.
        // Outer.HiddenHelper helper = outer.new HiddenHelper();
    }
}
