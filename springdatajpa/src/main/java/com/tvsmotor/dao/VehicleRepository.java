package com.tvsmotor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvsmotor.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> 
{
	
}
