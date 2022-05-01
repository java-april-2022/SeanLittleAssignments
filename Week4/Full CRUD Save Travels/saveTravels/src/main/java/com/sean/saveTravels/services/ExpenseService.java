package com.sean.saveTravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sean.saveTravels.models.Expense;
import com.sean.saveTravels.repositories.ExpenseRepo;

@Service
public class ExpenseService {
	
	@Autowired
	private ExpenseRepo expenseRepo;

	
	public List<Expense> getAllExpenses(){
		//Business logic
		return expenseRepo.findAll();
	}
	
	public void createExpense(Expense expense) {
		expenseRepo.save(expense);
	}
	
	public void updateExpense(Expense expense) {
		expenseRepo.save(expense);
	}
	
	public void deleteExpense(long id) {
		expenseRepo.deleteById(id);
	}
	
	public Expense expenseDetails(long id) {
		return expenseRepo.findById(id).orElse(null);
		
	}
}
