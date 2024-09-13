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
import com.tvsmotor.repository.VehicleRepository;

@RestController
@RequestMapping("/api/v2")
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    DealerRepository dealerRepository;

    @PostMapping("/vehicle")
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle) {
        try {
            if (vehicle.getDealer() == null || vehicle.getDealer().getId() == 0) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            Dealer dealer = dealerRepository.findById(vehicle.getDealer().getId())
                               .orElseThrow(() -> new RuntimeException("Dealer not found"));

            vehicle.setDealer(dealer); 
            Vehicle savedVehicle = vehicleRepository.save(vehicle);
            return new ResponseEntity<>(savedVehicle, HttpStatus.CREATED);
        } catch (Exception e) {
            // Log the exception (not shown here)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/vehicle")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return new ResponseEntity<>(vehicleRepository.findAll(), HttpStatus.OK);
    }
}
