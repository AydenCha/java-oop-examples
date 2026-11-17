package com.codeit.lecture.p37.ex03;

// 파일 이름: Main.java
class Service {
    String getStatus() { return "OK"; }
}

class FailingService extends Service {
    @Override
    String getStatus() { return null; }
}

public class Main {
    static void printStatusLength(Service service) {
        String status = service.getStatus();
        if (status == null) {
            System.out.println("상태가 null입니다. 그대로 status.length()를 호출했다면 NullPointerException이 발생합니다.");
            return;
        }
        System.out.println("상태 글자 수: " + status.length());
    }

    public static void main(String[] args) {
        printStatusLength(new Service()); // 상태 글자 수: 2
        printStatusLength(new FailingService());
    }
}
