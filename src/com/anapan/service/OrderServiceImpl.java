package com.anapan.service;

import java.util.List;

import javax.jdo.PersistenceManager;

import org.springframework.stereotype.Service;

import com.anapan.PMF;
import com.anapan.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public void saveOrder(Order order) {
		PMF.get().getPersistenceManager().makePersistent(order);		
	}

	@Override
	public List<Order> getOrders() {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();

		javax.jdo.Query q = pm.newQuery(Order.class);		
		q.setOrdering("date desc");		

		try {
			return (List<Order>) q.execute();			
		} finally {
			q.closeAll();			
		}				
	}
}
