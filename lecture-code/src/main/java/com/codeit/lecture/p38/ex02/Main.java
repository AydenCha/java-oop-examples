package com.codeit.lecture.p38.ex02;

// 파일 이름: Main.java
interface Repository {
    void save(); // 저장소는 save 할 수 있음
    void delete(); // 저장소는 delete 할 수 있음
    void sendEmail();
}

class MemberRepository implements Repository {
    public void save() { System.out.println("회원을 저장합니다."); }
    public void delete() { System.out.println("회원을 삭제합니다."); }
    public void sendEmail() { System.out.println("(저장소가 할 일이 아니지만 어쩔 수 없이 구현했습니다)"); }
}

public class Main {
    public static void main(String[] args) {
        Repository repository = new MemberRepository();
        repository.save();
        repository.delete();
        repository.sendEmail();
    }
}
