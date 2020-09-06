package com.ajzal.orderitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajzal.orderitem.OrderitemRepository;
import com.ajzal.orderitem.exception.InvalidRequestException;
import com.ajzal.orderitem.model.Orderitem;

/**
 * @author ajzal
 */
@RestController
@RequestMapping("/api")
public class OrderitemController {
	
	@Autowired
	private OrderitemRepository orderitemRepository;
	
	
	@GetMapping(path = "/orderitemsByOrderid/{orderid}", produces = "application/json")
	public List<Orderitem> getOrderitems(@PathVariable long orderid) {
		
		if(!isValidPara(orderid))throw new InvalidRequestException(""+orderid);
		
		List<Orderitem> orderitems = orderitemRepository.findByOrderid(orderid);
		
		return orderitems;
	}
	
	@PostMapping("/orderitems")
	public List<Orderitem> newOrderitems(@RequestBody List<Orderitem> orderitems) {
		System.out.println("orderitems  == "+ orderitems);
		
		return orderitemRepository.saveAll(orderitems);
	 }
	
	
	@PostMapping("/orderitem")
	public Orderitem newOrderitem(@RequestBody Orderitem orderitem) {
		return orderitemRepository.save(orderitem);
	}
	
	
	private boolean isValidPara(long input) {
        return (input >0);
    }
	


}
