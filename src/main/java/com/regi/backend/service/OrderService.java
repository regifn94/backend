package com.regi.backend.service;

import com.regi.backend.dto.OrderResponse;
import com.regi.backend.entity.Order;
import com.regi.backend.entity.Product;
import com.regi.backend.repository.OrderRepository;
import com.regi.backend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public Object createOrder(Order order){
        return orderRepository.save(order);
    }

    public Object getOrderDetail(Long id){
        OrderResponse orderResponse = new OrderResponse();
        Optional<Order> order = orderRepository.findById(id);
        if(order.isPresent()){
            Order newOrder = order.get();
            Product product = productRepository.findById(newOrder.getProductId()).get();
            orderResponse.setId(newOrder.getId());
            orderResponse.setOrderDate(newOrder.getOrderDate());
            orderResponse.setQuantity(newOrder.getQuantity());
            orderResponse.setProduct(product);
            orderResponse.setDateEstimation(newOrder.getDateEstimation());
            orderResponse.setTotalPrice(newOrder.getTotalPrice());
        }
        return orderResponse;
    }
}
