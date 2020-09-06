package com.ajzal.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajzal.order.OrderRepository;
import com.ajzal.order.OrderitemServiceProxy;
import com.ajzal.order.exception.InvalidRequestException;
import com.ajzal.order.exception.OrderNotFoundException;
import com.ajzal.order.model.Order;
import com.ajzal.order.model.Orderitem;


@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderitemServiceProxy orderitemServiceProxy;

	@Autowired
	private OrderRepository orderRepository;
	
	
	@GetMapping(path = "/orders/{id}", produces = "application/json")
	public Order getOrder(@PathVariable long id) throws OrderNotFoundException, InvalidRequestException {
		
		if(!isValidPara(id)) throw new InvalidRequestException(""+id);
		
		Order order = orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException(""+id));
	
		order.setOrdertems(orderitemServiceProxy.getOrderitems(id));
		
		return order;
	}
	
	@GetMapping(path = "/orders", produces = "application/json")
	public List<Order> getOrder() throws OrderNotFoundException, InvalidRequestException {
		
		return orderRepository.findAll();
	}
	
	
	@GetMapping(path = "/orderitemsByOrderid/{orderid}", produces = "application/json")
	public List<Orderitem> getOrderitems(@PathVariable long orderid) throws OrderNotFoundException, InvalidRequestException {
		
		if(!isValidPara(orderid)) throw new InvalidRequestException(""+orderid);
		
		List<Orderitem> orderitems = orderitemServiceProxy.getOrderitems(orderid);
		
		if(orderitems.isEmpty())throw new OrderNotFoundException(""+orderid);
			
		return orderitemServiceProxy.getOrderitems(orderid);		
	}
	
	
	@PostMapping("/order")
	public Order newOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	 }
	
	
	private boolean isValidPara(long input) {
        return (input >0);
    }
	
}
