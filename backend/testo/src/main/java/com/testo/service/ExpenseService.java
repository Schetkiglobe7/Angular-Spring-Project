package com.testo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testo.model.Expense;

@Service
public interface ExpenseService {

	List<Expense>findAll();
	
	Expense save(Expense expense);
	
	Expense findById(Long id);
	
	void delete(Long id);
}
