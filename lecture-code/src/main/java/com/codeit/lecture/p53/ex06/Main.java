package com.codeit.lecture.p53.ex06;

// 파일 이름: Main.java
import java.sql.SQLException;

class Order {
    private String id;
    Order(String id) { this.id = id; }
    String getId() { return id; }
}

// 주문 저장에 실패했다는 뜻이 이름에 드러나는 예외
class OrderSaveFailedException extends RuntimeException {
    OrderSaveFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}

class OrderRepository {
    void insert(Order order) throws SQLException {
        throw new SQLException("주문 테이블에 저장할 수 없습니다.");
    }
}

class OrderService {
    private OrderRepository repository = new OrderRepository();

    public void saveOrder(Order order) {
        try {
            repository.insert(order);
        } catch (SQLException e) {
            throw new OrderSaveFailedException("주문 저장 중 문제가 발생했습니다.", e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            new OrderService().saveOrder(new Order("ORD-1"));
        } catch (OrderSaveFailedException e) {
            System.out.println(e.getMessage());
            System.out.println("원인: " + e.getCause().getMessage());
        }
    }
}
