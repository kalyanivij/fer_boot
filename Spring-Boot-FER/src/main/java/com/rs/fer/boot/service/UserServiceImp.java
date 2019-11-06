package com.rs.fer.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candidjava.spring.repository.UserRepository;
import com.rs.fer.boot.bean.Expense;
import com.rs.fer.boot.bean.User;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository userRepository;

	public void createUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public List<User> getUser() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	public User findById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

	public User update(User user, long l) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
	}

	public User updatePartially(User user, long id) {
		// TODO Auto-generated method stub
		User usr = findById(id);
		usr.setCountry(user.getCountry());
		return userRepository.save(usr);
	}

	@Override
	public void create(User user) {
		userRepository.save(user);		
	}

	@Override
	public Object load(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Expense expense) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Expense expense) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Expense expense) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, String currentPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Expense> getExpenses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expense> expenseReport(String expense_type, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Expense findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		
	}



}
