package com.regi.backend.service;

import com.regi.backend.entity.Product;
import com.regi.backend.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Product detail(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

    public List<Product> listProduct(){
        return productRepository.findAll();
    }
}
