package com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia;

import com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia.entities.Order;
import com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia.service.OrderService;
import com.github.Ailton78.DesafioCoponenteInjecaoDeDependecia.service.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioCoponenteInjecaoDeDependeciaApplication implements CommandLineRunner {

	public OrderService orderService;

	public DesafioCoponenteInjecaoDeDependeciaApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioCoponenteInjecaoDeDependeciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Code: ");
		int code = sc.nextInt();
		System.out.print("Basic value: ");
		double basic = sc.nextDouble();
		System.out.print("Discount value: ");
		double discount = sc.nextDouble();

		Order order = new Order(code,basic, discount);


		System.out.println("Pedido código " + code);
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order)));

		sc.close();
	}
}
