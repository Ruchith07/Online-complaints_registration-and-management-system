package com.onlinecomplaints.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class callingindex {
	
	@GetMapping("home")
	public String homepage2() {
		return ("index");
	}
	
	@GetMapping("/RegistrationForm")
	public String homepage() {
		
		return ("complaintlist");
	}
	
	@RequestMapping("/form")
	public String gotoform() {
		return ("form");
	}
}

