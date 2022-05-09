package com.sean.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.sean.dojosNinjas.models.Student;
import com.sean.dojosNinjas.services.DojoService;
import com.sean.dojosNinjas.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService StudentService;
	
	@Autowired
	private DojoService DojoService;
	
	
	@GetMapping("/student")
	public String index(Model studentModel) {
		List<Student> students = StudentService.getAllStudents();
		studentModel.addAttribute("allStudents", students);
		return "studentIndex.jsp";
	}
	
	@GetMapping("/new/student")
	public String newStudent(@ModelAttribute("newStudent") Student newStudent, Model model) {
		model.addAttribute("allDojos", DojoService.getAllDojos());
		return "studentNew.jsp";
	}
	
	@PostMapping("/create/student")
	public String createStudent(@Valid @ModelAttribute("newStudent") Student newStudent, BindingResult results) {
		if(results.hasErrors()) {
			return "studentIndex.jsp";
		}
		StudentService.createStudent(newStudent);
		return "redirect:/student";
	}
	
	@GetMapping("/edit/student/{id}")
	public String editStudent(@PathVariable long id, Model studentModel, Model model) {
		Student editStudent = StudentService.studentDetails(id);
		model.addAttribute("allDojos", DojoService.getAllDojos());
		studentModel.addAttribute("editStudent", editStudent);
		return "studentEdit.jsp";
	}
	
	@PutMapping("/update/student/{id}")
	public String updateStudent(@ModelAttribute("editStudent") Student editedStudent, @PathVariable long id, BindingResult results) {
		if(results.hasErrors()) {
			return "studentNew.jsp";
		}
		StudentService.updateStudent(editedStudent);
		return "redirect:/student";
	}
	
	@DeleteMapping("/delete/student/{id}")
	public String deleteStudent(@PathVariable Long id) {
		StudentService.deleteStudent(id);
		return "redirect:/student";
	}
	
	@GetMapping("studentDetails/{id}")
	public String studentDetails(@PathVariable Long id, Model studentModel) {
		Student student = StudentService.studentDetails(id);
		studentModel.addAttribute("student",student);
		return "studentDetails.jsp";
	}
	
	
	
}
