package com.regi.backend.controller;

import com.regi.backend.entity.Order;
import com.regi.backend.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public Object createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("/detail/{id}")
    public Object detail(@PathVariable("id") Long id){
        return orderService.getOrderDetail(id);
    }

}
