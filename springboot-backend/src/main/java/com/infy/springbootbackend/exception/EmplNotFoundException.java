package com.infy.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmplNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	
	
	public EmplNotFoundException(String message) {
		super(message);
	}

}
