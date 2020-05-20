package com.practicerestful.demo.Service;

import java.sql.SQLDataException;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practicerestful.demo.DAO.CertificateRepo;
import com.practicerestful.demo.DTO.Certifications;

@Component
public class CertificationsService {
	@Autowired
	CertificateRepo crepo;
	public void addcertifications(List<Certifications> lc) throws SQLDataException{
		crepo.saveAll(lc);
	}
	
}
