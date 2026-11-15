package com.codeit.solid.isp.before;

// ISP(Interface Segregation Principle) 위반 예시
// 인터페이스가 너무 많은 기능을 가지고 있어, 필요 없는 기능을 구현해야 하는 경우
interface MultiFunctionDevice {
    void print();
    void scan();
    void fax();
}

// 복합기가 아닌 단순 프린터인데 print도 해야 하고, scan도 해야 하고 fax도 해야 함
public class SimplePrinter implements MultiFunctionDevice {
    public void print() {
        // 프린트 기능
    }
    public void scan() { throw new UnsupportedOperationException(); }
    public void fax() { throw new UnsupportedOperationException(); }
}
