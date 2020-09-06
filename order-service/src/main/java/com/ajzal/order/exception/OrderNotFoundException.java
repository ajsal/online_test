package com.ajzal.order.exception;

public class OrderNotFoundException extends RuntimeException {

	public OrderNotFoundException (String message) {
		super("Order item not found : " + message);
	}
}
