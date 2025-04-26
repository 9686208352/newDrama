package com.test.demo.service;

import java.util.List;

import com.test.demo.entity.StudentEntity;

public interface StudentService {
	
	public void save(Long id, String name, String address, Float salary);

	public StudentEntity find(Long id);
	public StudentEntity findByName(String name);

	public List<StudentEntity> findAll();

}
