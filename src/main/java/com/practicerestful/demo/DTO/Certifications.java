package com.practicerestful.demo.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Certifications {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column
	private int cid;
	@Column
	private String Certificate;
	@ManyToOne(fetch=FetchType.LAZY)
    @JsonBackReference
	private Employee emp;
	
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCertificate() {
		return Certificate;
	}

	public void setCertificate(String certificate) {
		Certificate = certificate;
	}
	
	
}
