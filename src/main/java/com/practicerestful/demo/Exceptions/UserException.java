package com.practicerestful.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class UserException extends RuntimeException {

	private String message;
	private String details;
	public UserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		/*this.message=message;
		this.details=details;*/
	}

	
}
