package com.codeit.lecture.p38.ex03;

// 파일 이름: Main.java
interface Saveable {
    void save();
}

interface Deletable {
    void delete();
}

class MemberRepository implements Saveable, Deletable {
    public void save() { System.out.println("회원을 저장합니다."); }
    public void delete() { System.out.println("회원을 삭제합니다."); }
}

class LogRepository implements Saveable {
    public void save() { System.out.println("기록을 저장합니다."); }
}

public class Main {
    public static void main(String[] args) {
        MemberRepository members = new MemberRepository();
        members.save();
        members.delete();

        LogRepository logs = new LogRepository();
        logs.save();
    }
}
