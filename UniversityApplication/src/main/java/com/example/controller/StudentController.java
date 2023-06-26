package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {

	private StudentService studentservice;
	
	public StudentController(StudentService studentservice) {
		this.studentservice = studentservice;
	}
	
	@GetMapping("/search")
	public Student getbyEnrolNo(@PathVariable int enrolNo) {
		return studentservice.searchbyEnrolNo(enrolNo);
	}
	
}
