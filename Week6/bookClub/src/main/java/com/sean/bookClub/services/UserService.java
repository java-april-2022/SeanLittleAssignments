package com.sean.bookClub.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.sean.bookClub.models.LoginUser;
import com.sean.bookClub.models.User;
import com.sean.bookClub.repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	//Validate User
	public void validate(User newUser, Errors errors) {
		//Password matching
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			errors.rejectValue("password", "mismatch", "Password does not match");
		}
		//Password duplicate
		if(userRepo.findByEmail(newUser.getEmail())!=null) {
			errors.rejectValue("email", "unique", "Eamil is already taken");
		}
	}
	//Hash student's password and add to database
	public void registerUser(User newUser) {
		String hashedPass = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashedPass);
		userRepo.save(newUser);
	}
	//Find User by email
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	//Find User by id
	public User findById(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	//Authenticate User
	public boolean authenticateUser(LoginUser newLogin, Errors errors) {
		//Find User by email
		User user = userRepo.findByEmail(newLogin.getEmail());
		//If student not found by email return false
		if(user == null) {
			errors.rejectValue("email", "missingEmail", "Email not found");
			return false;
		}
		else {
			if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
				errors.rejectValue("password", "Matches", "Invalid Passowrd");
				return false;
			}
		}
		//If User found check that passwords match, return true, else return false
		return true;
	}
	
	
	
	
}

//public void updateStudent(User user) {
//	userRepo.save(user);
//}
//
//public void deleteStudent(long id) {
//	userRepo.deleteById(id);
//}
//
//public User studentDetails(long id) {
//	return userRepo.findById(id).orElse(null);
//	
//}

//	public List<User> getAllByDojoId(Long dojoId){
//		return userRepo.findByDojoId(dojoId);
//	}

//	public List<User> getAllStudents(){
//		//Business logic
//		return userRepo.findAll();
//	}