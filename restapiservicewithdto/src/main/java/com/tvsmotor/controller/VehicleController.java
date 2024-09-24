package com.tvsmotor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.dto.VehicleDto;
import com.tvsmotor.service.VehicleService;

@RestController
@RequestMapping("/api/v1")
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("/vehicle")
	public VehicleDto addVehicle(@RequestBody VehicleDto vehicleDto)
	{
		return vehicleService.addVehicle(vehicleDto);
	}
	
	@GetMapping("/vehicle")
	public List<VehicleDto> viewAllVehicles()
	{
		return vehicleService.viewAllVehicle();
	}
	
	@DeleteMapping("/vehicle/{id}")
	public String deleteVehicleById(@PathVariable int id)
	{
		return vehicleService.deleteVehicleById(id);
	}
}
