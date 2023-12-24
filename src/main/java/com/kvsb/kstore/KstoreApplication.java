package com.kvsb.kstore;

import com.kvsb.kstore.entities.Order;
import com.kvsb.kstore.service.OrderService;
import com.kvsb.kstore.service.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class KstoreApplication implements CommandLineRunner {

	private OrderService orderService;
//	private ShippingService shippingService;

	public KstoreApplication(OrderService orderService /*ShippingService shippingService*/) {
		this.orderService = orderService;
//		this.shippingService = shippingService;
	}

	public static void main(String[] args) {
		SpringApplication.run(KstoreApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.00);
		System.out.println("Code: " + order.getCode() + " | Total: " + orderService.total(order));

		Order orderTwo = new Order(2282, 800, 10.00);
		System.out.println("Code: " + orderTwo.getCode() + " | Total: " + orderService.total(orderTwo));

		Order orderThree = new Order(1039, 95.90, 00.00);
		System.out.println("Code: " + orderThree.getCode() + " | Total: " + orderService.total(orderThree));
	}
}
