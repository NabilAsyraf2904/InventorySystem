package com.inventory.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryController {

	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
}
