package com.anapan.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anapan.entity.Order;
import com.anapan.service.OrderService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String  showShopPage(ModelMap model){
		return "shop";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveOrder(HttpServletRequest request,ModelMap model){
		Order order = new Order();
		order.setDate(new Date());
		order.setItem(request.getParameter("item"));
		order.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		orderService.saveOrder(order);				
		return "redirect:orders";
	}
}
