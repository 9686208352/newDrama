package com.test.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.StudentEntity;
import com.test.demo.repo.StudentRpo;
import com.test.demo.service.StudentService;

@Service
public class ServiceImpl implements StudentService {
	
	@Autowired
	StudentRpo repo;
	public void save(Long id, String name, String address, Float salary) {
		
		StudentEntity entity = new StudentEntity();
		
		entity.setId(id);
		entity.setName(name);
		entity.setAddress(address);
		entity.setSalary(salary);
		
		repo.save(entity);
		
	}
	@Override
	public StudentEntity find(Long id) {
		
		return repo.findById(id).get();
		
		
	}
//	public StudentEntity findByString(String name) {
//		
//		
//	}
	@Override
	public StudentEntity findByName(String name) {
		// TODO Auto-generated method stub
		 return repo.findByName(name);
	}
	@Override
	public List<StudentEntity> findAll() {
		
		return repo.findAll();
	}

}
