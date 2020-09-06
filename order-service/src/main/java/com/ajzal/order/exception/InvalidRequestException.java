package com.ajzal.order.exception;

public class InvalidRequestException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidRequestException (String message) {
		super("Invalid Request : " + message);
	}
}