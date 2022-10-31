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

import com.pms.entities.College;
import com.pms.service.ICollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController{
		
	@Autowired
	private ICollegeService service;
		
	// RESTful API methods for Retrieval operations
	@GetMapping("/list")
	public List<College> getAllColleges(){
		return service.listAllColleges();
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<College> getCollegeById(@PathVariable Integer id){
		College college = service.searchCollege(id);
		return new ResponseEntity<College>(college, HttpStatus.OK);
	}	
	
	//RESTful API method for Create operation
	@PostMapping("/create")
	public void createCollege(@RequestBody College college) {
		service.addCollege(college);
	}	
	
	// RESTful API method for Delete operation
	@DeleteMapping("/delete/{id}")
	public void deleteCollegeById(@PathVariable Integer id) {
		service.deleteCollege(id);
	}
	
	//RESTful API method for Update operation
	@PutMapping("/update/{id}")
	public void updateCollege(@PathVariable Integer id,@RequestBody College collegeDetails){
		service.updateCollege(id, collegeDetails);
	}
	
}



