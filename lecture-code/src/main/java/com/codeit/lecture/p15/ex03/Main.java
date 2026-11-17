package com.codeit.lecture.p15.ex03;

// 파일 이름: Main.java
class Animal {
    public void cry() {
        System.out.println("동물이 울음소리를 냅니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void cry() {
        System.out.println("호랑이가 울음소리를 냅니다. 어흥~~~~");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Tiger();

        animal.cry();
    }
}
