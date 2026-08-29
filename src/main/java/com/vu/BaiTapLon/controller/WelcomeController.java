package com.vu.BaiTapLon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/") 
		public String index() {
			return "main";
		}

	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
