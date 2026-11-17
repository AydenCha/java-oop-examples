package com.codeit.lecture.p14.ex03;

// 파일 이름: Main.java
class Logger {
    void log(String msg) {
        System.out.println("[LOG] " + msg);
    }
}

class Service {
    private Logger logger;

    public Service(Logger logger) {
        this.logger = logger;
    }

    void process() {
        logger.log("처리 시작");
    }
}

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Service service = new Service(logger);
        service.process(); // [LOG] 처리 시작

    }
}
