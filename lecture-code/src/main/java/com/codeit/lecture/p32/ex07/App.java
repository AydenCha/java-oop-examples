package com.codeit.lecture.p32.ex07;

// 파일 이름: App.java
// 역할: "메시지를 보낸다"는 기능의 약속
interface MessageSender {
    void send();
}

class EmailSender implements MessageSender {
    public void send() {
        System.out.println("이메일 전송");
    }
}

class SmsSender implements MessageSender {
    public void send() {
        System.out.println("SMS 전송");
    }
}

class NotificationService {
    public void notify(MessageSender sender) {
        sender.send();
    }
}

public class App {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.notify(new EmailSender()); // 이메일 전송
        service.notify(new SmsSender()); // SMS 전송
    }
}

/*
출력
이메일 전송
SMS 전송
*/
