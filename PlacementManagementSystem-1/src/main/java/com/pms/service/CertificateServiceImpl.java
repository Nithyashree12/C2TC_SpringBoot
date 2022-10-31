package com.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.entities.Certificate;
import com.pms.repository.ICertificateRepository;

	@Service
	@Transactional
	public class CertificateServiceImpl implements ICertificateService {
		
		@Autowired
		private ICertificateRepository repo;	
		
		@Override
		public void addCertificate(Certificate certificate) {
			repo.save(certificate);
		}
			
		@Override
		public void updateCertificate(Integer id,Certificate certificateDetails) {	
			 Certificate updateCertificate = this.searchCertificate(id);
			 updateCertificate.setYear(certificateDetails.getYear());
			 updateCertificate.setCollege(certificateDetails.getCollege());
			
			// updateCollege.setCollege(collegeDetails.getCollege());
			 this.addCertificate(updateCertificate);
		}
		
		@Override
		public Certificate searchCertificate(Integer id) {
			return repo.findById(id).get();
		}
		
		@Override
		public void deleteCertificate(Integer id) {
			repo.deleteById(id);
		}

		@Override
		public List<Certificate> listAllCertificates() {
			return repo.findAll();
		}
		
	}

