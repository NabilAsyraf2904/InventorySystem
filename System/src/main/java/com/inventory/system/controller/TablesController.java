package com.inventory.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TablesController {

	@GetMapping("/tables")
	public String tables() {
		
		return "tables";
	}
}
