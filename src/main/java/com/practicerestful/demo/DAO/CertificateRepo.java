package com.practicerestful.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practicerestful.demo.DTO.Certifications;

@Repository
public interface CertificateRepo extends CrudRepository<Certifications, Integer> {

}
