package com.example.lepatisseriebackend.order;

import com.example.lepatisseriebackend.product.Product;
import com.example.lepatisseriebackend.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private LocalDateTime dataPedido;
    @OneToMany(mappedBy = "order" , cascade = CascadeType.ALL)
    private List<Product> products;
    private Double totalPrice;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}

enum OrderStatus{
    PENDING, SENDED, DONE
}
