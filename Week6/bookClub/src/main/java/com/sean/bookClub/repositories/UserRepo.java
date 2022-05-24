package com.sean.bookClub.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sean.bookClub.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	User findByEmail(String email);	
}

//public interface UserRepo extends CrudRepository<User, Long> {
//	List<User> findAll();
//	public List<User> findByDojoId(Long dojoId);
//}
