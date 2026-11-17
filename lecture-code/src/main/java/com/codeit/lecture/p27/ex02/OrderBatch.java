package com.codeit.lecture.p27.ex02;

// 파일 이름: OrderBatch.java
class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}

class Americano extends Coffee {
    public Americano() { super(4000); }

    @Override
    public String toString() { return "아메리카노"; }
}

class CaffeLatte extends Coffee {
    public CaffeLatte() { super(5000); }

    @Override
    public String toString() { return "카페라떼"; }
}

class Customer {
    int money = 50000;

    void buyCoffee(Coffee coffee) {
        if (money < coffee.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= coffee.price;
        System.out.println(coffee + "를 구입했습니다.");
    }
}

public class OrderBatch {
    public static void main(String[] args) {
        Coffee[] orderList = {
            new Americano(),
            new CaffeLatte(),
            new Americano()
        };

        Customer customer = new Customer();

        for (Coffee coffee : orderList) {
            customer.buyCoffee(coffee);
        }

        System.out.println("최종 잔액: " + customer.money + "원");
    }
}

/*
실행 결과
아메리카노를 구입했습니다.
카페라떼를 구입했습니다.
아메리카노를 구입했습니다.
최종 잔액: 37000원
*/
