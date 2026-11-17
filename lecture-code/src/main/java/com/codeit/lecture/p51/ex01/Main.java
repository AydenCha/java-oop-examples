package com.codeit.lecture.p51.ex01;

// 파일 이름: Main.java
class Member {
    private int age;

    public void setAge(int age) {
        // 잘못된 값이 들어오면 직접 예외를 일으킵니다. throw new 예외클래스("메시지");
        if (age < 0) {
            throw new IllegalArgumentException("나이는 음수가 될 수 없습니다.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        member.setAge(20);
        System.out.println(member.getAge()); // 20

        try {
            member.setAge(-5); // 여기서 예외가 발생해 catch로 넘어갑니다.
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 값: " + e.getMessage());
        }

        System.out.println(member.getAge()); // 20 (잘못된 값은 반영되지 않았습니다)
    }
}
