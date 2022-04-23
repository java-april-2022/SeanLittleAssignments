package com.sean.daikichi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")	
	public String home() {
		return "Howdy!";
	}
	
	@RequestMapping("/today")	
	public String today() {
		return "Today you will find luck in all of your endeavors!";
	}
	
	@RequestMapping("/tomorrow")	
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
		
	@RequestMapping("/travel/{city}")	
	public String travel(@PathVariable String city) {
		return "Congratulations! You will soon travel to " + city + "!";
	}
	
	@RequestMapping("/lotto/{num}")	
	public String lotto(@PathVariable int num) {
		if (num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers...";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends...";
			
		}
	}
		
	@RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        
        return "index.jsp";
    }
    //...
    

	}

	
	

	
