package com.training.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@GetMapping("/message")
	public String getEmployeeMessage() {
		return "Hi Reda";
	}
	
	@GetMapping("/message/{empname}")
	public String getEmployeeMessage2(@PathVariable("empname") String eName) {
		return "Hi " + eName;
	}
	
	@GetMapping("/message/{num1}/and/{num2}")
	public String getEmployeeMessage3(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
		return "Sum of the two numbers are: " + (num1+num2);
	}
//	public EmployeeController() {
//		// TODO Auto-generated constructor stub
//	}
	@GetMapping("/message/{empname}/{place}")
	public String getEmployeeMessage4(@PathVariable("empname") String name, @PathVariable("place") String place) {
		return name + " is based out of " + place;
	}
	
	@PostMapping("/message")
	public String getEmployeeMessage5(@RequestBody Employee employee) {
		return "Hi " + employee.getEmployeeName() + ". Your record was saved successfully. Here are your records: " + employee;
	}
	
	@PutMapping("/message")
	public String getEmployeeMessage6() {
		return "Hi GalaxE - PUT";
	}
	
	@DeleteMapping("/message")
	public String getEmployeeMessage7() {
		return "Hi GalaxE - DELETE";
	}
}
