package com.sean.omikuji.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/getInfo")
	public String getInfo(
			@RequestParam int num, 
			@RequestParam ("city") String city,
			@RequestParam ("person") String person,
			@RequestParam ("hobby") String hobby,
			@RequestParam ("livingThing") String livingThing,
			@RequestParam ("niceThing") String niceThing,
			HttpSession session) {
		
		String result = String.format("In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.", num, city, person, hobby, livingThing, niceThing);
		session.setAttribute("result", result);
		
//		omikujiModel.addAttribute("city", city);
//		omikujiModel.addAttribute("person", person);
//		omikujiModel.addAttribute("hobby", hobby);
//		omikujiModel.addAttribute("livingThing", livingThing);
//		omikujiModel.addAttribute("niceThing", niceThing);
		
		return "redirect:/result";
	}
	
	@GetMapping("/result")
	public String result(HttpSession session, Model model) {
		String result = (String) session.getAttribute("result");
		model.addAttribute("result", result);
		
		return "result.jsp";
	}
	
	@GetMapping("/again")
	public String again() {
		return "redirect:/";
	}
	
	

}
