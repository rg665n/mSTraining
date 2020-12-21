package com.assignment.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.orderservice.Service.OrdersService;
import com.assignment.orderservice.model.Orders;


@RestController
public class OrdersController {
	@Autowired  OrdersService orderService ;
	@Autowired private JmsTemplate jmsTemplate;
	@PostMapping("/order")
	private int saveOrder(@RequestBody Orders orders) {
		
		
		orderService.saveOrUpdate(orders);
		// Get JMS template bean reference
		jmsTemplate.convertAndSend("ORDER_QUEUE", orders);
		return orders.getItemId();
	}	
}
