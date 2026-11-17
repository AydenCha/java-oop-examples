package com.codeit.lecture.p12.ex04;

// 파일 이름: Main.java
import java.util.ArrayList;
import java.util.List;

interface ClickListener {
    void onClick();
}

class Button {
    private List<ClickListener> listeners = new ArrayList<>();

    void addClickListener(ClickListener listener) {
        listeners.add(listener);
    }

    void removeClickListener(ClickListener listener) {
        listeners.remove(listener);
    }

    int listenerCount() {
        return listeners.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        ClickListener listener = new ClickListener() {
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다.");
            }
        };

        button.addClickListener(listener);
        System.out.println(button.listenerCount()); // 1

        button.removeClickListener(listener);
        System.out.println(button.listenerCount()); // 0
    }
}
