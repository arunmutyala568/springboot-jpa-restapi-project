package com.practicerestful.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.practicerestful.demo.DTO.Manager;

public interface ManagerRepo extends CrudRepository<Manager, Long> {

}
