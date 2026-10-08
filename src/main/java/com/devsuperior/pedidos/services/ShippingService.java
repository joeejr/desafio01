package com.devsuperior.pedidos.services;

import com.devsuperior.pedidos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double calculateShipping(Order order) {

        if (order.getBasic() >= 200){
            return 0.0;
        } else if (order.getBasic() >= 100 && order.getBasic() <= 200){
            return 12.0;
        } else {
            return 20.0;
        }

    }
}
