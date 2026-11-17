package com.codeit.lecture.p20.ex01;

// 파일 이름: GetterSetterTest.java
class Worker {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) return;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class GetterSetterTest {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.setName("김코딩");
        w.setAge(30);
        w.setId(5);

        w.setAge(-3);

        System.out.println("근로자의 이름은 " + w.getName()); // 근로자의 이름은 김코딩
        System.out.println("근로자의 나이는 " + w.getAge()); // 근로자의 나이는 30
        System.out.println("근로자의 ID는 " + w.getId()); // 근로자의 ID는 5
    }
}
