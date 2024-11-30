package com.example.lepatisseriebackend.order;

import com.example.lepatisseriebackend.product.Product;
import com.example.lepatisseriebackend.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
        private User user;
        private List<Product> products;
        private Double totalPrice;
}
