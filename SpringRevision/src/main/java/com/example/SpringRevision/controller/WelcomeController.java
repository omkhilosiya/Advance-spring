package com.example.SpringRevision.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String welcomeMessage() {	
		return "hello its working";
	}	

}
