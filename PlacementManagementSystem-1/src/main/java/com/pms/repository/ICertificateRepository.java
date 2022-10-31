package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entities.Certificate;


public interface ICertificateRepository extends JpaRepository<Certificate, Integer>{

}
