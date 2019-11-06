package com.rs.fer.boot.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candidjava.spring.repository.AddressRepository;
import com.candidjava.spring.repository.ExpenseRepository;
import com.candidjava.spring.repository.UserRepository;
import com.rs.fer.boot.bean.Expense;

@Service
@Transactional
public class FERServiceImp implements FERService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ExpenseRepository expenseRepository;
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public boolean registration(User user) {
		return userRepository.save(user) != null;
	}

	@Override
	public boolean login(String username, String password) {
		List<User> users=userRepository.findByUsernameAndPassword(username,password);
		return (users!= null && !users.isEmpty());
	}

	@Override
	public boolean addExpense(Expense expense) {
		return expenseRepository.save(expense) != null;
	}

	@Override
	public void editExpense(Expense expense) {
		expenseRepository.save(expense);
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Expense getExpense(int expenseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Expense> getExpenses(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Expense> expenseReport(int userId, String type, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resetPassword(String newPassword, String currentPassword, long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getUser() {
		return (List<User>) userRepository.findAll();
	}

}
