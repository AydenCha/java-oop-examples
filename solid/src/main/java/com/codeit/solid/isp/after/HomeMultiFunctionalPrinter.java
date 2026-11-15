package com.codeit.solid.isp.after;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

// 프린터는 print만 할 줄 알면 됨
class SimplePrinter implements Printer {
    public void print() { // 프린트 기능 구현 }
    }
}

// 스캐너는 scan만 할 줄 알면 됨
class SimpleScanner implements Scanner {
    public void scan() { // 스캔 기능 구현 }
    }
}

// 가정용 복합기는 print와 scan만 할 줄 알면 된다.
class HomeMultiFunctionalPrinter implements Printer, Scanner {
    public void print() { // 프린트 기능 구현 }
    }
    public void scan() { // 스캔 기능 구현 }
    }
}