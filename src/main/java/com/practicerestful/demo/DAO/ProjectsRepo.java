package com.practicerestful.demo.DAO;

import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;

import com.practicerestful.demo.DTO.Projects;


public interface ProjectsRepo extends CrudRepository<Projects, Long> {

}
