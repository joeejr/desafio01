package com.devsuperior.pedidos;

import com.devsuperior.pedidos.entities.Order;
import com.devsuperior.pedidos.services.CalculateOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PedidosApplication implements CommandLineRunner {

	@Autowired
	private CalculateOrderService calculateOrderService;

	Order order = new Order(2282, 95.90, 0.0);

	public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Pedido código "+order.getCode()+"\nValor Total: "+calculateOrderService.calculate(order));
	}
}
