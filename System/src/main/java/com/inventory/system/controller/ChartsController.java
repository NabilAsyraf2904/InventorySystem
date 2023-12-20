package com.inventory.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartsController {

	@GetMapping("/charts")
	public String charts() {
		
		return "charts";
	}
}
