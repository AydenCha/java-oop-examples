package com.codeit.lecture.p55.ex01;

// 파일 이름: Main.java
class User {
    String name;
    User(String name) { this.name = name; }
}

class OrderService {
    public void createOrder(User user) {
        // user 객체를 잠깐 사용
        System.out.println(user.name + "님의 주문을 만들었습니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        new OrderService().createOrder(new User("김코딩"));
    }
}
