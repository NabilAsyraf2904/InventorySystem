package com.inventory.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ButtonController {

	@GetMapping("/buttons")
	public String button() {
		
		return "buttons";
	}
}
