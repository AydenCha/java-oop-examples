package com.codeit.lecture.p56.ex01;

// 파일 이름: Main.java

class CreateOrderRequest {
    String item;
    int price;

    CreateOrderRequest(String item, int price) {
        this.item = item;
        this.price = price;
    }
}

class Order {
    private String id;
    Order(String id) { this.id = id; }
    String getId() { return id; }
}

class OrderResponse {
    String orderId;
    String result;

    OrderResponse(String orderId, String result) {
        this.orderId = orderId;
        this.result = result;
    }
}

class PaymentService {
    boolean pay(int price) {
        System.out.println("  [PaymentService] " + price + "원 결제");
        return true;
    }
}

class OrderRepository {
    Order save(Order order) {
        System.out.println("  [OrderRepository] 주문 저장: " + order.getId());
        return order;
    }
}

class OrderService {
    private final PaymentService paymentService = new PaymentService();
    private final OrderRepository orderRepository = new OrderRepository();

    public Order createOrder(CreateOrderRequest req) {
        paymentService.pay(req.price); // (2) 결제를 요청하고
        return orderRepository.save(new Order("ORD-1"));
    }
}

class OrderController {
    private final OrderService orderService = new OrderService();

    public OrderResponse order(CreateOrderRequest req) {
        Order order = orderService.createOrder(req);
        return new OrderResponse(order.getId(), "OK");
    }
}

public class Main {
    public static void main(String[] args) {
        OrderResponse response = new OrderController().order(new CreateOrderRequest("book", 15000));
        System.out.println(response.orderId + " " + response.result);
    }
}

/*
실행 결과
  [PaymentService] 15000원 결제
  [OrderRepository] 주문 저장: ORD-1
ORD-1 OK
*/
