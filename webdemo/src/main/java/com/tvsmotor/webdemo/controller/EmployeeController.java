package com.tvsmotor.webdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	
	@GetMapping("/showmessage")
	public String dislayMessage()
	{
		return "This is web demo";
	}
	
	@GetMapping("/home")
	public String dislayMessage2()
	{
		return "This is home";
	}

}
