package com.ajzal.orderitem.exception;
/**
 * @author ajzal
 */
public class OrderitemNotFoundException extends RuntimeException {
	


	public OrderitemNotFoundException (String message) {
		super("Order item not found : " + message);
	}
}
