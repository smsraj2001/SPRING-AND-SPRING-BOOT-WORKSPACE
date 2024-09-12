package com.tvsmotor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.entity.Inventory;
import com.tvsmotor.service.InventoryService;

@RestController
@RequestMapping("/api/v2")
public class InventoryController
{
	@Autowired
	InventoryService inventoryService;
	
	@PostMapping("/inventory")
	ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory)
	{
		return new ResponseEntity<Inventory>(inventoryService.addInventory(inventory), HttpStatus.OK);
	}
	
	@GetMapping("/inventory")
	ResponseEntity<List <Inventory>> viewAllInventory()
	{
		return new ResponseEntity<List<Inventory>>(inventoryService.viewAllInventory(), HttpStatus.OK);
	}
	
	@GetMapping("/inventory/{id}")
	ResponseEntity<Inventory> viewInventoryById(@PathVariable int id)
	{
		return new ResponseEntity<Inventory>(inventoryService.viewInventoryById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/inventory/{id}")
	ResponseEntity<String> deleteInventoryById(@PathVariable int id)
	{
		return new ResponseEntity<String>(inventoryService.deleteInventoryById(id), HttpStatus.OK);
	}
	
}
