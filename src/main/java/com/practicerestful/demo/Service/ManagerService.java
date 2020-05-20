package com.practicerestful.demo.Service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practicerestful.demo.DAO.ManagerRepo;
import com.practicerestful.demo.DTO.Manager;

//@Component
public class ManagerService {
	@Autowired
	ManagerRepo mrepo;
	public void savamanager(Manager e){
		if(e!=null)
			mrepo.save(e);
	}
}
