package com.firstchallengedevsuperior.firstchallenge;

import com.firstchallengedevsuperior.firstchallenge.entities.Order;
import com.firstchallengedevsuperior.firstchallenge.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class FirstchallengeApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(FirstchallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Integer code = scanner.nextInt();

		double basic = scanner.nextDouble();

		double discount = scanner.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println("Pedido código " + order.getCode()
							+ "\nValor total: R$ " + orderService.total(order));
	}
}
