package com.codeit.lecture.p49.ex02;

// 파일 이름: Main.java
enum Status {
    READY,
    IN_PROGRESS,
    DONE;

    public static Status from(String value) {
        for (Status status : values()) {
            if (status.name().equalsIgnoreCase(value)) { // 이름이 같으면(대소문자 무시)
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown status: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Status.from("READY")); // READY
        System.out.println(Status.from("ready")); // READY (소문자로 들어와도 찾습니다)
        System.out.println(Status.from("Done")); // DONE

        try {
            Status.from("FINISHED");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Unknown status: FINISHED
        }
    }
}
