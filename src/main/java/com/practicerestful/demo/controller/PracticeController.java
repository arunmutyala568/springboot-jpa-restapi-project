package com.practicerestful.demo.controller;

import java.io.Serializable;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityResult;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.server.EntityResponse;

import com.practicerestful.demo.DAO.CertificateRepo;
import com.practicerestful.demo.DAO.EmployeeRepo;
import com.practicerestful.demo.DAO.ManagerRepo;
import com.practicerestful.demo.DAO.ProjectsRepo;
import com.practicerestful.demo.DTO.Certifications;
import com.practicerestful.demo.DTO.Employee;
import com.practicerestful.demo.DTO.Manager;
import com.practicerestful.demo.DTO.Projects;
import com.practicerestful.demo.Exceptions.UserException;
import com.practicerestful.demo.Service.EmployeeService;


@Controller
public class PracticeController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6109162720976994638L;
	@Autowired
	EmployeeRepo erepo;
	@Autowired
	CertificateRepo crepo;
	@Autowired
	ManagerRepo mrepo;
	@Autowired
	ProjectsRepo prepo;

	@Autowired
	EmployeeService eservice;

	@RequestMapping("/")
	@ResponseBody
	public String welcome(){
		return "hi";
	}


	@PostMapping("/post")
	@ResponseBody
	public String add(@RequestBody Employee e) throws Exception {
		eservice.addEmployee(e);
		return "success";
	}
	
	@PostMapping("/savemanagers")
	@ResponseBody
	public String savemanagers(@RequestBody Manager e){

		mrepo.save(e);
		return "success"; 
	}
	@GetMapping("/get/{user}")
	@ResponseBody
	public Employee getAll(@PathVariable String user) throws Exception {
		return eservice.findUserDetails(user);
	}
	@PutMapping("/updatecertificate/{user}/{}")
	@ResponseBody
	public String updateCertificate(){
		return null;

	}
	@PostMapping("addcertifica/{user}")
	@ResponseBody
	public String addcertificate(@PathVariable String user,@Valid@RequestBody Certifications ce){	
		Employee e=erepo.findByName(user);
		ce.setEmp(e);
		crepo.save(ce); 
		return "success";

	}
	
	@GetMapping("/employeenames")
	@ResponseBody
	public List<String> getonlyemployees(){
		return erepo.getonlyemployeenames();
	}

}
