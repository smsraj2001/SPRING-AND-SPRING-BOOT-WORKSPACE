package com.tvsmotor.service;

import java.util.List;

import com.tvsmotor.entity.Inventory;

public interface InventoryService {
	
	Inventory addInventory(Inventory inventory);
	List<Inventory> viewAllInventory();
	Inventory viewInventoryById(int id);
	String deleteInventoryById(int id);
	Inventory updateInventoryById(int id, Inventory inventory);
}
