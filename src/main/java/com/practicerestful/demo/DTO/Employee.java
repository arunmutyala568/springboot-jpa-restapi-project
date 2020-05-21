package com.practicerestful.demo.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Employee {
	@javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int eId;
	@Column
	private String name;
	
	@Column
	private String department;
	@OneToMany(mappedBy="emp",fetch=FetchType.LAZY)
	@JsonManagedReference
	List<Certifications> cert;
	@OneToMany(mappedBy="emp",fetch=FetchType.LAZY)
	@JsonManagedReference
	List<Projects> projects;
	@OneToOne
	private Manager manager;
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public List<Certifications> getCert() {
		return cert;
	}
	public void setCert(List<Certifications> cert) {
		this.cert = cert;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Projects> getProjects() {
		return projects;
	}
	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}


}
