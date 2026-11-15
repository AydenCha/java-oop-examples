package com.codeit.solid.lsp.before;

// Liskov Substitution Principle
// 서브타입은 언제나 자신의 기반 타입으로 교체할 수 있어야 한다.
// LSP를 위반하는 예시
class Bird {
    void fly() { System.out.println("날아간다"); }
}

// LSP를 위반하는 서브타입
// 비행할 수 없는 새인 타조(Ostrich)가 Bird 클래스를 상속받고 있다.
// 타조는 날 수 없기 때문에 fly() 메서드를 오버라이드하여 UnsupportedOperationException을 던진다.
// 이로 인해 Bird 타입을 사용하는 클라이언트 코드에서 Ostrich 객체를 사용할 수 없게 된다.
class Ostrich extends Bird {
    void fly() { throw new UnsupportedOperationException(); }
}
