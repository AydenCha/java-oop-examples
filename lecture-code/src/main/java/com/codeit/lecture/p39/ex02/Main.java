package com.codeit.lecture.p39.ex02;

// 파일 이름: Main.java
// 추상화: "기록한다"는 약속
interface Logger {

    void log(String msg);
}

class FileLogger implements Logger {

    public void log(String msg) {
        System.out.println("[파일 기록] " + msg);
    }
}

class OrderService {

    private Logger logger;

    public OrderService(Logger logger) {
        this.logger = logger;
    }

    void processOrder() {
        logger.log("주문 처리");
    }
}

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new FileLogger());
        orderService.processOrder(); // [파일 기록] 주문 처리
    }
}
