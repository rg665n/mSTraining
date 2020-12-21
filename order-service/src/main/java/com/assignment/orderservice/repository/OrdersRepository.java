package com.assignment.orderservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.orderservice.model.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {

}
