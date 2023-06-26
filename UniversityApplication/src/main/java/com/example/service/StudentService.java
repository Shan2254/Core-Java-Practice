package com.example.service;

import com.exaple.Repository.StudentRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.*;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	public StudentService(StudentRepository studentrepository) {
		this.studentrepository = studentrepository;
	}
	
	public Student searchbyEnrolNo(int enrolNo) {
		return studentrepository.findById(enrolNo);
	}
	public Student searchbyName(String name)
	{
		return studentrepository.findByName(name);
	}
	
}
