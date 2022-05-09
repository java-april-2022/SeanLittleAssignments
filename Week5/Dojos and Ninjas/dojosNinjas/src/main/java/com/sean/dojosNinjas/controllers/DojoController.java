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

import com.sean.dojosNinjas.models.Dojo;
import com.sean.dojosNinjas.services.DojoService;
import com.sean.dojosNinjas.services.StudentService;

@Controller
public class DojoController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/")
	public String index(Model dojoModel) {
		List<Dojo> dojos = dojoService.getAllDojos();
		dojoModel.addAttribute("allDojos", dojos);
		return "index.jsp";
	}
	
	@GetMapping("/new")
	public String newDojo(@ModelAttribute("newDojo") Dojo newDojo) {
		return "new.jsp";
	}
	
	@PostMapping("/create")
	public String createDojo(@Valid @ModelAttribute("newDojo") Dojo newDojo, BindingResult results) {
		if(results.hasErrors()) {
			return "new.jsp";
		}
		dojoService.createDojo(newDojo);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editDojo(@PathVariable long id, Model model) {
		Dojo editDojo = dojoService.dojoDetails(id);
		model.addAttribute("editDojo", editDojo);
		return "edit.jsp";
	}
	
	@PutMapping("/update/{id}")
	public String updateDojo(@ModelAttribute("editDojo") Dojo editedDojo, @PathVariable long id, BindingResult results) {
		if(results.hasErrors()) {
			return "new.jsp";
		}
		dojoService.updateDojo(editedDojo);
		return "redirect:/";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDojo(@PathVariable Long id) {
		dojoService.deleteDojo(id);
		return "redirect:/";
	}
	
	@GetMapping("dojoDetails/{id}")
	public String dojoDetails(@PathVariable Long id, Model model, Dojo dojo) {
		dojo = dojoService.dojoDetails(id);
		model.addAttribute("dojo",dojo);
		model.addAttribute("allStudents", studentService.getAllByDojoId(id));
		return "details.jsp";
	}
	
	
	
}
