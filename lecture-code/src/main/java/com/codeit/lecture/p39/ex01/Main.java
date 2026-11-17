package com.codeit.lecture.p39.ex01;

// 파일 이름: Main.java
// 저수준 모듈: 세부 구현(파일에 기록)
class FileLogger {
    void log(String msg) {
        // 파일에 기록
        System.out.println("[파일 기록] " + msg);
    }
}

class OrderService {
    private FileLogger logger = new FileLogger();

    void processOrder() {
        logger.log("주문 처리");
    }
}

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrder(); // [파일 기록] 주문 처리
    }
}
