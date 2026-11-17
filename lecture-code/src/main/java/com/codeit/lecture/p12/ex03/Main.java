package com.codeit.lecture.p12.ex03;

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

    void click() {
        for (ClickListener listener : listeners) {
            listener.onClick();
        }
    }

    int listenerCount() {
        return listeners.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.addClickListener(new ClickListener() {
            public void onClick() {
                // DO SOMETHING
                System.out.println("버튼이 클릭되었습니다.");
            }
        });

        button.click();

        System.out.println(button.listenerCount()); // 1
    }
}
