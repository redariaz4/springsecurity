package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.controller.EmployeeController;
import com.training.controller.WelcomeController;
import com.training.model.Employee;
import com.training.targus.Bag;
import com.training.targus.Bill;

@SpringBootApplication
@RestController
public class ProductAppGalaxeBatch1Application {

   public static void main(String[] args) {
        SpringApplication.run(ProductAppGalaxeBatch1Application.class, args);
   }
   
//   @Autowired
//   Payment payment;
//   
//   @Autowired
//   Bag bag;
//   
//   @Autowired
//   Bill bill;
//   
//   @Autowired
//   WelcomeController controller;
   @Autowired
   EmployeeController employeeController;
   
   @GetMapping("/")
   public String display() {
       return "Reda Riaz";
   }
}