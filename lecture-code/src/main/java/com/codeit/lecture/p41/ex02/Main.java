package com.codeit.lecture.p41.ex02;

// 파일 이름: Main.java
class Button {
    class ClickListener {
        void onClick() {
            System.out.println("버튼이 클릭됨");
        }
    }

    void click() {
        ClickListener listener = new ClickListener();
        listener.onClick();
    }
}

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.click(); // 버튼이 클릭됨
    }
}
