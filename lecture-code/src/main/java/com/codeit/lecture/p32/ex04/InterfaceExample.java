package com.codeit.lecture.p32.ex04;

// 파일 이름: InterfaceExample.java
public class InterfaceExample {
    public static void main(String[] args) {
        User user = new User();
        user.callProvider(new Provider()); // 야호~
    }
}

class User {
    public void callProvider(Provider provider) {
        provider.call();
    }
}

class Provider {
    public void call() {
        System.out.println("야호~");
    }
}

// user.callProvider(new Provider2())는 컴파일 에러가 납니다. User의 코드를 고쳐야만 쓸 수 있습니다.
class Provider2 {
    public void call() {
        System.out.println("집 가보자고!");
    }
}
