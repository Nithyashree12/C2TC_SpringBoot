package com.pms.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.entities.College;
import com.pms.repository.ICollegeRepository;

@Service
@Transactional
public class CollegeServiceImpl implements ICollegeService {
	
	@Autowired
	private ICollegeRepository repo;	
	
	@Override
	public void addCollege(College college) {
		repo.save(college);
	}
		
	@Override
	public void updateCollege(Integer id,College collegeDetails) {	
		 College updateCollege = this.searchCollege(id);
		 updateCollege.setName(collegeDetails.getName());
		 updateCollege.setAdmin(collegeDetails.getAdmin());
		 updateCollege.setLocation(collegeDetails.getLocation());
		
		// updateCollege.setCollege(collegeDetails.getCollege());
		 this.addCollege(updateCollege);
	}
	
	@Override
	public College searchCollege(Integer id) {
		return repo.findById(id).get();
	}
	
	@Override
	public void deleteCollege(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<College> listAllColleges() {
		return repo.findAll();
	}
	
}