package com.codeit.solid.ocp.after;

// OCP(개방-폐쇄 원칙)
// - 소프트웨어 개체는 확장에 대해서는 열려 있어야 하고, 수정에 대해서는 닫혀 있어야 한다.
// - 즉, 기존 코드를 수정하지 않고도 새로운 기능을 추가할 수 있어야 한다.
// - 기존 코드를 수정하지 않고도 새로운 기능을 추가할 수 있어야 한다.

// PayStrategy 인터페이스는 결제 방식에 따라 다르게 동작하는 서비스입니다.
interface PayStrategy {
    void pay();
}

// PayStrategy 인터페이스를 구현한 클래스들입니다.
class CardPay implements PayStrategy {
    public void pay() {
        System.out.println("카드 결제");
    }
}

class KakaoPay implements PayStrategy {
    public void pay() {
        System.out.println("카카오페이");
    }
}

// PaymentService는 결제 방식에 따라 다르게 동작하는 서비스입니다.
// 결제 방식에 따라 다르게 동작하는 서비스입니다.
// 결제 방식이 추가되더라도 PaymentService는 수정할 필요가 없습니다.
// PaymentService를 호출하는곳에서 결제 방식을 결정합니다.
class PaymentService {

    private PayStrategy payStrategy;

    public PaymentService(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void processPayment() {
        payStrategy.pay();  // 구현체에 따라 동작이 바뀜
    }
}
