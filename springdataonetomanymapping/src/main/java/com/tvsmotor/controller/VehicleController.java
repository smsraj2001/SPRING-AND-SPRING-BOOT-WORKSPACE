package com.tvsmotor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tvsmotor.entity.Dealer;
import com.tvsmotor.entity.Vehicle;
import com.tvsmotor.repository.DealerRepository;
import com.tvsmotor.repository.VehicleRepository;

@RestController
@RequestMapping("/api/v2")
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private DealerRepository dealerRepository;

    @PostMapping("/vehicle")
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle) {
        // Validate dealer existence
        if (vehicle.getDealer() == null || vehicle.getDealer().getId() == 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Dealer dealer = dealerRepository.findById(vehicle.getDealer().getId())
                           .orElseThrow(() -> new RuntimeException("Dealer not found"));

        vehicle.setDealer(dealer); 
        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        return new ResponseEntity<>(savedVehicle, HttpStatus.CREATED);
    }

    @GetMapping("/vehicle")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return new ResponseEntity<>(vehicleRepository.findAll(), HttpStatus.OK);
    }
}
