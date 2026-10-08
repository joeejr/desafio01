package com.devsuperior.pedidos.services;

import com.devsuperior.pedidos.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateOrderService {

    @Autowired
    private OrderService orderService;

    public double calculate(Order order) {
        return orderService.total(order);
    }
}
