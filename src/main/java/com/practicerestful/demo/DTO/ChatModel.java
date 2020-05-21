package com.practicerestful.demo.DTO;

import javax.persistence.Column;
import javax.persistence.Id;

public class ChatModel {
	@Id
	private int id;
	@Column
	private String from;
	@Column
	private String To;
	@Column
	private String message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
