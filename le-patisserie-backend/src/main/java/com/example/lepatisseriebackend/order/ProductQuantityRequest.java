package com.example.lepatisseriebackend.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductQuantityRequest {
    private Long productId;
    private int quantity;
}
