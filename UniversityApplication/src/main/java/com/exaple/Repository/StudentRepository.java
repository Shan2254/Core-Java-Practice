package com.exaple.Repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{
	
	 Student findById(int enrolNo);


	Student findByName(String name);

}
