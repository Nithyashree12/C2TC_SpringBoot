package com.pms.service;

import java.util.List;

import com.pms.entities.Certificate;



public interface ICertificateService {
    
	void updateCertificate(Integer id,Certificate certificateDetails);
	
	void deleteCertificate(Integer id);

	List<Certificate> listAllCertificates();

	void addCertificate(Certificate certificate);

	Certificate searchCertificate(Integer id);

	
}

