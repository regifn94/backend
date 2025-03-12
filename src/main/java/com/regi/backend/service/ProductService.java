package com.regi.backend.service;

import com.regi.backend.entity.Product;
import com.regi.backend.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ResponseEntity<Object> create(Product product){
        try {
            return ResponseEntity.ok(productRepository.save(product));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(null);
        }
    }
}
