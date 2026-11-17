package com.codeit.lecture.p14.ex02;

// 파일 이름: Main.java
class Logger {
    void log(String msg) {
        System.out.println("[LOG] " + msg);
    }
}

class Service extends Logger {
    void process() {
        log("처리 시작"); // 물려받은 log()를 사용
    }
}

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.process(); // [LOG] 처리 시작

        service.log("밖에서 직접 호출"); // [LOG] 밖에서 직접 호출
    }
}
