package com.codeit.lecture.p44.ex02;

// 파일 이름: Main.java
interface OnClickListener {
    void onClick();
}

class Button {
    private OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void click() {
        listener.onClick();
    }
}

public class Main {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(() -> System.out.println("클릭됨"));

        btn.click(); // 클릭됨
    }
}
