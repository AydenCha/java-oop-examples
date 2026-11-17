package com.codeit.lecture.p05.ex06;

// 파일 이름: Main.java

class Singleton {

    // 클래스 로딩 시 단 한 번 생성되는 유일한 인스턴스
    private static Singleton instance = new Singleton();

    // 외부에서 new 호출 불가
    private Singleton() {}

    // 전역 접근 지점
    // 객체 생성 없이 호출 가능
    public static Singleton getInstance() {
        return instance;
    }
}

public class Main {

    public static void main(String[] args) {

        // 사용 예
        // 항상 같은 객체를 반환
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // 참조 변수끼리 ==로 비교하면 "같은 객체를 가리키는가"를 확인합니다.
        System.out.println(s1 == s2); // true (두 변수가 같은 객체 하나를 가리킵니다)

        // 아래 줄의 주석(//)을 지우면 컴파일 에러가 납니다. 생성자가 private이라 클래스 밖에서 new를 쓸 수 없습니다.
        // Singleton s3 = new Singleton();
    }
}
