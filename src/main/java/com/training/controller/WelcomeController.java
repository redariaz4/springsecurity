package com.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class WelcomeController {

	public WelcomeController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("welcome")
	public String home() {
		return "Welcome to GalaxE";
	}
}
