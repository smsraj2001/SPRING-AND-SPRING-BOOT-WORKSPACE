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
 
import com.tvsmotor.entity.Dealer;
import com.tvsmotor.entity.Vehicle;
import com.tvsmotor.repository.DealerRepository;

@RestController
@RequestMapping("/api/v1")
public class DealerController {
 
	@Autowired
	DealerRepository dealerRepository;
	@PostMapping("/dealer")
	ResponseEntity<Dealer> addUser(@RequestBody Dealer deal)
	{
		return new ResponseEntity<Dealer>(dealerRepository.save(deal),HttpStatus.OK);
	}
 
	@GetMapping("/dealer")
	ResponseEntity<List<Dealer>> getUser()
	{
		return new ResponseEntity<List<Dealer>>(dealerRepository.findAll(),HttpStatus.OK);
	}

}