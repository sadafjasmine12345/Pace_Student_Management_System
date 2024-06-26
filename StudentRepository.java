package com.pace.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pace.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}