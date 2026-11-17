package com.codeit.lecture.p49.ex04;

// 파일 이름: Main.java
enum DeliveryType {
    NORMAL {
        @Override
        public int getDays() { return 3; } // 일반 배송: 3일
    },
    ROCKET {
        @Override
        public int getDays() { return 1; } // 로켓 배송: 1일
    },
    DIRECT {
        @Override
        public int getDays() { return 0; } // 당일 배송: 0일
    };

    public abstract int getDays(); // 모든 상수가 구현해야 하는 추상 메서드
}

public class Main {
    public static void main(String[] args) {
        DeliveryType type = DeliveryType.ROCKET;

        System.out.println(type + " 배송: " + type.getDays() + "일"); // ROCKET 배송: 1일
    }
}
