package com.example.lepatisseriebackend.order;
import com.example.lepatisseriebackend.product.Product;
import com.example.lepatisseriebackend.user.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(User user, List<Product> products, Double totalPrice) {
        Order order = new Order();
        order.setUser(user);
        order.setProducts(products);
        order.setTotalPrice(totalPrice);
        order.setDataPedido(LocalDateTime.now());
        order.setOrderStatus(OrderStatus.PENDING);

        for (Product product : products) {
            product.setOrder(order);
        }

        return orderRepository.save(order);
    }

    public Order updateOrderStatus(Long id, OrderStatus newStatus) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setOrderStatus(newStatus);
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}