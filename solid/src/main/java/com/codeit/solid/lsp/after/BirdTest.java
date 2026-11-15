package com.codeit.solid.lsp.after;

// 날 수 있는 행동을 명시한 인터페이스
interface Flyable {
    void fly();
}

// 일반 새의 추상 클래스 (공통 행동 포함 가능)
abstract class Bird {
    String name;

    Bird(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + "가 먹이를 먹는다");
    }
}

// 날 수 있는 새
class Sparrow extends Bird implements Flyable {
    Sparrow() {
        super("참새");
    }

    @Override
    public void fly() {
        System.out.println("참새가 날아간다");
    }
}

// 날 수 없는 새
class Ostrich extends Bird {
    Ostrich() {
        super("타조");
    }

    // fly() 메서드를 구현하지 않음 → 예외도 던지지 않음 → LSP 위반 없음
}

// 사용 예시
public class BirdTest {
    public static void main(String[] args) {
        // Bird 타입은 공통 동작에만 사용
        Bird ostrich = new Ostrich();
        Bird sparrow = new Sparrow();

        ostrich.eat();
        sparrow.eat();

        // Flyable 타입으로만 비행 호출 → 안전
        Flyable flyingBird = new Sparrow();
        flyingBird.fly();
    }
}

