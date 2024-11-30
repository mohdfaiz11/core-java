package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Student;
import com.example.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired 
	StudentService service;
	
	@PostMapping
	ResponseEntity<Student> createStudent(@RequestBody Student student){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createStudent(student));
		
	}
	
	@PutMapping
	ResponseEntity<Student> updateStudent(@RequestBody Student student){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.updateStudent(student));
	}
	
	@GetMapping
	ResponseEntity<List<Student>> getAllStudents(){
		
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllStudents());
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Student> getById(@PathVariable Integer id){
		
		return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
	}
	@DeleteMapping("/{id}")

	ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		
		service.deleteStudent(id);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
