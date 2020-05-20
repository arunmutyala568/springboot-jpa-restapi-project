package com.practicerestful.demo.Exceptions;

public class CustomeExceptionForAll {

	private String message;
	
	private String details;

	public CustomeExceptionForAll(String message2, String description) {
		this.message=message2;
		this.details=description;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
