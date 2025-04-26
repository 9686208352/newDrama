package com.test.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="newtable")
public class StudentEntity {
	private Long id;
	private String name;
	private String address;
	private Float salary;
	
	
	@Id
	@Column(name ="id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
	
		this.id = id;
	}
	@Column(name ="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name ="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name ="salary")
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	

}
