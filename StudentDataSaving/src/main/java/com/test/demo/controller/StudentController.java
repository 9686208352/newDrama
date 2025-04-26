package com.test.demo.controller;

import java.awt.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.StudentEntity;
import com.test.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping(value ="/saveData", method = {RequestMethod.POST})
	public String save(Long id, String name, String address, Float salary) {
		
		service.save(id, name, address, salary);
		
		return "Saved Data Successsfully";
	}
	
	@RequestMapping(value ="/updateData", method = {RequestMethod.PUT})
	public String updateData(Long id, String name, String address, Float salary) {
		service.save(id, name, address, salary);
		return "Data updated";
	}
	@RequestMapping(value ="/findData", method = {RequestMethod.GET})
	public StudentEntity save(Long id) {
	StudentEntity studentEntity = service.find(id);
		return studentEntity;
	}
	@RequestMapping(value ="/findByName", method = {RequestMethod.GET})
	public StudentEntity save(String name) {
		
	StudentEntity studentEntity = service.findByName(name);
		return studentEntity;
	}
	
	
	@RequestMapping(value = "/findAll", method = {RequestMethod.GET})
   java.util.List<StudentEntity> findAll(){
		
		java.util.List<StudentEntity> all = service.findAll();
		return all;	   
   }
	

}
