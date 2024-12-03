package com.example.lepatisseriebackend.topProducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/top")
public class TopProductsController {
    @Autowired
    TopProductService topProductService;

    @PostMapping("/saveTopProducts")
    public ResponseEntity<TopProducts> saveTopProduct(@RequestBody TopProducts topProduct) {
        return ResponseEntity.ok(topProductService.saveTopProduct(topProduct));
    }
    @GetMapping
    public ResponseEntity<List<TopProducts>> getTopProduct() {
        return ResponseEntity.ok(topProductService.getTopProduct());
    }
}
