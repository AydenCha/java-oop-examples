package com.codeit.lecture.p32.ex01;

// 파일 이름: Main.java
interface InterfaceEx {
    int ROCK = 1; // public static final 생략 가능
    int SCISSORS = 2;
    int PAPER = 3;

    String getPlayingNum(); // public abstract 생략 가능
    void call();
}

class Player implements InterfaceEx {
    public String getPlayingNum() {
        return "가위: " + SCISSORS;
    }

    public void call() {
        System.out.println("called!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(InterfaceEx.ROCK); // 1

        InterfaceEx player = new Player();
        System.out.println(player.getPlayingNum()); // 가위: 2
        player.call();
    }
}
