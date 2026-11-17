package com.codeit.lecture.p13.ex04;

// 파일 이름: Main.java
class Animal {
    Animal(String name) {
        System.out.println(name + "이(가) 태어났습니다.");
    }
}

class Dog extends Animal {
    Dog() {
        super("강아지"); // 상위 클래스 생성자 호출
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
