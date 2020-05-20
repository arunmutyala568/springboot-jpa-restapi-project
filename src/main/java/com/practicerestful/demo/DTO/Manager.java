package com.practicerestful.demo.DTO;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manager {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column
	private int mid;
	@Column
	private String name;
	
/*	@OneToMany(mappedBy="manager")
	private List<Employee> employees;*/
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
/*	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}*/
}
