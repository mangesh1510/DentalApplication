package com.example.shivam.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.shivam.Repo.RegisterRepo;
import com.example.shivam.model.User;

@Service
public class RegistrationService {
	@Autowired
	public  RegisterRepo repo;
	
	

	

	public String registerUser(User user) {
		if(repo.findByEmail(user.getEmail())!=null) {
			throw new RuntimeException("Email already exists");
		}
		repo.save(user);
		return "register saved succesfully";
		
		
	}
	

}
