package com.tvsmotor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.entity.User;
import com.tvsmotor.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/user")
	ResponseEntity<User> addUser(@RequestBody User user)
	{
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
	}
	
	@GetMapping("/user")
	ResponseEntity<List<User>> getUser()
	{
		return new ResponseEntity<List<User>>(userRepository.findAll(), HttpStatus.OK);
	}
}
