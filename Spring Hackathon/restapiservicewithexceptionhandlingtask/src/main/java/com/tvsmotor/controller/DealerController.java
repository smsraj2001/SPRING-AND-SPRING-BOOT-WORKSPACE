package com.tvsmotor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvsmotor.entity.Dealer;
import com.tvsmotor.service.DealerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dealers")
public class DealerController {

    @Autowired
    private DealerService dealerService;

    @PostMapping
    public Dealer addDealer(@RequestBody Dealer dealer) {
        return dealerService.addDealer(dealer);
    }

    @GetMapping
    public List<Dealer> getAllDealers() {
        return dealerService.getAllDealers();
    }

    @GetMapping("/search/location/{location}")
    public List<Dealer> searchDealerByLocation(@PathVariable String location) {
        return dealerService.searchDealerByLocation(location);
    }

    @PutMapping("/{dealerId}/contact")
    public Dealer updateDealerContact(@PathVariable Long dealerId, @RequestParam String contactNumber, @RequestParam String email) {
        return dealerService.updateDealerContact(dealerId, contactNumber, email);
    }
}
