package com.codeit.lecture.p07.ex05;

// 파일 이름: Main.java
class Book {
    String title;

    Book() {
        this("제목 없음");
    }

    Book(String title) { // 호출된 생성자
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("자바의 정석"); // Book(String)이 바로 실행

        System.out.println(book1.title); // 제목 없음
        System.out.println(book2.title); // 자바의 정석
    }
}
