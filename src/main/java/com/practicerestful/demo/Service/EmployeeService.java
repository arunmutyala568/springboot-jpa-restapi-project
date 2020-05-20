package com.practicerestful.demo.Service;

import java.sql.SQLDataException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.resource.AppCacheManifestTransformer;

import com.practicerestful.demo.DAO.CertificateRepo;
import com.practicerestful.demo.DAO.EmployeeRepo;
import com.practicerestful.demo.DAO.ManagerRepo;
import com.practicerestful.demo.DAO.ProjectsRepo;
import com.practicerestful.demo.DTO.Certifications;
import com.practicerestful.demo.DTO.Employee;
import com.practicerestful.demo.DTO.Manager;
import com.practicerestful.demo.DTO.Projects;
import com.practicerestful.demo.Exceptions.UserException;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo erepo;
	
	@Autowired
    ManagerService mrepo;
	@Autowired
    ProjectsRepo prepo;	
	@Autowired
	CertificationsService cservice;
	public String addEmployee(Employee e) throws SQLDataException{
		List<Certifications> ls =e.getCert();
		List<Projects> p=e.getProjects();
		Manager m=e.getManager();
		mrepo.savamanager(m);
		erepo.save(e);
		cservice.addcertifications(ls);
		prepo.saveAll(p);
		return "success";
	}
	
	public String getallEmployeeDetails(){
		erepo.findAll();
		return "success";
	}
   
	public List<Certifications>  findcertificatesofemployee(String name){
		Employee e=erepo.findByName(name);
		List<Certifications> ls=e.getCert();
		return  ls;
		
	}
	
	public Employee findUserDetails(String name){
		Employee e= erepo.findByName(name);
		if(e==null)
			throw new UserException("the Employee with this name->"+" "+name+" "+"is not found");
		return e;
	}
 
}
