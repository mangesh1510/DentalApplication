package com.example.shivam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RequestMapping("/")
public class html {
	
	    
	    public String home() {
	        return "index"; // Ensures index.html is served
	    }
	}


