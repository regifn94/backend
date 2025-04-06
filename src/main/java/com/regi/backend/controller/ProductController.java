package com.regi.backend.controller;

import com.regi.backend.entity.Product;
import com.regi.backend.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public Object create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping("/detail/{id}")
    public Product detail(@PathVariable("id") Long id){
        return productService.detail(id);
    }

    @GetMapping("/list")
    public List<Product> listProduct(){
        return productService.listProduct();
    }
}
