package com.example.services;

import java.util.List;

import com.example.entities.Student;

public interface StudentService {
	
	//create 
	
	Student createStudent(Student student);
	
	//update
	
	Student updateStudent(Student student);
	
	//get all student
	
	List<Student> getAllStudents();
	
	//get by id
	
	Student getById(Integer id);
	
	//delete
	
	void deleteStudent(Integer id);

}
