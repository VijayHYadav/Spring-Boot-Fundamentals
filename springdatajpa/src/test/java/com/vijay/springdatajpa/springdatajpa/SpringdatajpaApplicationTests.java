package com.vijay.springdatajpa.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vijay.springdatajpa.springdatajpa.entities.Student;
import com.vijay.springdatajpa.springdatajpa.repos.StudentRepository;

import static org.junit.Assert.*;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("vijay");
		student.setTestScore(100);
		repository.save(student);

		Student savedStudent = repository.findById(1l).get();
		assertNotNull(savedStudent);
	}

}
