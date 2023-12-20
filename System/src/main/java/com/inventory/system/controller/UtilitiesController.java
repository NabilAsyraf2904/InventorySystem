package com.inventory.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilitiesController {

	@GetMapping("/animation")
	public String animation() {
		
		return "utilities-animation";
	}
	
	@GetMapping("/border")
	public String border() {
		
		return "utilities-border";
	}
	
	@GetMapping("/color")
	public String color() {
		
		return "utilities-color";
	}
	
	@GetMapping("/other")
	public String other() {
		
		return "utilities-other";
	}
	
}
