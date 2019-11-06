package com.rs.fer.boot.service;

import java.util.List;

import org.apache.catalina.User;

import com.rs.fer.boot.bean.Expense;

public interface FERService {

	boolean registration(User user);
	
	boolean login(String username, String password);

	boolean addExpense(Expense expense);

	void editExpense(Expense expense);

	public void deleteUserById(long id);


	Expense getExpense(int expenseId);

	Iterable<Expense> getExpenses(int userId);


	Iterable<Expense> expenseReport(int userId, String type, String fromDate, String toDate);

	boolean resetPassword(String newPassword, String currentPassword, long id);

	List<User> getUser();
	
}
