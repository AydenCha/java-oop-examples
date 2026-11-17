package com.codeit.lecture.p22.ex02;

// 파일 이름: Main.java
import java.util.ArrayList;
import java.util.List;

final class Team {
    private final List<String> members;

    public Team(List<String> members) {
        this.members = new ArrayList<>(members);
    }

    public List<String> getMembers() {
        return new ArrayList<>(members);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("영수");
        names.add("민지");

        Team team = new Team(names);

        names.add("철수");
        System.out.println(team.getMembers()); // [영수, 민지] (Team은 영향을 받지 않습니다)

        team.getMembers().add("영희");
        System.out.println(team.getMembers());
    }
}
