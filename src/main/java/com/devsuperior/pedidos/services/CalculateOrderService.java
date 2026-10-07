package com.devsuperior.pedidos.services;

import com.devsuperior.pedidos.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateOrderService {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ShippingService shippingService;

    public double calculate(Order order) {
        var totalAfterDiscount = orderService.discount(order);
        order.setBasic(totalAfterDiscount);

        return shippingService.calculateShipping(order);
    }
}
