package com.tvsmotor.service;

import java.util.List;

import com.tvsmotor.entity.Dealer;

public interface DealerService {
    Dealer addDealer(Dealer dealer);
    List<Dealer> getAllDealers();
    List<Dealer> searchDealerByLocation(String location);
    Dealer updateDealerContact(Long dealerId, String contactNumber, String email);
}
