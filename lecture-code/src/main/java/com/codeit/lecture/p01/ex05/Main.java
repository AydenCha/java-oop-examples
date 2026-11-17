package com.codeit.lecture.p01.ex05;

// 파일 이름: Main.java
public class Main {
    public static void main(String[] args) {
        String user = "alice"; // 주문한 사람
        String item = "book"; // 상품
        int price = 15000; // 가격
        String paymentType = "card"; // 결제 수단

        System.out.println(user + "님이 " + item + "을(를) " + price + "원에 " + paymentType + " 결제 요청하셨습니다.");
    }
}
