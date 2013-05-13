package com.immostar.repository;

import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.immostar.domain.User;

public interface UserRepository extends CrudRepository<User, ObjectId>, QueryDslPredicateExecutor<User> {

	public User findUserByUserNameAndPassword(String userName, String password);
	
	public User findUserByUserName(String userName);
	
	public User findUserByEmail(String email);
}
