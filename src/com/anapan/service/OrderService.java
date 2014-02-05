package com.anapan.service;

import java.util.List;

import com.anapan.entity.Order;


public interface OrderService {
	
	public void saveOrder(Order order);
	
	public List<Order> getOrders();
}
