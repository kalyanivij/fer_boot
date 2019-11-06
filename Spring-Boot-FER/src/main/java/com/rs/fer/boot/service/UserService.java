package com.rs.fer.boot.service;

import java.util.List;

import com.rs.fer.boot.bean.Expense;
import com.rs.fer.boot.bean.User;

public interface UserService {
	
	// registration
			public void create(User user);

		//login
			Object load(String username, String password);

		//addExpense
			public void create(Expense expense);

		//editExpense
			public void update(Expense expense);

		//deletExpense
			public void delete(Expense expense);

		//reset password
			public void update(int id, String currentPassword, String newPassword);

		//get expenses
			 List<Expense> getExpenses();

		//get expense
		 Expense findById(int id);

		//expense report
			List<Expense> expenseReport(String expense_type, String fromDate, String toDate);

		//get user
			User findByUser(int id);

		//update user
			public void update(User user);


	}

