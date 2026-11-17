package com.codeit.lecture.p53.ex01;

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

        // 예제 1: null 값 허용하지 않음
        if (id == null) {
            throw new IllegalArgumentException("사용자 ID는 null일 수 없습니다.");
        }

        User user = repository.findById(id);

        // 예제 2: 유효하지 않은 상태 즉시 중단
        if (user == null) {
            throw new IllegalStateException("해당 ID의 사용자를 찾을 수 없습니다. id=" + id);
        }

        return user;
    }
}

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        System.out.println(service.findUserById(1L).getName()); // 김코딩

        try {
            service.findUserById(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.findUserById(99L);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // 해당 ID의 사용자를 찾을 수 없습니다. id=99
        }
    }
}
