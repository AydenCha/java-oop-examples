package com.codeit.lecture.p38.ex01;

// 파일 이름: Main.java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class SimplePrinter implements Printer {
    public void print() { System.out.println("인쇄합니다."); }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.print();

    }
}
