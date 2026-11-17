package com.codeit.lecture.p32.ex06;

// 파일 이름: Interface4.java
interface Cover {
    void call();
}

class Provider implements Cover {
    public void call() {
        System.out.println("무야호~");
    }
}

class Provider2 implements Cover {
    public void call() {
        System.out.println("야호~");
    }
}

class User {
    public void callProvider(Cover cover) {
        cover.call();
    }
}

public class Interface4 {
    public static void main(String[] args) {
        User user = new User();
        user.callProvider(new Provider2()); // 야호~

        user.callProvider(new Provider()); // 무야호~
    }
}
