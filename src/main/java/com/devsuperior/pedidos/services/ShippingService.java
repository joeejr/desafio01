package com.devsuperior.pedidos.services;

import com.devsuperior.pedidos.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double calculateShipping(Order order) {

        if (order.getBasic() >= 200){
            return order.getBasic();
        } else if (order.getBasic() >= 100 && order.getBasic() <= 200){
            return order.getBasic() + 12.0;
        } else {
            return order.getBasic() + 20.0;
        }

    }
}
