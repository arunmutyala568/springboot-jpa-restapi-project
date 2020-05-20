package com.practicerestful.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
@RestController
public class CustomException extends ResponseEntityExceptionHandler {

	CustomeExceptionForAll cA=null;
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleExceptions(Exception ex, WebRequest request){
		
		cA=new CustomeExceptionForAll(ex.getMessage(),request.getDescription(true));
		
		return new ResponseEntity(cA,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(UserException.class)
	public final ResponseEntity<Object> UsernotfoundExceptions(UserException ex, WebRequest request){
		
		cA=new CustomeExceptionForAll(ex.getMessage(),request.getDescription(true));
		
		return new ResponseEntity(cA,HttpStatus.NOT_FOUND);
		
	}
	
}
