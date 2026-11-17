package com.codeit.lecture.p24.ex01;

// 파일 이름: FriendTest.java
class Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다.");
    }
}

class BoyFriend extends Friend {
    @Override
    public void friendInfo() { // Friend의 메서드를 오버라이딩
        System.out.println("나는 당신의 남자친구입니다.");
    }
}

class GirlFriend extends Friend {
    @Override
    public void friendInfo() {
        System.out.println("나는 당신의 여자친구입니다.");
    }
}

public class FriendTest {
    public static void main(String[] args) {
        Friend friend = new Friend(); // 변수 타입 Friend, 객체 Friend
        BoyFriend boyfriend = new BoyFriend();

        Friend girlfriend = new GirlFriend(); // 변수 타입 Friend, 객체 GirlFriend

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}
