package com.devsuperior.pedidos.services;

import com.devsuperior.pedidos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public double discount(Order order) {
        return order.getBasic()-(order.getBasic()*(order.getDiscount()/100));
    }
}
