package com.codeit.lecture.p40.ex01;

// 파일 이름: Main.java
interface AllInOneDevice {
    void print();
    void scan();
    void fax();
}

// 2. LSP 위반: 기능이 없는 단순 프린터인데 억지로 구현하다 보니 예외가 발생합니다
class SimplePrinter implements AllInOneDevice {
    public void print() { System.out.println("출력 완료"); }
    public void scan() { throw new UnsupportedOperationException(); } // 억지 구현
    public void fax() { throw new UnsupportedOperationException(); } // 억지 구현
}

class SmartCopier implements AllInOneDevice {
    public void print() { System.out.println("출력 완료"); }
    public void scan() { System.out.println("스캔 완료"); }
    public void fax() { System.out.println("팩스 전송"); }
}

class DocumentService {
    private SimplePrinter printer = new SimplePrinter();

    public void process(String docId, String format) {
        System.out.println(docId + " 문서를 읽어 옵니다."); // 문서 처리

        if (format.equals("PDF")) {
            System.out.println("PDF로 변환하여 저장");
        } else if (format.equals("HTML")) {
            System.out.println("HTML로 변환하여 저장");
        }

        // 인쇄를 실행합니다 (LSP 위반 때문에 여기서 팩스를 보내면 예외가 발생합니다)
        printer.print();
    }
}

public class Main {
    public static void main(String[] args) {
        DocumentService service = new DocumentService();
        service.process("DOC-001", "PDF");
        // PDF로 변환하여 저장
        // 출력 완료

        // LSP 위반 확인: 단순 프린터에게 팩스를 시키면 예외가 발생합니다. (try-catch는 7장에서 배웁니다)
        AllInOneDevice device = new SimplePrinter();
        try {
            device.fax();
        } catch (UnsupportedOperationException e) {
            System.out.println("팩스 실패: 단순 프린터는 팩스를 보낼 수 없습니다.");
        }
    }
}
