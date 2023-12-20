package com.inventory.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

	
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/forgotpassword")
	public String forgotPassword() {
		
		return "forgot-password";
	}
}
