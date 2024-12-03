package com.example.lepatisseriebackend.topProducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopProductService {
    @Autowired
    TopProductRepository topProductsRepository;

    public TopProducts saveTopProduct(TopProducts topProduct) {
        return topProductsRepository.save(topProduct);
    }

    public List<TopProducts> getTopProduct() {
        return topProductsRepository.findAll();
    }


}
