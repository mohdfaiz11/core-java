package com.example.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
