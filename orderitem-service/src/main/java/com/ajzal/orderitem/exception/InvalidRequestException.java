package com.ajzal.orderitem.exception;
/**
 * @author ajzal
 */
public class InvalidRequestException extends RuntimeException {


	public InvalidRequestException (String message) {
		super("Invalid Request : " + message);
	}
}
