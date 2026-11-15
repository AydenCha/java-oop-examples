package com.codeit.solid.srp.after;

// SRP (Single Responsibility Principle) - 단일 책임 원칙
// 클래스는 하나의 책임만 가져야 한다.
// 즉, 클래스는 하나의 기능만 수행해야 한다.

// 이제 이 Report 클래스는 단순히 보고서의 데이터를 관리하는 역할만 한다.
class Report {
    String title;
    String content;
}

// ReportPrinter와 ReportSaver는 각각 보고서를 출력하고 저장하는 책임을 가진다.
class ReportPrinter {
    void print(Report report) {
        // 콘솔 출력 등등
    }
}

class ReportSaver {
    void saveToFile(Report report) {
        // 파일 저장 등등
    }
}
