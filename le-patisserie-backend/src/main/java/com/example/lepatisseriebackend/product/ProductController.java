package com.example.lepatisseriebackend.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController()
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
         * Retrieves a product by its ID.
         *
         * This endpoint returns the details of a product based on the provided product ID.
         * If the product is found, it returns a 200 OK response with the product data.
         * If the product is not found, it returns a 404 Not Found response.
         *
         * @param id The ID of the product to retrieve.
         * @return ResponseEntity containing the product details if found, or a 404 status if not found.
         */
        @GetMapping("/{id}")
        public ResponseEntity<Product> getProductById(@PathVariable Long id) {
            return productService.findProductById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
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
