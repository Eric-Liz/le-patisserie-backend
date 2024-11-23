package com.example.lepatisseriebackend.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/products")
    public class ProductController {

        private final ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        /**
         * Retrieves all products.
         * @return ResponseEntity containing the list of products.
         */
        @GetMapping
        public ResponseEntity<List<Product>> getAllProducts() {
            List<Product> products = productService.getAllProducts();
            return ResponseEntity.ok(products);
        }

        /**
         * Saves a new product.
         *
         * @param product The product object to be saved.
         * @return ResponseEntity containing the saved product.
         */
        @PostMapping
        public ResponseEntity<Product> saveProduct(@RequestBody Product product) {

            Product savedProduct = productService.saveProduct(product);
            return ResponseEntity.ok(savedProduct);
        }
    }
