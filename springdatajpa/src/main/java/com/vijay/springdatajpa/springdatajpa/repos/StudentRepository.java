package com.vijay.springdatajpa.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.springdatajpa.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
