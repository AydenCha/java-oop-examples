package com.codeit.solid.dip.after;

interface Logger {

    void log(String msg);
}

class FileLogger implements Logger {

    public void log(String msg) {
        System.out.println("파일에 로그 기록: " + msg);
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
