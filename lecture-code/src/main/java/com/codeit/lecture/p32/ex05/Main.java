package com.codeit.lecture.p32.ex05;

// 파일 이름: Main.java
class Provider {
    public void call() {
        System.out.println("야호~");
    }
}

class Provider2 {
    public void call() {
        System.out.println("집 가보자고!");
    }
}

class User {
    public void callProvider(Provider2 provider) {
        provider.call();
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.callProvider(new Provider2());
    }
}
