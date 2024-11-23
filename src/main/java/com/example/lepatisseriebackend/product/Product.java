package com.example.lepatisseriebackend.product;

import com.example.lepatisseriebackend.order.Order;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    @Enumerated(EnumType.STRING)
    private Category category;
    private boolean available;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
enum Category {
    PIE, CAKE, DESERT, CHOCOLATE
}
