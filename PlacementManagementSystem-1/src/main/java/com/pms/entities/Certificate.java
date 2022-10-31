package com.pms.entities;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="certificates")
public class Certificate {
 private Integer id;
 private String year;
 private String college;
 
public Certificate() {
	
}
public Certificate(Integer id, String year, String college) {
	
	this.id = id;
	this.year = year;
	this.college = college;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
@Override
public String toString() {
	return "Certificate [id=" + id + ", year=" + year + ", college=" + college + "]";
}


}
