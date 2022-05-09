package com.sean.dojosNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sean.dojosNinjas.models.Student;
import com.sean.dojosNinjas.repositories.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	
	public List<Student> getAllStudents(){
		//Business logic
		return studentRepo.findAll();
	}
	
	public void createStudent(Student student) {
		studentRepo.save(student);
	}
	
	public void updateStudent(Student student) {
		studentRepo.save(student);
	}
	
	public void deleteStudent(long id) {
		studentRepo.deleteById(id);
	}
	
	public Student studentDetails(long id) {
		return studentRepo.findById(id).orElse(null);
		
	}
	public List<Student> getAllByDojoId(Long dojoId){
		return studentRepo.findByDojoId(dojoId);
	}
}
