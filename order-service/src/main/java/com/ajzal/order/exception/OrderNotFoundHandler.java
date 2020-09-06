package com.ajzal.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class OrderNotFoundHandler   {

	@ResponseBody
	@ExceptionHandler(OrderNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String orderNotFoundHandler(OrderNotFoundException ex) {
	    return ex.getMessage();
	}
	
	@ResponseBody
	@ExceptionHandler(InvalidRequestException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String invalidRequestdHandler(InvalidRequestException ex) {
	    return ex.getMessage();
	}
	
}
