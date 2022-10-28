package com.training.targus;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Bag {

	public Bag() {
	}
	

	@GetMapping("welcome")
	public String getDetails() {
//		return "The bag is targus";
		return "Welcome to Hi App";
	}
}
