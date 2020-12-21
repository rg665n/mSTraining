package com.assignment.orderservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.orderservice.model.Orders;
import com.assignment.orderservice.repository.OrdersRepository;

@Service
public class OrdersService {
	@Autowired 
	OrdersRepository ordersRepository ;
	
	public void saveOrUpdate(Orders order) {
		
		
		ordersRepository.save(order);
	}	
}
