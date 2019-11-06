package com.candidjava.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.rs.fer.boot.bean.User;
public interface UserRepository extends CrudRepository<User, Long>
{
	

}
