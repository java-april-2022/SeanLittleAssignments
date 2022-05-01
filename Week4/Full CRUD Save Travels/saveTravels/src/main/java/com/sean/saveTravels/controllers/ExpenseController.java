package com.sean.saveTravels.controllers;

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

import com.sean.saveTravels.models.Expense;
import com.sean.saveTravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	
	@GetMapping("/")
	public String index(Model expenseModel) {
		List<Expense> expenses = expenseService.getAllExpenses();
		expenseModel.addAttribute("allExpenses", expenses);
		return "index.jsp";
	}
	
	@GetMapping("/new")
	public String newExpense(@ModelAttribute("newExpense") Expense newExpense) {
		return "new.jsp";
	}
	
	@PostMapping("/create")
	public String createExpense(@Valid @ModelAttribute("newExpense") Expense newExpense, BindingResult results) {
		if(results.hasErrors()) {
			return "new.jsp";
		}
		expenseService.createExpense(newExpense);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable long id, Model model) {
		Expense editExpense = expenseService.expenseDetails(id);
		model.addAttribute("editExpense", editExpense);
		return "edit.jsp";
	}
	
	@PutMapping("/update/{id}")
	public String updateExpense(@ModelAttribute("editExpense") Expense editedExpense, @PathVariable long id, BindingResult results) {
		if(results.hasErrors()) {
			return "new.jsp";
		}
		expenseService.updateExpense(editedExpense);
		return "redirect:/";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteExpense(@PathVariable Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
	
	@GetMapping("expenseDetails/{id}")
	public String expenseDetails(@PathVariable Long id, Model model) {
		Expense expense = expenseService.expenseDetails(id);
		model.addAttribute("expense",expense);
		return "details.jsp";
	}
	
	
	
}
