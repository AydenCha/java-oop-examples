package com.codeit.solid.ocp.before;

// OCP(개방-폐쇄 원칙) 위반 예시
// 결제 수단이 추가될 때마다 PaymentService 클래스를 수정해야 함
// 결제 수단이 추가될 때마다 if문을 추가해야 함
class PaymentService {
    void pay(String method) {

        if (method.equals("card")) {
            System.out.println("카드 결제");
        } else if (method.equals("kakao")) {
            System.out.println("카카오페이");
        }
    }
}
