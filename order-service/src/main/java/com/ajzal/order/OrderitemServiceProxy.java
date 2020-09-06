package com.ajzal.order;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ajzal.order.model.Location;
import com.ajzal.order.model.Orderitem;

@FeignClient(name = "orderitem-service")
public interface OrderitemServiceProxy {

	@GetMapping(path = "/api/orderitem", produces = "application/json")
	Orderitem getOrderitem();
	
	@GetMapping(path = "/api/orderitemsByOrderid/{orderid}", produces = "application/json")
	List<Orderitem> getOrderitems(@PathVariable long orderid);
}
