package com.codeit.solid.dip.before;

class FileLogger {

    void log(String msg) {
        // 파일에 기록
    }
}

class OrderService {

    private FileLogger logger = new FileLogger(); // 구체 클래스에 직접 의존

    void processOrder() {
        logger.log("주문 처리");
    }
}
