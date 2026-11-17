package com.codeit.lecture.p44.ex01;

// 파일 이름: Main.java
// 클릭했을 때 할 일의 약속
interface OnClickListener {
    void onClick();
}

// 화면의 버튼을 흉내 낸 클래스
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

        btn.setOnClickListener(new OnClickListener() {
            public void onClick() {
                System.out.println("클릭됨");
            }
        });

        btn.click(); // 클릭됨
    }
}
