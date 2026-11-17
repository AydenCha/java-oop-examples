package com.codeit.lecture.p53.ex02;

// 파일 이름: Main.java
class User {
    private Long id;
    private String name;

    User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    Long getId() { return id; }
    String getName() { return name; }
}

class UserRepository {
    User findById(Long id) {
        if (id == 1L) {
            return new User(1L, "김코딩");
        }
        return null;
    }
}

class UserService {
    private UserRepository repository = new UserRepository();

    public User findUserById(Long id) {
        if (id == null) return null;
        User user = repository.findById(id);
        return user;
    }
}

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        User user = service.findUserById(99L);
        System.out.println("조회는 문제없이 끝난 것처럼 보입니다.");

        try {
            System.out.println(user.getName());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 발생: 원인은 findUserById에 있습니다(이 줄은 증상이 나타난 곳입니다).");
        }
    }
}
