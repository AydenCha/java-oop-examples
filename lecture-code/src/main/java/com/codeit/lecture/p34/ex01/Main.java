package com.codeit.lecture.p34.ex01;

// 파일 이름: Main.java

class Report {

    String title;
    String content;
}

class ReportPrinter {

    void print(Report report) {
        System.out.println("[출력] " + report.title + ": " + report.content);
    }
}

class ReportSaver {

    void saveToFile(Report report) {
        System.out.println("[저장] " + report.title + ".txt 파일로 저장합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.title = "11월 매출";
        report.content = "지난달보다 10% 늘었습니다.";

        new ReportSaver().saveToFile(report);
        new ReportPrinter().print(report);
    }
}
