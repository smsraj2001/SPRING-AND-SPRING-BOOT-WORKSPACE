package com.tvsmotor.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.model.Vehicle;

@RestController
@RequestMapping("/api/v1")
public class VehicleController {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public VehicleController() {
        vehicles.add(new Vehicle(1, "apache", "bike", 56000));
        vehicles.add(new Vehicle(2, "raider", "bike", 46000));
    }

    @PostMapping("/vehicle")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }

    @GetMapping("/vehicles") // Changed to more descriptive path
    public ArrayList<Vehicle> getAllVehicles() { // Renamed method
        return vehicles;
    }
    
    
    @GetMapping("/vehicle/{id}")
//    public List<Vehicle> getVehicleById(@PathVariable int id)
    public Vehicle getVehicleByIdAdd(@PathVariable int id)
    {
    	List<Vehicle> veh = vehicles.stream().filter(v->v.getId() == id).collect(Collectors.toList());
//    	return veh;
    	return veh.get(0);
    }
    
    @DeleteMapping("/deletevehicle/{id}")
    public void getVehicleByIdDelete(@PathVariable int id)
    {
    	List<Vehicle> veh = vehicles.stream().filter(v->v.getId() != id).collect(Collectors.toList());
    	vehicles = (ArrayList<Vehicle>) veh;
    	
    	// vehicles.removeIf(v->v.getId() == id);
    }
    
    @PutMapping("/putvehicle/{id}")
    public void updateVehicleById(@PathVariable int id, @RequestBody Vehicle updatedVehicle) {
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if (vehicle.getId() == id) {
                // Update the vehicle details
                vehicle.setName(updatedVehicle.getName());
                vehicle.setCategory(updatedVehicle.getCategory());
                vehicle.setAmount(updatedVehicle.getAmount());
            }
        }
    }
}
    
