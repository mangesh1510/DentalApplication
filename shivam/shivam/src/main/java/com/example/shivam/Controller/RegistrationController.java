package com.example.shivam.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.shivam.Service.RegistrationService;
import com.example.shivam.model.User;

@RestController
@RequestMapping("/api/UserInfo")
public class RegistrationController {
	@Autowired
	 private RegistrationService  Rservice;
	 
	
	     @PostMapping("/registerUser")
	    public String registerUser(@RequestBody User user) {
	       return  Rservice.registerUser(user);
	        
	    }
	
	
	

}
