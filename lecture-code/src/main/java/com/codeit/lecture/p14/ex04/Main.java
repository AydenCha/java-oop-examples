package com.codeit.lecture.p14.ex04;

// 파일 이름: Main.java
class Printer {
    void print() {
        System.out.println("출력!");
    }
}

class Report {
    private Printer printer = new Printer();

    void printReport() {
        printer.print();
    }
}

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.printReport();
    }
}
