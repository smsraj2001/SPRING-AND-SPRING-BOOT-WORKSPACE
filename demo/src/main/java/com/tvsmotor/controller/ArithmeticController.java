package com.tvsmotor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.model.Arithmetic;

@RestController
@RequestMapping("/api/arithmetic")
public class ArithmeticController {
	
//	@GetMapping("/add")
//	public int add()
//	{
//		return 0;
//	}
//}
	@PostMapping("/add")
	public int add(@RequestBody Arithmetic arithmetic)
	{
		return arithmetic.getNum1() + arithmetic.getNum2();
	}
	
	@PostMapping("/subbu")
	public int subtraction(@RequestBody Arithmetic arithmetic)
	{
		return arithmetic.getNum1() - arithmetic.getNum2();
	}
}