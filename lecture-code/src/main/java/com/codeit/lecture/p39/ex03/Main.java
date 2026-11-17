package com.codeit.lecture.p39.ex03;

// 파일 이름: Main.java
interface Logger {
    void log(String msg);
}

class FileLogger implements Logger {
    public void log(String msg) {
        System.out.println("[파일 기록] " + msg);
    }
}

class DBLogger implements Logger {
    public void log(String msg) {
        System.out.println("[DB 기록] " + msg);
    }
}

class OrderService {
    private final Logger logger;

    public OrderService(Logger logger) {
        this.logger = logger;
    }

    void processOrder() {
        logger.log("주문 처리");
    }
}

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        OrderService orderService = new OrderService(logger);
        orderService.processOrder(); // [파일 기록] 주문 처리

        OrderService another = new OrderService(new DBLogger());
        another.processOrder(); // [DB 기록] 주문 처리
    }
}
