package com.assignment.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class OrderServiceApplication {

	//private static final String MESSAGE_QUEUE = "order_queue";

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
		

	}

}
