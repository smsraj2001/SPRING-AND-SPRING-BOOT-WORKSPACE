package com.tvsmotor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvsmotor.entity.Inventory;
import com.tvsmotor.exception.IdNotFoundException;
import com.tvsmotor.exception.InValidCategoryException;
import com.tvsmotor.exception.InValidPriceException;
import com.tvsmotor.exception.OutOfStockException;
import com.tvsmotor.repository.InventoryRepository;

@Service // It will configure the bean
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired // It will inject the bean
	InventoryRepository inventoryRepository;

	@Override
	public Inventory addInventory(Inventory inventory) {
		if(inventory.getPrice() < 40000)
		{
			throw new InValidPriceException("Invalid Price...");
		}
		if(inventory.getStock() <= 0)
		{
			throw new OutOfStockException("Invalid Stock...");
		}
//		if(!(inventory.getCategory().equals("Electric")) || !(inventory.getCategory().equals("Motorcycles")) || !(inventory.getCategory().equals("Mopeds")) || !(inventory.getCategory().equals("Scooters")) || !(inventory.getCategory().equals("Three Wheelers")))
//		{
//			throw new InValidCategoryException("Invalid Category...");
//		}
		return inventoryRepository.save(inventory);
	}

	@Override
	public List<Inventory> viewAllInventory() {
		// TODO Auto-generated method stub
		return inventoryRepository.findAll();
	}

	@Override
	public Inventory viewInventoryById(int id) {
	
		Optional<Inventory> opInventory = inventoryRepository.findById(id);
		if(opInventory.isPresent())
		{
			throw new IdNotFoundException("The given id " + id + " is Invalid.");
		}
		return opInventory.get();
	}

	@Override
	public String deleteInventoryById(int id) {
		Inventory inventory = inventoryRepository.findById(id).orElseThrow(() -> new IdNotFoundException("Invalid ID to delete"));
		inventoryRepository.delete(inventory);
		
		return "Vehicle with ID " + id + " is deleted.";
	}

	@Override
	public Inventory updateInventoryById(int id, Inventory inventory) {
		
		if(inventory.getPrice() < 40000)
		{
			throw new InValidPriceException("Invalid Price...");
		}
		if(inventory.getStock() <= 0)
		{
			throw new OutOfStockException("Invalid Stock...");
		}
		if(!inventory.getCategory().equals("Electric") || !inventory.getCategory().equals("Motorcycles") || !inventory.getCategory().equals("Mopeds") || !inventory.getCategory().equals("Scooters") || !inventory.getCategory().equals("Three Wheelers"))
		{
			throw new InValidCategoryException("Invalid Category...");
		}
		
		return inventoryRepository.findById(id)
		        .map(inv -> {
		        	inv.setName(inventory.getName());
		        	inv.setEngine(inventory.getEngine());
		        	inv.setPower(inventory.getPower());
		        	inv.setWeight(inventory.getWeight());
		        	inv.setCategory(inventory.getCategory());
		        	inv.setStock(inventory.getStock());
		        	inv.setType(inventory.getType());
		        	inv.setPrice(inventory.getPrice());
		            return inventoryRepository.save(inv);
		        }).orElseThrow(() -> new IdNotFoundException("Invalid ID to delete"));		
	}
}
