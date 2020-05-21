package com.practicerestful.demo.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class LoginCredentials {
	@Id
	private int id;
	@Column
	private String uniqename;
	@Column
	@JsonIgnore
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUniqename() {
		return uniqename;
	}
	public void setUniqename(String uniqename) {
		this.uniqename = uniqename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
