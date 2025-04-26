package com.test.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.StudentEntity;

@Repository
public interface StudentRpo extends JpaRepository<StudentEntity,Long> {

	StudentEntity findByName(String name);
	java.util.List<StudentEntity> findAll();

}
