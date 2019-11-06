package com.candidjava.spring.repository;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByUsernameAndPassword(String username, String password);
}
