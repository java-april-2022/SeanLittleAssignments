package com.sean.saveTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sean.saveTravels.models.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Long> {
	List<Expense> findAll();
	
}
