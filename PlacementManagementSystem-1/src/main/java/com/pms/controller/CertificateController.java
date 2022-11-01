package com.pms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.pms.entities.Certificate;
import com.pms.service.ICertificateService;

@RestController
@RequestMapping("/certificate")

public class CertificateController{
		
	@Autowired
	private ICertificateService service;
		
	// RESTful API methods for Retrieval operations
	@GetMapping("/list")
	public List<Certificate> getAllCertificates(){
		return service.listAllCertificates();
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Certificate> getCollegeById(@PathVariable Integer id){
		Certificate certificate = service.searchCertificate(id);
		return new ResponseEntity<Certificate>(certificate, HttpStatus.OK);
	}	
	
	//RESTful API method for Create operation
	@PostMapping("/create")
	public void createCertificate(@RequestBody Certificate certificate) {
		service.addCertificate(certificate);
	}	
	
	// RESTful API method for Delete operation
	@DeleteMapping("/delete/{id}")
	public void deleteCertificateById(@PathVariable Integer id) {
		service.deleteCertificate(id);
	}
	
	//RESTful API method for Update operation
	@PutMapping("/update/{id}")
	public void updateCertificate(@PathVariable Integer id,@RequestBody Certificate certificateDetails){
		service.updateCertificate(id, certificateDetails);
	}
	
}
