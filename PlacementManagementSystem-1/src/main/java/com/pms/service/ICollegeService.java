package com.pms.service;

import java.util.List;

import com.pms.entities.College;


public interface ICollegeService {

	
	void updateCollege(Integer id,College collegeDetails);
	
	void deleteCollege(Integer id);

	List<College> listAllColleges();

	void addCollege(College college);

	College searchCollege(Integer id);
}
