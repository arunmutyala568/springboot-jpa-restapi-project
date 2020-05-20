package com.practicerestful.demo.DAO;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practicerestful.demo.DTO.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{
	Employee findByName(String name);
	
	@Transactional
	@Query("select name from Employee ")
	List<String> getonlyemployeenames();
}
