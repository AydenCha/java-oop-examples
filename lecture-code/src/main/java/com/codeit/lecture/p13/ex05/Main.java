package com.codeit.lecture.p13.ex05;

// 파일 이름: Main.java
class Printer {
    void print() { System.out.println("출력!"); }
}

class FancyPrinter extends Printer {
    void printFancy() {
        print();
        System.out.println("★ 장식 출력 ★");
    }
}

public class Main {
    public static void main(String[] args) {
        FancyPrinter printer = new FancyPrinter();
        printer.printFancy();
    }
}

/*
실행 결과
출력!
★ 장식 출력 ★
*/
