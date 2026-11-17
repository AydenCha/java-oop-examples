package com.codeit.lecture.p04.ex03;

// 파일 이름: Main.java
class Counter {

    // 인스턴스 변수
    // 각 객체마다 별도로 존재
    // 객체가 생성될 때마다 새로 만들어짐
    int count = 0;

    // 클래스 변수 (static 변수)
    // Counter 클래스에 단 하나만 존재
    // 모든 객체가 공유
    static int totalCount = 0;

    void increment() {
        count++; // "이 객체"의 count 증가
        totalCount++; // "모든 객체가 공유하는 값" 증가
    }
}

public class Main {

    public static void main(String[] args) {

        // 객체 생성
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        // 각 객체에서 increment 호출
        c1.increment();
        c2.increment();

        // c1의 count는 c1 객체의 것만 증가
        System.out.println(c1.count); // 1

        // c2의 count는 c2 객체의 것만 증가
        System.out.println(c2.count); // 1

        // totalCount는 모든 객체가 공유하므로
        // c1, c2 호출이 모두 누적됨
        System.out.println(Counter.totalCount); // 2
    }
}
