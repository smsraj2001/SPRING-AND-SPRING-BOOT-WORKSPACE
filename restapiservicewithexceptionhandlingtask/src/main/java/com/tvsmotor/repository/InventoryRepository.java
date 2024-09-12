package com.tvsmotor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvsmotor.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> 
{
	
}
