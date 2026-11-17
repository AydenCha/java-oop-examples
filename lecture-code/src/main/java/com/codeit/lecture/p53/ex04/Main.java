package com.codeit.lecture.p53.ex04;

// 파일 이름: Main.java
class User {
    private Long id;
    User(Long id) { this.id = id; }
    Long getId() { return id; }
}

// 저장에 실패하는 상황을 흉내 낸 저장소
class UserRepository {
    void save(User user) {
        throw new IllegalStateException("저장소에 연결할 수 없습니다.");
    }
}

class UserService {
    private UserRepository repository = new UserRepository();

    public void updateUser(User user) {
        try {
            repository.save(user);
        } catch (Exception e) {
        }
    }
}

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.updateUser(new User(1L));

        System.out.println("사용자 정보를 수정했습니다. (실제로는 저장되지 않았습니다)");
    }
}
