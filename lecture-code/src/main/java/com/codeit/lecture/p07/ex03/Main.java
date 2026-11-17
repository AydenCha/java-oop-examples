package com.codeit.lecture.p07.ex03;

// 파일 이름: Main.java
class DefaultConst {
    // (여기서는 어떤 모양인지 보이려고 직접 적었습니다)
    DefaultConst() {}
}

class NoConstructor {
    // 생성자를 적지 않은 클래스
}

public class Main {
    public static void main(String[] args) {
        DefaultConst a = new DefaultConst();
        NoConstructor b = new NoConstructor();
        System.out.println("객체 두 개를 만들었습니다.");
    }
}
