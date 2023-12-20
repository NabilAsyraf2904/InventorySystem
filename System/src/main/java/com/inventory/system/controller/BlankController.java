package com.inventory.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlankController {

	@GetMapping("/blank")
	public String blank() {
		
		return "blank";
	}
}
