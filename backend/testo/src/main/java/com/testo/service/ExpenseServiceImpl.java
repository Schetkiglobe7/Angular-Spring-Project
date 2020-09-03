package com.testo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testo.model.Expense;
import com.testo.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expRep;

	@Override
	public List<Expense> findAll() {
		return expRep.findAll();
		
	}
	
	@Override
	public Expense save(Expense expense) {
		// TODO Auto-generated method stub
		expRep.save(expense);
		return expense;
	}
	
	@Override
	public Expense findById(Long id) {
		// TODO Auto-generated method stub
		return expRep.findById(id).isPresent() == true ?  expRep.findById(id).get() : null;
	}
	
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Expense expense = findById(id);
		expRep.delete(expense);
	}
}
