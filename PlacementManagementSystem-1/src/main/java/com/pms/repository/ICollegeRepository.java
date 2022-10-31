package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.entities.College;

public interface ICollegeRepository extends JpaRepository<College, Integer>{

}
