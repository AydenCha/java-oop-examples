package com.codeit.lecture.p47.ex05;

// 파일 이름: Main.java
enum DeliveryType {
    NORMAL {
        @Override
        public int getDeliveryTime() {
            return 3; // 일반 배송: 3일
        }
    },
    ROCKET {
        @Override
        public int getDeliveryTime() {
            return 1; // 로켓 배송: 1일
        }
    },
    DIRECT {
        @Override
        public int getDeliveryTime() {
            return 0; // 당일 배송: 0일
        }
    };

    // 공통 추상 메서드: 모든 상수가 이 메서드를 반드시 구현해야 합니다. 하나라도 빠뜨리면 컴파일 에러가 납니다.
    public abstract int getDeliveryTime();
}

public class Main {
    public static void main(String[] args) {
        DeliveryType type = DeliveryType.ROCKET;

        System.out.println(type.getDeliveryTime()); // 1
    }
}
