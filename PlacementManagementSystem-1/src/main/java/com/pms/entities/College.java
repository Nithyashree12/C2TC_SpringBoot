package com.pms.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colleges")
public class College {
	private Integer id;
	private String name;
	private String Admin;
	private String location;
	
	public College() 
	{
	
	}

	public College(Integer id, String name, String admin, String location) {
		this.id = id;
		this.name = name;
		this.Admin = admin;
		this.location = location;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmin() {
		return Admin;
	}

	public void setAdmin(String admin) {
		Admin = admin;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", Admin=" + Admin + ", location=" + location + "]";
	}
	
}
